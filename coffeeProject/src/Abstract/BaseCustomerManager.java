package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public abstract void save(Customer customer);

}
