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

    /**
     * For return the customer for this specific use case
     * @param customerId
     * @return new Customer Lukas Gehrig, VIP-Level 1
     */
    public Customer retrieveCustomerById(Integer customerId) {
        return new Customer(1, "Lukas", "Gehrig", "Lukas Gehrig", "Musterstrasse 1", "8000 Zürich", "VIP1", 11000);
    }

    public void editLoyaltyBalance(Customer customer) {
        logger.info("customerId: " + customer.getCustomerId() + ". points " + customer.getNmbr_of_loyalty_points());
    }
}
