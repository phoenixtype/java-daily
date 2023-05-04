package DSA.store.menu.impl;

import java.util.ResourceBundle;

import DSA.store.configs.ApplicationContext;
import DSA.store.menu.Menu;

public class SignOutMenu implements Menu {

	private ApplicationContext context;
	private ResourceBundle rb;
	
	{
		context = ApplicationContext.getInstance();
		rb = ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME);
	}
	
	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println(rb.getString("sign.out.header"));
		System.out.println(rb.getString("bye.msg"));		
	}

}
