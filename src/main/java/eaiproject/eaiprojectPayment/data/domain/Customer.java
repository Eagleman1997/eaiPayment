package eaiproject.eaiprojectPayment.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Integer customerId;
    private String first_name;
    private String last_name;
    private String creditcard_provider;
    private String creditcard_number;
    private String shipping_address_name;
    private String shipping_address_street;
    private String shipping_address_location;

    private Integer nmbr_of_loyalty_points;
    private String customerType;
    private Integer customerPoints;

    public Customer() {
        super();
    }

    /**
     * Create a new Customer
     * Special: With customerType and also loyalityPoints
     * @param customerId
     * @param first_name
     * @param last_name
     * @param shipping_address_name
     * @param shipping_address_street
     * @param shipping_address_location
     * @param customerType
     * @param loyalityPoints
     * @author Lukas Weber
     */
    public Customer(Integer customerId, String first_name, String last_name, String shipping_address_name, String shipping_address_street, String shipping_address_location, String customerType, Integer loyalityPoints) {
        this.customerId = customerId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.shipping_address_name = shipping_address_name;
        this.shipping_address_street = shipping_address_street;
        this.shipping_address_location = shipping_address_location;
        this.customerType = customerType;
        this.nmbr_of_loyalty_points = loyalityPoints;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCreditcard_provider() {
        return creditcard_provider;
    }

    public void setCreditcard_provider(String creditcard_provider) {
        this.creditcard_provider = creditcard_provider;
    }

    public String getCreditcard_number() {
        return creditcard_number;
    }

    public void setCreditcard_number(String creditcard_number) {
        this.creditcard_number = creditcard_number;
    }

    public String getShipping_address_name() {
        return shipping_address_name;
    }

    public void setShipping_address_name(String shipping_address_name) {
        this.shipping_address_name = shipping_address_name;
    }

    public String getShipping_address_street() {
        return shipping_address_street;
    }

    public void setShipping_address_street(String shipping_address_street) {
        this.shipping_address_street = shipping_address_street;
    }

    public String getShipping_address_location() {
        return shipping_address_location;
    }

    public void setShipping_address_location(String shipping_address_location) {
        this.shipping_address_location = shipping_address_location;
    }

    public Integer getNmbr_of_loyalty_points() {
        return nmbr_of_loyalty_points;
    }

    public void setNmbr_of_loyalty_points(Integer nmbr_of_loyalty_points) {
        this.nmbr_of_loyalty_points = nmbr_of_loyalty_points;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Integer getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(Integer customerPoints) {
        this.customerPoints = customerPoints;
    }

}
