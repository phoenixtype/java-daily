package DSA.store.storage;

import DSA.store.entities.Product;

import java.util.List;



public interface ProductStoringService {
	
	List<Product> loadProducts();

}
