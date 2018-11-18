/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.business.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import eaiproject.eaiprojectPayment.api.model.OrderMessage;
import eaiproject.eaiprojectPayment.data.domain.Customer;


@Component
public class CustomerServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public Customer retrieveCustomerById(Long customerId) {
        return restTemplate.getForObject("http://localhost:8080/camel/customer/"  + customerId, Customer.class);
    }

    public void editLoyaltyBalance(Customer customer) {
        restTemplate.put("http://localhost:8080/camel/loyalty/" + customer.getCustomer_id(), new HttpEntity<>(customer), OrderMessage.class);
    }
}
