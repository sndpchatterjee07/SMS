	package com.sss.core.dao ;

	import java.util.ArrayList ;
import java.util.List;

	import java.sql.* ;

	import java.io.* ;

	import com.sss.core.bean.* ;

import com.sss.core.database.* ;

	public class SubbouquetchannelbindDAO {

		public SubbouquetchannelbindBean[] findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAll = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBybouquetid(int bouquetid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBouquetid = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE bouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBouquetid );

				preparedStatement.setInt(1,bouquetid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBysubbouquetid(int subbouquetid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubbouquetid = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE subbouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubbouquetid );

				preparedStatement.setInt(1,subbouquetid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBysubbouquetname(String subbouquetname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubbouquetname = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE subbouquetname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubbouquetname );

				preparedStatement.setString(1,subbouquetname); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBychannelid(int channelid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByChannelid = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE channelid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByChannelid );

				preparedStatement.setInt(1,channelid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubbouquetchannelbindBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubbouquetchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate FROM subbouquetchannelbind WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setBouquetid( resultSet.getInt("bouquetid"));

					bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

					bean.setSubbouquetname( resultSet.getString("subbouquetname"));

					bean.setChannelid( resultSet.getInt("channelid"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubbouquetchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubbouquetchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( SubbouquetchannelbindBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO subbouquetchannelbind( id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getBouquetid());

				preparedStatement.setInt(3, bean.getSubbouquetid());

				preparedStatement.setString(4, bean.getSubbouquetname());

				preparedStatement.setInt(5, bean.getChannelid());

				preparedStatement.setString(6, bean.getStatus());

				preparedStatement.setInt(7, bean.getCreateby());

				preparedStatement.setDate(8, bean.getCreatedate());

				preparedStatement.setInt(9, bean.getModifyby());

				preparedStatement.setDate(10, bean.getModifydate());

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				conn.rollback();

				e.printStackTrace();

				throw new Exception(e.getMessage());

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( SubbouquetchannelbindBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE subbouquetchannelbind SET  id = ?, bouquetid = ?, subbouquetid = ?, subbouquetname = ?, channelid = ?, status = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ? WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getBouquetid());

				preparedStatement.setInt(3, bean.getSubbouquetid());

				preparedStatement.setString(4, bean.getSubbouquetname());

				preparedStatement.setInt(5, bean.getChannelid());

				preparedStatement.setString(6, bean.getStatus());

				preparedStatement.setInt(7, bean.getCreateby());

				preparedStatement.setDate(8, bean.getCreatedate());

				preparedStatement.setInt(9, bean.getModifyby());

				preparedStatement.setDate(10, bean.getModifydate());

				preparedStatement.setInt(11, bean.getId());

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				conn.rollback();

				e.printStackTrace();

				throw new Exception(e.getMessage());

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM subbouquetchannelbind " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM subbouquetchannelbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteById );

				preparedStatement.setInt(1,id); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByBouquetid = "DELETE FROM subbouquetchannelbind WHERE bouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBouquetid );

				preparedStatement.setInt(1,bouquetid); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysubbouquetid(int subbouquetid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubbouquetid = "DELETE FROM subbouquetchannelbind WHERE subbouquetid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySubbouquetid );

				preparedStatement.setInt(1,subbouquetid); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysubbouquetname(String subbouquetname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubbouquetname = "DELETE FROM subbouquetchannelbind WHERE subbouquetname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySubbouquetname );

				preparedStatement.setString(1,subbouquetname); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByChannelid = "DELETE FROM subbouquetchannelbind WHERE channelid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByChannelid );

				preparedStatement.setInt(1,channelid); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByStatus = "DELETE FROM subbouquetchannelbind WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStatus );

				preparedStatement.setString(1,status); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByCreateby = "DELETE FROM subbouquetchannelbind WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCreateby );

				preparedStatement.setInt(1,createby); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByCreatedate = "DELETE FROM subbouquetchannelbind WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCreatedate );

				preparedStatement.setDate(1,createdate); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByModifyby = "DELETE FROM subbouquetchannelbind WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModifyby );

				preparedStatement.setInt(1,modifyby); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

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

			String sqlDeleteByModifydate = "DELETE FROM subbouquetchannelbind WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModifydate );

				preparedStatement.setDate(1,modifydate); 

				preparedStatement.executeUpdate();

				conn.commit();

			}catch(Exception e){

				e.printStackTrace();

				conn.rollback();

				throw new Exception(e.getMessage());

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		
		// Call from SubBouquetSelectDialogController.java
		
		public ArrayList<SubbouquetchannelbindBean> findBybouquetidAndStatus(
				int bouquetId, String status) throws Exception {
			
			ArrayList<SubbouquetchannelbindBean> subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet resultSet = null;
		    
		    String findBybouquetidAndStatus = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate from cbiz.subbouquetchannelbind where bouquetid = ? and status = ? group by subbouquetid";
		    
		    //String findBybouquetidAndStatus = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate , sdate , edate from cbiz.subbouquetchannelbind where bouquetid = ? and status = ? group by subbouquetid";
		    
		    try{
		    		
		    	   pstmt = conn.prepareStatement(findBybouquetidAndStatus);
		    	   
		    	   pstmt.setInt(1,bouquetId);
		    	   
		    	   pstmt.setString(2, status);
		    	   
		    	   resultSet = pstmt.executeQuery();
		    	   
		    	   while(resultSet.next()){

		    		   SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

						bean.setId( resultSet.getInt("id"));

						bean.setBouquetid( resultSet.getInt("bouquetid"));

						bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

						bean.setSubbouquetname( resultSet.getString("subbouquetname"));

						bean.setChannelid( resultSet.getInt("channelid"));

						bean.setStatus( resultSet.getString("status"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));
						
						subbouquetchannelbindBeans.add(bean);
		    		   
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
			
		    
		    return subbouquetchannelbindBeans;
			
			
		}

		
		
		// Call from SubBouquetSelectDialogController.java,ManagingComposer.java
		public List<SubbouquetchannelbindBean> findAllSubBouquets() throws Exception {
			
			ArrayList<SubbouquetchannelbindBean> subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet resultSet = null;
		    
		    String findAllSubBouquets = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate from cbiz.subbouquetchannelbind group by subbouquetid";
		    
		   // String findAllSubBouquets = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate , sdate , edate from cbiz.subbouquetchannelbind group by subbouquetid";
		    
		    try{
		    		
		    	   pstmt = conn.prepareStatement(findAllSubBouquets);
		    	   		    	   
		    	   resultSet = pstmt.executeQuery();
		    	   
		    	   while(resultSet.next()){

		    		    SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

						bean.setId( resultSet.getInt("id"));

						bean.setBouquetid( resultSet.getInt("bouquetid"));

						bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

						bean.setSubbouquetname( resultSet.getString("subbouquetname"));

						bean.setChannelid( resultSet.getInt("channelid"));

						bean.setStatus( resultSet.getString("status"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));
						
						subbouquetchannelbindBeans.add(bean);
		    		   
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
		    
		    return subbouquetchannelbindBeans;

		}

		
		
		// Call from ManagingComposer.java
		
		public List<SubbouquetchannelbindBean> findChannelsBySubBouquetId(
				int subbouquetid) throws Exception {
			
			ArrayList<SubbouquetchannelbindBean> subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet resultSet = null;
		    
		    String findChannelsBySubBouquetId = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate from cbiz.subbouquetchannelbind where subbouquetid = ? ";
		    
		    // String findChannelsBySubBouquetId = "select id, bouquetid, subbouquetid, subbouquetname, channelid, status, createby, createdate, modifyby, modifydate , sdate , edate from cbiz.subbouquetchannelbind where subbouquetid = ? ";
		    
		    try{
		    		
		    	   pstmt = conn.prepareStatement(findChannelsBySubBouquetId);
		    	   
		    	   pstmt.setInt(1,subbouquetid);
		    	   		    	   
		    	   resultSet = pstmt.executeQuery();
		    	   
		    	   while(resultSet.next()){

		    		    SubbouquetchannelbindBean bean = new SubbouquetchannelbindBean();

						bean.setId( resultSet.getInt("id"));

						bean.setBouquetid( resultSet.getInt("bouquetid"));

						bean.setSubbouquetid( resultSet.getInt("subbouquetid"));

						bean.setSubbouquetname( resultSet.getString("subbouquetname"));

						bean.setChannelid( resultSet.getInt("channelid"));

						bean.setStatus( resultSet.getString("status"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));
						
						subbouquetchannelbindBeans.add(bean);
		    		   
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
		    
		    return subbouquetchannelbindBeans;

			
			
		}
		
		
		// Call from ManagingComposer.java....NOT REQUIRED.

/*		public List<SubbouquetchannelbindBean> findByvc_idAndSubscriber_id_modeIn(
				int vcId, Integer subscriberId) throws Exception {
			
			ArrayList<SubbouquetchannelbindBean> subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet resultSet = null;
		    
		    String findByvc_idAndSubscriber_id_modeIn = "select DISTINCT subbouquetname from cbiz.subbouquetchannelbind where subbouquetid IN (select subbouquetid from cbiz.subscribersubbouquettran where vcid = ? and subscriberid = ? and mode = 'i')";
			
			try{
					pstmt = conn.prepareStatement(findByvc_idAndSubscriber_id_modeIn);
					
					pstmt.setInt(1, vcId);
					
					pstmt.setInt(2, subscriberId);
					
					resultSet = pstmt.executeQuery();
					
					while(resultSet.next()){
						
						SubbouquetchannelbindBean subbouquetchannelbindBean = new SubbouquetchannelbindBean();
						
						subbouquetchannelbindBean.setSubbouquetname(resultSet.getString("subbouquetname"));
						
						subbouquetchannelbindBeans.add(subbouquetchannelbindBean);
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
			
			return subbouquetchannelbindBeans;
			
		}*/

		
		
		

	}

