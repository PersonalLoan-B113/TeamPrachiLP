package com.webcore.app.loan.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
@Id
private int branchId;
private String branchName;
private String branchType;
private String ifsCode;
private int micrCode;
private int branchCode;
private long branchContactNo;
private String branchEmailId;
@OneToMany(cascade = CascadeType.ALL)
private Set<Address> branchAddress=new HashSet<Address>();
private int status;
public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBranchType() {
	return branchType;
}
public void setBranchType(String branchType) {
	this.branchType = branchType;
}
public String getIfsCode() {
	return ifsCode;
}
public void setIfsCode(String ifsCode) {
	this.ifsCode = ifsCode;
}
public int getMicrCode() {
	return micrCode;
}
public void setMicrCode(int micrCode) {
	this.micrCode = micrCode;
}
public int getBranchCode() {
	return branchCode;
}
public void setBranchCode(int branchCode) {
	this.branchCode = branchCode;
}
public long getBranchContactNo() {
	return branchContactNo;
}
public void setBranchContactNo(long branchContactNo) {
	this.branchContactNo = branchContactNo;
}
public String getBranchEmailId() {
	return branchEmailId;
}
public void setBranchEmailId(String branchEmailId) {
	this.branchEmailId = branchEmailId;
}
public Set<Address> getBranchAddress() {
	return branchAddress;
}
public void setBranchAddress(Set<Address> branchAddress) {
	this.branchAddress = branchAddress;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}

}
