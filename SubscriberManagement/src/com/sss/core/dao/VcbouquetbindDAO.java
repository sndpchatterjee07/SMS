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

	public class VcbouquetbindDAO {

		public VcbouquetbindBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind " ;

			return null ;

		}

		public VcbouquetbindBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcid = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcid );

				preparedStatement.setInt(1,vcid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findBybouquet_id(int bouquet_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByBouquet_id = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE bouquet_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByBouquet_id );

				preparedStatement.setInt(1,bouquet_id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));


					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIndate = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIndate );

				preparedStatement.setDate(1,indate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));


					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setString(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));


					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByOutdate = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByOutdate );

				preparedStatement.setDate(1,outdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));


					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findBysdate(Date sdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySdate = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE sdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySdate );

				preparedStatement.setDate(1,sdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));


					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcbouquetbindBean[] findByedate(Date edate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcbouquetbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEdate = "SELECT  id, vcid, bouquet_id, indate, mode, outdate, sdate, edate FROM vcbouquetbind WHERE edate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEdate );

				preparedStatement.setDate(1,edate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcbouquetbindBean bean = new VcbouquetbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setBouquet_id( resultSet.getInt("bouquet_id"));

					bean.setIndate( resultSet.getDate("indate"));

					bean.setMode( resultSet.getString("mode"));

					bean.setOutdate( resultSet.getDate("outdate"));

					//bean.setSdate( resultSet.getDate("sdate"));

					//bean.setEdate( resultSet.getDate("edate"));
					
					bean.setSdate(resultSet.getTimestamp("sdate"));
					
					bean.setEdate(resultSet.getTimestamp("edate"));

					beansList.add(bean);

				}

				Object[] objectArray = beansList.toArray();

				beans = new VcbouquetbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcbouquetbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public void insertAllCols( VcbouquetbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedvcbouquetbindId = 0;

			//String sqlInsertAllStmt = "INSERT INTO vcbouquetbind( id, vcid, bouquet_id, indate, mode, outdate, sdate, edate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ?  )" ;
			
			String sqlInsertAllStmt = "INSERT INTO vcbouquetbind(vcid,bouquet_id,indate,mode,sdate,edate) VALUES ( ? , ? , ? , ? , ? , ?)" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt,preparedStatement.RETURN_GENERATED_KEYS );

				//preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(1, bean.getVcid());

				preparedStatement.setInt(2, bean.getBouquet_id());

				preparedStatement.setDate(3, bean.getIndate());

				preparedStatement.setString(4, bean.getMode());

				//preparedStatement.setDate(5, bean.getOutdate());

				preparedStatement.setTimestamp(5, bean.getSdate());
				
				
				if(bean.getEdate()!= null){
					
					preparedStatement.setTimestamp(6, bean.getEdate());
				
				}else{
					
					preparedStatement.setNull(6,java.sql.Types.TIMESTAMP);
					
				}
						
				
				
				

				preparedStatement.executeUpdate();
				
				resultSet = preparedStatement.getGeneratedKeys();
		  	    
				if(resultSet.next()){
		  	       
					System.out.println("generatedvcbouquetbindId: " + resultSet.getInt(1));
		  	       
					generatedvcbouquetbindId = resultSet.getInt(1);
		  	    }

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( VcbouquetbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			// String sqlUpdateAllStmt = "UPDATE vcbouquetbind SET  id = ?, vcid = ?, bouquet_id = ?, indate = ?, mode = ?, outdate = ?, sdate = ?, edate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE vcbouquetbind SET  mode = ?, outdate = ? WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				preparedStatement.setString(1, bean.getMode());
				
				preparedStatement.setDate(2, bean.getOutdate());
				
				preparedStatement.setInt(3, bean.getId());
				
				//preparedStatement.setInt(1, bean.getId());

				//preparedStatement.setInt(2, bean.getVcid());

				//preparedStatement.setInt(3, bean.getBouquet_id());

				//preparedStatement.setDate(4, bean.getIndate());

				//preparedStatement.setString(5, bean.getMode());

				//preparedStatement.setDate(6, bean.getOutdate());

				//preparedStatement.setTimestamp(7, bean.getSdate());

				//preparedStatement.setTimestamp(8, bean.getEdate());

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void deleteAll( )throws Exception{

			String sqlDeleteAll = "DELETE FROM vcbouquetbind " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM vcbouquetbind WHERE id = ? " ;

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

		public void deleteByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByVcid = "DELETE FROM vcbouquetbind WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByVcid );

				preparedStatement.setInt(1,vcid); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBybouquet_id(int bouquet_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByBouquet_id = "DELETE FROM vcbouquetbind WHERE bouquet_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByBouquet_id );

				preparedStatement.setInt(1,bouquet_id); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByIndate = "DELETE FROM vcbouquetbind WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByIndate );

				preparedStatement.setDate(1,indate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByMode = "DELETE FROM vcbouquetbind WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByMode );

				preparedStatement.setString(1,mode); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByOutdate = "DELETE FROM vcbouquetbind WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByOutdate );

				preparedStatement.setDate(1,outdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteBysdate(Date sdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteBySdate = "DELETE FROM vcbouquetbind WHERE sdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteBySdate );

				preparedStatement.setDate(1,sdate); 

				preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();
preparedStatement.close();}catch(SQLException ioe){}

			}

			//no return value here

		}

		public void deleteByedate(Date edate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByEdate = "DELETE FROM vcbouquetbind WHERE edate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByEdate );

				preparedStatement.setDate(1,edate); 

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
		public List<VcbouquetbindBean> findByvc_id_modeIn(int id) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();
			
			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			List<VcbouquetbindBean> vcbouquetbindBeans = new ArrayList<VcbouquetbindBean>();
			
			String sqlSelectByVc_id = "SELECT  id, vcid,bouquet_id,indate, mode, outdate,sdate,edate FROM cbiz.vcbouquetbind WHERE vcid = ? and mode='i' ";
			
			try{

						preparedStatement = conn.prepareStatement( sqlSelectByVc_id );

						preparedStatement.setInt(1,id); 

						resultSet = preparedStatement.executeQuery();
						
						while(resultSet.next()){

								VcbouquetbindBean bean = new VcbouquetbindBean();
								
								bean.setId( resultSet.getInt("id"));

								bean.setVcid( resultSet.getInt("vcid"));

								bean.setBouquet_id( resultSet.getInt("bouquet_id"));

								bean.setIndate( resultSet.getDate("indate"));

								bean.setMode( resultSet.getString("mode"));

								bean.setOutdate( resultSet.getDate("outdate"));

								//bean.setSdate(new Date(resultSet.getDate("sdate").getTime()));
								
								//System.out.println("db time "+resultSet.getTimestamp("sdate"));

								//bean.setEdate( resultSet.getDate("edate"));
								
								bean.setSdate(resultSet.getTimestamp("sdate"));
								
								bean.setEdate(resultSet.getTimestamp("edate"));
								
								vcbouquetbindBeans.add(bean);
					
						}	
				}catch(Exception e){
					
					  e.printStackTrace();
					  
					  throw new Exception();
				
				}finally{

					try{ resultSet.close();preparedStatement.close();conn.close();dbDatabaseHandler.closeConnection();}catch(SQLException ioe){}

				}
				
				return vcbouquetbindBeans;
				
			}

		
		
		
		// Call from VcBouquetBindInfoUpdateHelper.java 
		
		public List<VcbouquetbindBean> fetchVcBouquetBind_modeIn(int id,
				Connection conn) throws Exception {
			
			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			List<VcbouquetbindBean> vcbouquetbindBeans = new ArrayList<VcbouquetbindBean>();
			
			String sqlSelectByVc_id = "SELECT  id, vcid,bouquet_id,indate, mode, outdate,sdate,edate FROM cbiz.vcbouquetbind WHERE vcid = ? and mode='i' ";
			
			try{
				
					preparedStatement = conn.prepareStatement( sqlSelectByVc_id );
					
					preparedStatement.setInt(1,id); 

					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){

						VcbouquetbindBean bean = new VcbouquetbindBean();
						
						bean.setId( resultSet.getInt("id"));

						bean.setVcid( resultSet.getInt("vcid"));

						bean.setBouquet_id( resultSet.getInt("bouquet_id"));

						bean.setIndate( resultSet.getDate("indate"));

						bean.setMode( resultSet.getString("mode"));

						bean.setOutdate( resultSet.getDate("outdate"));

						//bean.setSdate(new Date(resultSet.getDate("sdate").getTime()));
						
						//System.out.println("db time "+resultSet.getTimestamp("sdate"));

						//bean.setEdate( resultSet.getDate("edate"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));
						
						vcbouquetbindBeans.add(bean);
			
				}
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{

				try{ resultSet.close();preparedStatement.close();}catch(SQLException ioe){}

			}
			
			return vcbouquetbindBeans;
			
		}

		
		
		// Call from VcBouquetBindInfoUpdateHelper.java
		
		public void updateEDates(VcbouquetbindBean bean,
				Connection conn) throws Exception{
			
			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			// String sqlUpdateAllStmt = "UPDATE vcbouquetbind SET  id = ?, vcid = ?, bouquet_id = ?, indate = ?, mode = ?, outdate = ?, sdate = ?, edate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE vcbouquetbind SET  mode = ?, outdate = ?,edate = ? WHERE id = ? " ;

			try{

					preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );
	
					preparedStatement.setString(1, bean.getMode());
					
					preparedStatement.setDate(2, bean.getOutdate());
					
					if(bean.getEdate()!= null){
						
						preparedStatement.setTimestamp(3, bean.getEdate());
					
					}else{
						
						preparedStatement.setNull(3,java.sql.Types.TIMESTAMP);
						
					}
					
					System.out.println("~ " + bean.getId());
					
					preparedStatement.setInt(4, bean.getId());
				
					//preparedStatement.setInt(1, bean.getId());
	
					//preparedStatement.setInt(2, bean.getVcid());
	
					//preparedStatement.setInt(3, bean.getBouquet_id());
	
					//preparedStatement.setDate(4, bean.getIndate());
	
					//preparedStatement.setString(5, bean.getMode());
	
					//preparedStatement.setDate(6, bean.getOutdate());
	
					//preparedStatement.setTimestamp(7, bean.getSdate());
	
					//preparedStatement.setTimestamp(8, bean.getEdate());
	
					preparedStatement.executeUpdate();

			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

			
			
		}

		
		
		
	}

