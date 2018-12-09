package eaiproject.eaiprojectPayment.data.repository;

import eaiproject.eaiprojectPayment.data.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * For searching the transaction in de DB
 * @param transactionId
 * @author Lukas Weber
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    public List<Transaction> findTransactionsByTransactionId(@Param("transactionId") Integer transactionId);
}