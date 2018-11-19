package eaiproject.eaiprojectPayment.data.domain;

import javax.persistence.*;

@Entity
public class Shampoo {
	
	@Id
	private Integer shampoo_id;
	private String name;
	private String brand;
	private String type;
	private Double price;
	
	public Shampoo() {
		super();
	}

	public Shampoo(Integer shampoo_id, String name, String brand, String type, Double price) {
		this.shampoo_id = shampoo_id;
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	public Integer getShampoo_id() {
		return shampoo_id;
	}

	public void setShampoo_id(Integer shampoo_id) {
		this.shampoo_id = shampoo_id;
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
