package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PreviousLoanDetails {
@Id
private int id;
private int remainingEmi;
private double remainingAmount;
@OneToMany(cascade = CascadeType.ALL)
private Set<BankDetails> bankDeatils=new HashSet<BankDetails>();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRemainingEmi() {
	return remainingEmi;
}
public void setRemainingEmi(int remainingEmi) {
	this.remainingEmi = remainingEmi;
}
public double getRemainingAmount() {
	return remainingAmount;
}
public void setRemainingAmount(double remainingAmount) {
	this.remainingAmount = remainingAmount;
}
public Set<BankDetails> getBankDeatils() {
	return bankDeatils;
}
public void setBankDeatils(Set<BankDetails> bankDeatils) {
	this.bankDeatils = bankDeatils;
}

}
