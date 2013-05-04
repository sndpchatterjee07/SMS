	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

import java.sql.Blob ;

	public class SettopboxvcbindBean {

		private int  id ;

		private int  settopboxid ;

		private int  vcid ;

		private Date  indate ;

		private String  mode ;

		private Date  outdate ;

		private String  fiered ;

		
		@Override
		public String toString() {
			// return super.toString();
			return "STB ID: "+this.settopboxid+" -> VC ID: "+this.vcid;
		}
		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setSettopboxid( int settopboxid){
			this.settopboxid = settopboxid;
		}
		public int getSettopboxid(  ){
			return  this.settopboxid ;
		}

		public void setVcid( int vcid){
			this.vcid = vcid;
		}
		public int getVcid(  ){
			return  this.vcid ;
		}

		public void setIndate( Date indate){
			this.indate = indate;
		}
		public Date getIndate(  ){
			return  this.indate ;
		}

		public void setMode( String mode){
			this.mode = mode;
		}
		public String getMode(  ){
			return  this.mode ;
		}

		public void setOutdate( Date outdate){
			this.outdate = outdate;
		}
		public Date getOutdate(  ){
			return  this.outdate ;
		}

		public void setFiered( String fiered){
			this.fiered = fiered;
		}
		public String getFiered(  ){
			return  this.fiered ;
		}

	}

