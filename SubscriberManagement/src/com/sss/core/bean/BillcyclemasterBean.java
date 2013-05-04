	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

import java.sql.Blob ;

	public class BillcyclemasterBean {

		private int  id ;

		private String  name ;

		private int  startdate ;

		private String  description ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private int  enddate ;
		
		
		

		@Override
		public String toString() {
			return this.name;
		}

		
		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setName( String name){
			this.name = name;
		}
		public String getName(  ){
			return  this.name ;
		}

		public void setStartdate( int startdate){
			this.startdate = startdate;
		}
		public int getStartdate(  ){
			return  this.startdate ;
		}

		public void setDescription( String description){
			this.description = description;
		}
		public String getDescription(  ){
			return  this.description ;
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

		public void setEnddate( int enddate){
			this.enddate = enddate;
		}
		public int getEnddate(  ){
			return  this.enddate ;
		}

	}

