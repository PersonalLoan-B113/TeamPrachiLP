package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Tenure {
	@Id
	private int tenureId;
	private int noofyears;
	private int status;
	public int getTenureId() {
		return tenureId;
	}
	public void setTenureId(int tenureId) {
		this.tenureId = tenureId;
	}
	public int getNoofyears() {
		return noofyears;
	}
	public void setNoofyears(int noofyears) {
		this.noofyears = noofyears;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


}
