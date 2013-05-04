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

	public class AreamasterDAO {

		public AreamasterBean[] findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();
			
			String sqlSelectByAll = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster order by name" ;
			
			try{
					preparedStatement = conn.prepareStatement( sqlSelectByAll );
					
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){

						AreamasterBean bean = new AreamasterBean();

						bean.setId( resultSet.getInt("id"));

						bean.setCode( resultSet.getString("code"));

						bean.setName( resultSet.getString("name"));

						bean.setDescription( resultSet.getString("description"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setHistorypresent( resultSet.getString("historypresent"));

						bean.setExtra( resultSet.getString("extra"));

						bean.setSubzoneid( resultSet.getInt("subzoneid"));

						beansList.add(bean);

					}
					Object[] objectArray = beansList.toArray();

					beans = new AreamasterBean[objectArray.length];

					for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

						beans[jindex] = (AreamasterBean)objectArray[jindex];

					}
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			// AreamasterBean[] beans = null ;

			// ArrayList beansList = new ArrayList();
			
			AreamasterBean bean = new AreamasterBean();

			String sqlSelectById = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					//beansList.add(bean);

				}

				/*Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}*/

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public AreamasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public AreamasterBean[] findBysubzoneid(int subzoneid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			AreamasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubzoneid = "SELECT  id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid FROM areamaster WHERE subzoneid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubzoneid );

				preparedStatement.setInt(1,subzoneid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					AreamasterBean bean = new AreamasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setSubzoneid( resultSet.getInt("subzoneid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new AreamasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (AreamasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( AreamasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO areamaster( id, code, name, description, createby, createdate, modifyby, modifydate, historypresent, extra, subzoneid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setString(9, bean.getHistorypresent());

				preparedStatement.setString(10, bean.getExtra());

				preparedStatement.setInt(11, bean.getSubzoneid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( AreamasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE areamaster SET  id = ?, code = ?, name = ?, description = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, historypresent = ?, extra = ?, subzoneid = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setString(9, bean.getHistorypresent());

				preparedStatement.setString(10, bean.getExtra());

				preparedStatement.setInt(11, bean.getSubzoneid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM areamaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM areamaster WHERE id = ? " ;

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

		public void deleteBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCode = "DELETE FROM areamaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCode );

				preparedStatement.setString(1,code); 

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

			String sqlDeleteByName = "DELETE FROM areamaster WHERE name = ? " ;

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

		public void deleteBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDescription = "DELETE FROM areamaster WHERE description = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM areamaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM areamaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM areamaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM areamaster WHERE modifydate = ? " ;

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

		public void deleteByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByHistorypresent = "DELETE FROM areamaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByExtra = "DELETE FROM areamaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByExtra );

				preparedStatement.setString(1,extra); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysubzoneid(int subzoneid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubzoneid = "DELETE FROM areamaster WHERE subzoneid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySubzoneid );

				preparedStatement.setInt(1,subzoneid); 

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

