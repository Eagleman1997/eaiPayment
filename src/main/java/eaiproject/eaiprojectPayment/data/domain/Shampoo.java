package eaiproject.eaiprojectPayment.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shampoo {

    @Id
    @GeneratedValue
    private Integer shampooId;
    private String name;
    private String brand;
    private String type;
    private Double price;

    public Shampoo() {
        super();
    }

    public Shampoo(Integer shampooId, String name, String brand, String type, Double price) {
        this.shampooId = shampooId;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Integer getShampooId() {
        return shampooId;
    }

    public void setShampooId(Integer shampooId) {
        this.shampooId = shampooId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
