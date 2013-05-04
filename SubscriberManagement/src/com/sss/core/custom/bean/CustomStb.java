package com.sss.core.custom.bean;



public class CustomStb {
	
	
	private int stbId;
	private String makenumber;	
	private String modelnumber ;
	private int casId;
	private String status;
	
	
	
	@Override
	public String toString() {
		// return super.toString();
		
		return this.makenumber;
	}
	
	
	//// ACCESSORS AND MUTATORS ////////
	
	public int getStbId() {
		return stbId;
	}
	public void setStbId(int stbId) {
		this.stbId = stbId;
	}
	public String getMakenumber() {
		return makenumber;
	}
	public void setMakenumber(String makenumber) {
		this.makenumber = makenumber;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
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
