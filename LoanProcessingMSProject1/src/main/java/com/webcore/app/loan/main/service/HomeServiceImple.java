package com.webcore.app.loan.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.repository.HomeRepositoryAddress;
import com.webcore.app.loan.main.repository.HomeRepositoryCustomerDetails;

@Service
public class HomeServiceImple implements HomeService {
	@Autowired
	HomeRepositoryCustomerDetails homerepositorycustomerdetails;
	@Autowired
	HomeRepositoryAddress homerepositoryaddress;


	@Override
	public void saveCustomerData(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		homerepositorycustomerdetails.save(customerDetails);
	}

	@Override
	public void saveAddressData(Address address) {
		// TODO Auto-generated method stub
		homerepositoryaddress.save(address);
	}

	@Override
	public Address showAddressData(int id) {
	Address a=homerepositoryaddress.findById(id).get();
		// TODO Auto-generated method stub
		return a;
		
	}
}
