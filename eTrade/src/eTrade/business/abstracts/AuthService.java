package eTrade.business.abstracts;

import eTrade.core.concretes.User;

public interface AuthService {

	void login(User user);

	void register(User user);

	void loginWithGoogle();

	void verify(User user, String code);
}
