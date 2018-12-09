package eaiproject.eaiprojectPayment.data.repository;

import eaiproject.eaiprojectPayment.data.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * For searching the order in de DB
 * @param orderId
 * @author Lukas Weber
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    public Order findOrderByOrderId(@Param("orderId") Integer orderId);
}