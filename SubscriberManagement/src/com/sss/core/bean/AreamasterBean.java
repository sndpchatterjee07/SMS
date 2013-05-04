	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class AreamasterBean {

		private int  id ;

		private String  code ;

		private String  name ;

		private String  description ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  historypresent ;

		private String  extra ;

		private int  subzoneid ;
		
		
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

		public void setHistorypresent( String historypresent){
			this.historypresent = historypresent;
		}
		public String getHistorypresent(  ){
			return  this.historypresent ;
		}

		public void setExtra( String extra){
			this.extra = extra;
		}
		public String getExtra(  ){
			return  this.extra ;
		}

		public void setSubzoneid( int subzoneid){
			this.subzoneid = subzoneid;
		}
		public int getSubzoneid(  ){
			return  this.subzoneid ;
		}

	}

