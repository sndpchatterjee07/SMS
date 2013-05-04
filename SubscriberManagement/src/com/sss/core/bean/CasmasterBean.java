	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class CasmasterBean {

		private int  id ;

		private String  name ;

		private String  ip ;

		private String  port ;

		private String  factoryname ;

		private String  status ;

		private String  extra ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;
		
		
		
		
		/*@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}*/
		
		
		

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

		public void setIp( String ip){
			this.ip = ip;
		}
		public String getIp(  ){
			return  this.ip ;
		}

		public void setPort( String port){
			this.port = port;
		}
		public String getPort(  ){
			return  this.port ;
		}

		public void setFactoryname( String factoryname){
			this.factoryname = factoryname;
		}
		public String getFactoryname(  ){
			return  this.factoryname ;
		}

		public void setStatus( String status){
			this.status = status;
		}
		public String getStatus(  ){
			return  this.status ;
		}

		public void setExtra( String extra){
			this.extra = extra;
		}
		public String getExtra(  ){
			return  this.extra ;
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

