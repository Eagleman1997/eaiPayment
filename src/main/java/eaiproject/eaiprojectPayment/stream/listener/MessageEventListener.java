/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.stream.listener;

import eaiproject.eaiprojectPayment.business.service.PaymentService;
import eaiproject.eaiprojectPayment.data.domain.Transaction;
import eaiproject.eaiprojectPayment.stream.message.EventMessage;
import eaiproject.eaiprojectPayment.stream.message.OrderMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@EnableBinding({Sink.class, Source.class})
public class MessageEventListener {

    private static Logger logger = LoggerFactory.getLogger(MessageEventListener.class);
    @Autowired
    @Output(Source.OUTPUT)
    private MessageChannel messageChannel;
    @Autowired
    private PaymentService paymentService;

    /**
     * Search for the call RequestPayment do the payment
     * Generate a new Transaction
     * Set in the order the TransactionId 
     * @param eventMessage
     * @throws Exception
     * @author Lukas Weber
     */
    @StreamListener(target = Sink.INPUT, condition = "headers['type']=='RequestPayment'")
    @Transactional
    public void payment(@Payload EventMessage<OrderMessage> eventMessage) throws Exception {
        OrderMessage orderMessage = eventMessage.getPayload();
        logger.info("Payload received: " + orderMessage.toString());
        Transaction transaction = paymentService.processPayment(Integer.parseInt(orderMessage.getCustomerId()), Integer.parseInt(orderMessage.getOrderId()), orderMessage.getItems(), orderMessage.getAmount());
        orderMessage.setTransactionId(String.valueOf(transaction.getTransactionId()));
        orderMessage.setStatus("PaymentReceived");
        send(new EventMessage<>("FetchGoods", orderMessage));
    }

    public void send(EventMessage<OrderMessage> eventMessage) {
        messageChannel.send(MessageBuilder.withPayload(eventMessage).setHeader("type", eventMessage.getType()).build());
    }

    @StreamListener(target = Sink.INPUT)
    public void defaultListener() {
    }
}