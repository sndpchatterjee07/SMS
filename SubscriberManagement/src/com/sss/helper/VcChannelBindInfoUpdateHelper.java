package com.sss.helper;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.MultiValueMap;

import com.sss.core.bean.VcchannelbindBean;
import com.sss.core.bean.VcmasterBean;
import com.sss.core.custom.bean.CustomChannel;
import com.sss.core.dao.VcchannelbindDAO;

public class VcChannelBindInfoUpdateHelper {
	
	
	VcchannelbindDAO vcchannelbindDAO = new VcchannelbindDAO();
	List<VcchannelbindBean> vcchannelbindBeans = new ArrayList<VcchannelbindBean>();   		   // VC-CHANNEL bind list fetched from database.
	List<VcchannelbindBean> toBeAddedChannelList = new ArrayList<VcchannelbindBean>();
	List<VcchannelbindBean> toBeDeletedChannelList = new ArrayList<VcchannelbindBean>();
	MultiValueMap vcChannelMap = new MultiValueMap();  								           // VC-CHANNEL mapping information fetched from database for a particular VC.
	
	List<VcchannelbindBean> toBeUpdatedChannelList = new ArrayList<VcchannelbindBean>();
	List<VcchannelbindBean> diffEndDateButInDbList = new ArrayList<VcchannelbindBean>();
	
	
	// Call from ManagingComposer.java
	public void processInformation(VcmasterBean vcmasterBean,
			List<CustomChannel> customChannels, Connection conn) throws Exception {
		
		
		try{
			
				/*
				 * 		1. Fetch the list of Channel's binded to this VC from database. 	
				 * 		2. Add those VC-CHANNEL mapping information in a MultiValueMap. 
				 * 		3. Store this VC information in an ArrayList<VcchannelbindBean> and mark this as "dbListVcChannel".
				 */
				
			     vcchannelbindBeans = vcchannelbindDAO.fetchVcChannelBind_modeIn(vcmasterBean.getId(),conn);
					
			     for(VcchannelbindBean vcchannelbindBean : vcchannelbindBeans){
			    	 
			    	 vcChannelMap.put(vcchannelbindBean.getVcid(), vcchannelbindBean.getChannel_id());
			    	 
			     }
			
			     /////////////////////////////////////   LISTS RETRIEVED FROM DATABASE ////////////////////////////////////
			     
			    // 1.  VC-CHANNEL List
			     
			     /*System.out.println("DATABASE LIST: VC-CHANNEL");
			     
			     for(int i=0;i<vcchannelbindBeans.size();i++){
		    			
		    			System.out.println("VC Id:("+vcmasterBean.getId()+") ->"+vcchannelbindBeans.get(i).getChannel_id());
		    	 }*/
			     
			     //////////////////////////////////////////////////////////////////////////////////////////////////////////
			     
			     
			     /////////////////////////////////////   MAPPING INFORMATION /////////////////////////////////////////////
			     
			     /*System.out.println("VC/CHANNEL MAPPING INFORMATION:");
			     
			     // 1.  VC-CHANNEL Mapping
			     
			     Set vcChannelentrySet = vcChannelMap.entrySet();
			     
			     Iterator vcChannelentrySetIterator = vcChannelentrySet.iterator();
			     
			     while (vcChannelentrySetIterator.hasNext()) {
			    	 
			    	 Map.Entry mapEntry = (Map.Entry) vcChannelentrySetIterator.next();
			    	 
			    	 List lst = (List) vcChannelMap.get(mapEntry.getKey());
			    	 
			    	 for (int i = 0; i < lst.size(); i++) {
			                
		    			System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
		                	
		             }
			    	 
			     }*/
			     
			     //////////////////////////////////////////////////////////////////////////////////////////////////////////
			     
			     // VC/CHANNEL DATABASE LIST AND GRID LIST COMPARISON ...
			     
			     compareVcChannelLists(customChannels,vcchannelbindBeans,vcChannelMap,vcmasterBean,conn);
			     
			     
			   // 1. When toBeAddedChannelList is not empty ...
			     
			    if(!toBeAddedChannelList.isEmpty()){
			    	
			    	// System.out.println("toBeAddedChannelList is not empty...");
			    	
			    	for(int i = 0;i<toBeAddedChannelList.size();i++){
			    		
			    		vcchannelbindDAO.insertAllCols(toBeAddedChannelList.get(i),conn);
			    		
			    	}
			    	
			    }
			     
			  // 2. When toBeDeletedChannelList is not empty ...
			    
			    if(!toBeDeletedChannelList.isEmpty()){
			    	
			    	// System.out.println("toBeDeletedChannelList is not empty...");
			    	
			    	for(int i = 0;i < toBeDeletedChannelList.size();i++){
			    	
			    		vcchannelbindDAO.updateAllCols(toBeDeletedChannelList.get(i),conn);
			    		
			    	}
			    	
			    }
			    
			    
			    ////////////////////////////////////////// TESTING ETIME CHANGE ///////////////////////////////
			     
			    // 3. When toBeUpdatedChannelList is not empty ...
			    
			    if(!toBeUpdatedChannelList.isEmpty()){
			
			    	// System.out.println("toBeUpdatedChannelList is not empty...");
			    	
			    	//System.out.println("CHANNEL ETIME CHANGE ->" + toBeUpdatedChannelList.size());
			    	
			    	for(int i = 0;i < toBeUpdatedChannelList.size();i++){
						
						 for(int j = 0; j<vcchannelbindBeans.size();j++){

							// if((vcbouquetbindBeans.get(i).getEdate() != null) && vcbouquetbindBeans.get(i).getEdate().compareTo(toBeUpdatedBouquetList.get(j).getEdate()) != 0){ // DOES NOT MATCH.
							
							 if(toBeUpdatedChannelList.get(i).getChannel_id() == vcchannelbindBeans.get(j).getChannel_id()){
							 
								if(vcchannelbindBeans.get(j).getEdate() != null){  // DB EDATE IS NOT NULL
									
									/*System.out.println(toBeUpdatedBouquetList.get(i).getBouquet_id() + "  "+ toBeUpdatedBouquetList.get(i).getEdate()
											+"  "+vcbouquetbindBeans.get(j).getBouquet_id() + "  "+ vcbouquetbindBeans.get(j).getEdate()); */
									
									
									if(toBeUpdatedChannelList.get(i).getEdate() != null){
										
										if(vcchannelbindBeans.get(j).getEdate().compareTo(toBeUpdatedChannelList.get(i).getEdate()) != 0){ // DOES NOT MATCH...
											
											System.out.println("Case 1 !"); // WHEN DB EDATE AND UI EDATE DOES NOT MATCH...
											
											diffEndDateButInDbList.add(toBeUpdatedChannelList.get(i));
											
										}	
									
									}else{ 
											
											diffEndDateButInDbList.add(toBeUpdatedChannelList.get(i));
											
											System.out.println("Case 2 !");
										
									}
								
								}else{ // DB EDATE IS NULL 
									
									// 1. if ui edate is null,nothing to do.
									
									// 2. if ui is not null,then update...
									/* System.out.println(toBeUpdatedBouquetList.get(i).getBouquet_id() + "  "+ toBeUpdatedBouquetList.get(i).getEdate()
											+"  "+vcbouquetbindBeans.get(j).getBouquet_id() + "  "+ vcbouquetbindBeans.get(j).getEdate()); */
									
									
									if(toBeUpdatedChannelList.get(i).getEdate()!= null){
										
										diffEndDateButInDbList.add(toBeUpdatedChannelList.get(i));
										
										System.out.println("Case 3 !"); // WHEN UI EDATE IS NOT NULL...
										
										// UPDATE QUERY ...
										
									}
									
								}
							
							}
							
						}
						
					}
			    	
			    	for(int i = 0;i < diffEndDateButInDbList.size();i++){
						
						//System.out.println("Updating Edate for VCBouquetBindBean :"+ diffEndDateButInDbList.get(i).getId());
			    		
			    		vcchannelbindDAO.updateEDates(diffEndDateButInDbList.get(i),conn);

					}
			    	
			    
			    }	
			    	
			    ////////////////////////////////////////// END - TESTING ETIME CHANGE   ///////////////////////////////
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			throw new Exception();
			
		}finally{ // CLEAR ALL MAPS,LISTS.
			
			vcchannelbindBeans.clear();
			
			toBeAddedChannelList.clear();
			
			toBeDeletedChannelList.clear();
			
			toBeUpdatedChannelList.clear();
			
			diffEndDateButInDbList.clear();
			
			vcChannelMap.clear();
			
		}
		
		
	}




