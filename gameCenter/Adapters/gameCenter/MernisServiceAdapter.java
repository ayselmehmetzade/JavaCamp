package gameCenter;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean checkIfRealPerson(User user) {

		UserValidation checkUser = new UserValidation();
		
		boolean result= true;		
		
		
	
		try {
			result=checkUser.userValidate(Long.parseLong(user.getIdentityNumber()), 
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), 
					user.getBirthDate().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	
	}

}
