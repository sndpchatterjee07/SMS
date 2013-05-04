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

	public class SettopboxvcbindDAO {

		public SettopboxvcbindBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind " ;

			return null ;

		}

		public SettopboxvcbindBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findBysettopboxid_modeIn(int settopboxid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySettopboxid = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE settopboxid = ? and mode='i' " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySettopboxid );

				preparedStatement.setInt(1,settopboxid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcid = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcid );

				preparedStatement.setInt(1,vcid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIndate = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIndate );

				preparedStatement.setDate(1,indate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setString(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByOutdate = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByOutdate );

				preparedStatement.setDate(1,outdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxvcbindBean[] findByfiered(String fiered )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxvcbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByFiered = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE fiered = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByFiered );

				preparedStatement.setString(1,fiered); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxvcbindBean bean = new SettopboxvcbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setSettopboxid( resultSet.getInt("settopboxid"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					bean.setFiered( resultSet.getString("fiered"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxvcbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxvcbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public int insertAllCols( SettopboxvcbindBean bean, Connection conn )throws Exception{

			// DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			// Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedstbvcBindId = 0;

			//String sqlInsertAllStmt = "INSERT INTO settopboxvcbind( id, settopboxid, vcid, indate, mode, outdate, fiered ) VALUES ( ? , ? , ? , ? , ? , ? , ?  )" ;
			String sqlInsertAllStmt = "INSERT INTO settopboxvcbind(settopboxid,vcid,indate) VALUES (?,?,?)" ;

			try{

					preparedStatement = conn.prepareStatement(sqlInsertAllStmt,preparedStatement.RETURN_GENERATED_KEYS);
	
					/*preparedStatement.setInt(1, bean.getId());*/
	
					preparedStatement.setInt(1, bean.getSettopboxid());
	
					preparedStatement.setInt(2, bean.getVcid());
	
					preparedStatement.setDate(3, bean.getIndate());
	
					/*preparedStatement.setString(5, bean.getMode());
	
					preparedStatement.setDate(6, bean.getOutdate());
	
					preparedStatement.setString(7, bean.getFiered());
	*/
					preparedStatement.executeUpdate();
					
					resultSet = preparedStatement.getGeneratedKeys();
				
			  	    if(resultSet.next()){
			  	    	
			  	       System.out.println("generatedstbvcBindId: " + resultSet.getInt(1));
			  	       
			  	       generatedstbvcBindId = resultSet.getInt(1);
			  	    }

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}
			return generatedstbvcBindId;

		}

		public void updateAllCols( SettopboxvcbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			// String sqlUpdateAllStmt = "UPDATE settopboxvcbind SET  id = ?, settopboxid = ?, vcid = ?, indate = ?, mode = ?, outdate = ?, fiered = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE settopboxvcbind SET mode = ?, outdate = ? WHERE id = ? " ;

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
					
					preparedStatement.setString(1, bean.getMode());
					
					preparedStatement.setDate(2, bean.getOutdate());
	
					preparedStatement.setInt(3, bean.getId());
	
					/*preparedStatement.setInt(2, bean.getSettopboxid());
	
					preparedStatement.setInt(3, bean.getVcid());
	
					preparedStatement.setDate(4, bean.getIndate());
	
					preparedStatement.setString(7, bean.getFiered());
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

			String sqlDeleteAll = "DELETE FROM settopboxvcbind " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM settopboxvcbind WHERE id = ? " ;

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

		public void deleteBysettopboxid(int settopboxid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySettopboxid = "DELETE FROM settopboxvcbind WHERE settopboxid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySettopboxid );

				preparedStatement.setInt(1,settopboxid); 

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

			String sqlDeleteByVcid = "DELETE FROM settopboxvcbind WHERE vcid = ? " ;

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

		public void deleteByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIndate = "DELETE FROM settopboxvcbind WHERE indate = ? " ;

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

			String sqlDeleteByMode = "DELETE FROM settopboxvcbind WHERE mode = ? " ;

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

			String sqlDeleteByOutdate = "DELETE FROM settopboxvcbind WHERE outdate = ? " ;

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

		public void deleteByfiered(String fiered )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByFiered = "DELETE FROM settopboxvcbind WHERE fiered = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByFiered );

				preparedStatement.setString(1,fiered); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public boolean findBySTBandVCid(int settopboxid, int vcid) throws Exception {
		
			boolean found = false ;
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			String sqlSelectById = "SELECT  id, settopboxid, vcid, indate, mode, outdate, fiered FROM settopboxvcbind WHERE settopboxid = ?" +
									" and vcid =? and mode ='i' " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,settopboxid); 

				preparedStatement.setInt(2,vcid);
				
				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){
						
					found = true ;
					
					break;
					
				}

			}catch(Exception e){

				e.printStackTrace();
				throw new Exception("BIND ALREADY EXIST");

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return found;
		}

		
		
		// Call to ManagingComposer.java
		public void removeStbVcBind(SettopboxvcbindBean bean,
				Connection conn) throws Exception {

			PreparedStatement preparedStatement = null ;
			
			String sqlUpdateAllStmt = "UPDATE settopboxvcbind SET mode = ?, outdate = ? WHERE settopboxid = ? " ;

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
					
					preparedStatement.setString(1, bean.getMode());
					
					preparedStatement.setDate(2, bean.getOutdate());
	
					preparedStatement.setInt(3, bean.getSettopboxid());
					
					preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		
			
			
		}

	}

