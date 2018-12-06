package eaiproject.eaiprojectPayment.data.repository;

import eaiproject.eaiprojectPayment.data.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    public Order findOrderByOrderId(@Param("orderId") Integer orderId);
}