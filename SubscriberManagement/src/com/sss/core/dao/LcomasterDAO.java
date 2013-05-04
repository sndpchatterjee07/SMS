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

	public class LcomasterDAO {

		public LcomasterBean[] findAll( )throws Exception{
		
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();
			
			String sqlSelectByAll = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster order by name" ;


			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean bean = null ;
			
			String sqlSelectById = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean =  new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

				}

			
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public LcomasterBean[] findBycode(String code )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCode = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE code = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCode );

				preparedStatement.setString(1,code); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByname(String name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByName = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByName );

				preparedStatement.setString(1,name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycountry(String country )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCountry = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE country = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCountry );

				preparedStatement.setString(1,country); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBystate(String state )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByState = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE state = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByState );

				preparedStatement.setString(1,state); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycity(String city )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCity = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE city = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCity );

				preparedStatement.setString(1,city); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByaddressline1(String addressline1 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAddressline1 = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE addressline1 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAddressline1 );

				preparedStatement.setString(1,addressline1); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByaddressline2(String addressline2 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAddressline2 = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE addressline2 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAddressline2 );

				preparedStatement.setString(1,addressline2); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByaddressline3(String addressline3 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAddressline3 = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE addressline3 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAddressline3 );

				preparedStatement.setString(1,addressline3); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByaddressline4(String addressline4 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAddressline4 = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE addressline4 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAddressline4 );

				preparedStatement.setString(1,addressline4); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBypin(String pin )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPin = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE pin = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPin );

				preparedStatement.setString(1,pin); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByphone(String phone )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPhone = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE phone = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPhone );

				preparedStatement.setString(1,phone); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBymobile(String mobile )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMobile = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE mobile = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMobile );

				preparedStatement.setString(1,mobile); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycommission(double commission )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCommission = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE commission = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCommission );

				preparedStatement.setDouble(1,commission); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBydistributorid(int distributorid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDistributorid = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE distributorid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDistributorid );

				preparedStatement.setInt(1,distributorid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBycouponquota(double couponquota )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCouponquota = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE couponquota = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCouponquota );

				preparedStatement.setDouble(1,couponquota); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBypo_reg_no(String po_reg_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPo_reg_no = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE po_reg_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPo_reg_no );

				preparedStatement.setString(1,po_reg_no); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByentertainment_reg_no(String entertainment_reg_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEntertainment_reg_no = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE entertainment_reg_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEntertainment_reg_no );

				preparedStatement.setString(1,entertainment_reg_no); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBypan(String pan )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPan = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE pan = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPan );

				preparedStatement.setString(1,pan); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBytin(String tin )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByTin = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE tin = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByTin );

				preparedStatement.setString(1,tin); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByvat(String vat )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVat = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE vat = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVat );

				preparedStatement.setString(1,vat); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByservice_tax(String service_tax )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByService_tax = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE service_tax = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByService_tax );

				preparedStatement.setString(1,service_tax); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findBydas_no(String das_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDas_no = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE das_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDas_no );

				preparedStatement.setString(1,das_no); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByperson_name(String person_name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByPerson_name = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE person_name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByPerson_name );

				preparedStatement.setString(1,person_name); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public LcomasterBean[] findByemail(String email )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			LcomasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEmail = "SELECT  id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email FROM lcomaster WHERE email = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEmail );

				preparedStatement.setString(1,email); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					LcomasterBean bean = new LcomasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setCode( resultSet.getString("code"));

					bean.setName( resultSet.getString("name"));

					bean.setCountry( resultSet.getString("country"));

					bean.setState( resultSet.getString("state"));

					bean.setCity( resultSet.getString("city"));

					bean.setAddressline1( resultSet.getString("addressline1"));

					bean.setAddressline2( resultSet.getString("addressline2"));

					bean.setAddressline3( resultSet.getString("addressline3"));

					bean.setAddressline4( resultSet.getString("addressline4"));

					bean.setPin( resultSet.getString("pin"));

					bean.setPhone( resultSet.getString("phone"));

					bean.setMobile( resultSet.getString("mobile"));

					bean.setCommission( resultSet.getDouble("commission"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setDistributorid( resultSet.getInt("distributorid"));

					bean.setCouponquota( resultSet.getDouble("couponquota"));

					bean.setPo_reg_no( resultSet.getString("po_reg_no"));

					bean.setEntertainment_reg_no( resultSet.getString("entertainment_reg_no"));

					bean.setPan( resultSet.getString("pan"));

					bean.setTin( resultSet.getString("tin"));

					bean.setVat( resultSet.getString("vat"));

					bean.setService_tax( resultSet.getString("service_tax"));

					bean.setDas_no( resultSet.getString("das_no"));

					bean.setPerson_name( resultSet.getString("person_name"));

					bean.setEmail( resultSet.getString("email"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new LcomasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (LcomasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( LcomasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO lcomaster( id, code, name, country, state, city, addressline1, addressline2, addressline3, addressline4, pin, phone, mobile, commission, status, comments, createby, createdate, modifyby, modifydate, historypresent, extra, distributorid, couponquota, po_reg_no, entertainment_reg_no, pan, tin, vat, service_tax, das_no, person_name, email ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getCountry());

				preparedStatement.setString(5, bean.getState());

				preparedStatement.setString(6, bean.getCity());

				preparedStatement.setString(7, bean.getAddressline1());

				preparedStatement.setString(8, bean.getAddressline2());

				preparedStatement.setString(9, bean.getAddressline3());

				preparedStatement.setString(10, bean.getAddressline4());

				preparedStatement.setString(11, bean.getPin());

				preparedStatement.setString(12, bean.getPhone());

				preparedStatement.setString(13, bean.getMobile());

				preparedStatement.setDouble(14, bean.getCommission());

				preparedStatement.setString(15, bean.getStatus());

				preparedStatement.setString(16, bean.getComments());

				preparedStatement.setInt(17, bean.getCreateby());

				preparedStatement.setDate(18, bean.getCreatedate());

				preparedStatement.setInt(19, bean.getModifyby());

				preparedStatement.setDate(20, bean.getModifydate());

				preparedStatement.setString(21, bean.getHistorypresent());

				preparedStatement.setString(22, bean.getExtra());

				preparedStatement.setInt(23, bean.getDistributorid());

				preparedStatement.setDouble(24, bean.getCouponquota());

				preparedStatement.setString(25, bean.getPo_reg_no());

				preparedStatement.setString(26, bean.getEntertainment_reg_no());

				preparedStatement.setString(27, bean.getPan());

				preparedStatement.setString(28, bean.getTin());

				preparedStatement.setString(29, bean.getVat());

				preparedStatement.setString(30, bean.getService_tax());

				preparedStatement.setString(31, bean.getDas_no());

				preparedStatement.setString(32, bean.getPerson_name());

				preparedStatement.setString(33, bean.getEmail());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( LcomasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlUpdateAllStmt = "UPDATE lcomaster SET  id = ?, code = ?, name = ?, country = ?, state = ?, city = ?, addressline1 = ?, addressline2 = ?, addressline3 = ?, addressline4 = ?, pin = ?, phone = ?, mobile = ?, commission = ?, status = ?, comments = ?, createby = ?, createdate = ?, modifyby = ?, modifydate = ?, historypresent = ?, extra = ?, distributorid = ?, couponquota = ?, po_reg_no = ?, entertainment_reg_no = ?, pan = ?, tin = ?, vat = ?, service_tax = ?, das_no = ?, person_name = ?, email = ?" ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getCode());

				preparedStatement.setString(3, bean.getName());

				preparedStatement.setString(4, bean.getCountry());

				preparedStatement.setString(5, bean.getState());

				preparedStatement.setString(6, bean.getCity());

				preparedStatement.setString(7, bean.getAddressline1());

				preparedStatement.setString(8, bean.getAddressline2());

				preparedStatement.setString(9, bean.getAddressline3());

				preparedStatement.setString(10, bean.getAddressline4());

				preparedStatement.setString(11, bean.getPin());

				preparedStatement.setString(12, bean.getPhone());

				preparedStatement.setString(13, bean.getMobile());

				preparedStatement.setDouble(14, bean.getCommission());

				preparedStatement.setString(15, bean.getStatus());

				preparedStatement.setString(16, bean.getComments());

				preparedStatement.setInt(17, bean.getCreateby());

				preparedStatement.setDate(18, bean.getCreatedate());

				preparedStatement.setInt(19, bean.getModifyby());

				preparedStatement.setDate(20, bean.getModifydate());

				preparedStatement.setString(21, bean.getHistorypresent());

				preparedStatement.setString(22, bean.getExtra());

				preparedStatement.setInt(23, bean.getDistributorid());

				preparedStatement.setDouble(24, bean.getCouponquota());

				preparedStatement.setString(25, bean.getPo_reg_no());

				preparedStatement.setString(26, bean.getEntertainment_reg_no());

				preparedStatement.setString(27, bean.getPan());

				preparedStatement.setString(28, bean.getTin());

				preparedStatement.setString(29, bean.getVat());

				preparedStatement.setString(30, bean.getService_tax());

				preparedStatement.setString(31, bean.getDas_no());

				preparedStatement.setString(32, bean.getPerson_name());

				preparedStatement.setString(33, bean.getEmail());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM lcomaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM lcomaster WHERE id = ? " ;

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

			String sqlDeleteByCode = "DELETE FROM lcomaster WHERE code = ? " ;

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

			String sqlDeleteByName = "DELETE FROM lcomaster WHERE name = ? " ;

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

		public void deleteBycountry(String country )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCountry = "DELETE FROM lcomaster WHERE country = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCountry );

				preparedStatement.setString(1,country); 

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

			String sqlDeleteByState = "DELETE FROM lcomaster WHERE state = ? " ;

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

		public void deleteBycity(String city )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCity = "DELETE FROM lcomaster WHERE city = ? " ;

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

		public void deleteByaddressline1(String addressline1 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAddressline1 = "DELETE FROM lcomaster WHERE addressline1 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAddressline1 );

				preparedStatement.setString(1,addressline1); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByaddressline2(String addressline2 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAddressline2 = "DELETE FROM lcomaster WHERE addressline2 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAddressline2 );

				preparedStatement.setString(1,addressline2); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByaddressline3(String addressline3 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAddressline3 = "DELETE FROM lcomaster WHERE addressline3 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAddressline3 );

				preparedStatement.setString(1,addressline3); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByaddressline4(String addressline4 )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAddressline4 = "DELETE FROM lcomaster WHERE addressline4 = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAddressline4 );

				preparedStatement.setString(1,addressline4); 

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

			String sqlDeleteByPin = "DELETE FROM lcomaster WHERE pin = ? " ;

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

		public void deleteByphone(String phone )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPhone = "DELETE FROM lcomaster WHERE phone = ? " ;

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

		public void deleteBymobile(String mobile )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMobile = "DELETE FROM lcomaster WHERE mobile = ? " ;

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

		public void deleteBycommission(double commission )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCommission = "DELETE FROM lcomaster WHERE commission = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCommission );

				preparedStatement.setDouble(1,commission); 

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

			String sqlDeleteByStatus = "DELETE FROM lcomaster WHERE status = ? " ;

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

			String sqlDeleteByComments = "DELETE FROM lcomaster WHERE comments = ? " ;

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

		public void deleteBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCreateby = "DELETE FROM lcomaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM lcomaster WHERE createdate = ? " ;

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

			String sqlDeleteByModifyby = "DELETE FROM lcomaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM lcomaster WHERE modifydate = ? " ;

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

			String sqlDeleteByHistorypresent = "DELETE FROM lcomaster WHERE historypresent = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM lcomaster WHERE extra = ? " ;

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

		public void deleteBydistributorid(int distributorid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDistributorid = "DELETE FROM lcomaster WHERE distributorid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDistributorid );

				preparedStatement.setInt(1,distributorid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBycouponquota(double couponquota )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByCouponquota = "DELETE FROM lcomaster WHERE couponquota = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByCouponquota );

				preparedStatement.setDouble(1,couponquota); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBypo_reg_no(String po_reg_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPo_reg_no = "DELETE FROM lcomaster WHERE po_reg_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPo_reg_no );

				preparedStatement.setString(1,po_reg_no); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByentertainment_reg_no(String entertainment_reg_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEntertainment_reg_no = "DELETE FROM lcomaster WHERE entertainment_reg_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEntertainment_reg_no );

				preparedStatement.setString(1,entertainment_reg_no); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBypan(String pan )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPan = "DELETE FROM lcomaster WHERE pan = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPan );

				preparedStatement.setString(1,pan); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBytin(String tin )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByTin = "DELETE FROM lcomaster WHERE tin = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByTin );

				preparedStatement.setString(1,tin); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByvat(String vat )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByVat = "DELETE FROM lcomaster WHERE vat = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByVat );

				preparedStatement.setString(1,vat); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByservice_tax(String service_tax )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByService_tax = "DELETE FROM lcomaster WHERE service_tax = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByService_tax );

				preparedStatement.setString(1,service_tax); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBydas_no(String das_no )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByDas_no = "DELETE FROM lcomaster WHERE das_no = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByDas_no );

				preparedStatement.setString(1,das_no); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByperson_name(String person_name )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByPerson_name = "DELETE FROM lcomaster WHERE person_name = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByPerson_name );

				preparedStatement.setString(1,person_name); 

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

			String sqlDeleteByEmail = "DELETE FROM lcomaster WHERE email = ? " ;

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

	}

