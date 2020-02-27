package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerDetails {
@Id
private int custId;
private String custName;
private String custMobileNo;
private String custEmail;
private String custGender;
private String DOB;
private String policeStation;
private Double incomeDetails;
private String loanNo;
private String maritalStatus;
private String statusCode;
@OneToMany(cascade = CascadeType.ALL)
private Set<Address> address=new HashSet<Address>();
@OneToMany(cascade = CascadeType.ALL)
private Set<BankDetails> bankDetails=new HashSet<BankDetails>();
@OneToMany(cascade = CascadeType.ALL)
private Set<PreviousLoanDetails> previousLoanDetails=new HashSet<PreviousLoanDetails>();
@OneToMany(cascade = CascadeType.ALL)
private Set<GuarantorDetails> guarantorDetailsDetails=new HashSet<GuarantorDetails>();
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
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getPoliceStation() {
	return policeStation;
}
public void setPoliceStation(String policeStation) {
	this.policeStation = policeStation;
}
public Double getIncomeDetails() {
	return incomeDetails;
}
public void setIncomeDetails(Double incomeDetails) {
	this.incomeDetails = incomeDetails;
}
public String getLoanNo() {
	return loanNo;
}
public void setLoanNo(String loanNo) {
	this.loanNo = loanNo;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public String getStatusCode() {
	return statusCode;
}
public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}
public Set<Address> getAddress() {
	return address;
}
public void setAddress(Set<Address> address) {
	this.address = address;
}
public Set<BankDetails> getBankDetails() {
	return bankDetails;
}
public void setBankDetails(Set<BankDetails> bankDetails) {
	this.bankDetails = bankDetails;
}
public Set<PreviousLoanDetails> getPreviousLoanDetails() {
	return previousLoanDetails;
}
public void setPreviousLoanDetails(Set<PreviousLoanDetails> previousLoanDetails) {
	this.previousLoanDetails = previousLoanDetails;
}
public Set<GuarantorDetails> getGuarantorDetailsDetails() {
	return guarantorDetailsDetails;
}
public void setGuarantorDetailsDetails(Set<GuarantorDetails> guarantorDetailsDetails) {
	this.guarantorDetailsDetails = guarantorDetailsDetails;
}




}
