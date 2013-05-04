	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class SchememasterBean {

		private int  id ;

		private String  code ;

		private String  name ;

		private String  description ;

		private double  rate ;

		private Date  startdate ;

		private String  historypresent ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  extra ;

		private int  mode ;

		private int  rentalperiod ;

		private double  rentalamount ;

		private String  status ;

		private double  securityDeposit ;

		private double  depreciation ;

		private String  comments ;

		private String  isattach ;

		private String  progid ;

		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setCode( String code){
			this.code = code;
		}
		public String getCode(  ){
			return  this.code ;
		}

		public void setName( String name){
			this.name = name;
		}
		public String getName(  ){
			return  this.name ;
		}

		public void setDescription( String description){
			this.description = description;
		}
		public String getDescription(  ){
			return  this.description ;
		}

		public void setRate( double rate){
			this.rate = rate;
		}
		public double getRate(  ){
			return  this.rate ;
		}

		public void setStartdate( Date startdate){
			this.startdate = startdate;
		}
		public Date getStartdate(  ){
			return  this.startdate ;
		}

		public void setHistorypresent( String historypresent){
			this.historypresent = historypresent;
		}
		public String getHistorypresent(  ){
			return  this.historypresent ;
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

		public void setExtra( String extra){
			this.extra = extra;
		}
		public String getExtra(  ){
			return  this.extra ;
		}

		public void setMode( int mode){
			this.mode = mode;
		}
		public int getMode(  ){
			return  this.mode ;
		}

		public void setRentalperiod( int rentalperiod){
			this.rentalperiod = rentalperiod;
		}
		public int getRentalperiod(  ){
			return  this.rentalperiod ;
		}

		public void setRentalamount( double rentalamount){
			this.rentalamount = rentalamount;
		}
		public double getRentalamount(  ){
			return  this.rentalamount ;
		}

		public void setStatus( String status){
			this.status = status;
		}
		public String getStatus(  ){
			return  this.status ;
		}

		public void setSecurityDeposit( double securityDeposit){
			this.securityDeposit = securityDeposit;
		}
		public double getSecurityDeposit(  ){
			return  this.securityDeposit ;
		}

		public void setDepreciation( double depreciation){
			this.depreciation = depreciation;
		}
		public double getDepreciation(  ){
			return  this.depreciation ;
		}

		public void setComments( String comments){
			this.comments = comments;
		}
		public String getComments(  ){
			return  this.comments ;
		}

		public void setIsattach( String isattach){
			this.isattach = isattach;
		}
		public String getIsattach(  ){
			return  this.isattach ;
		}

		public void setProgid( String progid){
			this.progid = progid;
		}
		public String getProgid(  ){
			return  this.progid ;
		}

	}

