package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GeneratorType;
@Entity
public class Cibill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cibillId;
	private int leadId;
	private double cibillScore;
	private String cibillScoreDateAndTime;
	private int statusCode;
	private String remark;
	public int getStatusCode() {
	return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public int getCibillId() {
		return cibillId;
	}
	public void setCibillId(int cibillId) {
		this.cibillId = cibillId;
	}
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public double getCibillScore() {
		return cibillScore;
	}
	public void setCibillScore(double cibillScore) {
		this.cibillScore = cibillScore;
	}
	public String getCibillScoreDateAndTime() {
		return cibillScoreDateAndTime;
	}
	public void setCibillScoreDateAndTime(String cibillScoreDateAndTime) {
		this.cibillScoreDateAndTime = cibillScoreDateAndTime;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
