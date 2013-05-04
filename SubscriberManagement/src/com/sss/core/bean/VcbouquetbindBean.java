	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class VcbouquetbindBean {

		private int  id ;

		private int  vcid ;

		private int  bouquet_id ;

		private Date  indate ;

		private String  mode ;

		private Date  outdate ;

		//private Date  sdate ;

		//private Date  edate ;
		
		////////////////////////////////
		
		private Timestamp sdate;
		
		private Timestamp edate;
		
		////////////////////////////////
		

		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setVcid( int vcid){
			this.vcid = vcid;
		}
		public int getVcid(  ){
			return  this.vcid ;
		}

		public void setBouquet_id( int bouquet_id){
			this.bouquet_id = bouquet_id;
		}
		public int getBouquet_id(  ){
			return  this.bouquet_id ;
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
		
		
		///////////////////////////////////////////////////
		
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

		///////////////////////////////////////////////////
		
		/*public void setSdate( Date sdate){
			this.sdate = sdate;
		}*/
		/*public Date getSdate(  ){
			return  this.sdate ;
		}*/

		/*public void setEdate( Date edate){
			this.edate = edate;
		}*/
		/*public Date getEdate(  ){
			return  this.edate ;
		}*/

		
		
		
	}

