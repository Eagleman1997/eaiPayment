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
	
	
	public Transaction(Integer transaction_id2, Date transaction_date2, String payment_service_provider2,
			Double total_order_price2) {
		this.transaction_id = transaction_id;
		this.transaction_date = transaction_date;
		this.payment_service_provider = payment_service_provider;
		this.total_order_price = total_order_price;
	}
	
	public Integer getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getPayment_service_provider() {
		return payment_service_provider;
	}

	public void setPayment_service_provider(String payment_service_provider) {
		this.payment_service_provider = payment_service_provider;
	}

	public Double getTotal_order_price() {
		return total_order_price;
	}

	public void setTotal_order_price(Double total_order_price) {
		this.total_order_price = total_order_price;
	}

}
