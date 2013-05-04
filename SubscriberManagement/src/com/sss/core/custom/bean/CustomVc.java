package com.sss.core.custom.bean;

public class CustomVc {
	
	
	private int vcId;
	private String vcnumber;	
	private int casId;
	private String status;
	
	
	@Override
	public String toString() {
		// return super.toString();
		
		return this.vcnumber;
	}

	////ACCESSORS AND MUTATORS ////////

	public int getVcId() {
		return vcId;
	}


	public void setVcId(int vcId) {
		this.vcId = vcId;
	}


	public String getVcnumber() {
		return vcnumber;
	}


	public void setVcnumber(String vcnumber) {
		this.vcnumber = vcnumber;
	}


	public int getCasId() {
		return casId;
	}


	public void setCasId(int casId) {
		this.casId = casId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
