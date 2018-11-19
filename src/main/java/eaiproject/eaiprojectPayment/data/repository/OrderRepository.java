package eaiproject.eaiprojectPayment.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import eaiproject.eaiprojectPayment.data.domain.Order;



public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	public Order findOrderByOrderId(@Param("order_id") Integer OrderId);

}