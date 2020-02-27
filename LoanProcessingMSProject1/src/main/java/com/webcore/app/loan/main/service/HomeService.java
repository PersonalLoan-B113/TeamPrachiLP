package com.webcore.app.loan.main.service;

import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.CustomerDetails;

public interface HomeService{


	void saveCustomerData(CustomerDetails customerDetails);

	void saveAddressData(Address address);

	Address showAddressData(int id);

}
