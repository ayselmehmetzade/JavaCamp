package eTrade.business.concretes;

import eTrade.business.abstracts.AuthService;
import eTrade.business.abstracts.UserService;
import eTrade.core.abstracts.GoogleService;
import eTrade.core.adapters.GmailAdapter;
import eTrade.core.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(User user) {

		if(!userService.validationRules(user))
		{
			return;
		}
		if (!checkUser(user)) {
			System.out.println("Email ve şifreyi eksiksiz giriniz");
			return;
		}

		User userToLogin = this.userService.getByMail(user.getEmail());
		if (userToLogin.isActive() == true) {
			if (userToLogin != null && user.getPassword() == userToLogin.getPassword()) {
				System.out.println("Giriş başarılı gerçekleşti :" + user.getFirstName()+
						" " +user.getLastName());
			} else {
				System.out.println("Giriş başarısız. Lütfen Email ve Şifrenizi kontrol ediniz");
			}
		}
		else {
			System.out.println("Bu kullanıcı aktif değildir");
		}

	}

	@Override
	public void register(User user) {
		if(!userService.validationRules(user))
		{
			return;
		}
		if (this.userService.getByMail(user.getEmail()) != null) {
			System.out.println("Kullanıcı mevcut");
			return;
		}

		int rendom = (int) Math.floor((Math.random() * 99999));
		String verify = user.getFirstName().substring(0, 1) +
				user.getId() + user.getLastName().substring(0, 1)
				+ rendom;

		user.setVerifiticationCode(verify);

		this.userService.add(user);
		System.out.println("Kayıt başarılı bir şekilde gerçekleşti :" + 
		user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void loginWithGoogle() {
		GoogleService googleService = new GmailAdapter();
		User user = googleService.registerWithLogin();
		if (this.userService.getByMail(user.getEmail()) != null) {
			this.userService.getByMail(user.getEmail()).setActive(true);
		} else {
			user.setActive(true);
			this.userService.add(user);
			

		}
		System.out.println("Giriş yapıldı : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void verify(User user, String code) {

		if(!userService.validationRules(user))
		{
			return;
		}
		User user1 = this.userService.getById(user.getId());

		if (user1.getVerifiticationCode() == code) {
			user1.setActive(true);
			System.out.println("Doğruma kodu onaylandı");
			return;
		} else {
			System.out.println("Doğrulama kodu geçersiz");
		}
	}

	private boolean checkUser(User user) {
		if (user.getEmail().length() > 0 && user.getPassword().length() > 0) {
			return true;
		}
		return false;
	}

}
