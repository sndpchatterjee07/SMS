	package com.sss.core.dao ;

	import java.util.ArrayList ;
import java.util.List;

	import java.sql.Date ;

	import java.sql.Blob ;

	import java.sql.Timestamp ;

	import java.sql.Connection ;

	import java.sql.PreparedStatement ;

	import java.sql.ResultSet ;

	import java.sql.SQLException ;

	import java.io.* ;

	import com.sss.core.bean.* ;

import com.sss.core.database.* ;

	public class SubscribersubbouquettranDAO {

		public SubscribersubbouquettranBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran " ;

			return null ;

		}

		public SubscribersubbouquettranBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBysubscriberid(int subscriberid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubscriberid = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE subscriberid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubscriberid );

				preparedStatement.setInt(1,subscriberid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBybouquetid(int bouquetid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBouquetid = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE bouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBouquetid );

				preparedStatement.setInt(1,bouquetid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBychannelid(int channelid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByChannelid = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE channelid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByChannelid );

				preparedStatement.setInt(1,channelid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setString(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIndate = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIndate );

				preparedStatement.setDate(1,indate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByOutdate = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByOutdate );

				preparedStatement.setDate(1,outdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcid = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcid );

				preparedStatement.setInt(1,vcid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findBysdate(Date sdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySdate = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE sdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySdate );

				preparedStatement.setDate(1,sdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersubbouquettranBean[] findByedate(Date edate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEdate = "SELECT  id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate FROM subscribersubbouquettran WHERE edate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEdate );

				preparedStatement.setDate(1,edate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setMode( resultSet.getString("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setVcid( resultSet.getInt("vcid"));

					// bean.setSdate( resultSet.getDate("sdate"));

					// bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersubbouquettranBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersubbouquettranBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( SubscribersubbouquettranBean bean, Connection conn ) throws Exception{

			// DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			// Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedvcchannelbindId = 0;

			// String sqlInsertAllStmt = "INSERT INTO subscribersubbouquettran( id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;
			
			String sqlInsertAllStmt = "INSERT INTO subscribersubbouquettran(subscriberid, bouquetid, channelid, mode, createby, indate, vcid, sdate, edate, subbouquetid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );
				

				preparedStatement.setInt(1, bean.getSubscriberid());

				preparedStatement.setInt(2, bean.getBouquetid());

				preparedStatement.setInt(3, bean.getChannelid());

				preparedStatement.setString(4, bean.getMode());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getIndate());

				// preparedStatement.setDate(8, bean.getOutdate());

				preparedStatement.setInt(7, bean.getVcid());

				//preparedStatement.setDate(10, bean.getSdate());

				//preparedStatement.setDate(11, bean.getEdate());
				
				preparedStatement.setTimestamp(8, bean.getSdate());

				if(bean.getEdate()!= null){
					
					preparedStatement.setTimestamp(9, bean.getEdate());
				
				}else{
					
					preparedStatement.setNull(9,java.sql.Types.TIMESTAMP);
					
				}
				
				preparedStatement.setInt(10,bean.getSubbouquetid());
				
				
				preparedStatement.executeUpdate();
				
				resultSet = preparedStatement.getGeneratedKeys();
				
				if(resultSet.next()){
			  	       
					System.out.println("GENERATED ID WHILE INSERT IN subscribersubbouquettran table: " + resultSet.getInt(1));
		  	       
					generatedvcchannelbindId = resultSet.getInt(1);
		  	    }

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( SubscribersubbouquettranBean bean, Connection conn )throws Exception{

			// DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			// Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			// String sqlUpdateAllStmt = "UPDATE subscribersubbouquettran SET  id = ?, subscriberid = ?, bouquetid = ?, channelid = ?, mode = ?, createby = ?, indate = ?, outdate = ?, vcid = ?, sdate = ?, edate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE subscribersubbouquettran SET mode = ?, outdate = ? WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
				
				preparedStatement.setString(1, bean.getMode());
				
				preparedStatement.setDate(2, bean.getOutdate());
				
				preparedStatement.setInt(3, bean.getId());
				
				
				/*preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getSubscriberid());

				preparedStatement.setInt(3, bean.getBouquetid());

				preparedStatement.setInt(4, bean.getChannelid());

				preparedStatement.setString(5, bean.getMode());

				preparedStatement.setInt(6, bean.getCreateby());

				preparedStatement.setDate(7, bean.getIndate());

				preparedStatement.setDate(8, bean.getOutdate());

				preparedStatement.setInt(9, bean.getVcid());

				// preparedStatement.setDate(10, bean.getSdate());

				// preparedStatement.setDate(11, bean.getEdate());
*/
				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM subscribersubbouquettran " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM subscribersubbouquettran WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteById );

				preparedStatement.setInt(1,id); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysubscriberid(int subscriberid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubscriberid = "DELETE FROM subscribersubbouquettran WHERE subscriberid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySubscriberid );

				preparedStatement.setInt(1,subscriberid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybouquetid(int bouquetid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBouquetid = "DELETE FROM subscribersubbouquettran WHERE bouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBouquetid );

				preparedStatement.setInt(1,bouquetid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBychannelid(int channelid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByChannelid = "DELETE FROM subscribersubbouquettran WHERE channelid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByChannelid );

				preparedStatement.setInt(1,channelid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMode = "DELETE FROM subscribersubbouquettran WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMode );

				preparedStatement.setString(1,mode); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM subscribersubbouquettran WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCreateby );

				preparedStatement.setInt(1,createby); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIndate = "DELETE FROM subscribersubbouquettran WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByIndate );

				preparedStatement.setDate(1,indate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByOutdate = "DELETE FROM subscribersubbouquettran WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByOutdate );

				preparedStatement.setDate(1,outdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByVcid = "DELETE FROM subscribersubbouquettran WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByVcid );

				preparedStatement.setInt(1,vcid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysdate(Date sdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySdate = "DELETE FROM subscribersubbouquettran WHERE sdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySdate );

				preparedStatement.setDate(1,sdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByedate(Date edate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEdate = "DELETE FROM subscribersubbouquettran WHERE edate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEdate );

				preparedStatement.setDate(1,edate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		
		// Call from ManagingComposer.java
		
		public ArrayList<SubscribersubbouquettranBean> find_subBouquet_ChannelList_modeIn(
				int _subscriberId, int i, int subbouquetid) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersubbouquettranBean[] beans = null ;

			ArrayList<SubscribersubbouquettranBean> subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>();

			String find_subBouquet_ChannelList_modeIn = "select id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate from cbiz.subscribersubbouquettran where subscriberid = ? and vcid = ? and mode = 'i'" ;
			
			try{
					preparedStatement = conn.prepareStatement( find_subBouquet_ChannelList_modeIn );

					preparedStatement.setInt(1,_subscriberId); 
					
					preparedStatement.setInt(2,i); 

					resultSet = preparedStatement.executeQuery();

					while(resultSet.next()){

						SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

						bean.setId( resultSet.getInt("id"));

						bean.setSubscriberid( resultSet.getInt("subscriberid"));

						bean.setBouquetid( resultSet.getInt("bouquetid"));

						bean.setChannelid( resultSet.getInt("channelid"));

						bean.setMode( resultSet.getString("mode"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setIndate( resultSet.getDate("indate"));

						bean.setOutdate( resultSet.getDate("outdate"));

						bean.setVcid( resultSet.getInt("vcid"));

						// bean.setSdate( resultSet.getDate("sdate"));

						// bean.setEdate( resultSet.getDate("edate"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));
						
						subscribersubbouquettranBeans.add(bean);

					}	
				
				
			}catch(Exception e){
				
				e.printStackTrace();
			
			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}
			
			return subscribersubbouquettranBeans;

		}

		
		// Call from SubscribersubbouquettranInfoUpdateHelper.java
		public List<SubscribersubbouquettranBean> fetchSubBouquet_ChannelList_modeIn(
				int _subscriberId, int _vcId, int subbouquetid, Connection conn) throws Exception {
			
			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null ;

			List<SubscribersubbouquettranBean> subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>();

			String fetchSubBouquet_ChannelList_modeIn = "select id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate from cbiz.subscribersubbouquettran where subscriberid = ? and vcid = ? and subbouquetid = ? and mode = 'i'";

			try{
					preparedStatement = conn.prepareStatement( fetchSubBouquet_ChannelList_modeIn );

					preparedStatement.setInt(1,_subscriberId); 
					
					preparedStatement.setInt(2,_vcId); 
					
					preparedStatement.setInt(3, subbouquetid);
	
					resultSet = preparedStatement.executeQuery();

					while(resultSet.next()){

						SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();
	
						bean.setId( resultSet.getInt("id"));
	
						bean.setSubscriberid( resultSet.getInt("subscriberid"));
	
						bean.setBouquetid( resultSet.getInt("bouquetid"));
	
						bean.setChannelid( resultSet.getInt("channelid"));
	
						bean.setMode( resultSet.getString("mode"));
	
						bean.setCreateby( resultSet.getInt("createby"));
	
						bean.setIndate( resultSet.getDate("indate"));
	
						bean.setOutdate( resultSet.getDate("outdate"));
	
						bean.setVcid( resultSet.getInt("vcid"));
	
						// bean.setSdate( resultSet.getDate("sdate"));
	
						// bean.setEdate( resultSet.getDate("edate"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));
						
						subscribersubbouquettranBeans.add(bean);

				}	
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{
				
				try{ resultSet.close();preparedStatement.close();}catch(SQLException ioe){}
				
			}
			
			return subscribersubbouquettranBeans;
		}

		
		// Call from SubscribersubbouquettranInfoUpdateHelper.java
		
		public void updateEDates(
				SubscribersubbouquettranBean subscribersubbouquettranBean,
				Connection conn) throws Exception {
			
			PreparedStatement preparedStatement = null;
			
			String sqlUpdateAllStmt = "UPDATE subscribersubbouquettran SET  mode = ?, outdate = ?,edate = ? WHERE id = ? " ;
			
			try{
				  preparedStatement = conn.prepareStatement(sqlUpdateAllStmt);
				  
				  preparedStatement.setString(1,subscribersubbouquettranBean.getMode());
				  
				  preparedStatement.setDate(2, subscribersubbouquettranBean.getOutdate());
				  
				  if(subscribersubbouquettranBean.getEdate()!= null){
						
					  preparedStatement.setTimestamp(3, subscribersubbouquettranBean.getEdate());
					
				  }else{
						
					  preparedStatement.setNull(3,java.sql.Types.TIMESTAMP);
						
				  }
				
				  preparedStatement.setInt(4, subscribersubbouquettranBean.getId());
				  
				  preparedStatement.executeUpdate();
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{

				try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}
			
		}
		
		
		// Call from ManagingComposer.java
		
		public List<SubscribersubbouquettranBean> findByvc_idAndSubscriber_id_modeIn(
				int vcId, Integer subscriberId) throws Exception {
			
			ArrayList<SubscribersubbouquettranBean> subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet resultSet = null;
		    
		    String findByvc_idAndSubscriber_id_modeIn = "select id, subscriberid, bouquetid, channelid, mode, createby, indate, outdate, vcid, sdate, edate, subbouquetid from cbiz.subscribersubbouquettran where subscriberid = ? and vcid = ? and mode = 'i'";
		    
		    try{
		    	
		    		pstmt = conn.prepareStatement( findByvc_idAndSubscriber_id_modeIn );
		    		
		    		pstmt.setInt(1, subscriberId);
		    		
		    		pstmt.setInt(2, vcId);

		    		resultSet = pstmt.executeQuery();
		    	
		    		while(resultSet.next()){
		    			
		    			
		    			SubscribersubbouquettranBean bean = new SubscribersubbouquettranBean();

						bean.setId( resultSet.getInt("id"));

						bean.setSubscriberid( resultSet.getInt("subscriberid"));

						bean.setBouquetid( resultSet.getInt("bouquetid"));

						bean.setChannelid( resultSet.getInt("channelid"));

						bean.setMode( resultSet.getString("mode"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setIndate( resultSet.getDate("indate"));

						bean.setOutdate( resultSet.getDate("outdate"));

						bean.setVcid( resultSet.getInt("vcid"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));

		    			if(resultSet.getInt("subbouquetid") == 0){  // NULL returned
		    				
		    				bean.setSubbouquetid(0);
		    				
		    			}else{
		    				
		    				bean.setSubbouquetid(resultSet.getInt("subbouquetid"));
		    			}
		    			
		    			subscribersubbouquettranBeans.add(bean);
		    			
		    		}
		    	
		    }catch(Exception e){
		    	
		    	e.printStackTrace();
		    	
		    	throw new Exception();
		    	
		    }finally{
				
				resultSet.close();
		    	
		    	pstmt.close();
		    	
		    	conn.close();
		    	
		    	dbDatabaseHandler.closeConnection();
				
			}
			
		    return subscribersubbouquettranBeans;

		}

	}

