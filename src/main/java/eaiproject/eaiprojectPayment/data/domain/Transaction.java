package eaiproject.eaiprojectPayment.data.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Integer transactionId;
    @ManyToOne
    private Customer customer;
    private Integer order_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date transaction_date;
    private Double total_order_price;
    private Boolean Canceled;

    public Transaction() {
        super();
    }

    /**
     * Genereate new Transaction
     * @param customer
     * @param order_id
     * @param total_order_price
     * @author Lukas Weber
     */
    public Transaction(Customer customer, Integer order_id, Double total_order_price) {
        this.customer = customer;
        this.order_id = order_id;
        this.transaction_date = new Timestamp(System.currentTimeMillis());
        this.total_order_price = total_order_price;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getTotal_order_price() {
        return total_order_price;
    }

    public void setTotal_order_price(Double total_order_price) {
        this.total_order_price = total_order_price;
    }

    public Boolean getCanceled() {
        return Canceled;
    }

    public void setCanceled(Boolean canceled) {
        Canceled = canceled;
    }

}
