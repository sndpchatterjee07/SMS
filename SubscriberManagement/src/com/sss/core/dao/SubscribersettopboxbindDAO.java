	package com.sss.core.dao ;

	import java.util.ArrayList ;

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

	public class SubscribersettopboxbindDAO {

		public SubscribersettopboxbindBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind " ;

			return null ;

		}

		public SubscribersettopboxbindBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersettopboxbindBean[] findBysubscriber_id_modeIn(int subscriber_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubscriber_id = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE subscriber_id = ? and mode='i' " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubscriber_id );

				preparedStatement.setInt(1,subscriber_id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersettopboxbindBean[] findBysettopbox_id(int settopbox_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySettopbox_id = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE settopbox_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySettopbox_id );

				preparedStatement.setInt(1,settopbox_id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersettopboxbindBean[] findByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIndate = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIndate );

				preparedStatement.setDate(1,indate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersettopboxbindBean[] findBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setString(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribersettopboxbindBean[] findByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribersettopboxbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByOutdate = "SELECT  id, subscriber_id, settopbox_id, indate, mode, outdate FROM subscribersettopboxbind WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByOutdate );

				preparedStatement.setDate(1,outdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribersettopboxbindBean bean = new SubscribersettopboxbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSubscriber_id( resultSet.getInt("subscriber_id"));

					bean.setSettopbox_id( resultSet.getInt("settopbox_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribersettopboxbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribersettopboxbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public int insertAllCols( SubscribersettopboxbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			// Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedsubscriberstbbindId = 0;

			//String sqlInsertAllStmt = "INSERT INTO subscribersettopboxbind( id, subscriber_id, settopbox_id, indate, mode, outdate ) VALUES ( ? , ? , ? , ? , ? , ?  )" ;
			String sqlInsertAllStmt = "INSERT INTO subscribersettopboxbind(subscriber_id,settopbox_id,indate) VALUES (?,?,?)" ;

			try{

					preparedStatement = conn.prepareStatement(sqlInsertAllStmt,preparedStatement.RETURN_GENERATED_KEYS );
	
					/*preparedStatement.setInt(1, bean.getId());*/
	
					preparedStatement.setInt(1, bean.getSubscriber_id());
	
					preparedStatement.setInt(2, bean.getSettopbox_id());
	
					preparedStatement.setDate(3, bean.getIndate());
	
					/*preparedStatement.setString(5, bean.getMode());*/
	
					/*preparedStatement.setDate(6, bean.getOutdate());*/
	
					preparedStatement.executeUpdate();
				
					resultSet = preparedStatement.getGeneratedKeys();
			  	    
					if(resultSet.next()){
			  	       
						System.out.println("generatedsubscriberstbbindId: " + resultSet.getInt(1));
			  	       
						generatedsubscriberstbbindId = resultSet.getInt(1);
			  	    }

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}
			return generatedsubscriberstbbindId;

		}

		public void updateAllCols( SubscribersettopboxbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			//String sqlUpdateAllStmt = "UPDATE subscribersettopboxbind SET  id = ?, subscriber_id = ?, settopbox_id = ?, indate = ?, mode = ?, outdate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE subscribersettopboxbind SET mode = ?, outdate = ? WHERE id = ? " ;

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
					
					preparedStatement.setString(1, bean.getMode());
					
					preparedStatement.setDate(2, bean.getOutdate());
	
					preparedStatement.setInt(3, bean.getId());
	
					/*preparedStatement.setInt(2, bean.getSubscriber_id());
	
					preparedStatement.setInt(3, bean.getSettopbox_id());
	
					preparedStatement.setDate(4, bean.getIndate());
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

			String sqlDeleteAll = "DELETE FROM subscribersettopboxbind " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM subscribersettopboxbind WHERE id = ? " ;

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

		public void deleteBysubscriber_id(int subscriber_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubscriber_id = "DELETE FROM subscribersettopboxbind WHERE subscriber_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySubscriber_id );

				preparedStatement.setInt(1,subscriber_id); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysettopbox_id(int settopbox_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySettopbox_id = "DELETE FROM subscribersettopboxbind WHERE settopbox_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySettopbox_id );

				preparedStatement.setInt(1,settopbox_id); 

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

			String sqlDeleteByIndate = "DELETE FROM subscribersettopboxbind WHERE indate = ? " ;

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

		public void deleteBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMode = "DELETE FROM subscribersettopboxbind WHERE mode = ? " ;

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

		public void deleteByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByOutdate = "DELETE FROM subscribersettopboxbind WHERE outdate = ? " ;

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

		
		// Call from MangingComposer.java
		public void removeSubscriberStbBind(
				SubscribersettopboxbindBean bean,
				Connection conn) throws Exception {

			PreparedStatement preparedStatement = null ;
			
			String sqlUpdateAllStmt = "UPDATE subscribersettopboxbind SET mode = ?, outdate = ? WHERE subscriber_id = ? " ;

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
					
					preparedStatement.setString(1, bean.getMode());
					
					preparedStatement.setDate(2, bean.getOutdate());
	
					preparedStatement.setInt(3, bean.getSubscriber_id());
					
					preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		
			
			
		}

	}

