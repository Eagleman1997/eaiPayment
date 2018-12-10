/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.business.client;

import eaiproject.eaiprojectPayment.data.domain.Customer;
import eaiproject.eaiprojectPayment.data.domain.Transaction;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentServiceProviderClient {
	
	/**
	 * Simulate a new Transaction
	 * @param customer
	 * @param transaction_id
	 * @param order_id
	 * @param total_order_price
	 * @return new Transaction
	 */
    public Transaction transaction(Customer customer, Integer transaction_id, Integer order_id, Double total_order_price) {
        return new Transaction(customer, order_id, total_order_price);
    }

    /**
     * Simulate a Credit Card charging
     * @param total_order_price
     * @param creditcard_number
     * @return new Id for Creditcard
     */
    public Integer chargeCreditCard(Double total_order_price, String creditcard_number) {
        return new Integer(665);
    }
}
