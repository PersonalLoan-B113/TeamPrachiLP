package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {
@Id
private int documentId;
private int customerId;
private String addressProof;
private String bankStatement;
private String itrFile;
private String photo;
private String signature;
private String thumb;
private String blankcheck;
private String salarySlip;
private String adharcard;
private String pancard;
private String previousLoanStatement;
public int getDocumentId() {
	return documentId;
}
public void setDocumentId(int documentId) {
	this.documentId = documentId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getAddressProof() {
	return addressProof;
}
public void setAddressProof(String addressProof) {
	this.addressProof = addressProof;
}
public String getBankStatement() {
	return bankStatement;
}
public void setBankStatement(String bankStatement) {
	this.bankStatement = bankStatement;
}
public String getItrFile() {
	return itrFile;
}
public void setItrFile(String itrFile) {
	this.itrFile = itrFile;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getSignature() {
	return signature;
}
public void setSignature(String signature) {
	this.signature = signature;
}
public String getThumb() {
	return thumb;
}
public void setThumb(String thumb) {
	this.thumb = thumb;
}
public String getBlankcheck() {
	return blankcheck;
}
public void setBlankcheck(String blankcheck) {
	this.blankcheck = blankcheck;
}
public String getSalarySlip() {
	return salarySlip;
}
public void setSalarySlip(String salarySlip) {
	this.salarySlip = salarySlip;
}
public String getAdharcard() {
	return adharcard;
}
public void setAdharcard(String adharcard) {
	this.adharcard = adharcard;
}
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public String getPreviousLoanStatement() {
	return previousLoanStatement;
}
public void setPreviousLoanStatement(String previousLoanStatement) {
	this.previousLoanStatement = previousLoanStatement;
}

}
