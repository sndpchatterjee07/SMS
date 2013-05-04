	package com.sss.core.dao ;

	import java.util.ArrayList ;

	import java.sql.Date ;

	import java.sql.Blob ;

	import java.sql.Connection ;

	import java.sql.PreparedStatement ;

	import java.sql.ResultSet ;

	import java.sql.SQLException ;

	import com.sss.core.bean.* ;

import com.sss.core.database.* ;

	public class ChannelmasterDAO {

		public ArrayList<ChannelmasterBean> findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			//String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster order by name " ;
			
			String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM cbiz.channelmaster where status = 'a' order by name";

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){ChannelmasterBean bean = new ChannelmasterBean();

				bean.setId( resultSet.getInt("id"));

				bean.setCode( resultSet.getString("code"));

				bean.setName( resultSet.getString("name"));

				bean.setDescription( resultSet.getString("description"));

				bean.setLogo( resultSet.getBlob("logo"));

				bean.setLogotype( resultSet.getString("logotype"));

				bean.setLanguageid( resultSet.getInt("languageid"));

				bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

				bean.setCategoryid( resultSet.getInt("categoryid"));

				bean.setType( resultSet.getInt("type"));

				bean.setRate( resultSet.getDouble("rate"));

				bean.setEffecteddate( resultSet.getDate("effecteddate"));

				bean.setHistorypresent( resultSet.getString("historypresent"));

				bean.setCreateby( resultSet.getInt("createby"));

				bean.setCreatedate( resultSet.getDate("createdate"));

				bean.setModifyby( resultSet.getInt("modifyby"));

				bean.setModifydate( resultSet.getDate("modifydate"));

				bean.setStatus( resultSet.getString("status"));

				bean.setComments( resultSet.getString("comments"));

				bean.setExtra( resultSet.getString("extra"));

				bean.setCasid( resultSet.getInt("casid"));

				bean.setProgid( resultSet.getString("progid"));

				bean.setCaspositionid( resultSet.getInt("caspositionid"));

				beansList.add(bean);
				
			}

			
			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			
			return beansList ;

		}
		
		public ChannelmasterBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBylogo(Blob logo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLogo = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE logo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLogo );

				preparedStatement.setBlob(1,logo); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBylogotype(String logotype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLogotype = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE logotype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLogotype );

				preparedStatement.setString(1,logotype); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBylanguageid(int languageid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLanguageid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE languageid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLanguageid );

				preparedStatement.setInt(1,languageid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBybroadcusterid(int broadcusterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBroadcusterid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE broadcusterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBroadcusterid );

				preparedStatement.setInt(1,broadcusterid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycategoryid(int categoryid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCategoryid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE categoryid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCategoryid );

				preparedStatement.setInt(1,categoryid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBytype(int type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByType = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByType );

				preparedStatement.setInt(1,type); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByrate(double rate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRate = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE rate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRate );

				preparedStatement.setDouble(1,rate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByeffecteddate(Date effecteddate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEffecteddate = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE effecteddate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEffecteddate );

				preparedStatement.setDate(1,effecteddate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasid );

				preparedStatement.setInt(1,casid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findByprogid(String progid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByProgid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE progid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByProgid );

				preparedStatement.setString(1,progid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public ChannelmasterBean[] findBycaspositionid(int caspositionid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ChannelmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCaspositionid = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM channelmaster WHERE caspositionid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCaspositionid );

				preparedStatement.setInt(1,caspositionid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					ChannelmasterBean bean = new ChannelmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setLogo( resultSet.getBlob("logo"));

					bean.setLogotype( resultSet.getString("logotype"));

					bean.setLanguageid( resultSet.getInt("languageid"));

					bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

					bean.setCategoryid( resultSet.getInt("categoryid"));

					bean.setType( resultSet.getInt("type"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setProgid( resultSet.getString("progid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new ChannelmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (ChannelmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( ChannelmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO channelmaster( id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setBlob(5, bean.getLogo());

				preparedStatement.setString(6, bean.getLogotype());

				preparedStatement.setInt(7, bean.getLanguageid());

				preparedStatement.setInt(8, bean.getBroadcusterid());

				preparedStatement.setInt(9, bean.getCategoryid());

				preparedStatement.setInt(10, bean.getType());

				preparedStatement.setDouble(11, bean.getRate());

				preparedStatement.setDate(12, bean.getEffecteddate());

				preparedStatement.setString(13, bean.getHistorypresent());

				preparedStatement.setInt(14, bean.getCreateby());

				preparedStatement.setDate(15, bean.getCreatedate());

				preparedStatement.setInt(16, bean.getModifyby());

				preparedStatement.setDate(17, bean.getModifydate());

				preparedStatement.setString(18, bean.getStatus());

				preparedStatement.setString(19, bean.getComments());

				preparedStatement.setString(20, bean.getExtra());

				preparedStatement.setInt(21, bean.getCasid());

				preparedStatement.setString(22, bean.getProgid());

				preparedStatement.setInt(23, bean.getCaspositionid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( ChannelmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE channelmaster SET  id = ?, code = ?, name = ?, description = ?, logo = ?, logotype = ?, languageid = ?, broadcusterid = ?, categoryid = ?, type = ?, rate = ?, effecteddate = ?, historypresent = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, status = ?, comments = ?, extra = ?, casid = ?, progid = ?, caspositionid = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setBlob(5, bean.getLogo());

				preparedStatement.setString(6, bean.getLogotype());

				preparedStatement.setInt(7, bean.getLanguageid());

				preparedStatement.setInt(8, bean.getBroadcusterid());

				preparedStatement.setInt(9, bean.getCategoryid());

				preparedStatement.setInt(10, bean.getType());

				preparedStatement.setDouble(11, bean.getRate());

				preparedStatement.setDate(12, bean.getEffecteddate());

				preparedStatement.setString(13, bean.getHistorypresent());

				preparedStatement.setInt(14, bean.getCreateby());

				preparedStatement.setDate(15, bean.getCreatedate());

				preparedStatement.setInt(16, bean.getModifyby());

				preparedStatement.setDate(17, bean.getModifydate());

				preparedStatement.setString(18, bean.getStatus());

				preparedStatement.setString(19, bean.getComments());

				preparedStatement.setString(20, bean.getExtra());

				preparedStatement.setInt(21, bean.getCasid());

				preparedStatement.setString(22, bean.getProgid());

				preparedStatement.setInt(23, bean.getCaspositionid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM channelmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM channelmaster WHERE id = ? " ;

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

			String sqlDeleteByCode = "DELETE FROM channelmaster WHERE code = ? " ;

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

			String sqlDeleteByName = "DELETE FROM channelmaster WHERE name = ? " ;

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

			String sqlDeleteByDescription = "DELETE FROM channelmaster WHERE description = ? " ;

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

		public void deleteBylogo(Blob logo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLogo = "DELETE FROM channelmaster WHERE logo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLogo );

				preparedStatement.setBlob(1,logo); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBylogotype(String logotype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLogotype = "DELETE FROM channelmaster WHERE logotype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLogotype );

				preparedStatement.setString(1,logotype); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBylanguageid(int languageid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLanguageid = "DELETE FROM channelmaster WHERE languageid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLanguageid );

				preparedStatement.setInt(1,languageid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybroadcusterid(int broadcusterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBroadcusterid = "DELETE FROM channelmaster WHERE broadcusterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBroadcusterid );

				preparedStatement.setInt(1,broadcusterid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycategoryid(int categoryid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCategoryid = "DELETE FROM channelmaster WHERE categoryid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCategoryid );

				preparedStatement.setInt(1,categoryid); 

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

			String sqlDeleteByType = "DELETE FROM channelmaster WHERE type = ? " ;

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

		public void deleteByrate(double rate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByRate = "DELETE FROM channelmaster WHERE rate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByRate );

				preparedStatement.setDouble(1,rate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByeffecteddate(Date effecteddate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEffecteddate = "DELETE FROM channelmaster WHERE effecteddate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEffecteddate );

				preparedStatement.setDate(1,effecteddate); 

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

			String sqlDeleteByHistorypresent = "DELETE FROM channelmaster WHERE historypresent = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM channelmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM channelmaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM channelmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM channelmaster WHERE modifydate = ? " ;

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

		public void deleteBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStatus = "DELETE FROM channelmaster WHERE status = ? " ;

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

		public void deleteBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByComments = "DELETE FROM channelmaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByComments );

				preparedStatement.setString(1,comments); 

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

			String sqlDeleteByExtra = "DELETE FROM channelmaster WHERE extra = ? " ;

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

		public void deleteBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCasid = "DELETE FROM channelmaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCasid );

				preparedStatement.setInt(1,casid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByprogid(String progid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByProgid = "DELETE FROM channelmaster WHERE progid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByProgid );

				preparedStatement.setString(1,progid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycaspositionid(int caspositionid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCaspositionid = "DELETE FROM channelmaster WHERE caspositionid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCaspositionid );

				preparedStatement.setInt(1,caspositionid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		
		
		// Call from ManagingComposer.java.
		public ArrayList<ChannelmasterBean> searchByChannelName(
				String searchString) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			//String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM cbiz.channelmaster where status = 'a' order by name";
			
			String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM cbiz.channelmaster WHERE name like concat (?, '%')";

			try{
					
					preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
					preparedStatement.setString(1, searchString);

					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						ChannelmasterBean bean = new ChannelmasterBean();
						
						bean.setId( resultSet.getInt("id"));

						bean.setCode( resultSet.getString("code"));

						bean.setName( resultSet.getString("name"));

						bean.setDescription( resultSet.getString("description"));

						bean.setLogo( resultSet.getBlob("logo"));

						bean.setLogotype( resultSet.getString("logotype"));

						bean.setLanguageid( resultSet.getInt("languageid"));

						bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

						bean.setCategoryid( resultSet.getInt("categoryid"));

						bean.setType( resultSet.getInt("type"));

						bean.setRate( resultSet.getDouble("rate"));

						bean.setEffecteddate( resultSet.getDate("effecteddate"));

						bean.setHistorypresent( resultSet.getString("historypresent"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setStatus( resultSet.getString("status"));

						bean.setComments( resultSet.getString("comments"));

						bean.setExtra( resultSet.getString("extra"));

						bean.setCasid( resultSet.getInt("casid"));

						bean.setProgid( resultSet.getString("progid"));

						bean.setCaspositionid( resultSet.getInt("caspositionid"));

						beansList.add(bean);
						
					}
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{
				
				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}
				
			}
			
			return beansList;
			
		}
		
		
		
		
		// Call from ManagingComposer.java
		public ArrayList<ChannelmasterBean> searchByChannelCode(
				String searchString) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			//String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM cbiz.channelmaster where status = 'a' order by name";
			
			String sqlSelectByAll = "SELECT  id, code, name, description, logo, logotype, languageid, broadcusterid, categoryid, type, rate, effecteddate, historypresent, createby, createdate, modifyby, modifydate, status, comments, extra, casid, progid, caspositionid FROM cbiz.channelmaster WHERE code like concat (?, '%')";
			
			try{
				
					preparedStatement = conn.prepareStatement( sqlSelectByAll );
					
					preparedStatement.setString(1, searchString);
	
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						ChannelmasterBean bean = new ChannelmasterBean();
						
						bean.setId( resultSet.getInt("id"));

						bean.setCode( resultSet.getString("code"));

						bean.setName( resultSet.getString("name"));

						bean.setDescription( resultSet.getString("description"));

						bean.setLogo( resultSet.getBlob("logo"));

						bean.setLogotype( resultSet.getString("logotype"));

						bean.setLanguageid( resultSet.getInt("languageid"));

						bean.setBroadcusterid( resultSet.getInt("broadcusterid"));

						bean.setCategoryid( resultSet.getInt("categoryid"));

						bean.setType( resultSet.getInt("type"));

						bean.setRate( resultSet.getDouble("rate"));

						bean.setEffecteddate( resultSet.getDate("effecteddate"));

						bean.setHistorypresent( resultSet.getString("historypresent"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setStatus( resultSet.getString("status"));

						bean.setComments( resultSet.getString("comments"));

						bean.setExtra( resultSet.getString("extra"));

						bean.setCasid( resultSet.getInt("casid"));

						bean.setProgid( resultSet.getString("progid"));

						bean.setCaspositionid( resultSet.getInt("caspositionid"));

						beansList.add(bean);
						
						
					}
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
			
			}finally{
				
				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}
			}
			
			return beansList;
			
		}

	}

