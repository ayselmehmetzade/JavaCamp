package eTrade;

import eTrade.business.abstracts.AuthService;
import eTrade.business.concretes.AuthManager;
import eTrade.business.concretes.UserManager;
import eTrade.core.concretes.User;
import eTrade.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		var userService = new UserManager(new InMemoryUserDao());
		AuthService authService=new AuthManager(userService);
		User user1=new User();
		user1.setId(6);
		user1.setFirstName("Aysel");
		user1.setLastName("Mehmetzade");
		user1.setEmail("ayseltest.com");
		user1.setPassword("1234566");	

		if(userService.validationRules(user1))
		{
			authService.register(user1);
			authService.verify(user1, user1.getVerifiticationCode());
			authService.login(user1);
		}
		System.out.println("**********");
		User user2=new User();
		user2.setId(9);
		user2.setFirstName("Esra");
		user2.setLastName("Sancak");
		user2.setEmail("esrasancak@gmail.com");
		user2.setPassword("1234567");	

		authService.login(user2);

	}

}
