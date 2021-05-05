package gameCenter;

public class UserManager implements UserService {
	
	private UserValidationService userValidationService;
	

	public UserManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullanýcý eklendi :" + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Kullanýcý doðrulanamadý lütfen tekrar deneyiniz");
		}
	}

	@Override
	public void update(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullanýcý güncellendi :" + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Kullanýcý doðrulanamadý lütfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
