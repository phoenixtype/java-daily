package DSA.store.storage;

import DSA.store.entities.User;

import java.util.List;


public interface UserStoringService {
	
	void saveUser(User user);
	
	List<User> loadUsers();
	
}
