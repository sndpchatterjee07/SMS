	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

import java.sql.Blob ;

	public class SubscribermasterBean {

		private int  id ;

		private String  name ;

		private String  firstname ;

		private String  middlename ;

		private String  lastname ;

		private String  code ;

		private String  pin ;

		private String  mobile ;

		private String  phone ;

		private String  email ;

		private int  areaid ;

		private int  lcoid ;

		private int  casid ;

		private Date  installationdate ;

		private String  status ;

		private String  comments ;

		private int  billcycleid ;

		private int  taxcombinationid ;

		private double  lastpayment ;

		private double  previousbalance ;

		private String  historypresent ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  extra ;

		private String  houseNo ;

		private String  floor ;

		private String  side ;

		private String  blockNo ;

		private String  sector ;

		private String  complexName ;

		private String  city ;

		private String  district ;

		private String  state ;

		private int  rentalperiod ;

		private int  billmonth ;

		private int  casconfigured ;

		private String  remarks ;

		private String  type ;

		private String  saff_no ;

		private String  colony ;

		private String  billingaddr ;
		
		
		@Override
		public String toString() {
			return ""+this.id;
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

		public void setFirstname( String firstname){
			this.firstname = firstname;
		}
		public String getFirstname(  ){
			return  this.firstname ;
		}

		public void setMiddlename( String middlename){
			this.middlename = middlename;
		}
		public String getMiddlename(  ){
			return  this.middlename ;
		}

		public void setLastname( String lastname){
			this.lastname = lastname;
		}
		public String getLastname(  ){
			return  this.lastname ;
		}

		public void setCode( String code){
			this.code = code;
		}
		public String getCode(  ){
			return  this.code ;
		}

		public void setPin( String pin){
			this.pin = pin;
		}
		public String getPin(  ){
			return  this.pin ;
		}

		public void setMobile( String mobile){
			this.mobile = mobile;
		}
		public String getMobile(  ){
			return  this.mobile ;
		}

		public void setPhone( String phone){
			this.phone = phone;
		}
		public String getPhone(  ){
			return  this.phone ;
		}

		public void setEmail( String email){
			this.email = email;
		}
		public String getEmail(  ){
			return  this.email ;
		}

		public void setAreaid( int areaid){
			this.areaid = areaid;
		}
		public int getAreaid(  ){
			return  this.areaid ;
		}

		public void setLcoid( int lcoid){
			this.lcoid = lcoid;
		}
		public int getLcoid(  ){
			return  this.lcoid ;
		}

		public void setCasid( int casid){
			this.casid = casid;
		}
		public int getCasid(  ){
			return  this.casid ;
		}

		public void setInstallationdate( Date installationdate){
			this.installationdate = installationdate;
		}
		public Date getInstallationdate(  ){
			return  this.installationdate ;
		}

		public void setStatus( String status){
			this.status = status;
		}
		public String getStatus(  ){
			return  this.status ;
		}

		public void setComments( String comments){
			this.comments = comments;
		}
		public String getComments(  ){
			return  this.comments ;
		}

		public void setBillcycleid( int billcycleid){
			this.billcycleid = billcycleid;
		}
		public int getBillcycleid(  ){
			return  this.billcycleid ;
		}

		public void setTaxcombinationid( int taxcombinationid){
			this.taxcombinationid = taxcombinationid;
		}
		public int getTaxcombinationid(  ){
			return  this.taxcombinationid ;
		}

		public void setLastpayment( double lastpayment){
			this.lastpayment = lastpayment;
		}
		public double getLastpayment(  ){
			return  this.lastpayment ;
		}

		public void setPreviousbalance( double previousbalance){
			this.previousbalance = previousbalance;
		}
		public double getPreviousbalance(  ){
			return  this.previousbalance ;
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

		public void setHouseNo( String houseNo){
			this.houseNo = houseNo;
		}
		public String getHouseNo(  ){
			return  this.houseNo ;
		}

		public void setFloor( String floor){
			this.floor = floor;
		}
		public String getFloor(  ){
			return  this.floor ;
		}

		public void setSide( String side){
			this.side = side;
		}
		public String getSide(  ){
			return  this.side ;
		}

		public void setBlockNo( String blockNo){
			this.blockNo = blockNo;
		}
		public String getBlockNo(  ){
			return  this.blockNo ;
		}

		public void setSector( String sector){
			this.sector = sector;
		}
		public String getSector(  ){
			return  this.sector ;
		}

		public void setComplexName( String complexName){
			this.complexName = complexName;
		}
		public String getComplexName(  ){
			return  this.complexName ;
		}

		public void setCity( String city){
			this.city = city;
		}
		public String getCity(  ){
			return  this.city ;
		}

		public void setDistrict( String district){
			this.district = district;
		}
		public String getDistrict(  ){
			return  this.district ;
		}

		public void setState( String state){
			this.state = state;
		}
		public String getState(  ){
			return  this.state ;
		}

		public void setRentalperiod( int rentalperiod){
			this.rentalperiod = rentalperiod;
		}
		public int getRentalperiod(  ){
			return  this.rentalperiod ;
		}

		public void setBillmonth( int billmonth){
			this.billmonth = billmonth;
		}
		public int getBillmonth(  ){
			return  this.billmonth ;
		}

		public void setCasconfigured( int casconfigured){
			this.casconfigured = casconfigured;
		}
		public int getCasconfigured(  ){
			return  this.casconfigured ;
		}

		public void setRemarks( String remarks){
			this.remarks = remarks;
		}
		public String getRemarks(  ){
			return  this.remarks ;
		}

		public void setType( String type){
			this.type = type;
		}
		public String getType(  ){
			return  this.type ;
		}

		public void setSaff_no( String saff_no){
			this.saff_no = saff_no;
		}
		public String getSaff_no(  ){
			return  this.saff_no ;
		}

		public void setColony( String colony){
			this.colony = colony;
		}
		public String getColony(  ){
			return  this.colony ;
		}

		public void setBillingaddr( String billingaddr){
			this.billingaddr = billingaddr;
		}
		public String getBillingaddr(  ){
			return  this.billingaddr ;
		}

	}

