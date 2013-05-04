	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class VcmasterBean {

		private int  id ;

		private String  vcnumber ;

		private String  make ;

		private String  description ;

		private Date  assigndate ;

		private Date  unassigndate ;

		private String  status ;

		private String  comments ;

		private int  createby ;

		private Date  createdate ;

		private String  historypresent ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  extra ;

		private int  casid ;

		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setVcnumber( String vcnumber){
			this.vcnumber = vcnumber;
		}
		public String getVcnumber(  ){
			return  this.vcnumber ;
		}

		public void setMake( String make){
			this.make = make;
		}
		public String getMake(  ){
			return  this.make ;
		}

		public void setDescription( String description){
			this.description = description;
		}
		public String getDescription(  ){
			return  this.description ;
		}

		public void setAssigndate( Date assigndate){
			this.assigndate = assigndate;
		}
		public Date getAssigndate(  ){
			return  this.assigndate ;
		}

		public void setUnassigndate( Date unassigndate){
			this.unassigndate = unassigndate;
		}
		public Date getUnassigndate(  ){
			return  this.unassigndate ;
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

		public void setHistorypresent( String historypresent){
			this.historypresent = historypresent;
		}
		public String getHistorypresent(  ){
			return  this.historypresent ;
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

	}