	private void compareVcChannelLists(List<CustomChannel> customChannels,
			List<VcchannelbindBean> vcchannelbindBeans,
			MultiValueMap vcChannelMap, VcmasterBean vcmasterBean,
			Connection conn) throws Exception {
		
		
		//Convert today's date to SQL Date
		Date todaysDate = new Date();
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		
		String tempDate = fmt.format(todaysDate);
		
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(tempDate));
		
		
		try{
					
				// NEWLY ADDED BINDS's...
			
			   System.out.println("Testing CustomChannels size: " +customChannels.size());
			
			   for(int i = 0; i< customChannels.size(); i++){
				   
				   boolean found = false;
				   
				   for(int j = 0; j<vcchannelbindBeans.size();j++){
				   
					   // if(customChannels.get(i).getChannelId() == vcchannelbindBeans.get(j).getChannel_id()   ||  vcChannelMap.containsValue(customChannels.get(i).getChannelId())){
					   
					   if(customChannels.get(i).getChannelId() == vcchannelbindBeans.get(j).getChannel_id()){
						   
						    // System.out.println("MATCH FOUND !");
						   
						    //////////////	ADD THE VcchannelbindBean TO toBeUpdatedChannelList ////////////////////
						   
						    VcchannelbindBean vcchannelbindBean = new VcchannelbindBean();
						    
						    vcchannelbindBean.setId(vcchannelbindBeans.get(j).getId());
						   
						    vcchannelbindBean.setChannel_id(customChannels.get(i).getChannelId());
							
						    vcchannelbindBean.setIndate(TodaysDate);
							
						    vcchannelbindBean.setMode("i");

						    vcchannelbindBean.setSdate(new Timestamp(customChannels.get(i).getStime().getTime()));
						    
						    if(customChannels.get(i).getEtime()==null){
								
								// SET ETIME AS NULL IN DAO.
								
							   // System.out.println("etime is NULL");
								
							}else{
								
							   // System.out.println("etime is not NULL");
								
								vcchannelbindBean.setEdate(new Timestamp(customChannels.get(i).getEtime().getTime()));
							}
							
							toBeUpdatedChannelList.add(vcchannelbindBean);
						   
						   
						   //////////////	END - ADD THE VcchannelbindBean TO toBeUpdatedChannelList ////////////////////
						    
						    found = true ;
						     
						    break;
					   
					   }
					   
					   
				   }
				   
				   
				   if(!found){ // INSERT
					   
					   VcchannelbindBean vcchannelbindBean = new VcchannelbindBean();
					   
					   vcchannelbindBean.setVcid(vcmasterBean.getId());
					   
					   vcchannelbindBean.setChannel_id(customChannels.get(i).getChannelId());
					   
					   vcchannelbindBean.setIndate(TodaysDate);
					   
					   vcchannelbindBean.setMode("i");
					   
					   vcchannelbindBean.setSdate(new Timestamp(customChannels.get(i).getStime().getTime()));
					   
					   if(customChannels.get(i).getEtime()==null){
							
							// SET ETIME AS NULL IN DAO.
							
					   }else{
						   
						   vcchannelbindBean.setEdate(new Timestamp(customChannels.get(i).getEtime().getTime()));
						   
					   }
					   
					   toBeAddedChannelList.add(vcchannelbindBean);
					   
				   }
				   
			   }
			   
			   
			   System.out.println("toBeAddedChannelList Channel id's: ");
				
			   Iterator iterator1 = toBeAddedChannelList.iterator();
			 	
			   while(iterator1.hasNext()){
			 		
			 		System.out.println(iterator1.next().toString());
			   }
			   
			   
			   
			// DELETED BINDS's...
			   
			for(int i=0 ; i< vcchannelbindBeans.size();i++){   
			   
				boolean found = false;
				
				for(int j=0; j<customChannels.size(); j++){
				
					if(vcchannelbindBeans.get(i).getChannel_id() == customChannels.get(j).getChannelId()){
						
						found = true;
						
						break;
					}
					
				}
				
				if(!found){  // DELETE
					
					VcchannelbindBean vcchannelbindBean = new VcchannelbindBean();
					
					vcchannelbindBean.setId(vcchannelbindBeans.get(i).getId());
					
					vcchannelbindBean.setOutdate(TodaysDate);
					
					vcchannelbindBean.setMode("o");
					
					toBeDeletedChannelList.add(vcchannelbindBean);
					
				}
				
			}	
			
			System.out.println("toBeDeletedChannelList Channel id's: ");
			 
			Iterator iterator2 = toBeDeletedChannelList.iterator();
			 
			 while(iterator2.hasNext()){
			 
				 System.out.println(iterator2.next().toString());
			 
		   }
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			throw new Exception();
			
		}
		
	}
	
	

}
