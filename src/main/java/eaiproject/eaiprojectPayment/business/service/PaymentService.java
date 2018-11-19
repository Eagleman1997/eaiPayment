package eaiproject.eaiprojectPayment.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eaiproject.eaiprojectPayment.business.client.CustomerServiceClient;
import eaiproject.eaiprojectPayment.business.client.PaymentServiceProviderClient;
import eaiproject.eaiprojectPayment.data.domain.Customer;
import eaiproject.eaiprojectPayment.data.domain.Discount;
import eaiproject.eaiprojectPayment.data.domain.Order;
import eaiproject.eaiprojectPayment.data.domain.Shampoo;
import eaiproject.eaiprojectPayment.data.domain.Transaction;
import eaiproject.eaiprojectPayment.data.repository.CustomerRepository;
import eaiproject.eaiprojectPayment.data.repository.OrderRepository;
import eaiproject.eaiprojectPayment.data.repository.TransactionRepository;

@Service
public class PaymentService {

	    @Autowired
	    private TransactionRepository transactionRepository;
	    @Autowired
	    private CustomerServiceClient customerService;
	    @Autowired
	    private PaymentServiceProviderClient psp;
	    @Autowired
	    private CustomerRepository customerRespository;
	    @Autowired
	    private OrderRepository orderRepository;

	    public Transaction processPayment(Integer customerId, Integer transaction_id, Integer order_id, Double total_order_price) throws Exception {
	        Customer customer = customerService.retrieveCustomerById(customerId);
	        Transaction transaction = new Transaction(customerRespository.findCustomerByCustomerId(customerId), transaction_id, order_id, total_order_price);
	        Order order = orderRepository.findOrderByOrderId(order_id);
	        Discount discount = calculateDiscount(customerId, total_order_price, order.getShampoos().size());
	        transaction.setTotal_order_price(total_order_price - discount.getFactor());
	        if (total_order_price > 0) {
	            try {
	                transaction.setTransaction_id(chargeCreditCard(customer, total_order_price, transaction).getTransaction_id());
	                transaction.setCanceled(false);
	            } catch (Exception e) {
	                transaction.setCanceled(true);
	                transactionRepository.save(transaction);
	                throw new Exception("Credit card transaction failed due to " + e.getMessage() + ".");
	            }
	        }
	        transactionRepository.save(transaction);
	        return transaction;
	    }

	    public Discount calculateDiscount(Integer customerId, Double total_order_price, Integer numberOfItems) {
	        Customer customer = customerService.retrieveCustomerById(customerId);
	        if (total_order_price >= 1000 && customer.getNmbr_of_loyalty_points() > 100) {
	            if (numberOfItems >= 10) {
	                return new Discount(0.20);
	            } else {
	                return new Discount(0.10);
	            }
	        }
	        if (total_order_price  >= 500 && customer.getNmbr_of_loyalty_points() > 50) {
	            return new Discount(0.05);
	        }
	        return new Discount(0.00);
	    }

	    private Transaction chargeCreditCard(Customer customer, Double total_order_price, Transaction transaction) {
	        transaction.setTransaction_id(psp.chargeCreditCard(total_order_price, customer.getCreditcard_number()));
	        return transaction;
	    }

	    public Transaction retrievePayment(Long transactionId) {
	        throw new UnsupportedOperationException();
	    }

	    public List<Transaction> listPayments(String customerId) {
	        throw new UnsupportedOperationException();
	    }

	    public Transaction updateCanceledPayment(Long transactionId, Long cardTransactionId) {
	        throw new UnsupportedOperationException();
	    }

	    public void deleteCanceledPayment(Long transactionId) {
	        throw new UnsupportedOperationException();
	    }
}