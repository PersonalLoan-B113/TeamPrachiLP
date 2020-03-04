package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.repository.Repo;
import com.webcore.app.loan.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	Repo r;
	
	@Override
	public void saveData(CustomerDetails cd) {
		r.save(cd);
		
	}

	@Override
	public List<CustomerDetails> getCustomerData() {
		return (List<CustomerDetails>)r.findAll();
	}

	@Override
	public CustomerDetails getCustomer(int custId) {
		return r.findById(custId).get();
	}
	
	
	 
}
