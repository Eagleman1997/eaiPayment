/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package eaiproject.eaiprojectPayment.stream.message;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eaiproject.eaiprojectPayment.data.domain.Shampoo;


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
	private String firstName;
	private String lastName;
	private String shippingAddressName;
	private String shippingAddressStreet;
	private String shippingAddressLocation;
	private String loyalityPoints;
	private String parcelService;
	private Date creationDate;

    public OrderMessage() {
    }

    /**
     * Generate a new OrderMessage
     * Calculating the amount with the List of items 
     * Set a timestamp with the current timestamp for creationDate
     * @param orderId
     * @param customerId
     * @param amount
     * @param numberOfItems
     * @param shampoos
     * @param first_name
     * @param last_name
     * @param shipping_address_name
     * @param shipping_address_street
     * @param shipping_address_location
     * @param parcel_service
     * @param status
     * @param string
     * @author Lukas Weber
     */
    public OrderMessage(String orderId, String customerId, Double amount, Integer numberOfItems, List<Shampoo> shampoos, String firstName, String lastName, String shippingAddressName, String shippingAddressStreet, String shippingAddressLocation, String parcelService, String status) {
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
        this.numberOfItems = numberOfItems;
        this.shampoos = shampoos;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.shippingAddressName = shippingAddressName;
    	this.shippingAddressStreet = shippingAddressStreet;
    	this.shippingAddressLocation = shippingAddressLocation;
    	this.parcelService = parcelService;
        this.status = status;
        this.creationDate = new Timestamp(System.currentTimeMillis());
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
	
	

    public List<Shampoo> getShampoos() {
		return shampoos;
	}

	public void setShampoos(List<Shampoo> shampoos) {
		this.shampoos = shampoos;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getShippingAddressName() {
		return shippingAddressName;
	}

	public void setShippingAddressName(String shippingAddressName) {
		this.shippingAddressName = shippingAddressName;
	}

	public String getShippingAddressStreet() {
		return shippingAddressStreet;
	}

	public void setShippingAddressStreet(String shippingAddressStreet) {
		this.shippingAddressStreet = shippingAddressStreet;
	}

	public String getShippingAddressLocation() {
		return shippingAddressLocation;
	}

	public void setShippingAddressLocation(String shippingAddressLocation) {
		this.shippingAddressLocation = shippingAddressLocation;
	}

	public String getParcelService() {
		return parcelService;
	}

	public void setParcelService(String parcelService) {
		this.parcelService = parcelService;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
    public String toString() {
        return "OrderMessage{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", amount=" + amount +
                ", numberOfItems=" + numberOfItems +
                ", items=" + shampoos.toString() +
                ", transactionId='" + transactionId + '\'' +
                ", trackingId='" + trackingId + '\'' +
                ", packingSlipId='" + packingSlipId + '\'' +
                ", status='" + status + '\'' +
                ", first_name=" + firstName +
                ", last_name=" + lastName +
                ", shipping_address_name='" + shippingAddressName + '\'' +
                ", shipping_address_street='" + shippingAddressStreet + '\'' +
                ", shipping_address_location='" + shippingAddressLocation + '\'' +
                ", parcel_service='" + parcelService + '\'' +
                '}';
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
            return "OrderItem{" +
                    "itemId='" + itemId + '\'' +
                    ", productId='" + productId + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

}
