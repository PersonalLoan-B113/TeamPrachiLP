package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enquiry {
@Id
private int enquiryId;
private String customerFName;
private String customerMName;
private String customerLName;
private String customerGender;
private String customerMobileNo;
private String customerDOB;
private String customerEmailId;
private String address;
private String createdBy;
private int statusCode;
private double loanRequired;
private String dateTime;
public int getEnquiryId() {
	return enquiryId;
}
public void setEnquiryId(int enquiryId) {
	this.enquiryId = enquiryId;
}
public String getCustomerFName() {
	return customerFName;
}
public void setCustomerFName(String customerFName) {
	this.customerFName = customerFName;
}
public String getCustomerMName() {
	return customerMName;
}
public void setCustomerMName(String customerMName) {
	this.customerMName = customerMName;
}
public String getCustomerLName() {
	return customerLName;
}
public void setCustomerLName(String customerLName) {
	this.customerLName = customerLName;
}
public String getCustomerGender() {
	return customerGender;
}
public void setCustomerGender(String customerGender) {
	this.customerGender = customerGender;
}
public String getCustomerMobileNo() {
	return customerMobileNo;
}
public void setCustomerMobileNo(String customerMobileNo) {
	this.customerMobileNo = customerMobileNo;
}
public String getCustomerDOB() {
	return customerDOB;
}
public void setCustomerDOB(String customerDOB) {
	this.customerDOB = customerDOB;
}
public String getCustomerEmailId() {
	return customerEmailId;
}
public void setCustomerEmailId(String customerEmailId) {
	this.customerEmailId = customerEmailId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public double getLoanRequired() {
	return loanRequired;
}
public void setLoanRequired(double loanRequired) {
	this.loanRequired = loanRequired;
}
public String getDateTime() {
	return dateTime;
}
public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}

}
