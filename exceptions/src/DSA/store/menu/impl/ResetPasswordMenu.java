package DSA.store.menu.impl;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

import DSA.store.configs.ApplicationContext;
import DSA.store.menu.Menu;
import DSA.store.services.ResetPasswordService;
import DSA.store.services.UserManagementService;
import DSA.store.services.impl.DefaultResetPasswordService;
import DSA.store.services.impl.DefaultUserManagementService;
import DSA.store.entities.User;

public class ResetPasswordMenu implements Menu {
	
	private ResetPasswordService resetPasswordService;
	private UserManagementService userManagementService;
	private ResourceBundle rb;

	{
		resetPasswordService = new DefaultResetPasswordService();
		userManagementService = DefaultUserManagementService.getInstance();
		rb = ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME);
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		System.out.println(rb.getString("pass.sent.to.email"));
		CompletableFuture.runAsync(() -> {
			User user = userManagementService.getUserByEmail(userInput);
			resetPasswordService.resetPasswordForUser(user);
		});
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println(rb.getString("reset.pass.header"));
		System.out.print(rb.getString("enter.your.email.msg"));
	}

}
