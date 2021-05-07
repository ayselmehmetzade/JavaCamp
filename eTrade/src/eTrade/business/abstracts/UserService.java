package eTrade.business.abstracts;


import eTrade.core.concretes.User;

public interface UserService {
	void add(User user);

	void delete(User user);

	void update(User user);

	User getById(int id);

	User getByMail(String email);

	boolean userExits(String email);
	boolean validationRules(User user);
}
