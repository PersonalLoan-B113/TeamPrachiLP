package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	
	private String custName;
	private String custMobileNo;
	private String custEmail;
	private String custGender;
	private String custDOB;
	private String custPoliceStation;
	private double custIncomeDetails;
	private double custLoanNo;
	private String custMaritalStatus;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> address=new HashSet<Address>();
	//private BankDetails bankdetails;
	//private GurenterDetails gurenterdetails;
	//private PriviousLoanDetails priviousloandetails;

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustPoliceStation() {
		return custPoliceStation;
	}

	public void setCustPoliceStation(String custPoliceStation) {
		this.custPoliceStation = custPoliceStation;
	}

	public double getCustIncomeDetails() {
		return custIncomeDetails;
	}

	public void setCustIncomeDetails(double custIncomeDetails) {
		this.custIncomeDetails = custIncomeDetails;
	}

	public double getCustLoanNo() {
		return custLoanNo;
	}

	public void setCustLoanNo(double custLoanNo) {
		this.custLoanNo = custLoanNo;
	}

	public String getCustMaritalStatus() {
		return custMaritalStatus;
	}

	public void setCustMaritalStatus(String custMaritalStatus) {
		this.custMaritalStatus = custMaritalStatus;
	}

	
}
