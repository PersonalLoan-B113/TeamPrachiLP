package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class GuarantorDetails {
@Id
private int gurantorId;
private String gurantorName;
private String gurantorMobileNo;
private String gurantorEmailId;
private String gurantorGender;
private String gurantorDOB;
private int gurantorAge;
private String policeStation;
private String residenceType;
private String maritalStatus;
private String dateTime;
@OneToMany(cascade = CascadeType.ALL)
private Set<PreviousLoanDetails> previousLoanDetails=new HashSet<PreviousLoanDetails>();
@OneToMany(cascade = CascadeType.ALL)
private Set<Address> gurantoraddress=new HashSet<Address>();
@OneToMany(cascade = CascadeType.ALL)
private Set<Document> documentDetails=new HashSet<Document>();
public int getGurantorId() {
	return gurantorId;
}
public void setGurantorId(int gurantorId) {
	this.gurantorId = gurantorId;
}
public String getGurantorName() {
	return gurantorName;
}
public void setGurantorName(String gurantorName) {
	this.gurantorName = gurantorName;
}
public String getGurantorMobileNo() {
	return gurantorMobileNo;
}
public void setGurantorMobileNo(String gurantorMobileNo) {
	this.gurantorMobileNo = gurantorMobileNo;
}
public String getGurantorEmailId() {
	return gurantorEmailId;
}
public void setGurantorEmailId(String gurantorEmailId) {
	this.gurantorEmailId = gurantorEmailId;
}
public String getGurantorGender() {
	return gurantorGender;
}
public void setGurantorGender(String gurantorGender) {
	this.gurantorGender = gurantorGender;
}
public String getGurantorDOB() {
	return gurantorDOB;
}
public void setGurantorDOB(String gurantorDOB) {
	this.gurantorDOB = gurantorDOB;
}
public int getGurantorAge() {
	return gurantorAge;
}
public void setGurantorAge(int gurantorAge) {
	this.gurantorAge = gurantorAge;
}
public String getPoliceStation() {
	return policeStation;
}
public void setPoliceStation(String policeStation) {
	this.policeStation = policeStation;
}
public String getResidenceType() {
	return residenceType;
}
public void setResidenceType(String residenceType) {
	this.residenceType = residenceType;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public String getDateTime() {
	return dateTime;
}
public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}
public Set<PreviousLoanDetails> getPreviousLoanDetails() {
	return previousLoanDetails;
}
public void setPreviousLoanDetails(Set<PreviousLoanDetails> previousLoanDetails) {
	this.previousLoanDetails = previousLoanDetails;
}
public Set<Address> getGurantoraddress() {
	return gurantoraddress;
}
public void setGurantoraddress(Set<Address> gurantoraddress) {
	this.gurantoraddress = gurantoraddress;
}
public Set<Document> getDocumentDetails() {
	return documentDetails;
}
public void setDocumentDetails(Set<Document> documentDetails) {
	this.documentDetails = documentDetails;
}


}
