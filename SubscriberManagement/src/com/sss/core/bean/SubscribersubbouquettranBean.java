	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class SubscribersubbouquettranBean {

		private int  id ;

		private int  subscriberid ;

		private int  bouquetid ;

		private int  channelid ;

		private String  mode ;

		private int  createby ;

		private Date  indate ;

		private Date  outdate ;

		private int  vcid ;

		// private Date  sdate ;

		// private Date  edate ;
		
		
		// START - NEWLY ADDED FOR SUB-BOUQUET IMPLEMENTATION. //
		
		private Timestamp sdate;
		
		private Timestamp edate;
		
		private int subbouquetid;  
	

		public Timestamp getSdate() {
			return sdate;
		}
		
		public void setSdate(Timestamp sdate) {
			this.sdate = sdate;
		}
		
		public Timestamp getEdate() {
			return edate;
		}
		
		public void setEdate(Timestamp edate) {
			this.edate = edate;
		}
		
		public int getSubbouquetid() {
			return subbouquetid;
		}
		
		public void setSubbouquetid(int subbouquetid) {
			this.subbouquetid = subbouquetid;
		}
		
		// END - NEWLY ADDED FOR SUB-BOUQUET IMPLEMENTATION. //
		
		
		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setSubscriberid( int subscriberid){
			this.subscriberid = subscriberid;
		}
		public int getSubscriberid(  ){
			return  this.subscriberid ;
		}

		public void setBouquetid( int bouquetid){
			this.bouquetid = bouquetid;
		}
		public int getBouquetid(  ){
			return  this.bouquetid ;
		}

		public void setChannelid( int channelid){
			this.channelid = channelid;
		}
		public int getChannelid(  ){
			return  this.channelid ;
		}

		public void setMode( String mode){
			this.mode = mode;
		}
		public String getMode(  ){
			return  this.mode ;
		}

		public void setCreateby( int createby){
			this.createby = createby;
		}
		public int getCreateby(  ){
			return  this.createby ;
		}

		public void setIndate( Date indate){
			this.indate = indate;
		}
		public Date getIndate(  ){
			return  this.indate ;
		}

		public void setOutdate( Date outdate){
			this.outdate = outdate;
		}
		public Date getOutdate(  ){
			return  this.outdate ;
		}

		public void setVcid( int vcid){
			this.vcid = vcid;
		}
		public int getVcid(  ){
			return  this.vcid ;
		}

		/*public void setSdate( Date sdate){
			this.sdate = sdate;
		}
		public Date getSdate(  ){
			return  this.sdate ;
		}

		public void setEdate( Date edate){
			this.edate = edate;
		}
		public Date getEdate(  ){
			return  this.edate ;
		}
*/
	}

