package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.service.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	HomeService hs;

	@RequestMapping("/saveCustomer")
	public CustomerDetails save(@RequestBody CustomerDetails customerDetails) {
		hs.saveCustomerData(customerDetails);
		return customerDetails;
	}
	
	@RequestMapping("/saveAddress")
	public Address save(@RequestBody Address address) {
		hs.saveAddressData(address);
		return address;
	}
	
	@RequestMapping("/showAddress/{addressId}")	
	public Address show(@PathVariable("addressId") int id)
	{
	
	Address address	=hs.showAddressData(id);

	
		return	address;
		 
	}
}
