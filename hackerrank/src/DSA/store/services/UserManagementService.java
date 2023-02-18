package DSA.store.services;

import DSA.store.entities.User;

import java.util.List;



public interface UserManagementService {

	String registerUser(User user);
	
	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
