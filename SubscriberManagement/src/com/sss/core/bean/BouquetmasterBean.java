	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class BouquetmasterBean {

		private int  id ;

		private String  code ;

		private String  name ;

		private String  description ;

		private double  totalamount ;

		private double  discount ;

		private double  rate ;

		private Date  effecteddate ;

		private String  status ;

		private String  comments ;

		private String  isattach ;

		private String  historypresent ;

		private int  mode ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  extra ;

		private int  casid ;

		private int  caspositionid ;

		private int  nooffreechannel ;

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

		public void setTotalamount( double totalamount){
			this.totalamount = totalamount;
		}
		public double getTotalamount(  ){
			return  this.totalamount ;
		}

		public void setDiscount( double discount){
			this.discount = discount;
		}
		public double getDiscount(  ){
			return  this.discount ;
		}

		public void setRate( double rate){
			this.rate = rate;
		}
		public double getRate(  ){
			return  this.rate ;
		}

		public void setEffecteddate( Date effecteddate){
			this.effecteddate = effecteddate;
		}
		public Date getEffecteddate(  ){
			return  this.effecteddate ;
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

		public void setIsattach( String isattach){
			this.isattach = isattach;
		}
		public String getIsattach(  ){
			return  this.isattach ;
		}

		public void setHistorypresent( String historypresent){
			this.historypresent = historypresent;
		}
		public String getHistorypresent(  ){
			return  this.historypresent ;
		}

		public void setMode( int mode){
			this.mode = mode;
		}
		public int getMode(  ){
			return  this.mode ;
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

		public void setCasid( int casid){
			this.casid = casid;
		}
		public int getCasid(  ){
			return  this.casid ;
		}

		public void setCaspositionid( int caspositionid){
			this.caspositionid = caspositionid;
		}
		public int getCaspositionid(  ){
			return  this.caspositionid ;
		}

		public void setNooffreechannel( int nooffreechannel){
			this.nooffreechannel = nooffreechannel;
		}
		public int getNooffreechannel(  ){
			return  this.nooffreechannel ;
		}

	}

