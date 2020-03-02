package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tenure 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int tenureId;
	private int noOfYears;
	private int statusCode;
	
	
	public int getTenureId() {
		return tenureId;
	}
	public void setTenureId(int tenureId) {
		this.tenureId = tenureId;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}

