/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.business.client;

import org.springframework.stereotype.Component;

import eaiproject.eaiprojectPayment.data.domain.Transaction;

import java.util.Date;
import java.util.UUID;

@Component
public class PaymentServiceProviderClient {
    public Transaction transaction(Integer transaction_id, Date transaction_date, String payment_service_provider,
			Double total_order_price) {
        return new Transaction(transaction_id, transaction_date, payment_service_provider, total_order_price);
    }
}
