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

	public class CasproductDAO {

		public CasproductBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, productnumber, productname, type FROM casproduct " ;

			return null ;

		}

		public CasproductBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasproductBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, productnumber, productname, type FROM casproduct WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasproductBean bean = new CasproductBean();

					bean.setId( resultSet.getInt("id"));

					bean.setProductnumber( resultSet.getInt("productnumber"));

					bean.setProductname( resultSet.getString("productname"));

					bean.setType( resultSet.getInt("type"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasproductBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasproductBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasproductBean[] findByproductnumber(int productnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasproductBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByProductnumber = "SELECT  id, productnumber, productname, type FROM casproduct WHERE productnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByProductnumber );

				preparedStatement.setInt(1,productnumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasproductBean bean = new CasproductBean();

					bean.setId( resultSet.getInt("id"));

					bean.setProductnumber( resultSet.getInt("productnumber"));

					bean.setProductname( resultSet.getString("productname"));

					bean.setType( resultSet.getInt("type"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasproductBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasproductBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasproductBean[] findByproductname(String productname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasproductBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByProductname = "SELECT  id, productnumber, productname, type FROM casproduct WHERE productname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByProductname );

				preparedStatement.setString(1,productname); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasproductBean bean = new CasproductBean();

					bean.setId( resultSet.getInt("id"));

					bean.setProductnumber( resultSet.getInt("productnumber"));

					bean.setProductname( resultSet.getString("productname"));

					bean.setType( resultSet.getInt("type"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasproductBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasproductBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasproductBean[] findBytype(int type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasproductBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByType = "SELECT  id, productnumber, productname, type FROM casproduct WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByType );

				preparedStatement.setInt(1,type); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasproductBean bean = new CasproductBean();

					bean.setId( resultSet.getInt("id"));

					bean.setProductnumber( resultSet.getInt("productnumber"));

					bean.setProductname( resultSet.getString("productname"));

					bean.setType( resultSet.getInt("type"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasproductBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasproductBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( CasproductBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO casproduct( id, productnumber, productname, type ) VALUES ( ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getProductnumber());

				preparedStatement.setString(3, bean.getProductname());

				preparedStatement.setInt(4, bean.getType());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( CasproductBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE casproduct SET  id = ?, productnumber = ?, productname = ?, type = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getProductnumber());

				preparedStatement.setString(3, bean.getProductname());

				preparedStatement.setInt(4, bean.getType());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM casproduct " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM casproduct WHERE id = ? " ;

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

		public void deleteByproductnumber(int productnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByProductnumber = "DELETE FROM casproduct WHERE productnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByProductnumber );

				preparedStatement.setInt(1,productnumber); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByproductname(String productname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByProductname = "DELETE FROM casproduct WHERE productname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByProductname );

				preparedStatement.setString(1,productname); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBytype(int type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByType = "DELETE FROM casproduct WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByType );

				preparedStatement.setInt(1,type); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

	}

