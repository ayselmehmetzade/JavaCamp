package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCust�merManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	

	public StarbucksCust�merManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealCustomer(customer)) {
						System.out.println("Save to db for starbucks : " + customer.getFirstName() + " " + customer.getLastName());
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}
}
