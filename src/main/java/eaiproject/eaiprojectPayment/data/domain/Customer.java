package eaiproject.eaiprojectPayment.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id
	private Integer customer_id;
	private String first_name;
	private String last_name;
	private String creditcard_provider;
	private String creditcard_number;
	private Integer nmbr_of_loyalty_points;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private List<Transaction> transactions;
	

	public Customer() {
		super();
	}
	
	public Integer getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
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


	public Integer getNmbr_of_loyalty_points() {
		return nmbr_of_loyalty_points;
	}


	public void setNmbr_of_loyalty_points(Integer nmbr_of_loyalty_points) {
		this.nmbr_of_loyalty_points = nmbr_of_loyalty_points;
	}


	public List<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	
}
