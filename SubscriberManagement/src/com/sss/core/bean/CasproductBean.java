	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

	import java.sql.Blob ;

	public class CasproductBean {

		private int  id ;

		private int  productnumber ;

		private String  productname ;

		private int  type ;

		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setProductnumber( int productnumber){
			this.productnumber = productnumber;
		}
		public int getProductnumber(  ){
			return  this.productnumber ;
		}

		public void setProductname( String productname){
			this.productname = productname;
		}
		public String getProductname(  ){
			return  this.productname ;
		}

		public void setType( int type){
			this.type = type;
		}
		public int getType(  ){
			return  this.type ;
		}

	}

