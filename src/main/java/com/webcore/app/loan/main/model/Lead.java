package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lead {
@Id
private String customerAdharcard;
private String customerPancard;
private String customerAdharno;
private String customerPanno;
private String date;
private String statusCode;
private String leadDateAndTime;
@OneToMany
private Set<Enquiry> enquiryId=new HashSet<Enquiry>();
public String getCustomerAdharcard() {
	return customerAdharcard;
}
public void setCustomerAdharcard(String customerAdharcard) {
	this.customerAdharcard = customerAdharcard;
}
public String getCustomerPancard() {
	return customerPancard;
}
public void setCustomerPancard(String customerPancard) {
	this.customerPancard = customerPancard;
}
public String getCustomerAdharno() {
	return customerAdharno;
}
public void setCustomerAdharno(String customerAdharno) {
	this.customerAdharno = customerAdharno;
}
public String getCustomerPanno() {
	return customerPanno;
}
public void setCustomerPanno(String customerPanno) {
	this.customerPanno = customerPanno;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getStatusCode() {
	return statusCode;
}
public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}
public String getLeadDateAndTime() {
	return leadDateAndTime;
}
public void setLeadDateAndTime(String leadDateAndTime) {
	this.leadDateAndTime = leadDateAndTime;
}
public Set<Enquiry> getEnquiryId() {
	return enquiryId;
}
public void setEnquiryId(Set<Enquiry> enquiryId) {
	this.enquiryId = enquiryId;
}

}
