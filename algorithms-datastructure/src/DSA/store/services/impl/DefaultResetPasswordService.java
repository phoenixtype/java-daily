package DSA.store.services.impl;


import DSA.store.entities.User;
import DSA.store.services.ResetPasswordService;
import DSA.store.utils.mail.MailSender;

public class DefaultResetPasswordService implements ResetPasswordService {
	
	private MailSender mailSender;
	
	{
		mailSender = DefaultMailSender.getInstance();
	}

	@Override
	public void resetPasswordForUser(User user) {
		mailSender.sendEmail(user.getEmail(), "Please, use this password to login: " + user.getPassword());
	}

}
