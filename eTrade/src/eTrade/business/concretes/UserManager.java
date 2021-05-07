package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.core.concretes.User;
import eTrade.core.validators.EmailValidators;
import eTrade.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		if(!this.validationRules(user)) {
			System.out.println("Lütfen tekrar deneyiniz");
			return;
		}
		this.userDao.add(user);
		

	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);

	}

	@Override
	public void update(User user) {
		if(!this.validationRules(user)) {
			System.out.println("Lütfen tekrar deneyiniz");
			return;
		}
		this.userDao.update(user);

	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);

	}

	@Override
	public User getByMail(String email) {
		return this.userDao.getByMail(email);

	}

	@Override
	public boolean userExits(String email) {

		return this.userDao.userExits(email);

	}

	private boolean checkIfNameValid(String name) {
		if (name.length() < 2) {
			return false;
		}
		return true;

	}
	
	
	private boolean checkIfLastNameValid(String lastName) {
		if (lastName.length() < 2) {
			return false;
		}
		return true;

	}
	
	private boolean checkIfPasswordValid(String password) {
		if (password.length() < 6) {
			return false;
		}
		return true;

	}
	
	private boolean checkIfEmailValid(String email) {
		if(EmailValidators.isEmailValid(email)) {
			return true;
		}
		return false;

	}
	
    public boolean validationRules(User user) {
        
        if(!this.checkIfNameValid(user.getFirstName())) {
            System.out.println("First Name must be longer than 2 char. ");
            return false;
        }
        if(!this.checkIfLastNameValid(user.getLastName())) {
            System.out.println("Last Name must be longer than 2 char. ");
            return false;
        }
        if(!this.checkIfPasswordValid(user.getPassword())) {
            System.out.println("Password must be longer than 2 char. ");
            return false;
        }
        
        if(!this.checkIfEmailValid(user.getEmail())) {
            System.out.println("Invalid email.");
            return false;
        }
        
        return true;
    }
	
	
	

}
