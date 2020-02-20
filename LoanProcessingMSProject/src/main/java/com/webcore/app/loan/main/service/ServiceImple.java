package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webcore.app.loan.main.model.LoanDetails;
import com.webcore.app.loan.main.repository.DataRepository;


@Service
public class ServiceImple implements ServiceInter {
	
	@Autowired
	DataRepository dr;

	@Override
	public LoanDetails saveData(LoanDetails ld) {
		return dr.save(ld);
	}

	@Override
	public List<LoanDetails> getData() {
		List<LoanDetails> l = (List<LoanDetails>)dr.findAll();
		return l;
	}



	

}
