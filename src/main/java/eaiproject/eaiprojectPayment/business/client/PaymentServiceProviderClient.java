/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.business.client;

import org.springframework.stereotype.Component;

import eaiproject.eaiprojectPayment.data.domain.Customer;
import eaiproject.eaiprojectPayment.data.domain.Transaction;

import java.util.Date;
import java.util.UUID;

@Component
public class PaymentServiceProviderClient {
    public Transaction transaction(Customer customer, Integer transaction_id, Integer order_id, Double total_order_price) {
        return new Transaction(customer, order_id, total_order_price);
    }

	public Integer chargeCreditCard(Double total_order_price, String creditcard_number) {
		return new Integer(UUID.randomUUID().toString());
	}
}
