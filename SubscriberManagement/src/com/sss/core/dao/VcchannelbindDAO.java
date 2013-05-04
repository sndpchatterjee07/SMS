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

	public class VcchannelbindDAO {

		public VcchannelbindBean[] findAll( )throws Exception{

			String sqlSelectByAll = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind " ;

			return null ;

		}

		public VcchannelbindBean[] findByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectById = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectById );

				preparedStatement.setInt(1,id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findByvcid(int vcid )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByVcid = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE vcid = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByVcid );

				preparedStatement.setInt(1,vcid); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findBychannel_id(int channel_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByChannel_id = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE channel_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByChannel_id );

				preparedStatement.setInt(1,channel_id); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findByindate(Date indate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByIndate = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE indate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByIndate );

				preparedStatement.setDate(1,indate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findBymode(String mode )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByMode = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE mode = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByMode );

				preparedStatement.setString(1,mode); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findByoutdate(Date outdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByOutdate = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE outdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByOutdate );

				preparedStatement.setDate(1,outdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findBysdate(Date sdate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectBySdate = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE sdate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectBySdate );

				preparedStatement.setDate(1,sdate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		public VcchannelbindBean[] findByedate(Date edate )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			VcchannelbindBean[] beans = null ;

			ArrayList beansList = new ArrayList();

			String sqlSelectByEdate = "SELECT  id, vcid, channel_id, indate, mode, outdate, sdate, edate FROM vcchannelbind WHERE edate = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlSelectByEdate );

				preparedStatement.setDate(1,edate); 

				resultSet = preparedStatement.executeQuery();

				while(resultSet.next()){

					VcchannelbindBean bean = new VcchannelbindBean();

					bean.setId( resultSet.getInt("id"));

					bean.setVcid( resultSet.getInt("vcid"));

					bean.setChannel_id( resultSet.getInt("channel_id"));

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

				beans = new VcchannelbindBean[objectArray.length];

				for(int jindex = 0 ; jindex < objectArray.length ; jindex++){

					beans[jindex] = (VcchannelbindBean)objectArray[jindex];

				}

			}catch(Exception e){

				e.printStackTrace();

			}finally{

				try{ dbDatabaseHandler.closeConnection();preparedStatement.close();}catch(SQLException ioe){}

			}

			return beans ;

		}

		
		
		
		public void insertAllCols( VcchannelbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null;
			
			int generatedvcchannelbindId = 0;

			//String sqlInsertAllStmt = "INSERT INTO vcchannelbind( id, vcid, channel_id, indate, mode, outdate, sdate, edate ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ?  )" ;
			
			String sqlInsertAllStmt = "INSERT INTO vcchannelbind(vcid,channel_id,indate,mode,sdate,edate) VALUES (?,?,?,?,?,?)" ;

			try{

				preparedStatement = conn.prepareStatement( sqlInsertAllStmt,preparedStatement.RETURN_GENERATED_KEYS );

				
				preparedStatement.setInt(1, bean.getVcid());

				preparedStatement.setInt(2, bean.getChannel_id());

				preparedStatement.setDate(3, bean.getIndate());

				preparedStatement.setString(4, bean.getMode());

				preparedStatement.setTimestamp(5, bean.getSdate());
				
				
				if(bean.getEdate()!= null){
					
					preparedStatement.setTimestamp(6, bean.getEdate());
				
				}else{
					
					preparedStatement.setNull(6,java.sql.Types.TIMESTAMP);
					
				}
				
				
				/*preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getVcid());

				preparedStatement.setInt(3, bean.getChannel_id());

				preparedStatement.setDate(4, bean.getIndate());

				preparedStatement.setString(5, bean.getMode());

				preparedStatement.setDate(6, bean.getOutdate());

				//preparedStatement.setDate(7, bean.getSdate());

				//preparedStatement.setDate(8, bean.getEdate());
				
				preparedStatement.setTimestamp(7, bean.getSdate());
				
				preparedStatement.setTimestamp(8, bean.getEdate());
*/
				
				
				preparedStatement.executeUpdate();
				
				resultSet = preparedStatement.getGeneratedKeys();
				
				if(resultSet.next()){
			  	       
					System.out.println("generatedvcchannelbindId: " + resultSet.getInt(1));
		  	       
					generatedvcchannelbindId = resultSet.getInt(1);
		  	    }
				
			}catch(Exception e){

				e.printStackTrace();
				
				throw new Exception();

			}finally{

			try{ /*dbDatabaseHandler.closeConnection();*/preparedStatement.close();}catch(SQLException ioe){}

			}

		}

		public void updateAllCols( VcchannelbindBean bean, Connection conn )throws Exception{

			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			//String sqlUpdateAllStmt = "UPDATE vcchannelbind SET  id = ?, vcid = ?, channel_id = ?, indate = ?, mode = ?, outdate = ?, sdate = ?, edate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE vcchannelbind SET mode = ?, outdate = ? WHERE id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlUpdateAllStmt );

				
				preparedStatement.setString(1, bean.getMode());
				
				preparedStatement.setDate(2, bean.getOutdate());
				
				preparedStatement.setInt(3, bean.getId());
				
				/*preparedStatement.setInt(1, bean.getId());

				preparedStatement.setInt(2, bean.getVcid());

				preparedStatement.setInt(3, bean.getChannel_id());

				preparedStatement.setDate(4, bean.getIndate());

				preparedStatement.setString(5, bean.getMode());

				preparedStatement.setDate(6, bean.getOutdate());

				//preparedStatement.setDate(7, bean.getSdate());

				//preparedStatement.setDate(8, bean.getEdate());
				
				preparedStatement.setTimestamp(7, bean.getSdate());
				
				preparedStatement.setTimestamp(8, bean.getEdate());
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

			String sqlDeleteAll = "DELETE FROM vcchannelbind " ;

			//delete code here...

		}

		public void deleteByid(int id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteById = "DELETE FROM vcchannelbind WHERE id = ? " ;

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

			String sqlDeleteByVcid = "DELETE FROM vcchannelbind WHERE vcid = ? " ;

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

		public void deleteBychannel_id(int channel_id )throws Exception{

			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			String sqlDeleteByChannel_id = "DELETE FROM vcchannelbind WHERE channel_id = ? " ;

			try{

				preparedStatement = conn.prepareStatement( sqlDeleteByChannel_id );

				preparedStatement.setInt(1,channel_id); 

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

			String sqlDeleteByIndate = "DELETE FROM vcchannelbind WHERE indate = ? " ;

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

			String sqlDeleteByMode = "DELETE FROM vcchannelbind WHERE mode = ? " ;

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

			String sqlDeleteByOutdate = "DELETE FROM vcchannelbind WHERE outdate = ? " ;

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

			String sqlDeleteBySdate = "DELETE FROM vcchannelbind WHERE sdate = ? " ;

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

			String sqlDeleteByEdate = "DELETE FROM vcchannelbind WHERE edate = ? " ;

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

		
		
		
		// Call from ManagingCompose.java
		public List<VcchannelbindBean> findByvc_id_modeIn(int id) throws Exception {
			
			DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			Connection conn = dbDatabaseHandler.getConnection();
			
			PreparedStatement preparedStatement = null ;

			ResultSet resultSet = null ;

			List<VcchannelbindBean> vcchannelbindBeans = new ArrayList<VcchannelbindBean>();
			
			String sqlSelectByVc_id = "SELECT id,vcid,channel_id,indate,mode,outdate,sdate,edate FROM vcchannelbind v WHERE vcid = ? and mode='i'";
			
			try{
				
					preparedStatement = conn.prepareStatement( sqlSelectByVc_id );
					
					preparedStatement.setInt(1,id);
					
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						VcchannelbindBean bean = new VcchannelbindBean();
						
						bean.setId(resultSet.getInt("id"));
						
						bean.setVcid(resultSet.getInt("vcid"));
						
						bean.setChannel_id(resultSet.getInt("channel_id"));
						
						bean.setIndate(resultSet.getDate("indate"));
						
						bean.setMode(resultSet.getString("mode"));
						
						bean.setOutdate(resultSet.getDate("outdate"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));

						vcchannelbindBeans.add(bean);
						
					}
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
			
			}finally{
				
				try{ resultSet.close();preparedStatement.close();conn.close();dbDatabaseHandler.closeConnection();}catch(SQLException ioe){}
			}
			
			
			return vcchannelbindBeans;
			
		}

		
		
		
		// Call from VcChannelBindInfoUpdateHelper.java
		public List<VcchannelbindBean> fetchVcChannelBind_modeIn(int id,
				Connection conn) throws Exception {
			
			
			PreparedStatement preparedStatement = null ;
			
			ResultSet resultSet = null ;

			List<VcchannelbindBean> vcchannelbindBeans = new ArrayList<VcchannelbindBean>();

			String sqlSelectByVc_id = "SELECT  id, vcid,channel_id,indate, mode, outdate,sdate,edate FROM cbiz.vcchannelbind WHERE vcid = ? and mode='i'";
			
			try{
					preparedStatement = conn.prepareStatement(sqlSelectByVc_id);
					
					preparedStatement.setInt(1, id);
					
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()){
						
						VcchannelbindBean bean = new VcchannelbindBean();
						
						bean.setId( resultSet.getInt("id"));
						
						bean.setVcid( resultSet.getInt("vcid"));
						
						bean.setChannel_id( resultSet.getInt("channel_id"));
						
						bean.setIndate(resultSet.getDate("indate"));
						
						bean.setMode(resultSet.getString("mode"));
						
						bean.setOutdate(resultSet.getDate("outdate"));
						
						bean.setSdate(resultSet.getTimestamp("sdate"));
						
						bean.setEdate(resultSet.getTimestamp("edate"));
						
						vcchannelbindBeans.add(bean);
					}
					
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{
				
				try{ resultSet.close();preparedStatement.close();}catch(SQLException ioe){}
				
			}
			
			return vcchannelbindBeans;
			
		}

		
		
		// Call from VcChannelBindInfoUpdateHelper.java
		
		public void updateEDates(VcchannelbindBean bean,
				Connection conn) throws Exception {
			
			
			//DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();

			//Connection conn = dbDatabaseHandler.getConnection();

			PreparedStatement preparedStatement = null ;

			// String sqlUpdateAllStmt = "UPDATE vcbouquetbind SET  id = ?, vcid = ?, bouquet_id = ?, indate = ?, mode = ?, outdate = ?, sdate = ?, edate = ?" ;
			
			String sqlUpdateAllStmt = "UPDATE vcchannelbind SET  mode = ?, outdate = ?,edate = ? WHERE id = ? " ;

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

