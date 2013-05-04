	package com.sss.core.bean ;

	import java.sql.Date ;

	import java.sql.Timestamp ;

import java.sql.Blob ;

	public class SubscribersettopboxbindBean {

		private int  id ;

		private int  subscriber_id ;

		private int  settopbox_id ;

		private Date  indate ;

		private String  mode ;

		private Date  outdate ;

		
		@Override
		public String toString() {
			//return super.toString();
			return "SUBSCRIBER ID: "+this.subscriber_id+" -> STB ID: "+this.settopbox_id;
		}
		
		
		public void setId( int id){
			this.id = id;
		}
		public int getId(  ){
			return  this.id ;
		}

		public void setSubscriber_id( int subscriber_id){
			this.subscriber_id = subscriber_id;
		}
		public int getSubscriber_id(  ){
			return  this.subscriber_id ;
		}

		public void setSettopbox_id( int settopbox_id){
			this.settopbox_id = settopbox_id;
		}
		public int getSettopbox_id(  ){
			return  this.settopbox_id ;
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

	}

