package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}