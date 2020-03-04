package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.repository.Repo;

@Service
public class ServiceImpl implements ServiceInter {

	@Autowired
	Repo re;
	
	@Override
	public List<CustomerDetails> getDetails() {
		return (List<CustomerDetails>)re.findAll();
	}

}
