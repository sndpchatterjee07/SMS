	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class ChannelmasterBean {

		private int  id ;

		private String  code ;

		private String  name ;

		private String  description ;

		private Blob  logo ;

		private String  logotype ;

		private int  languageid ;

		private int  broadcusterid ;

		private int  categoryid ;

		private int  type ;

		private double  rate ;

		private Date  effecteddate ;

		private String  historypresent ;

		private int  createby ;

		private Date  createdate ;

		private int  modifyby ;

		private Date  modifydate ;

		private String  status ;

		private String  comments ;

		private String  extra ;

		private int  casid ;

		private String  progid ;

		private int  caspositionid ;

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

		public void setLogo( Blob logo){
			this.logo = logo;
		}
		public Blob getLogo(  ){
			return  this.logo ;
		}

		public void setLogotype( String logotype){
			this.logotype = logotype;
		}
		public String getLogotype(  ){
			return  this.logotype ;
		}

		public void setLanguageid( int languageid){
			this.languageid = languageid;
		}
		public int getLanguageid(  ){
			return  this.languageid ;
		}

		public void setBroadcusterid( int broadcusterid){
			this.broadcusterid = broadcusterid;
		}
		public int getBroadcusterid(  ){
			return  this.broadcusterid ;
		}

		public void setCategoryid( int categoryid){
			this.categoryid = categoryid;
		}
		public int getCategoryid(  ){
			return  this.categoryid ;
		}

		public void setType( int type){
			this.type = type;
		}
		public int getType(  ){
			return  this.type ;
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

		public void setProgid( String progid){
			this.progid = progid;
		}
		public String getProgid(  ){
			return  this.progid ;
		}

		public void setCaspositionid( int caspositionid){
			this.caspositionid = caspositionid;
		}
		public int getCaspositionid(  ){
			return  this.caspositionid ;
		}

	}

