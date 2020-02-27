package com.webcore.app.loan.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Address;
import com.webcore.app.loan.main.model.BankDetails;
import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.model.BusinessDetails;
import com.webcore.app.loan.main.model.Cibil;
import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.Document;
import com.webcore.app.loan.main.model.Enquiry;
import com.webcore.app.loan.main.model.GuarantorDetails;
import com.webcore.app.loan.main.model.Lead;
import com.webcore.app.loan.main.model.LoanDetails;
import com.webcore.app.loan.main.model.PreviousLoanDetails;
import com.webcore.app.loan.main.model.Tenure;
import com.webcore.app.loan.main.repository.TenureRepository;


@Service
public class HomeService implements IHomeService{
@Autowired
TenureRepository tenureRepository;

@Override
public void saveTenure(Tenure tenure) {
	// TODO Auto-generated method stub
	tenureRepository.save(tenure);
}

@Override
public List<Tenure> getTenure() {
	// TODO Auto-generated method stub
	return (List<Tenure>) tenureRepository.findAll() ;
}

@Override
public void deleteTenure(int tenureId) {
	// TODO Auto-generated method stub
	tenureRepository.deleteById(tenureId);
}

@Override
public Tenure getTenureByID(int tenureId) {
	// TODO Auto-generated method stub
	return tenureRepository.findById(tenureId).get();
}

@Override
public Tenure updateTenure(Tenure tenure) {
	// TODO Auto-generated method stub
	return tenureRepository.save(tenure);
}









	}
