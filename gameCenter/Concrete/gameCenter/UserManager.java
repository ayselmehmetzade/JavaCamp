package gameCenter;

public class UserManager implements UserService {
	
	private UserValidationService userValidationService;
	

	public UserManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� eklendi :" + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Kullan�c� do�rulanamad� l�tfen tekrar deneyiniz");
		}
	}

	@Override
	public void update(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� g�ncellendi :" + user.getFirstName() + " " + user.getLastName());
		}
		else {
			System.out.println("Kullan�c� do�rulanamad� l�tfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
