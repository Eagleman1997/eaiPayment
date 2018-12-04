/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.stream.message;

import eaiproject.eaiprojectPayment.data.domain.Shampoo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class OrderMessage {
    private String orderId;
    private String customerId;
    private Double amount;
    private Integer numberOfItems;
    private List<Shampoo> shampoos;
    private String transactionId;
    private String trackingId;
    private String packingSlipId;
    private String status;
    private String first_name;
    private String last_name;
    private String shipping_address_name;
    private String shipping_address_street;
    private String shipping_address_location;
    private String loyalityPoints;
    private String parcel_service;
    private Date creation_date;

    public OrderMessage() {
    }

    public OrderMessage(String orderId, String customerId, Double amount, Integer numberOfItems, List<Shampoo> shampoos, String first_name, String last_name, String shipping_address_name, String shipping_address_street, String shipping_address_location, String parcel_service, String status, String string) {
        this.orderId = orderId;
        this.customerId = customerId;
        if (amount == 0.00) {
            double price = 0.00;
            for (Shampoo shampoo : shampoos) {
                price += shampoo.getPrice();
            }
            this.amount = price;
        } else {
            this.amount = amount;
        }
        this.amount = amount;
        this.numberOfItems = numberOfItems;
        this.shampoos = shampoos;
        this.first_name = first_name;
        this.last_name = last_name;
        this.shipping_address_name = shipping_address_name;
        this.shipping_address_street = shipping_address_street;
        this.shipping_address_location = shipping_address_location;
        this.parcel_service = parcel_service;
        this.status = status;
        this.creation_date = new Timestamp(System.currentTimeMillis());
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public List<Shampoo> getItems() {
        return shampoos;
    }

    public void setItems(List<Shampoo> shampoos) {
        this.shampoos = shampoos;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getPackingSlipId() {
        return packingSlipId;
    }

    public void setPackingSlipId(String packingSlipId) {
        this.packingSlipId = packingSlipId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoyalityPoints() {
        return loyalityPoints;
    }

    public void setLoyalityPoints(String loyalityPoints) {
        this.loyalityPoints = loyalityPoints;
    }

    @Override
    public String toString() {
        return "OrderMessage{" + "orderId='" + orderId + '\'' + ", customerId='" + customerId + '\'' + ", amount=" + amount + ", numberOfItems=" + numberOfItems + ", items=" + shampoos.toString() + ", transactionId='" + transactionId + '\'' + ", trackingId='" + trackingId + '\'' + ", packingSlipId='" + packingSlipId + '\'' + ", status='" + status + '\'' + ", first_name=" + first_name + ", last_name=" + last_name + ", shipping_address_name='" + shipping_address_name + '\'' + ", shipping_address_street='" + shipping_address_street + '\'' + ", shipping_address_location='" + shipping_address_location + '\'' + ", parcel_service='" + parcel_service + '\'' + '}';
    }

    public static class OrderItem {
        private String itemId;
        private String productId;
        private Integer quantity;

        public OrderItem() {
        }

        public OrderItem(String itemId, String productId, Integer quantity) {
            this.itemId = itemId;
            this.productId = productId;
            this.quantity = quantity;
        }

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "OrderItem{" + "itemId='" + itemId + '\'' + ", productId='" + productId + '\'' + ", quantity=" + quantity + '}';
        }
    }

}
