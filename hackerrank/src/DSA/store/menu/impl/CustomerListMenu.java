package DSA.store.menu.impl;

import java.util.List;
import java.util.ResourceBundle;

import DSA.store.configs.ApplicationContext;
import DSA.store.entities.User;
import DSA.store.menu.Menu;
import DSA.store.services.UserManagementService;
import DSA.store.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	private ResourceBundle rb;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
		rb = ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME);
	}
	
	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		
		if (users == null || users.size() == 0) {
			System.out.println(rb.getString("no.users.msg"));
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println(rb.getString("customer.list.header"));		
	}

}
