package com.webcore.app.loan.main.service;

import java.util.List;

import com.webcore.app.loan.main.model.LoanDetails;

public interface ServiceInter {

	LoanDetails saveData(LoanDetails ld);

	List<LoanDetails> getData();

	

}
