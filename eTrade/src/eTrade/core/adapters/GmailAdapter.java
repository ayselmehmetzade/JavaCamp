package eTrade.core.adapters;

import java.util.ArrayList;

import eTrade.core.abstracts.GoogleService;
import eTrade.core.concretes.User;
import eTrade.fakeService.Gmail;
import eTrade.fakeService.GmailClass;

public class GmailAdapter implements GoogleService {

	@Override
	public User registerWithLogin() {
		
		Gmail gmail = new Gmail();
		
		ArrayList<GmailClass> gmails=gmail.getByEmailAndPassword();
		int rendom= (int)Math.floor(Math.random() * gmails.size()-1);
		
		User user=new User();
		user.setId(10);
		user.setEmail(gmails.get(rendom).getEmail());
		user.setFirstName(gmails.get(rendom).getFirstName());
		user.setLastName(gmails.get(rendom).getLastName());
		user.setPassword(gmails.get(rendom).getPassword());
		
		return user;
		
	}

}
