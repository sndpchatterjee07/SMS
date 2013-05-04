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

	public class CasmasterDAO {

		public CasmasterBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster " ;

			return null ;

		}

		public CasmasterBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findByip(String ip )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIp = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE ip = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIp );

				preparedStatement.setString(1,ip); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findByport(String port )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPort = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE port = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPort );

				preparedStatement.setString(1,port); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findByfactoryname(String factoryname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByFactoryname = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE factoryname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByFactoryname );

				preparedStatement.setString(1,factoryname); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public CasmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			CasmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate FROM casmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					CasmasterBean bean = new CasmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setIp( resultSet.getString("ip"));

					bean.setPort( resultSet.getString("port"));

					bean.setFactoryname( resultSet.getString("factoryname"));

					bean.setStatus( resultSet.getString("status"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new CasmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (CasmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( CasmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO casmaster( id, name, ip, port, factoryname, status, extra, createby, createdate, modifyby, modifydate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setString(3, bean.getIp());

				preparedStatement.setString(4, bean.getPort());

				preparedStatement.setString(5, bean.getFactoryname());

				preparedStatement.setString(6, bean.getStatus());

				preparedStatement.setString(7, bean.getExtra());

				preparedStatement.setInt(8, bean.getCreateby());

				preparedStatement.setDate(9, bean.getCreatedate());

				preparedStatement.setInt(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( CasmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE casmaster SET  id = ?, name = ?, ip = ?, port = ?, factoryname = ?, status = ?, extra = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setString(3, bean.getIp());

				preparedStatement.setString(4, bean.getPort());

				preparedStatement.setString(5, bean.getFactoryname());

				preparedStatement.setString(6, bean.getStatus());

				preparedStatement.setString(7, bean.getExtra());

				preparedStatement.setInt(8, bean.getCreateby());

				preparedStatement.setDate(9, bean.getCreatedate());

				preparedStatement.setInt(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM casmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM casmaster WHERE id = ? " ;

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

			String sqlDeleteByName = "DELETE FROM casmaster WHERE name = ? " ;

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

		public void deleteByip(String ip )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIp = "DELETE FROM casmaster WHERE ip = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByIp );

				preparedStatement.setString(1,ip); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByport(String port )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPort = "DELETE FROM casmaster WHERE port = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPort );

				preparedStatement.setString(1,port); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByfactoryname(String factoryname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByFactoryname = "DELETE FROM casmaster WHERE factoryname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByFactoryname );

				preparedStatement.setString(1,factoryname); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStatus = "DELETE FROM casmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStatus );

				preparedStatement.setString(1,status); 

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

			String sqlDeleteByExtra = "DELETE FROM casmaster WHERE extra = ? " ;

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

		public void deleteBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM casmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM casmaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM casmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM casmaster WHERE modifydate = ? " ;

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

	}

