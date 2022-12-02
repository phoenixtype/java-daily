package DSA.store.storage;

import DSA.store.entities.Order;

import java.util.List;


public interface OrderStoringService {
	
	void saveOrders(List<Order> order);
	
	List<Order> loadOrders();
}
