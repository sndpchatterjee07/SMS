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

	public class BillcyclemasterDAO {

		public BillcyclemasterBean[] findAll( )throws Exception{
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();


			String sqlSelectByAll = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster order by name " ;

			try{

					preparedStatement = conn.prepareStatement( sqlSelectByAll );
					
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						BillcyclemasterBean bean = new BillcyclemasterBean();

						bean.setId( resultSet.getInt("id"));

						bean.setName( resultSet.getString("name"));

						bean.setStartdate( resultSet.getInt("startdate"));

						bean.setDescription( resultSet.getString("description"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setEnddate( resultSet.getInt("enddate"));

						beansList.add(bean);
					}
					
					Object[] objectArray = beansList.toArray();

					beans = new BillcyclemasterBean[objectArray.length];

					for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

						beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

					}
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;
		
		}

		
		
		
		
		public BillcyclemasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			// BillcyclemasterBean[] beans = null ;

			// ArrayList beansList = new ArrayList();
			
			BillcyclemasterBean bean = new BillcyclemasterBean();

			String sqlSelectById = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					// beansList.add(bean);

				}

				/*Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}*/

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public BillcyclemasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBystartdate(int startdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStartdate = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE startdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStartdate );

				preparedStatement.setInt(1,startdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BillcyclemasterBean[] findByenddate(int enddate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BillcyclemasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEnddate = "SELECT  id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate FROM billcyclemaster WHERE enddate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEnddate );

				preparedStatement.setInt(1,enddate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BillcyclemasterBean bean = new BillcyclemasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setStartdate( resultSet.getInt("startdate"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setEnddate( resultSet.getInt("enddate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BillcyclemasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BillcyclemasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( BillcyclemasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO billcyclemaster( id, name, startdate, description, createby, createdate, modifyby, modifydate, enddate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setInt(3, bean.getStartdate());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setInt(9, bean.getEnddate());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( BillcyclemasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE billcyclemaster SET  id = ?, name = ?, startdate = ?, description = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, enddate = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setInt(3, bean.getStartdate());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setInt(9, bean.getEnddate());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM billcyclemaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM billcyclemaster WHERE id = ? " ;

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

		public void deleteByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByName = "DELETE FROM billcyclemaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByName );

				preparedStatement.setString(1,name); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBystartdate(int startdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStartdate = "DELETE FROM billcyclemaster WHERE startdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStartdate );

				preparedStatement.setInt(1,startdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDescription = "DELETE FROM billcyclemaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDescription );

				preparedStatement.setString(1,description); 

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

			String sqlDeleteByCreateby = "DELETE FROM billcyclemaster WHERE createby = ? " ;

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

		public void deleteBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreatedate = "DELETE FROM billcyclemaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCreatedate );

				preparedStatement.setDate(1,createdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByModifyby = "DELETE FROM billcyclemaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModifyby );

				preparedStatement.setInt(1,modifyby); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByModifydate = "DELETE FROM billcyclemaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModifydate );

				preparedStatement.setDate(1,modifydate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByenddate(int enddate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEnddate = "DELETE FROM billcyclemaster WHERE enddate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEnddate );

				preparedStatement.setInt(1,enddate); 

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

