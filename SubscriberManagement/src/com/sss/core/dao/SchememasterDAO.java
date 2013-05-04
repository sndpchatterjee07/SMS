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

	public class SchememasterDAO {

		public SchememasterBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster " ;

			return null ;

		}

		public SchememasterBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;
			
			SchememasterBean bean = new SchememasterBean();
			
			String sqlSelectByName = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

				}

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception(e);

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public SchememasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByrate(double rate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRate = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE rate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRate );

				preparedStatement.setDouble(1,rate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBystartdate(Date startdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStartdate = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE startdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStartdate );

				preparedStatement.setDate(1,startdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBymode(int mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setInt(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByrentalperiod(int rentalperiod )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRentalperiod = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE rentalperiod = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRentalperiod );

				preparedStatement.setInt(1,rentalperiod); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByrentalamount(double rentalamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRentalamount = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE rentalamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRentalamount );

				preparedStatement.setDouble(1,rentalamount); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBysecurityDeposit(double securityDeposit )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySecurityDeposit = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE securityDeposit = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySecurityDeposit );

				preparedStatement.setDouble(1,securityDeposit); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBydepreciation(double depreciation )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDepreciation = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE depreciation = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDepreciation );

				preparedStatement.setDouble(1,depreciation); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByisattach(String isattach )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIsattach = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE isattach = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIsattach );

				preparedStatement.setString(1,isattach); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SchememasterBean[] findByprogid(String progid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SchememasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByProgid = "SELECT  id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid FROM schememaster WHERE progid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByProgid );

				preparedStatement.setString(1,progid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SchememasterBean bean = new SchememasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setStartdate( resultSet.getDate("startdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setRentalamount( resultSet.getDouble("rentalamount"));

					bean.setStatus( resultSet.getString("status"));

					bean.setSecurityDeposit( resultSet.getDouble("securityDeposit"));

					bean.setDepreciation( resultSet.getDouble("depreciation"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setProgid( resultSet.getString("progid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SchememasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SchememasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( SchememasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO schememaster( id, code, name, description, rate, startdate, historypresent, createby, createdate, modifyby, modifydate, extra, mode, rentalperiod, rentalamount, status, securityDeposit, depreciation, comments, isattach, progid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setDouble(5, bean.getRate());

				preparedStatement.setDate(6, bean.getStartdate());

				preparedStatement.setString(7, bean.getHistorypresent());

				preparedStatement.setInt(8, bean.getCreateby());

				preparedStatement.setDate(9, bean.getCreatedate());

				preparedStatement.setInt(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.setString(12, bean.getExtra());

				preparedStatement.setInt(13, bean.getMode());

				preparedStatement.setInt(14, bean.getRentalperiod());

				preparedStatement.setDouble(15, bean.getRentalamount());

				preparedStatement.setString(16, bean.getStatus());

				preparedStatement.setDouble(17, bean.getSecurityDeposit());

				preparedStatement.setDouble(18, bean.getDepreciation());

				preparedStatement.setString(19, bean.getComments());

				preparedStatement.setString(20, bean.getIsattach());

				preparedStatement.setString(21, bean.getProgid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( SchememasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE schememaster SET  id = ?, code = ?, name = ?, description = ?, rate = ?, startdate = ?, historypresent = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, extra = ?, mode = ?, rentalperiod = ?, rentalamount = ?, status = ?, securityDeposit = ?, depreciation = ?, comments = ?, isattach = ?, progid = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setDouble(5, bean.getRate());

				preparedStatement.setDate(6, bean.getStartdate());

				preparedStatement.setString(7, bean.getHistorypresent());

				preparedStatement.setInt(8, bean.getCreateby());

				preparedStatement.setDate(9, bean.getCreatedate());

				preparedStatement.setInt(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.setString(12, bean.getExtra());

				preparedStatement.setInt(13, bean.getMode());

				preparedStatement.setInt(14, bean.getRentalperiod());

				preparedStatement.setDouble(15, bean.getRentalamount());

				preparedStatement.setString(16, bean.getStatus());

				preparedStatement.setDouble(17, bean.getSecurityDeposit());

				preparedStatement.setDouble(18, bean.getDepreciation());

				preparedStatement.setString(19, bean.getComments());

				preparedStatement.setString(20, bean.getIsattach());

				preparedStatement.setString(21, bean.getProgid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM schememaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM schememaster WHERE id = ? " ;

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

			String sqlDeleteByCode = "DELETE FROM schememaster WHERE code = ? " ;

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

			String sqlDeleteByName = "DELETE FROM schememaster WHERE name = ? " ;

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

			String sqlDeleteByDescription = "DELETE FROM schememaster WHERE description = ? " ;

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

		public void deleteByrate(double rate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByRate = "DELETE FROM schememaster WHERE rate = ? " ;

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

		public void deleteBystartdate(Date startdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStartdate = "DELETE FROM schememaster WHERE startdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStartdate );

				preparedStatement.setDate(1,startdate); 

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

			String sqlDeleteByHistorypresent = "DELETE FROM schememaster WHERE historypresent = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM schememaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM schememaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM schememaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM schememaster WHERE modifydate = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM schememaster WHERE extra = ? " ;

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

		public void deleteBymode(int mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMode = "DELETE FROM schememaster WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMode );

				preparedStatement.setInt(1,mode); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByrentalperiod(int rentalperiod )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByRentalperiod = "DELETE FROM schememaster WHERE rentalperiod = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByRentalperiod );

				preparedStatement.setInt(1,rentalperiod); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByrentalamount(double rentalamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByRentalamount = "DELETE FROM schememaster WHERE rentalamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByRentalamount );

				preparedStatement.setDouble(1,rentalamount); 

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

			String sqlDeleteByStatus = "DELETE FROM schememaster WHERE status = ? " ;

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

		public void deleteBysecurityDeposit(double securityDeposit )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySecurityDeposit = "DELETE FROM schememaster WHERE securityDeposit = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySecurityDeposit );

				preparedStatement.setDouble(1,securityDeposit); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBydepreciation(double depreciation )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDepreciation = "DELETE FROM schememaster WHERE depreciation = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDepreciation );

				preparedStatement.setDouble(1,depreciation); 

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

			String sqlDeleteByComments = "DELETE FROM schememaster WHERE comments = ? " ;

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

		public void deleteByisattach(String isattach )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIsattach = "DELETE FROM schememaster WHERE isattach = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByIsattach );

				preparedStatement.setString(1,isattach); 

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

			String sqlDeleteByProgid = "DELETE FROM schememaster WHERE progid = ? " ;

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

		
		
		
		// Call from STBSchemeSelectDialogController.java
		
		public ArrayList<SchememasterBean> fetchActiveSTBSchemes() throws Exception {
			
			ArrayList<SchememasterBean> schememasterBeans = new ArrayList<SchememasterBean>();
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
		    Connection conn = dbDatabaseHandler.getConnection();
		    
		    PreparedStatement pstmt = null;
		    
		    ResultSet rs = null;
			
		    try{
		    		String fetchActiveSTBSchemes = "select id,name,rate from cbiz.schememaster where status = 'a'";
		    		
		    		pstmt = conn.prepareStatement(fetchActiveSTBSchemes);
		    		
		    		rs = pstmt.executeQuery();
		    		
		    		while(rs.next()){
		    			
		    			SchememasterBean schememasterBean = new SchememasterBean();
		    			
		    			schememasterBean.setId(rs.getInt("id"));
		    			
		    			schememasterBean.setName(rs.getString("name"));
		    			
		    			schememasterBean.setRate(rs.getDouble("rate"));
		    			
		    			schememasterBeans.add(schememasterBean);
		    		}
		    	
		    }catch(Exception e){
		    	
		    	e.printStackTrace();
		    	
		    	throw new Exception();
		    	
		    }finally{
		    	
		    	rs.close();
		    	
		    	pstmt.close();
		    	
		    	conn.close();
		    	
		    	dbDatabaseHandler.closeConnection();
		    }
		    
			return schememasterBeans;
			
		}

	}

