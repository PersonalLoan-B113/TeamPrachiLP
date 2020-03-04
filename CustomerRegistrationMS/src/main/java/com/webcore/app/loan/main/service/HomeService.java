package com.webcore.app.loan.main.service;

import java.util.List;

import com.webcore.app.loan.main.model.CustomerDetails;

public interface HomeService {

	void saveData(CustomerDetails cd);

	List<CustomerDetails> getCustomerData();

	CustomerDetails getCustomer(int custId);

	

}
