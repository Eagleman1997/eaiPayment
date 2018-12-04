package eaiproject.eaiprojectPayment.data.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    private Integer order_id;
    private Double total_order_price;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_fk")
    private List<Shampoo> shampoos;

    public Order() {
        super();
    }

    public Order(Integer order_id, Double total_order_price) {
        this.order_id = order_id;
        this.total_order_price = total_order_price;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public List<Shampoo> getShampoos() {
        return shampoos;
    }

    public void setShampoos(List<Shampoo> shampoos) {
        this.shampoos = shampoos;
    }

}
