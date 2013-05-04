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

	public class TaxcombinationmasterDAO {

		public TaxcombinationmasterBean[] findAll( )throws Exception{
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
			Connection conn = dbDatabaseHandler.getConnection();
			
			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAll = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster " ;

			try{
					preparedStatement = conn.prepareStatement( sqlSelectByAll );
					
					resultSet = preparedStatement.executeQuery();

					while(resultSet.next()){

						TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

						bean.setId( resultSet.getInt("id"));

						bean.setCode( resultSet.getString("code"));

						bean.setDescription( resultSet.getString("description"));

						bean.setHistorypresent( resultSet.getString("historypresent"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setExtra( resultSet.getString("extra"));

						bean.setCesstaxid( resultSet.getInt("cesstaxid"));

						beansList.add(bean);

					}

					Object[] objectArray = beansList.toArray();

					beans = new TaxcombinationmasterBean[objectArray.length];

					for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

						beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

					}
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;
		}

		
		
		
		
		
		
		
		public TaxcombinationmasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			//TaxcombinationmasterBean[] beans = null ;

			//ArrayList beansList = new ArrayList();
			
			TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

			String sqlSelectById = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){


					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					//beansList.add(bean);

				}

				/*Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}*/

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public TaxcombinationmasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public TaxcombinationmasterBean[] findBycesstaxid(int cesstaxid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			TaxcombinationmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCesstaxid = "SELECT  id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid FROM taxcombinationmaster WHERE cesstaxid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCesstaxid );

				preparedStatement.setInt(1,cesstaxid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					TaxcombinationmasterBean bean = new TaxcombinationmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setDescription( resultSet.getString("description"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCesstaxid( resultSet.getInt("cesstaxid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new TaxcombinationmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (TaxcombinationmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( TaxcombinationmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO taxcombinationmaster( id, code, description, historypresent, createby, createdate, modifyby, modifydate, extra, cesstaxid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getDescription());

				preparedStatement.setString(4, bean.getHistorypresent());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setString(9, bean.getExtra());

				preparedStatement.setInt(10, bean.getCesstaxid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( TaxcombinationmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE taxcombinationmaster SET  id = ?, code = ?, description = ?, historypresent = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, extra = ?, cesstaxid = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getDescription());

				preparedStatement.setString(4, bean.getHistorypresent());

				preparedStatement.setInt(5, bean.getCreateby());

				preparedStatement.setDate(6, bean.getCreatedate());

				preparedStatement.setInt(7, bean.getModifyby());

				preparedStatement.setDate(8, bean.getModifydate());

				preparedStatement.setString(9, bean.getExtra());

				preparedStatement.setInt(10, bean.getCesstaxid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM taxcombinationmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM taxcombinationmaster WHERE id = ? " ;

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

			String sqlDeleteByCode = "DELETE FROM taxcombinationmaster WHERE code = ? " ;

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

		public void deleteBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDescription = "DELETE FROM taxcombinationmaster WHERE description = ? " ;

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

		public void deleteByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByHistorypresent = "DELETE FROM taxcombinationmaster WHERE historypresent = ? " ;

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

		public void deleteBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM taxcombinationmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM taxcombinationmaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM taxcombinationmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM taxcombinationmaster WHERE modifydate = ? " ;

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

		public void deleteByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByExtra = "DELETE FROM taxcombinationmaster WHERE extra = ? " ;

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

		public void deleteBycesstaxid(int cesstaxid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCesstaxid = "DELETE FROM taxcombinationmaster WHERE cesstaxid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCesstaxid );

				preparedStatement.setInt(1,cesstaxid); 

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

