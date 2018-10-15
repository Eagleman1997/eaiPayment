package eaiproject.eaiprojectPayment.data.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Transaction {
	
	@Id @GeneratedValue
	private Integer transaction_id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date transaction_date;
	private String payment_service_provider;
	private Double total_order_price;

	public Transaction(){
		super();
	}

}
