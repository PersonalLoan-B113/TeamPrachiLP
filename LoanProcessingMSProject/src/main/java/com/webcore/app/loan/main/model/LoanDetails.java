package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	@NotNull
	private String loanCode;
	@NotNull
	private int customerId; 
	@NotNull
	private int leadId;
	@NotNull
	private double loanAmount;
	@NotNull
	private double rateOfInterest;
	@NotNull
	private int tenure;
	@NotNull
	private double marginmoney;
	@Value(value = "0.0")
	private double advanceEMI;
	private double processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark; 
	private int statusCode;
	
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
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMarginmoney() {
		return marginmoney;
	}
	public void setMarginmoney(double marginmoney) {
		this.marginmoney = marginmoney;
	}
	public double getAdvanceEMI() {
		return advanceEMI;
	}
	public void setAdvanceEMI(double advanceEMI) {
		this.advanceEMI = advanceEMI;
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
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
