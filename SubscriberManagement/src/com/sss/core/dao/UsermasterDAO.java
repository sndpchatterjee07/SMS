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

	public class UsermasterDAO {

		public UsermasterBean[] findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAll = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		

		}

		public UsermasterBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBypassword(String password )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPassword = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE password = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPassword );

				preparedStatement.setString(1,password); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBytype(String type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByType = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByType );

				preparedStatement.setString(1,type); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBygroupid(int groupid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByGroupid = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE groupid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByGroupid );

				preparedStatement.setInt(1,groupid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBylcoid(int lcoid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLcoid = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE lcoid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLcoid );

				preparedStatement.setInt(1,lcoid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBybroadcasterid(int broadcasterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBroadcasterid = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE broadcasterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBroadcasterid );

				preparedStatement.setInt(1,broadcasterid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBycreateby(long createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setLong(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBymodifyby(long modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setLong(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findBysubscriberid(int subscriberid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySubscriberid = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE subscriberid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySubscriberid );

				preparedStatement.setInt(1,subscriberid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public UsermasterBean[] findByservicepersonalid(int servicepersonalid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			UsermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByServicepersonalid = "SELECT  id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid FROM usermaster WHERE servicepersonalid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByServicepersonalid );

				preparedStatement.setInt(1,servicepersonalid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					UsermasterBean bean = new UsermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setPassword( resultSet.getString("password"));

					bean.setType( resultSet.getString("type"));

					bean.setGroupid( resultSet.getInt("groupid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setBroadcasterid( resultSet.getInt("broadcasterid"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setCreateby( resultSet.getLong("createby"));

					bean.setModifyby( resultSet.getLong("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setSubscriberid( resultSet.getInt("subscriberid"));

					bean.setServicepersonalid( resultSet.getInt("servicepersonalid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new UsermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (UsermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( UsermasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO usermaster( id, name, password, type, groupid, lcoid, broadcasterid, createdate, createby, modifyby, modifydate, subscriberid, servicepersonalid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setString(3, bean.getPassword());

				preparedStatement.setString(4, bean.getType());

				preparedStatement.setInt(5, bean.getGroupid());

				preparedStatement.setInt(6, bean.getLcoid());

				preparedStatement.setInt(7, bean.getBroadcasterid());

				preparedStatement.setDate(8, bean.getCreatedate());

				preparedStatement.setLong(9, bean.getCreateby());

				preparedStatement.setLong(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.setInt(12, bean.getSubscriberid());

				preparedStatement.setInt(13, bean.getServicepersonalid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( UsermasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE usermaster SET  id = ?, name = ?, password = ?, type = ?, groupid = ?, lcoid = ?, broadcasterid = ?, createdate = ?, createby = ?, modifyby = ?, modifydate = ?, subscriberid = ?, servicepersonalid = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getName());

				preparedStatement.setString(3, bean.getPassword());

				preparedStatement.setString(4, bean.getType());

				preparedStatement.setInt(5, bean.getGroupid());

				preparedStatement.setInt(6, bean.getLcoid());

				preparedStatement.setInt(7, bean.getBroadcasterid());

				preparedStatement.setDate(8, bean.getCreatedate());

				preparedStatement.setLong(9, bean.getCreateby());

				preparedStatement.setLong(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.setInt(12, bean.getSubscriberid());

				preparedStatement.setInt(13, bean.getServicepersonalid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM usermaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM usermaster WHERE id = ? " ;

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

			String sqlDeleteByName = "DELETE FROM usermaster WHERE name = ? " ;

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

		public void deleteBypassword(String password )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPassword = "DELETE FROM usermaster WHERE password = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPassword );

				preparedStatement.setString(1,password); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBytype(String type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByType = "DELETE FROM usermaster WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByType );

				preparedStatement.setString(1,type); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBygroupid(int groupid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByGroupid = "DELETE FROM usermaster WHERE groupid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByGroupid );

				preparedStatement.setInt(1,groupid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBylcoid(int lcoid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLcoid = "DELETE FROM usermaster WHERE lcoid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLcoid );

				preparedStatement.setInt(1,lcoid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybroadcasterid(int broadcasterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBroadcasterid = "DELETE FROM usermaster WHERE broadcasterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBroadcasterid );

				preparedStatement.setInt(1,broadcasterid); 

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

			String sqlDeleteByCreatedate = "DELETE FROM usermaster WHERE createdate = ? " ;

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

		public void deleteBycreateby(long createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM usermaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCreateby );

				preparedStatement.setLong(1,createby); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymodifyby(long modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByModifyby = "DELETE FROM usermaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModifyby );

				preparedStatement.setLong(1,modifyby); 

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

			String sqlDeleteByModifydate = "DELETE FROM usermaster WHERE modifydate = ? " ;

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

		public void deleteBysubscriberid(int subscriberid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySubscriberid = "DELETE FROM usermaster WHERE subscriberid = ? " ;

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

		public void deleteByservicepersonalid(int servicepersonalid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByServicepersonalid = "DELETE FROM usermaster WHERE servicepersonalid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByServicepersonalid );

				preparedStatement.setInt(1,servicepersonalid); 

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

