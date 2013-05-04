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
import com.sss.core.custom.bean.CustomVc;

import com.sss.core.database.* ;

	public class VcmasterDAO {

		public VcmasterBean[] findAll( )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();
			
			String sqlSelectByAll = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster " ;


			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAll );

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		

		}

		public VcmasterBean findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean bean = null ;

			String sqlSelectById = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

				}

				
			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;

		}

		public VcmasterBean[] findByvcnumber(String vcnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcnumber = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE vcnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcnumber );

				preparedStatement.setString(1,vcnumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBymake(String make )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMake = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE make = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMake );

				preparedStatement.setString(1,make); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBydescription(String description )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByDescription = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE description = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByDescription );

				preparedStatement.setString(1,description); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findByassigndate(Date assigndate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByAssigndate = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE assigndate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByAssigndate );

				preparedStatement.setDate(1,assigndate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findByunassigndate(Date unassigndate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByUnassigndate = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE unassigndate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByUnassigndate );

				preparedStatement.setDate(1,unassigndate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBystatus(String status )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByStatus = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE status = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByStatus );

				preparedStatement.setString(1,status); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBycomments(String comments )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByComments = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE comments = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByComments );

				preparedStatement.setString(1,comments); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBycreateby(int createby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreateby = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE createby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreateby );

				preparedStatement.setInt(1,createby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBycreatedate(Date createdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCreatedate = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE createdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCreatedate );

				preparedStatement.setDate(1,createdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByHistorypresent = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE historypresent = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByHistorypresent );

				preparedStatement.setString(1,historypresent); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifyby = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE modifyby = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifyby );

				preparedStatement.setInt(1,modifyby); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBymodifydate(Date modifydate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByModifydate = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE modifydate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByModifydate );

				preparedStatement.setDate(1,modifydate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findByextra(String extra )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByExtra = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE extra = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByExtra );

				preparedStatement.setString(1,extra); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcmasterBean[] findBycasid(int casid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByCasid = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE casid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByCasid );

				preparedStatement.setInt(1,casid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcmasterBean bean = new VcmasterBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcmasterBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcmasterBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( VcmasterBean bean )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlInsertAllStmt = "INSERT INTO vcmaster( id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?  )" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt );

				preparedStatement.setInt(1, bean.getId());

				preparedStatement.setString(2, bean.getVcnumber());

				preparedStatement.setString(3, bean.getMake());

				preparedStatement.setString(4, bean.getDescription());

				preparedStatement.setDate(5, bean.getAssigndate());

				preparedStatement.setDate(6, bean.getUnassigndate());

				preparedStatement.setString(7, bean.getStatus());

				preparedStatement.setString(8, bean.getComments());

				preparedStatement.setInt(9, bean.getCreateby());

				preparedStatement.setDate(10, bean.getCreatedate());

				preparedStatement.setString(11, bean.getHistorypresent());

				preparedStatement.setInt(12, bean.getModifyby());

				preparedStatement.setDate(13, bean.getModifydate());

				preparedStatement.setString(14, bean.getExtra());

				preparedStatement.setInt(15, bean.getCasid());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

			try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( VcmasterBean bean, Connection conn )throws Exception{

			/*DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();
*/
			PreparedStatement preparedStatement = null ;

			//String sqlUpdateAllStmt = "UPDATE vcmaster SET  id = ?, vcnumber = ?, make = ?, description = ?, assigndate = ?, unassigndate = ?, status = ?, comments = ?, createby = ?, createdate = ?, historypresent = ?, modifyby = ?, modifydate = ?, extra = ?, casid = ?" ;
			String sqlUpdateAllStmt = "UPDATE vcmaster SET  assigndate = ?, status = ?, modifyby = ?, modifydate = ? WHERE vcnumber = ? " ;

			try{

					preparedStatement = conn.prepareStatement(sqlUpdateAllStmt);

					preparedStatement.setDate(1,bean.getAssigndate());
					preparedStatement.setString(2,bean.getStatus());
					preparedStatement.setInt(3, bean.getModifyby());
					preparedStatement.setDate(4,bean.getModifydate());
					preparedStatement.setString(5,bean.getVcnumber());
				
				
					/*preparedStatement.setInt(1, bean.getId());
	
					preparedStatement.setString(2, bean.getVcnumber());
	
					preparedStatement.setString(3, bean.getMake());
	
					preparedStatement.setString(4, bean.getDescription());
	
					preparedStatement.setDate(5, bean.getAssigndate());
	
					preparedStatement.setDate(6, bean.getUnassigndate());
	
					preparedStatement.setString(7, bean.getStatus());
	
					preparedStatement.setString(8, bean.getComments());
	
					preparedStatement.setInt(9, bean.getCreateby());
	
					preparedStatement.setDate(10, bean.getCreatedate());
	
					preparedStatement.setString(11, bean.getHistorypresent());
	
					preparedStatement.setInt(12, bean.getModifyby());
	
					preparedStatement.setDate(13, bean.getModifydate());
	
					preparedStatement.setString(14, bean.getExtra());
	
					preparedStatement.setInt(15, bean.getCasid());
	*/
				    preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM vcmaster " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM vcmaster WHERE id = ? " ;

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

		public void deleteByvcnumber(String vcnumber )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByVcnumber = "DELETE FROM vcmaster WHERE vcnumber = ? " ;

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

		public void deleteBymake(String make )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMake = "DELETE FROM vcmaster WHERE make = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMake );

				preparedStatement.setString(1,make); 

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

			String sqlDeleteByDescription = "DELETE FROM vcmaster WHERE description = ? " ;

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

		public void deleteByassigndate(Date assigndate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByAssigndate = "DELETE FROM vcmaster WHERE assigndate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByAssigndate );

				preparedStatement.setDate(1,assigndate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByunassigndate(Date unassigndate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByUnassigndate = "DELETE FROM vcmaster WHERE unassigndate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByUnassigndate );

				preparedStatement.setDate(1,unassigndate); 

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

			String sqlDeleteByStatus = "DELETE FROM vcmaster WHERE status = ? " ;

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

			String sqlDeleteByComments = "DELETE FROM vcmaster WHERE comments = ? " ;

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

			String sqlDeleteByCreateby = "DELETE FROM vcmaster WHERE createby = ? " ;

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

			String sqlDeleteByCreatedate = "DELETE FROM vcmaster WHERE createdate = ? " ;

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

		public void deleteByhistorypresent(String historypresent )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByHistorypresent = "DELETE FROM vcmaster WHERE historypresent = ? " ;

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

		public void deleteBymodifyby(int modifyby )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByModifyby = "DELETE FROM vcmaster WHERE modifyby = ? " ;

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

			String sqlDeleteByModifydate = "DELETE FROM vcmaster WHERE modifydate = ? " ;

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

			String sqlDeleteByExtra = "DELETE FROM vcmaster WHERE extra = ? " ;

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

			String sqlDeleteByCasid = "DELETE FROM vcmaster WHERE casid = ? " ;

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

		
		
		// Call from ManagingComposer.java
		public void unAssignVC(VcmasterBean bean, Connection conn) throws Exception {
			

			PreparedStatement preparedStatement = null ;
			
			String unAssignVC = "UPDATE vcmaster SET status = ?,unassigndate = ?,modifyby = ?,modifydate = ? WHERE id = ? " ;

			try{

					preparedStatement = conn.prepareStatement(unAssignVC);
	
					preparedStatement.setString(1, bean.getStatus());
					
					preparedStatement.setDate(2, bean.getUnassigndate());
					
					preparedStatement.setInt(3, bean.getModifyby());
					
					preparedStatement.setDate(4, bean.getModifydate());
					
					preparedStatement.setInt(5, bean.getId());
	
					preparedStatement.executeUpdate();

			}catch(Exception e){

					e.printStackTrace();
					
					throw new Exception();

			}finally{

				try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}
	
				}
			
		
			
		}

		
		// Call from ManagingComposer.java
		public VcmasterBean fetchVCDetailsFromVCNumber(String vcnumber,
				Connection conn) throws Exception {

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcmasterBean bean = new VcmasterBean();

			String sqlSelectByVcnumber = "SELECT  id, vcnumber, make, description, assigndate, unassigndate, status, comments, createby, createdate, historypresent, modifyby, modifydate, extra, casid FROM vcmaster WHERE vcnumber = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcnumber );

				preparedStatement.setString(1,vcnumber); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					bean.setId( resultSet.getInt("id"));

					bean.setVcnumber( resultSet.getString("vcnumber"));

					bean.setMake( resultSet.getString("make"));

					bean.setDescription( resultSet.getString("description"));

					bean.setAssigndate( resultSet.getDate("assigndate"));

					bean.setUnassigndate( resultSet.getDate("unassigndate"));

					bean.setStatus( resultSet.getString("status"));

					bean.setComments( resultSet.getString("comments"));

					bean.setCreateby( resultSet.getInt("createby"));

					bean.setCreatedate( resultSet.getDate("createdate"));

					bean.setHistorypresent( resultSet.getString("historypresent"));

					bean.setModifyby( resultSet.getInt("modifyby"));

					bean.setModifydate( resultSet.getDate("modifydate"));

					bean.setExtra( resultSet.getString("extra"));

					bean.setCasid( resultSet.getInt("casid"));

				}

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

				try{ resultSet.close();preparedStatement.close();}catch(SQLException ioe){}

			}

			return bean ;
			
		}

		
		// Call from ManageSearchComposer.java
		public CustomVc fetchVcDetailsByVcNumber(String vcnumber) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
			
			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;
			
			CustomVc customVc = new CustomVc();
			
			String sqlSelectByVcnumber = "SELECT  id, vcnumber, status, casid FROM vcmaster WHERE vcnumber = ? " ;
			
			try{
					preparedStatement = conn.prepareStatement( sqlSelectByVcnumber );

					preparedStatement.setString(1,vcnumber); 
				
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						customVc.setVcId(resultSet.getInt("id"));
						
						customVc.setVcnumber(resultSet.getString("vcnumber"));
						
						customVc.setStatus(resultSet.getString("status"));
						
						customVc.setCasId(resultSet.getInt("casid"));
						
					}
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
			
			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}
			
			return customVc;
			
		}

	}

