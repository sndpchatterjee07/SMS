package com.sss.core.custom.bean;

import java.util.Date;

import com.sss.core.bean.ChannelmasterBean;

public class CustomChannel {

	private int channelId;
	private String name;	
	private ChannelmasterBean channelmasterBean ;
	private Date stime;
	private Date etime;
	
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ChannelmasterBean getChannelmasterBean() {
		return channelmasterBean;
	}
	public void setChannelmasterBean(ChannelmasterBean channelmasterBean) {
		this.channelmasterBean = channelmasterBean;
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
