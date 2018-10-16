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
	
}
