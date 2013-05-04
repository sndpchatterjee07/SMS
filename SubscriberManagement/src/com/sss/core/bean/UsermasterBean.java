	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class UsermasterBean {

		private int  id ;

		private String  name ;

		private String  password ;

		private String  type ;

		private int  groupid ;

		private int  lcoid ;

		private int  broadcasterid ;

		private Date  createdate ;

		private long  createby ;

		private long  modifyby ;

		private Date  modifydate ;

		private int  subscriberid ;

		private int  servicepersonalid ;

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

		public void setPassword( String password){
			this.password = password;
		}
		public String getPassword(  ){
			return  this.password ;
		}

		public void setType( String type){
			this.type = type;
		}
		public String getType(  ){
			return  this.type ;
		}

		public void setGroupid( int groupid){
			this.groupid = groupid;
		}
		public int getGroupid(  ){
			return  this.groupid ;
		}

		public void setLcoid( int lcoid){
			this.lcoid = lcoid;
		}
		public int getLcoid(  ){
			return  this.lcoid ;
		}

		public void setBroadcasterid( int broadcasterid){
			this.broadcasterid = broadcasterid;
		}
		public int getBroadcasterid(  ){
			return  this.broadcasterid ;
		}

		public void setCreatedate( Date createdate){
			this.createdate = createdate;
		}
		public Date getCreatedate(  ){
			return  this.createdate ;
		}

		public void setCreateby( long createby){
			this.createby = createby;
		}
		public long getCreateby(  ){
			return  this.createby ;
		}

		public void setModifyby( long modifyby){
			this.modifyby = modifyby;
		}
		public long getModifyby(  ){
			return  this.modifyby ;
		}

		public void setModifydate( Date modifydate){
			this.modifydate = modifydate;
		}
		public Date getModifydate(  ){
			return  this.modifydate ;
		}

		public void setSubscriberid( int subscriberid){
			this.subscriberid = subscriberid;
		}
		public int getSubscriberid(  ){
			return  this.subscriberid ;
		}

		public void setServicepersonalid( int servicepersonalid){
			this.servicepersonalid = servicepersonalid;
		}
		public int getServicepersonalid(  ){
			return  this.servicepersonalid ;
		}

	}

