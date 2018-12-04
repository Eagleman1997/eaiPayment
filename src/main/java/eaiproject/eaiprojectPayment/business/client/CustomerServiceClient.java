/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.business.client;

import eaiproject.eaiprojectPayment.data.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceClient {

    private Logger logger = LoggerFactory.getLogger(CustomerServiceClient.class);

    public Customer retrieveCustomerById(Integer customerId) {
        return new Customer(1, "Lukas", "Gehrig", "Musterstrasse 1", "8000 Zürich", "VIP1");
    }

    public void editLoyaltyBalance(Customer customer) {
        logger.info("customerId: " + customer.getCustomer_id() + ". points " + customer.getNmbr_of_loyalty_points());
    }
}
