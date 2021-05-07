package eTrade.core.concretes;

import eTrade.core.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean isActive=false;
	private String verifiticationCode;

	public User() {

	}

	public User(int id, String firstName, String lastName, String email, String password,boolean isActive) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.isActive=isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getVerifiticationCode() {
		return verifiticationCode;
	}

	public void setVerifiticationCode(String verifiticationCode) {
		this.verifiticationCode = verifiticationCode;
	}
}
