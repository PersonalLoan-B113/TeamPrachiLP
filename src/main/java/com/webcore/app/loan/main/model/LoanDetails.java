package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanDetails {
@Id
private int loanId;
private String loanCode;
private int customerId;
private int leadId;
private double loanAmount;
private double rateofInterest;
private int tenure;
private double marginMoney;
private double advanceEmi;
private double processingFees;
private double totalInterest;
private String sanctionDate;
private String remark;
private int status;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoanCode() {
	return loanCode;
}
public void setLoanCode(String loanCode) {
	this.loanCode = loanCode;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getLeadId() {
	return leadId;
}
public void setLeadId(int leadId) {
	this.leadId = leadId;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public double getRateofInterest() {
	return rateofInterest;
}
public void setRateofInterest(double rateofInterest) {
	this.rateofInterest = rateofInterest;
}
public int getTenure() {
	return tenure;
}
public void setTenure(int tenure) {
	this.tenure = tenure;
}
public double getMarginMoney() {
	return marginMoney;
}
public void setMarginMoney(double marginMoney) {
	this.marginMoney = marginMoney;
}
public double getAdvanceEmi() {
	return advanceEmi;
}
public void setAdvanceEmi(double advanceEmi) {
	this.advanceEmi = advanceEmi;
}
public double getProcessingFees() {
	return processingFees;
}
public void setProcessingFees(double processingFees) {
	this.processingFees = processingFees;
}
public double getTotalInterest() {
	return totalInterest;
}
public void setTotalInterest(double totalInterest) {
	this.totalInterest = totalInterest;
}
public String getSanctionDate() {
	return sanctionDate;
}
public void setSanctionDate(String sanctionDate) {
	this.sanctionDate = sanctionDate;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}


}
