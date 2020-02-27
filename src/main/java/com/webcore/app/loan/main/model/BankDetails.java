package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BankDetails {
@Id
private int id;
private String bankAccountNo;
private String bankAccountHolderName;
@OneToMany(cascade = CascadeType.ALL)
private Set<Branch> bankBranch=new HashSet<Branch>();
private int status;
private int custId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBankAccountNo() {
	return bankAccountNo;
}
public void setBankAccountNo(String bankAccountNo) {
	this.bankAccountNo = bankAccountNo;
}
public String getBankAccountHolderName() {
	return bankAccountHolderName;
}
public void setBankAccountHolderName(String bankAccountHolderName) {
	this.bankAccountHolderName = bankAccountHolderName;
}
public Set<Branch> getBankBranch() {
	return bankBranch;
}
public void setBankBranch(Set<Branch> bankBranch) {
	this.bankBranch = bankBranch;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}

}
