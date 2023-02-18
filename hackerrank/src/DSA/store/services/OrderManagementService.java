package DSA.store.services;

import DSA.store.entities.Order;

import java.util.List;


public interface OrderManagementService {

	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();

}
