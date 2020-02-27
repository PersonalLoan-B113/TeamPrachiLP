package com.webcore.app.loan.main.service;

import java.util.List;

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

public interface IHomeService {

	public void saveTenure(Tenure tenure);  
    public List<Tenure> getTenure();  
    public void deleteTenure(int tenureId);  
    public Tenure getTenureByID(int tenureId);  
    public Tenure updateTenure(Tenure tenure);
    }
