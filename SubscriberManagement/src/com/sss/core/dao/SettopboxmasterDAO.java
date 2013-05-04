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
import com.sss.core.custom.bean.CustomStb;

import com.sss.core.database.* ;

	public class SettopboxmasterDAO {

		public SettopboxmasterBean[] findAll(int x , int y )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster LIMIT "+x+","+y ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean bean = null ;

			String sqlSelectById = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

				}


			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public SettopboxmasterBean[] findBymakenumber(String makenumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMakenumber = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE makenumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMakenumber );

				preparedStatement.setString(1,makenumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBymodelnumber(String modelnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModelnumber = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE modelnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModelnumber );

				preparedStatement.setString(1,modelnumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByembeded(String embeded )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEmbeded = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE embeded = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEmbeded );

				preparedStatement.setString(1,embeded); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByschemeid(int schemeid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySchemeid = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE schemeid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySchemeid );

				preparedStatement.setInt(1,schemeid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByinstalldate(Date installdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByInstalldate = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE installdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByInstalldate );

				preparedStatement.setDate(1,installdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBybalanceamount(double balanceamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBalanceamount = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE balanceamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBalanceamount );

				preparedStatement.setDouble(1,balanceamount); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBybilled(String billed )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBilled = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE billed = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBilled );

				preparedStatement.setString(1,billed); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByrentalperiod(int rentalperiod )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRentalperiod = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE rentalperiod = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRentalperiod );

				preparedStatement.setInt(1,rentalperiod); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBylcoid(int lcoid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLcoid = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE lcoid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLcoid );

				preparedStatement.setInt(1,lcoid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBylcoidAndStatus(int lcoid , String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLcoid = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE lcoid = ? and status = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLcoid );

				preparedStatement.setInt(1,lcoid); 
				
				preparedStatement.setString(2,status);

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		
		public SettopboxmasterBean[] findByservicecenterid(int servicecenterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByServicecenterid = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE servicecenterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByServicecenterid );

				preparedStatement.setInt(1,servicecenterid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasid = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasid );

				preparedStatement.setInt(1,casid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByvcnumber(String vcnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcnumber = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE vcnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcnumber );

				preparedStatement.setString(1,vcnumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBystbtype(String stbtype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStbtype = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE stbtype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStbtype );

				preparedStatement.setString(1,stbtype); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findByispvr(String ispvr )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIspvr = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE ispvr = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIspvr );

				preparedStatement.setString(1,ispvr); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBypvrtype(String pvrtype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPvrtype = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE pvrtype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPvrtype );

				preparedStatement.setString(1,pvrtype); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SettopboxmasterBean[] findBystolen_missing(String stolen_missing )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SettopboxmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStolen_missing = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE stolen_missing = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStolen_missing );

				preparedStatement.setString(1,stolen_missing); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SettopboxmasterBean bean = new SettopboxmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setMakenumber( resultSet.getString("makenumber"));

					bean.setModelnumber( resultSet.getString("modelnumber"));

					bean.setEmbeded( resultSet.getString("embeded"));

					bean.setSchemeid( resultSet.getInt("schemeid"));

					bean.setInstalldate( resultSet.getDate("installdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setStatus( resultSet.getString("status"));

					bean.setBalanceamount( resultSet.getDouble("balanceamount"));

					bean.setBilled( resultSet.getString("billed"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setServicecenterid( resultSet.getInt("servicecenterid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setStbtype( resultSet.getString("stbtype"));

					bean.setIspvr( resultSet.getString("ispvr"));

					bean.setPvrtype( resultSet.getString("pvrtype"));

					bean.setStolen_missing( resultSet.getString("stolen_missing"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SettopboxmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SettopboxmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( SettopboxmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO settopboxmaster( id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getMakenumber());

				preparedStatement.setString(3, bean.getModelnumber());

				preparedStatement.setString(4, bean.getEmbeded());

				preparedStatement.setInt(5, bean.getSchemeid());

				preparedStatement.setDate(6, bean.getInstalldate());

				preparedStatement.setString(7, bean.getHistorypresent());

				preparedStatement.setInt(8, bean.getCreateby());

				preparedStatement.setDate(9, bean.getCreatedate());

				preparedStatement.setInt(10, bean.getModifyby());

				preparedStatement.setDate(11, bean.getModifydate());

				preparedStatement.setString(12, bean.getExtra());

				preparedStatement.setString(13, bean.getStatus());

				preparedStatement.setDouble(14, bean.getBalanceamount());

				preparedStatement.setString(15, bean.getBilled());

				preparedStatement.setInt(16, bean.getRentalperiod());

				preparedStatement.setInt(17, bean.getLcoid());

				preparedStatement.setInt(18, bean.getServicecenterid());

				preparedStatement.setInt(19, bean.getCasid());

				preparedStatement.setString(20, bean.getVcnumber());

				preparedStatement.setString(21, bean.getStbtype());

				preparedStatement.setString(22, bean.getIspvr());

				preparedStatement.setString(23, bean.getPvrtype());

				preparedStatement.setString(24, bean.getStolen_missing());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( SettopboxmasterBean bean, Connection conn )throws Exception{

			PreparedStatement preparedStatement = null ;
			
			String sqlUpdateAllStmt = "UPDATE settopboxmaster SET  schemeid = ? , installdate = ?, status = ?, modifyby = ?, modifydate = ?  WHERE makenumber = ? " ;

			try{

					preparedStatement = conn.prepareStatement(sqlUpdateAllStmt);
	
					preparedStatement.setInt(1, bean.getSchemeid());
	
					preparedStatement.setDate(2, bean.getInstalldate());
					
					preparedStatement.setString(3, bean.getStatus());
					
					preparedStatement.setInt(4,bean.getModifyby());
					
					preparedStatement.setDate(5, bean.getModifydate());
					
					preparedStatement.setString(6, bean.getMakenumber());
					
					preparedStatement.executeUpdate();

			}catch(Exception e){

					e.printStackTrace();
					
					throw new Exception();

			}finally{

				try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}
	
				}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM settopboxmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM settopboxmaster WHERE id = ? " ;

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

		public void deleteBymakenumber(String makenumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMakenumber = "DELETE FROM settopboxmaster WHERE makenumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMakenumber );

				preparedStatement.setString(1,makenumber); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymodelnumber(String modelnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByModelnumber = "DELETE FROM settopboxmaster WHERE modelnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByModelnumber );

				preparedStatement.setString(1,modelnumber); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByembeded(String embeded )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEmbeded = "DELETE FROM settopboxmaster WHERE embeded = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEmbeded );

				preparedStatement.setString(1,embeded); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByschemeid(int schemeid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySchemeid = "DELETE FROM settopboxmaster WHERE schemeid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySchemeid );

				preparedStatement.setInt(1,schemeid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByinstalldate(Date installdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByInstalldate = "DELETE FROM settopboxmaster WHERE installdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByInstalldate );

				preparedStatement.setDate(1,installdate); 

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

			String sqlDeleteByHistorypresent = "DELETE FROM settopboxmaster WHERE historypresent = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM settopboxmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM settopboxmaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM settopboxmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM settopboxmaster WHERE modifydate = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM settopboxmaster WHERE extra = ? " ;

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

		public void deleteBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStatus = "DELETE FROM settopboxmaster WHERE status = ? " ;

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

		public void deleteBybalanceamount(double balanceamount )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBalanceamount = "DELETE FROM settopboxmaster WHERE balanceamount = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBalanceamount );

				preparedStatement.setDouble(1,balanceamount); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybilled(String billed )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBilled = "DELETE FROM settopboxmaster WHERE billed = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBilled );

				preparedStatement.setString(1,billed); 

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

			String sqlDeleteByRentalperiod = "DELETE FROM settopboxmaster WHERE rentalperiod = ? " ;

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

		public void deleteBylcoid(int lcoid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLcoid = "DELETE FROM settopboxmaster WHERE lcoid = ? " ;

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

		public void deleteByservicecenterid(int servicecenterid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByServicecenterid = "DELETE FROM settopboxmaster WHERE servicecenterid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByServicecenterid );

				preparedStatement.setInt(1,servicecenterid); 

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

			String sqlDeleteByCasid = "DELETE FROM settopboxmaster WHERE casid = ? " ;

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

		public void deleteByvcnumber(String vcnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByVcnumber = "DELETE FROM settopboxmaster WHERE vcnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByVcnumber );

				preparedStatement.setString(1,vcnumber); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBystbtype(String stbtype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStbtype = "DELETE FROM settopboxmaster WHERE stbtype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStbtype );

				preparedStatement.setString(1,stbtype); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByispvr(String ispvr )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIspvr = "DELETE FROM settopboxmaster WHERE ispvr = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByIspvr );

				preparedStatement.setString(1,ispvr); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBypvrtype(String pvrtype )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPvrtype = "DELETE FROM settopboxmaster WHERE pvrtype = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPvrtype );

				preparedStatement.setString(1,pvrtype); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBystolen_missing(String stolen_missing )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByStolen_missing = "DELETE FROM settopboxmaster WHERE stolen_missing = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByStolen_missing );

				preparedStatement.setString(1,stolen_missing); 

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
		public void unAssignSTB(SettopboxmasterBean bean,
				Connection conn) throws Exception {
			

			PreparedStatement preparedStatement = null ;
			
			String unAssignSTB = "UPDATE settopboxmaster SET schemeid = ?,status = ?,installdate = ?,modifyby = ?,modifydate = ? WHERE id = ? " ;

			try{

					preparedStatement = conn.prepareStatement(unAssignSTB);
					
					preparedStatement.setNull(1, java.sql.Types.INTEGER);
	
					preparedStatement.setString(2, bean.getStatus());
					
					preparedStatement.setNull(3, java.sql.Types.DATE);
					
					preparedStatement.setInt(4, bean.getModifyby());
					
					preparedStatement.setDate(5, bean.getModifydate());
					
					preparedStatement.setInt(6, bean.getId());
	
					preparedStatement.executeUpdate();

			}catch(Exception e){

					e.printStackTrace();
					
					throw new Exception();

			}finally{

				try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}
	
				}
			
		}

		
		
		// Call from ManageSearchcomposer.java
		public CustomStb fetchStbDetailsByMakeNumber(String makenumber) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;
			
			CustomStb customStb = new CustomStb();
			
			String sqlSelectByMakenumber = "SELECT  id, makenumber, modelnumber, status, casid FROM settopboxmaster WHERE makenumber = ? " ;
			
			try{
				
					preparedStatement = conn.prepareStatement( sqlSelectByMakenumber );

					preparedStatement.setString(1,makenumber); 

					resultSet = preparedStatement.executeQuery();
				
					while(resultSet.next()){
						
						customStb.setStbId(resultSet.getInt("id"));
						
						customStb.setMakenumber(resultSet.getString("makenumber"));
						
						customStb.setModelnumber(resultSet.getString("modelnumber"));
						
						customStb.setStatus(resultSet.getString("status"));
						
						customStb.setCasId(resultSet.getInt("casid"));
						
					}
				
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
			
			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}
			
			return customStb;
			
		}

		
		// Call from ManagingComposer.java for STB Scheme update
		
		public SettopboxmasterBean findBymakenumberforSchemeUpdate(String makenumber) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;
			
			SettopboxmasterBean bean = new SettopboxmasterBean();
			
			String sqlSelectByMakenumber = "SELECT  id, makenumber, modelnumber, embeded, schemeid, installdate, historypresent, createby, createdate, modifyby, modifydate, extra, status, balanceamount, billed, rentalperiod, lcoid, servicecenterid, casid, vcnumber, stbtype, ispvr, pvrtype, stolen_missing FROM settopboxmaster WHERE makenumber = ? " ;
			
			try{
				
					preparedStatement = conn.prepareStatement( sqlSelectByMakenumber );
					
					preparedStatement.setString(1,makenumber);
					
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
				
						bean.setId( resultSet.getInt("id"));

						bean.setMakenumber( resultSet.getString("makenumber"));

						bean.setModelnumber( resultSet.getString("modelnumber"));

						bean.setEmbeded( resultSet.getString("embeded"));

						bean.setSchemeid( resultSet.getInt("schemeid"));

						bean.setInstalldate( resultSet.getDate("installdate"));

						bean.setHistorypresent( resultSet.getString("historypresent"));

						bean.setCreateby( resultSet.getInt("createby"));

						bean.setCreatedate( resultSet.getDate("createdate"));

						bean.setModifyby( resultSet.getInt("modifyby"));

						bean.setModifydate( resultSet.getDate("modifydate"));

						bean.setExtra( resultSet.getString("extra"));

						bean.setStatus( resultSet.getString("status"));

						bean.setBalanceamount( resultSet.getDouble("balanceamount"));

						bean.setBilled( resultSet.getString("billed"));

						bean.setRentalperiod( resultSet.getInt("rentalperiod"));

						bean.setLcoid( resultSet.getInt("lcoid"));

						bean.setServicecenterid( resultSet.getInt("servicecenterid"));

						bean.setCasid( resultSet.getInt("casid"));

						bean.setVcnumber( resultSet.getString("vcnumber"));

						bean.setStbtype( resultSet.getString("stbtype"));

						bean.setIspvr( resultSet.getString("ispvr"));

						bean.setPvrtype( resultSet.getString("pvrtype"));

						bean.setStolen_missing( resultSet.getString("stolen_missing"));
				
					}	
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}
			
			return bean;
			
		}

		
		// Call from STBSchemeUpdateDialogController.java
		
		public void updateSTBScheme(SettopboxmasterBean bean,
				Connection conn) throws Exception {
			
			PreparedStatement preparedStatement = null ;
			
			String sqlUpdateAllStmt = "UPDATE settopboxmaster SET  schemeid = ? , modifyby = ?, modifydate = ?  WHERE id = ?" ;
			
			try{
				
					preparedStatement = conn.prepareStatement(sqlUpdateAllStmt);
					
					preparedStatement.setInt(1, bean.getSchemeid());
					
					preparedStatement.setInt(2,bean.getModifyby());
					
					preparedStatement.setDate(3,bean.getModifydate());
					
					preparedStatement.setInt(4,bean.getId());
					
					preparedStatement.executeUpdate();
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{
				
				try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}
				
				}
			
		}

	}

