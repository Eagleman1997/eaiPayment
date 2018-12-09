package eaiproject.eaiprojectPayment.data.repository;

import eaiproject.eaiprojectPayment.data.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * For searching the customer in de DB
 * @param customerId
 * @author Lukas Weber
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByCustomerId(@Param("customerId") Integer customerId);
}