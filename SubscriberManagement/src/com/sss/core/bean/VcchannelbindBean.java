	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class VcchannelbindBean {

		private int  id ;

		private int  vcid ;

		private int  channel_id ;

		private Date  indate ;

		private String  mode ;

		private Date  outdate ;

		//private Date  sdate ;

		//private Date  edate ;
		
		
		////////////////////////////////////////////
		
		private Timestamp sdate;
		
		
		private Timestamp edate;
		
		///////////////////////////////////////////
		
		
		

		public void setId( int id){
			this.id = id;
		}
		
		///////////////////////////////////////////////////////////
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
		/////////////////////////////////////////////////////////
		
		
		public int getId(  ){
			return  this.id ;
		}
		

		public void setVcid( int vcid){
			this.vcid = vcid;
		}
		public int getVcid(  ){
			return  this.vcid ;
		}

		public void setChannel_id( int channel_id){
			this.channel_id = channel_id;
		}
		public int getChannel_id(  ){
			return  this.channel_id ;
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

