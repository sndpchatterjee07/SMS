package com.sss.core.custom.bean;

import java.util.Date;

import com.sss.core.bean.BouquetmasterBean;

public class CustomBouquet {

	private int bouquetId;
	private String name;	
	private BouquetmasterBean bouquetmasterBean ;
	private Date stime;
	private Date etime;
	
	public int getBouquetId() {
		return bouquetId;
	}
	public void setBouquetId(int bouquetId) {
		this.bouquetId = bouquetId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BouquetmasterBean getBouquetmasterBean() {
		return bouquetmasterBean;
	}
	public void setBouquetmasterBean(BouquetmasterBean bouquetmasterBean) {
		this.bouquetmasterBean = bouquetmasterBean;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	
}
