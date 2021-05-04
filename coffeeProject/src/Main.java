import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustýmerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
//		 BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		 BaseCustomerManager base1CustomerManager= new StarbucksCustýmerManager(new MernisServiceAdapter());
		 
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Aysel");
		 customer.setLastName("Mehmetzade");
		 customer.setDateOfBirth(LocalDate.of(1984, 6, 28));
		 customer.setNationalityId("12345");
		 
		 base1CustomerManager.save(customer);

	}

}

