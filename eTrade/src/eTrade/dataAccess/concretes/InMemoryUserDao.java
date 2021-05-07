package eTrade.dataAccess.concretes;

import java.util.ArrayList;

import eTrade.core.concretes.User;
import eTrade.dataAccess.abstracts.UserDao;

public class InMemoryUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();

	public InMemoryUserDao() {
		User user = new User(1, "Esra", "Sancak", "esrasancak@gmail.com", "1234567",true);
		User user1 = new User(2, "Aysel", "Mehmetzade", "aysel123@gmail.com", "123",true);
		User user2 = new User(3, "Kübra", "Terzi", "kubraterzi@gmail.com", "123245",true);
		User user3 = new User(4, "Fatih", "Kayan", "fatihkayan@gmail.com", "1324",true);
		User user4 = new User(5, "Umut", "Kose", "umutkose@gmail.com", "1324684",true);

		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý eklendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi");

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi");

	}

	@Override
	public User getById(int id) {
		User selectedUser = this.users.stream().filter((u) -> u.getId() == id).findFirst().orElse(null);
		return selectedUser;
	}

	@Override
	public User getByMail(String email) {
		User selectedUser = this.users.stream().filter((u) -> u.getEmail().equals(email)).findAny().orElse(null);
		return selectedUser;
	}

	//kalsýn bu burda
	@Override
	public boolean userExits(String email) {

		User selectedUser = users.stream().filter((u) -> u.getEmail().equals(email)).findAny().orElse(null);
		if (selectedUser != null) {
			System.out.println("User exits");
			return true;
		}

		return false;
	}

}
