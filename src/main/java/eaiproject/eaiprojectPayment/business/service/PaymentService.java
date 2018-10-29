package eaiproject.eaiprojectPayment.business.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import eaiproject.eaiprojectPayment.data.domain.Transaction;
import eaiproject.eaiprojectPayment.data.repository.CustomerRepository;
import eaiproject.eaiprojectPayment.data.repository.TransactionRepository;

public class PaymentService {

	@Autowired
	private CustomerRepository customerRepository;
	private TransactionRepository  transactionRepository;
	
	
	/**
	 * 
	 * transaction
	 */
	public Transaction createTransaction(Integer transaction_id, Date transaction_date, String payment_service_provider, Double total_order_price) {
		Transaction transaction = new Transaction(transaction_id, transaction_date, payment_service_provider, total_order_price);
		return transactionRepository.save(transaction);
	}
	
	public Transaction readTransactionById(String transactionId) {
		return transactionRepository.findById(Integer.parseInt(transactionId)).orElse(null);
	}
	
	public Transaction updateTransaction(String transaction_id, Date transaction_date, String payment_service_provider, Double total_order_price) {
		Transaction transaction = new Transaction(Integer.parseInt(transaction_id), transaction_date, payment_service_provider, total_order_price);
		transaction.setTransaction_id(Integer.parseInt(transaction_id));
		return transactionRepository.save(transaction);
	}

	
	/**
	 * 
	 * customer
	 */
	// ToDo
}