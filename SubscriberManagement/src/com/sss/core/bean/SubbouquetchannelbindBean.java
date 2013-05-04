	package com.sss.core.bean ;

	import java.sql.*;

	public class SubbouquetchannelbindBean {

		private int  id ;

		private int  bouquetid ;

		private int  subbouquetid ;

		private String  subbouquetname ;

		private int  channelid ;

		private String  status ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;
		

		@Override
		public String toString() {
			
			// return super.toString();
			
			return this.subbouquetname;
			
		}
		
		
		
		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setBouquetid( int bouquetid){
			this.bouquetid = bouquetid;
		}
		public int getBouquetid(  ){
			return  this.bouquetid ;
		}

		public void setSubbouquetid( int subbouquetid){
			this.subbouquetid = subbouquetid;
		}
		public int getSubbouquetid(  ){
			return  this.subbouquetid ;
		}

		public void setSubbouquetname( String subbouquetname){
			this.subbouquetname = subbouquetname;
		}
		public String getSubbouquetname(  ){
			return  this.subbouquetname ;
		}

		public void setChannelid( int channelid){
			this.channelid = channelid;
		}
		public int getChannelid(  ){
			return  this.channelid ;
		}

		public void setStatus( String status){
			this.status = status;
		}
		public String getStatus(  ){
			return  this.status ;
		}

		public void setCreateby( int createby){
			this.createby = createby;
		}
		public int getCreateby(  ){
			return  this.createby ;
		}

		public void setCreatedate( Date createdate){
			this.createdate = createdate;
		}
		public Date getCreatedate(  ){
			return  this.createdate ;
		}

		public void setModifyby( int modifyby){
			this.modifyby = modifyby;
		}
		public int getModifyby(  ){
			return  this.modifyby ;
		}

		public void setModifydate( Date modifydate){
			this.modifydate = modifydate;
		}
		public Date getModifydate(  ){
			return  this.modifydate ;
		}

	}

