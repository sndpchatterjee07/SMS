	package com.sss.core.dao ;

	import java.util.ArrayList ;
import java.util.List;

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

	public class BouquetmasterDAO {

		public ArrayList<BouquetmasterBean> findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			String sqlSelectByAll = "SELECT  id, code, name,status, casid, caspositionid, nooffreechannel FROM bouquetmaster where status = 'a'" ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

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

		public BouquetmasterBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBytotalamount(double totalamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByTotalamount = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE totalamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByTotalamount );

				preparedStatement.setDouble(1,totalamount); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBydiscount(double discount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDiscount = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE discount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDiscount );

				preparedStatement.setDouble(1,discount); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByrate(double rate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRate = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE rate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRate );

				preparedStatement.setDouble(1,rate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByeffecteddate(Date effecteddate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEffecteddate = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE effecteddate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEffecteddate );

				preparedStatement.setDate(1,effecteddate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByisattach(String isattach )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIsattach = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE isattach = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIsattach );

				preparedStatement.setString(1,isattach); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBymode(int mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setInt(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasid = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasid );

				preparedStatement.setInt(1,casid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBycaspositionid(int caspositionid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCaspositionid = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE caspositionid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCaspositionid );

				preparedStatement.setInt(1,caspositionid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public BouquetmasterBean[] findBynooffreechannel(int nooffreechannel )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			BouquetmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByNooffreechannel = "SELECT  id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE nooffreechannel = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByNooffreechannel );

				preparedStatement.setInt(1,nooffreechannel); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setDescription( resultSet.getString("description"));

					bean.setTotalamount( resultSet.getDouble("totalamount"));

					bean.setDiscount( resultSet.getDouble("discount"));

					bean.setRate( resultSet.getDouble("rate"));

					bean.setEffecteddate( resultSet.getDate("effecteddate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setIsattach( resultSet.getString("isattach"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setMode( resultSet.getInt("mode"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new BouquetmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (BouquetmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( BouquetmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO bouquetmaster( id, code, name, description, totalamount, discount, rate, effecteddate, status, comments, isattach, historypresent, mode, createby, createdate, modifyby, modifydate, extra, casid, caspositionid, nooffreechannel ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setDouble(5, bean.getTotalamount());

				preparedStatement.setDouble(6, bean.getDiscount());

				preparedStatement.setDouble(7, bean.getRate());

				preparedStatement.setDate(8, bean.getEffecteddate());

				preparedStatement.setString(9, bean.getStatus());

				preparedStatement.setString(10, bean.getComments());

				preparedStatement.setString(11, bean.getIsattach());

				preparedStatement.setString(12, bean.getHistorypresent());

				preparedStatement.setInt(13, bean.getMode());

				preparedStatement.setInt(14, bean.getCreateby());

				preparedStatement.setDate(15, bean.getCreatedate());

				preparedStatement.setInt(16, bean.getModifyby());

				preparedStatement.setDate(17, bean.getModifydate());

				preparedStatement.setString(18, bean.getExtra());

				preparedStatement.setInt(19, bean.getCasid());

				preparedStatement.setInt(20, bean.getCaspositionid());

				preparedStatement.setInt(21, bean.getNooffreechannel());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( BouquetmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE bouquetmaster SET  id = ?, code = ?, name = ?, description = ?, totalamount = ?, discount = ?, rate = ?, effecteddate = ?, status = ?, comments = ?, isattach = ?, historypresent = ?, mode = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, extra = ?, casid = ?, caspositionid = ?, nooffreechannel = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setDouble(5, bean.getTotalamount());

				preparedStatement.setDouble(6, bean.getDiscount());

				preparedStatement.setDouble(7, bean.getRate());

				preparedStatement.setDate(8, bean.getEffecteddate());

				preparedStatement.setString(9, bean.getStatus());

				preparedStatement.setString(10, bean.getComments());

				preparedStatement.setString(11, bean.getIsattach());

				preparedStatement.setString(12, bean.getHistorypresent());

				preparedStatement.setInt(13, bean.getMode());

				preparedStatement.setInt(14, bean.getCreateby());

				preparedStatement.setDate(15, bean.getCreatedate());

				preparedStatement.setInt(16, bean.getModifyby());

				preparedStatement.setDate(17, bean.getModifydate());

				preparedStatement.setString(18, bean.getExtra());

				preparedStatement.setInt(19, bean.getCasid());

				preparedStatement.setInt(20, bean.getCaspositionid());

				preparedStatement.setInt(21, bean.getNooffreechannel());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM bouquetmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM bouquetmaster WHERE id = ? " ;

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

			String sqlDeleteByCode = "DELETE FROM bouquetmaster WHERE code = ? " ;

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

			String sqlDeleteByName = "DELETE FROM bouquetmaster WHERE name = ? " ;

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

			String sqlDeleteByDescription = "DELETE FROM bouquetmaster WHERE description = ? " ;

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

		public void deleteBytotalamount(double totalamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByTotalamount = "DELETE FROM bouquetmaster WHERE totalamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByTotalamount );

				preparedStatement.setDouble(1,totalamount); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBydiscount(double discount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDiscount = "DELETE FROM bouquetmaster WHERE discount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDiscount );

				preparedStatement.setDouble(1,discount); 

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

			String sqlDeleteByRate = "DELETE FROM bouquetmaster WHERE rate = ? " ;

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

			String sqlDeleteByEffecteddate = "DELETE FROM bouquetmaster WHERE effecteddate = ? " ;

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

		public void deleteBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStatus = "DELETE FROM bouquetmaster WHERE status = ? " ;

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

			String sqlDeleteByComments = "DELETE FROM bouquetmaster WHERE comments = ? " ;

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

			String sqlDeleteByIsattach = "DELETE FROM bouquetmaster WHERE isattach = ? " ;

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

		public void deleteByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByHistorypresent = "DELETE FROM bouquetmaster WHERE historypresent = ? " ;

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

		public void deleteBymode(int mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMode = "DELETE FROM bouquetmaster WHERE mode = ? " ;

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

		public void deleteBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM bouquetmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM bouquetmaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM bouquetmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM bouquetmaster WHERE modifydate = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM bouquetmaster WHERE extra = ? " ;

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

			String sqlDeleteByCasid = "DELETE FROM bouquetmaster WHERE casid = ? " ;

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

		public void deleteBycaspositionid(int caspositionid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCaspositionid = "DELETE FROM bouquetmaster WHERE caspositionid = ? " ;

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

		public void deleteBynooffreechannel(int nooffreechannel )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByNooffreechannel = "DELETE FROM bouquetmaster WHERE nooffreechannel = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByNooffreechannel );

				preparedStatement.setInt(1,nooffreechannel); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		
		
		// Call from ManagingComposer.java
		public ArrayList<BouquetmasterBean> searchByBouquetName(String searchString) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			//String sqlSelectByAll = "SELECT  id, code, name,status, casid, caspositionid, nooffreechannel FROM bouquetmaster where status = 'a'" ;
			
			String sqlSelectByAll =   "SELECT  id, code, name,status, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE name like concat (?, '%')";

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
				preparedStatement.setString(1, searchString);

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

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

		
		
		// Call from ManagingComposer.java
		public ArrayList<BouquetmasterBean> searchByBouquetCode(
				String searchString) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList beansList = new ArrayList();
			
			//String sqlSelectByAll = "SELECT  id, code, name,status, casid, caspositionid, nooffreechannel FROM bouquetmaster where status = 'a'" ;
			
			String sqlSelectByAll =   "SELECT  id, code, name,status, casid, caspositionid, nooffreechannel FROM bouquetmaster WHERE code like concat (?, '%')";

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
				preparedStatement.setString(1, searchString);

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					BouquetmasterBean bean = new BouquetmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setStatus( resultSet.getString("status"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setCaspositionid( resultSet.getInt("caspositionid"));

					bean.setNooffreechannel( resultSet.getInt("nooffreechannel"));

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

	}

