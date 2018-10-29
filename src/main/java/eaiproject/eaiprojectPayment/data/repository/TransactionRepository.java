package eaiproject.eaiprojectPayment.data.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import eaiproject.eaiprojectPayment.data.domain.Transaction;


public interface TransactionRepository  extends JpaRepository<Transaction, Integer>{
	
	public List<Transaction> findTransactionsByTrackingId(@Param("transactionId") Integer transactionId);
	public List<Transaction> findTransactionsByOrderId(@Param("transaction_date") Date transactionDate);

}