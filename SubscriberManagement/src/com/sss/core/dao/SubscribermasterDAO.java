	package com.sss.core.dao ;

	import java.util.ArrayList ;
import java.util.List;

	import java.sql.Date ;

	import java.sql.Connection ;

	import java.sql.PreparedStatement ;

	import java.sql.ResultSet ;

	import java.sql.SQLException ;

	import com.sss.core.bean.* ;

import com.sss.core.database.* ;

	public class SubscribermasterDAO {
		
		public ArrayList<SubscribermasterBean> findAll(int start , int end )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList<SubscribermasterBean> beansList = new ArrayList<SubscribermasterBean>();

			String sqlSelectByAll = "SELECT  id,code, name FROM subscribermaster LIMIT ?,? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
				preparedStatement.setInt(1, start);
				
				preparedStatement.setInt(2,end);

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));					
					
					bean.setCode(resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

				
					beansList.add(bean);

				}


			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beansList ;

		}

		public ArrayList<SubscribermasterBean> findAllByLco(int start , int end ,int lcoid)throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList<SubscribermasterBean> beansList = new ArrayList<SubscribermasterBean>();

			String sqlSelectByAll = "SELECT  id,code, name FROM subscribermaster where lcoid = ?  LIMIT ?,?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
				preparedStatement.setInt(1,lcoid);
				
				preparedStatement.setInt(2, start);
				
				preparedStatement.setInt(3,end);
				

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));
					
					bean.setCode(resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));
				
					beansList.add(bean);

				}


			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beansList ;

		}


		public SubscribermasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			//SubscribermasterBean[] beans = null ;

			// ArrayList beansList = new ArrayList();
			
			SubscribermasterBean bean = new SubscribermasterBean();

			String sqlSelectById = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					/*beansList.add(bean);*/

				}

				/*Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}
*/
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public SubscribermasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByfirstname(String firstname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByFirstname = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE firstname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByFirstname );

				preparedStatement.setString(1,firstname); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBymiddlename(String middlename )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMiddlename = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE middlename = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMiddlename );

				preparedStatement.setString(1,middlename); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBylastname(String lastname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLastname = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE lastname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLastname );

				preparedStatement.setString(1,lastname); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBypin(String pin )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPin = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE pin = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPin );

				preparedStatement.setString(1,pin); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBymobile(String mobile )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMobile = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE mobile = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMobile );

				preparedStatement.setString(1,mobile); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByphone(String phone )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPhone = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE phone = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPhone );

				preparedStatement.setString(1,phone); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByemail(String email )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEmail = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE email = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEmail );

				preparedStatement.setString(1,email); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByareaid(int areaid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAreaid = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE areaid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAreaid );

				preparedStatement.setInt(1,areaid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBylcoid(int lcoid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLcoid = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE lcoid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLcoid );

				preparedStatement.setInt(1,lcoid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasid = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasid );

				preparedStatement.setInt(1,casid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByinstallationdate(Date installationdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByInstallationdate = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE installationdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByInstallationdate );

				preparedStatement.setDate(1,installationdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBybillcycleid(int billcycleid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBillcycleid = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE billcycleid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBillcycleid );

				preparedStatement.setInt(1,billcycleid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBytaxcombinationid(int taxcombinationid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByTaxcombinationid = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE taxcombinationid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByTaxcombinationid );

				preparedStatement.setInt(1,taxcombinationid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBylastpayment(double lastpayment )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByLastpayment = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE lastpayment = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByLastpayment );

				preparedStatement.setDouble(1,lastpayment); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBypreviousbalance(double previousbalance )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPreviousbalance = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE previousbalance = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPreviousbalance );

				preparedStatement.setDouble(1,previousbalance); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByhouseNo(String houseNo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHouseNo = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE houseNo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHouseNo );

				preparedStatement.setString(1,houseNo); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByfloor(String floor )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByFloor = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE floor = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByFloor );

				preparedStatement.setString(1,floor); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByside(String side )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySide = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE side = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySide );

				preparedStatement.setString(1,side); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByblockNo(String blockNo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBlockNo = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE blockNo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBlockNo );

				preparedStatement.setString(1,blockNo); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBysector(String sector )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySector = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE sector = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySector );

				preparedStatement.setString(1,sector); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycomplexName(String complexName )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComplexName = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE complexName = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComplexName );

				preparedStatement.setString(1,complexName); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycity(String city )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCity = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE city = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCity );

				preparedStatement.setString(1,city); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBydistrict(String district )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDistrict = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE district = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDistrict );

				preparedStatement.setString(1,district); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBystate(String state )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByState = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE state = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByState );

				preparedStatement.setString(1,state); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByrentalperiod(int rentalperiod )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRentalperiod = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE rentalperiod = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRentalperiod );

				preparedStatement.setInt(1,rentalperiod); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBybillmonth(int billmonth )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBillmonth = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE billmonth = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBillmonth );

				preparedStatement.setInt(1,billmonth); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycasconfigured(int casconfigured )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasconfigured = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE casconfigured = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasconfigured );

				preparedStatement.setInt(1,casconfigured); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findByremarks(String remarks )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByRemarks = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE remarks = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByRemarks );

				preparedStatement.setString(1,remarks); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBytype(String type )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByType = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE type = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByType );

				preparedStatement.setString(1,type); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBysaff_no(String saff_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySaff_no = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE saff_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySaff_no );

				preparedStatement.setString(1,saff_no); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBycolony(String colony )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByColony = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE colony = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByColony );

				preparedStatement.setString(1,colony); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public SubscribermasterBean[] findBybillingaddr(String billingaddr )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			SubscribermasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBillingaddr = "SELECT  id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr FROM subscribermaster WHERE billingaddr = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBillingaddr );

				preparedStatement.setString(1,billingaddr); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setName( resultSet.getString("name"));

					bean.setFirstname( resultSet.getString("firstname"));

					bean.setMiddlename( resultSet.getString("middlename"));

					bean.setLastname( resultSet.getString("lastname"));

					bean.setCode( resultSet.getString("code"));

					bean.setPin( resultSet.getString("pin"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setEmail( resultSet.getString("email"));

					bean.setAreaid( resultSet.getInt("areaid"));

					bean.setLcoid( resultSet.getInt("lcoid"));

					bean.setCasid( resultSet.getInt("casid"));

					bean.setInstallationdate( resultSet.getDate("installationdate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setBillcycleid( resultSet.getInt("billcycleid"));

					bean.setTaxcombinationid( resultSet.getInt("taxcombinationid"));

					bean.setLastpayment( resultSet.getDouble("lastpayment"));

					bean.setPreviousbalance( resultSet.getDouble("previousbalance"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setHouseNo( resultSet.getString("HouseNo"));

					bean.setFloor( resultSet.getString("Floor"));

					bean.setSide( resultSet.getString("Side"));

					bean.setBlockNo( resultSet.getString("BlockNo"));

					bean.setSector( resultSet.getString("Sector"));

					bean.setComplexName( resultSet.getString("ComplexName"));

					bean.setCity( resultSet.getString("City"));

					bean.setDistrict( resultSet.getString("District"));

					bean.setState( resultSet.getString("State"));

					bean.setRentalperiod( resultSet.getInt("rentalperiod"));

					bean.setBillmonth( resultSet.getInt("billmonth"));

					bean.setCasconfigured( resultSet.getInt("casconfigured"));

					bean.setRemarks( resultSet.getString("remarks"));

					bean.setType( resultSet.getString("type"));

					bean.setSaff_no( resultSet.getString("saff_no"));

					bean.setColony( resultSet.getString("colony"));

					bean.setBillingaddr( resultSet.getString("billingaddr"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new SubscribermasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (SubscribermasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public int insertAllCols( SubscribermasterBean bean,Connection conn ) throws Exception{

			/*DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();*/

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedKey = 0;

			//String sqlInsertAllStmt = "INSERT INTO subscribermaster( id, name, firstname, middlename, lastname, code, pin, mobile, phone, email, areaid, lcoid, casid, installationdate, status, comments, billcycleid, taxcombinationid, lastpayment, previousbalance, historypresent, createby, createdate, modifyby, modifydate, extra, HouseNo, Floor, Side, BlockNo, Sector, ComplexName, City, District, State, rentalperiod, billmonth, casconfigured, remarks, type, saff_no, colony, billingaddr ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;
			String insertNewSubscriber = "INSERT INTO subscribermaster(name,firstname,middlename,lastname,pin,mobile,phone,email,areaid,lcoid,casid,status,billcycleid,taxcombinationid,createby,createdate,HouseNo,Floor,Side,BlockNo,Sector,ComplexName,City,District,State,saff_no,colony,billingaddr) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;

			try{

				preparedStatement = conn.prepareStatement(insertNewSubscriber,preparedStatement.RETURN_GENERATED_KEYS);

				preparedStatement.setString(1, bean.getName());

				preparedStatement.setString(2, bean.getFirstname());

				preparedStatement.setString(3, bean.getMiddlename());

				preparedStatement.setString(4, bean.getLastname());

				/*preparedStatement.setString(5, bean.getCode());*/

				preparedStatement.setString(5, bean.getPin());

				preparedStatement.setString(6, bean.getMobile());

				preparedStatement.setString(7, bean.getPhone());

				preparedStatement.setString(8, bean.getEmail());

				preparedStatement.setInt(9, bean.getAreaid());

				preparedStatement.setInt(10, bean.getLcoid());

				//preparedStatement.setInt(11, bean.getCasid());
				preparedStatement.setNull(11,java.sql.Types.INTEGER);

				preparedStatement.setString(12, bean.getStatus());

				preparedStatement.setInt(13, bean.getBillcycleid());

				preparedStatement.setInt(14, bean.getTaxcombinationid());

				preparedStatement.setInt(15, bean.getCreateby());

				preparedStatement.setDate(16, bean.getCreatedate());

				preparedStatement.setString(17, bean.getHouseNo());

				preparedStatement.setString(18, bean.getFloor());

				preparedStatement.setString(19, bean.getSide());

				preparedStatement.setString(20, bean.getBlockNo());

				preparedStatement.setString(21, bean.getSector());

				preparedStatement.setString(22, bean.getComplexName());

				preparedStatement.setString(23, bean.getCity());

				preparedStatement.setString(24, bean.getDistrict());

				preparedStatement.setString(25, bean.getState());

				preparedStatement.setString(26, bean.getSaff_no());

				preparedStatement.setString(27, bean.getColony());

				preparedStatement.setString(28, bean.getBillingaddr());

				
				preparedStatement.executeUpdate();
				
				
				resultSet = preparedStatement.getGeneratedKeys();
				
		  	    if(resultSet.next()){
		  	        	
		  	    		System.out.println("Generated Subscriber Id: " + resultSet.getInt(1));
		  	        	
		  	    		generatedKey = resultSet.getInt(1);
		  	   }

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}
			return generatedKey;

		}

		public void updateAllCols( SubscribermasterBean bean, Connection conn )throws Exception{

			// DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			// Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE subscribermaster SET  name = ? ,firstname = ? ,middlename = ? ,lastname = ? ,pin = ? ,mobile = ? ,phone = ? ,email = ? ,areaid = ? ,lcoid = ? ,casid = ? ,status = ? ,billcycleid = ? ,taxcombinationid = ? ,HouseNo = ? ,Floor = ? ,Side = ? ,BlockNo = ? ,Sector = ? ,ComplexName = ? ,City = ? ,District = ? ,State = ? ,saff_no = ? ,colony = ? ,billingaddr = ?  WHERE id = ?";

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
					
					preparedStatement.setString(1, bean.getName());
	
					preparedStatement.setString(2, bean.getFirstname());
	
					preparedStatement.setString(3, bean.getMiddlename());
	
					preparedStatement.setString(4, bean.getLastname());
	
					preparedStatement.setString(5, bean.getPin());
	
					preparedStatement.setString(6, bean.getMobile());
	
					preparedStatement.setString(7, bean.getPhone());
	
					preparedStatement.setString(8, bean.getEmail());
	
					preparedStatement.setInt(9, bean.getAreaid());
	
					preparedStatement.setInt(10, bean.getLcoid());
	
					//preparedStatement.setInt(11, bean.getCasid());
					preparedStatement.setNull(11,java.sql.Types.INTEGER);
	
					preparedStatement.setString(12, bean.getStatus());
	
					preparedStatement.setInt(13, bean.getBillcycleid());
	
					preparedStatement.setInt(14, bean.getTaxcombinationid());
	
					preparedStatement.setString(15, bean.getHouseNo());
	
					preparedStatement.setString(16, bean.getFloor());
	
					preparedStatement.setString(17, bean.getSide());
	
					preparedStatement.setString(18, bean.getBlockNo());
	
					preparedStatement.setString(19, bean.getSector());
	
					preparedStatement.setString(20, bean.getComplexName());
	
					preparedStatement.setString(21, bean.getCity());
	
					preparedStatement.setString(22, bean.getDistrict());
	
					preparedStatement.setString(23, bean.getState());
	
					preparedStatement.setString(24, bean.getSaff_no());
	
					preparedStatement.setString(25, bean.getColony());
	
					preparedStatement.setString(26, bean.getBillingaddr());
					
					preparedStatement.setInt(27, bean.getId());
					
					preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM subscribermaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM subscribermaster WHERE id = ? " ;

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

			String sqlDeleteByName = "DELETE FROM subscribermaster WHERE name = ? " ;

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

		public void deleteByfirstname(String firstname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByFirstname = "DELETE FROM subscribermaster WHERE firstname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByFirstname );

				preparedStatement.setString(1,firstname); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymiddlename(String middlename )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMiddlename = "DELETE FROM subscribermaster WHERE middlename = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMiddlename );

				preparedStatement.setString(1,middlename); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBylastname(String lastname )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLastname = "DELETE FROM subscribermaster WHERE lastname = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLastname );

				preparedStatement.setString(1,lastname); 

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

			String sqlDeleteByCode = "DELETE FROM subscribermaster WHERE code = ? " ;

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

		public void deleteBypin(String pin )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPin = "DELETE FROM subscribermaster WHERE pin = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPin );

				preparedStatement.setString(1,pin); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymobile(String mobile )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMobile = "DELETE FROM subscribermaster WHERE mobile = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMobile );

				preparedStatement.setString(1,mobile); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByphone(String phone )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPhone = "DELETE FROM subscribermaster WHERE phone = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPhone );

				preparedStatement.setString(1,phone); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByemail(String email )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEmail = "DELETE FROM subscribermaster WHERE email = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEmail );

				preparedStatement.setString(1,email); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByareaid(int areaid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAreaid = "DELETE FROM subscribermaster WHERE areaid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAreaid );

				preparedStatement.setInt(1,areaid); 

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

			String sqlDeleteByLcoid = "DELETE FROM subscribermaster WHERE lcoid = ? " ;

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

		public void deleteBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCasid = "DELETE FROM subscribermaster WHERE casid = ? " ;

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

		public void deleteByinstallationdate(Date installationdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByInstallationdate = "DELETE FROM subscribermaster WHERE installationdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByInstallationdate );

				preparedStatement.setDate(1,installationdate); 

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

			String sqlDeleteByStatus = "DELETE FROM subscribermaster WHERE status = ? " ;

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

			String sqlDeleteByComments = "DELETE FROM subscribermaster WHERE comments = ? " ;

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

		public void deleteBybillcycleid(int billcycleid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBillcycleid = "DELETE FROM subscribermaster WHERE billcycleid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBillcycleid );

				preparedStatement.setInt(1,billcycleid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBytaxcombinationid(int taxcombinationid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByTaxcombinationid = "DELETE FROM subscribermaster WHERE taxcombinationid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByTaxcombinationid );

				preparedStatement.setInt(1,taxcombinationid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBylastpayment(double lastpayment )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByLastpayment = "DELETE FROM subscribermaster WHERE lastpayment = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByLastpayment );

				preparedStatement.setDouble(1,lastpayment); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBypreviousbalance(double previousbalance )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPreviousbalance = "DELETE FROM subscribermaster WHERE previousbalance = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPreviousbalance );

				preparedStatement.setDouble(1,previousbalance); 

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

			String sqlDeleteByHistorypresent = "DELETE FROM subscribermaster WHERE historypresent = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM subscribermaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM subscribermaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM subscribermaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM subscribermaster WHERE modifydate = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM subscribermaster WHERE extra = ? " ;

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

		public void deleteByhouseNo(String houseNo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByHouseNo = "DELETE FROM subscribermaster WHERE houseNo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByHouseNo );

				preparedStatement.setString(1,houseNo); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByfloor(String floor )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByFloor = "DELETE FROM subscribermaster WHERE floor = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByFloor );

				preparedStatement.setString(1,floor); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByside(String side )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySide = "DELETE FROM subscribermaster WHERE side = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySide );

				preparedStatement.setString(1,side); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByblockNo(String blockNo )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBlockNo = "DELETE FROM subscribermaster WHERE blockNo = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBlockNo );

				preparedStatement.setString(1,blockNo); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysector(String sector )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySector = "DELETE FROM subscribermaster WHERE sector = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySector );

				preparedStatement.setString(1,sector); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycomplexName(String complexName )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByComplexName = "DELETE FROM subscribermaster WHERE complexName = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByComplexName );

				preparedStatement.setString(1,complexName); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycity(String city )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCity = "DELETE FROM subscribermaster WHERE city = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCity );

				preparedStatement.setString(1,city); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBydistrict(String district )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDistrict = "DELETE FROM subscribermaster WHERE district = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDistrict );

				preparedStatement.setString(1,district); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBystate(String state )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByState = "DELETE FROM subscribermaster WHERE state = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByState );

				preparedStatement.setString(1,state); 

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

			String sqlDeleteByRentalperiod = "DELETE FROM subscribermaster WHERE rentalperiod = ? " ;

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

		public void deleteBybillmonth(int billmonth )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBillmonth = "DELETE FROM subscribermaster WHERE billmonth = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBillmonth );

				preparedStatement.setInt(1,billmonth); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycasconfigured(int casconfigured )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCasconfigured = "DELETE FROM subscribermaster WHERE casconfigured = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCasconfigured );

				preparedStatement.setInt(1,casconfigured); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByremarks(String remarks )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByRemarks = "DELETE FROM subscribermaster WHERE remarks = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByRemarks );

				preparedStatement.setString(1,remarks); 

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

			String sqlDeleteByType = "DELETE FROM subscribermaster WHERE type = ? " ;

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

		public void deleteBysaff_no(String saff_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySaff_no = "DELETE FROM subscribermaster WHERE saff_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySaff_no );

				preparedStatement.setString(1,saff_no); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycolony(String colony )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByColony = "DELETE FROM subscribermaster WHERE colony = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByColony );

				preparedStatement.setString(1,colony); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybillingaddr(String billingaddr )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBillingaddr = "DELETE FROM subscribermaster WHERE billingaddr = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBillingaddr );

				preparedStatement.setString(1,billingaddr); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		
		// Call from IndexComposer.java.
		public List<SubscribermasterBean> searchBySubscriberName(int lcoid,
				String searchString) throws Exception {
			
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList<SubscribermasterBean> beansList = new ArrayList<SubscribermasterBean>();

			String sqlSelectByAll = "SELECT  id,code, name FROM subscribermaster WHERE name like concat (?, '%') AND lcoid = ? "; 

			try{
				
				preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
				preparedStatement.setString(1,searchString);
				
				preparedStatement.setInt(2, lcoid);

				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()){
					
					SubscribermasterBean bean = new SubscribermasterBean();

					bean.setId( resultSet.getInt("id"));
					
					bean.setCode(resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));
				
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

		
		
		// Call from IndexComposer.java
		public List<SubscribermasterBean> searchBySubscriberCode(int lcoid,
				String searchString) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			ArrayList<SubscribermasterBean> beansList = new ArrayList<SubscribermasterBean>();

			String sqlSelectByAll = "SELECT  id,code, name FROM subscribermaster WHERE code like concat (?, '%') AND lcoid = ? ";
			
			try{
					preparedStatement = conn.prepareStatement( sqlSelectByAll );
				
					preparedStatement.setString(1,searchString);
				
					preparedStatement.setInt(2, lcoid);
					
					resultSet = preparedStatement.executeQuery();
				
					while(resultSet.next()){
					
						SubscribermasterBean bean = new SubscribermasterBean();

						bean.setId( resultSet.getInt("id"));
					
						bean.setCode(resultSet.getString("code"));

						bean.setName( resultSet.getString("name"));
				
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

