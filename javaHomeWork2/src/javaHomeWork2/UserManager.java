package javaHomeWork2;

public class UserManager {

	public void addUser(User user) {
		System.out.println("Sisteme yeni kullan�c� eklendi: " + user.getEmail() + " " + user.getFirstName() + " "
				+ user.getLastName());

	}
	
	public void deleteUser(User user) {
		System.out.println("Kullan�c� silindi: " + user.getFirstName() + " " + user.getLastName());
	}

	public void updateUser(User user) {
		System.out.println("Kullan�c� G�ncellendi: " + user.getFirstName() + " " + user.getLastName());
	}
}
