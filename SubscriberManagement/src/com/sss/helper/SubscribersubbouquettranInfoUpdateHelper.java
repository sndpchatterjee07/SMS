package com.sss.helper;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.zkoss.zk.ui.Sessions;

import com.sss.core.bean.BouquetmasterBean;
import com.sss.core.bean.SubbouquetchannelbindBean;
import com.sss.core.bean.SubscribersubbouquettranBean;
import com.sss.core.bean.UsermasterBean;
import com.sss.core.custom.bean.CustomChannel;
import com.sss.core.dao.SubscribersubbouquettranDAO;

public class SubscribersubbouquettranInfoUpdateHelper {
	
	SubscribersubbouquettranDAO subscribersubbouquettranDAO = new SubscribersubbouquettranDAO();
	
	List<SubscribersubbouquettranBean> subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>();
	
	List<SubscribersubbouquettranBean> toBeAddedChannelList = new ArrayList<SubscribersubbouquettranBean>();
	
	List<SubscribersubbouquettranBean> toBeDeletedChannelList = new ArrayList<SubscribersubbouquettranBean>();
	
	List<SubscribersubbouquettranBean> toBeUpdatedChannelList = new ArrayList<SubscribersubbouquettranBean>();
	
	List<SubscribersubbouquettranBean> diffEndDateButInDbList = new ArrayList<SubscribersubbouquettranBean>();
	
	int currentlyLoggedInUserId = 0;
	
	// Call from ManagingComposer.java
	
	public void processInformation(int _subscriberId,
			BouquetmasterBean _bouquetmasterBean, int _vcId,
			SubbouquetchannelbindBean _subbouquetchannelbindBean,
			List<CustomChannel> customChannels, Connection conn) throws Exception {

			
			try{
				
					subscribersubbouquettranBeans = subscribersubbouquettranDAO.fetchSubBouquet_ChannelList_modeIn(_subscriberId,_vcId,_subbouquetchannelbindBean.getSubbouquetid(),conn);
				
					System.out.println("subscribersubbouquettranBeans - SIZE: "+subscribersubbouquettranBeans.size());
					
					compareVcChannelLists(customChannels,subscribersubbouquettranBeans,_vcId,conn); // DATABASE LIST AND GRID LIST COMPARISON ...
					
					currentlyLoggedInUserId = ((UsermasterBean) (Sessions.getCurrent().getAttribute("logininfo"))).getId();
					
					// 1. When toBeAddedChannelList is not empty ...
					
					if(!toBeAddedChannelList.isEmpty()){
					
						System.out.println("toBeAddedChannelList is not empty...");
						
						for(int i = 0;i<toBeAddedChannelList.size();i++){
							
							toBeAddedChannelList.get(i).setBouquetid(_bouquetmasterBean.getId());
							
							toBeAddedChannelList.get(i).setCreateby(currentlyLoggedInUserId);
							
							toBeAddedChannelList.get(i).setSubscriberid(_subscriberId);
							
							toBeAddedChannelList.get(i).setSubbouquetid(_subbouquetchannelbindBean.getSubbouquetid());
				    		
							subscribersubbouquettranDAO.insertAllCols(toBeAddedChannelList.get(i),conn);
				    		
				    	}
						
					}
					
					// 2. When toBeDeletedChannelList is not empty ...
					
					if(!toBeDeletedChannelList.isEmpty()){
				    	
				    	// System.out.println("toBeDeletedChannelList is not empty...");
				    	
				    	for(int i = 0;i < toBeDeletedChannelList.size();i++){
				    		
				    		subscribersubbouquettranDAO.updateAllCols(toBeDeletedChannelList.get(i),conn);
				    		
				    	}
				    	
				    }
					
					////////////////////////////////////////// TESTING ETIME CHANGE ///////////////////////////////
					
					// 3. When toBeUpdatedChannelList is not empty ...
					
					if(!toBeUpdatedChannelList.isEmpty()){
						
						for(int i = 0;i < toBeUpdatedChannelList.size();i++){
							
							for(int j = 0; j<subscribersubbouquettranBeans.size();j++){
								
								if(toBeUpdatedChannelList.get(i).getChannelid() == subscribersubbouquettranBeans.get(j).getChannelid()){
									
									if(subscribersubbouquettranBeans.get(j).getEdate() != null){  // DB EDATE IS NOT NULL
										
										if(toBeUpdatedChannelList.get(i).getEdate() != null){
											
											if(subscribersubbouquettranBeans.get(j).getEdate().compareTo(toBeUpdatedChannelList.get(i).getEdate()) != 0){ // DOES NOT MATCH...
												
												System.out.println("Case 1 !"); // WHEN DB EDATE AND UI EDATE DOES NOT MATCH...
												
												diffEndDateButInDbList.add(toBeUpdatedChannelList.get(i));
												
											}	
										
										}else{ 
												
												diffEndDateButInDbList.add(toBeUpdatedChannelList.get(i));
												
												System.out.println("Case 2 !");
											
										}
										
									}else{ // DB EDATE IS NULL 
										
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
				    		
				    		subscribersubbouquettranDAO.updateEDates(diffEndDateButInDbList.get(i),conn);

						}
						
					
					}
					
					////////////////////////////////////////// END - TESTING ETIME CHANGE   ///////////////////////////////
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				throw new Exception();
				
			}finally{ // CLEAR ALL MAPS,LISTS.
				
				subscribersubbouquettranBeans.clear();
				
				toBeAddedChannelList.clear();
				
				toBeDeletedChannelList.clear();
				
				toBeUpdatedChannelList.clear();
				
				diffEndDateButInDbList.clear();
				
			}

		
			
		
		
		
		
	}



	private void compareVcChannelLists(List<CustomChannel> customChannels,
			List<SubscribersubbouquettranBean> subscribersubbouquettranBeans,
			int _vcId, Connection conn) throws Exception {
		
		//Convert today's date to SQL Date
		
		Date todaysDate = new Date();
				
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				
		String tempDate = fmt.format(todaysDate);
				
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(tempDate));
		
		try {
				// NEWLY ADDED BINDS's...
			
				for(int i = 0; i< customChannels.size(); i++){
					
					boolean found = false;
					   
					   for(int j = 0; j<subscribersubbouquettranBeans.size();j++){
					
						   if(customChannels.get(i).getChannelId() == subscribersubbouquettranBeans.get(j).getChannelid()){
							   
							   //////////////	ADD THE SubscribersubbouquettranBean TO toBeUpdatedChannelList ////////////////////
							   
							   SubscribersubbouquettranBean subscribersubbouquettranBean = new SubscribersubbouquettranBean();
							   
							   subscribersubbouquettranBean.setId(subscribersubbouquettranBeans.get(j).getId());
							   
							   subscribersubbouquettranBean.setChannelid(customChannels.get(i).getChannelId());
							   
							   subscribersubbouquettranBean.setIndate(TodaysDate);
							   
							   subscribersubbouquettranBean.setMode("i");
							   
							   subscribersubbouquettranBean.setSdate(new Timestamp(customChannels.get(i).getStime().getTime()));
							   
							   if(customChannels.get(i).getEtime()==null){
									
									// SET ETIME AS NULL IN DAO.
									
								   // System.out.println("etime is NULL");
									
								}else{
									
								   // System.out.println("etime is not NULL");
									
									subscribersubbouquettranBean.setEdate(new Timestamp(customChannels.get(i).getEtime().getTime()));
								}
							   
							   
							    toBeUpdatedChannelList.add(subscribersubbouquettranBean);
							   
							   //////////////	END - ADD THE SubscribersubbouquettranBean TO toBeUpdatedChannelList ////////////////////////
							    
							    found = true ;
							     
							    break;
							   
						   }
						   
					   }
					   
					   if(!found){ // INSERT
						   
						   SubscribersubbouquettranBean subscribersubbouquettranBean = new SubscribersubbouquettranBean();
						   
						   subscribersubbouquettranBean.setVcid(_vcId);
						   
						   subscribersubbouquettranBean.setChannelid(customChannels.get(i).getChannelId());
						   
						   subscribersubbouquettranBean.setIndate(TodaysDate);
						   
						   subscribersubbouquettranBean.setMode("i");
						   
						   subscribersubbouquettranBean.setSdate(new Timestamp(customChannels.get(i).getStime().getTime()));
						   
						   if(customChannels.get(i).getEtime()==null){
								
								// SET ETIME AS NULL IN DAO.
								
						   }else{
							   
							   subscribersubbouquettranBean.setEdate(new Timestamp(customChannels.get(i).getEtime().getTime()));
							   
						   }
						   
						   toBeAddedChannelList.add(subscribersubbouquettranBean);
						   
					   }
					   
				}
				
				System.out.println("toBeAddedChannelList Channel id's: ");
				
				Iterator iterator1 = toBeAddedChannelList.iterator();
				 	
				while(iterator1.hasNext()){
				 		
				 	System.out.println(iterator1.next().toString());
				}
				
				// DELETED BINDS's...
				
				for(int i=0 ; i< subscribersubbouquettranBeans.size();i++){  
					
					boolean found = false;
					
					for(int j=0; j<customChannels.size(); j++){
					
						if(subscribersubbouquettranBeans.get(i).getChannelid() == customChannels.get(j).getChannelId()){
							
							found = true;
							
							break;
						}
						
					}
					
					if(!found){  // DELETE
						
						SubscribersubbouquettranBean subscribersubbouquettranBean = new SubscribersubbouquettranBean();
						
						subscribersubbouquettranBean.setId(subscribersubbouquettranBeans.get(i).getId());
						
						subscribersubbouquettranBean.setOutdate(TodaysDate);
						
						subscribersubbouquettranBean.setMode("o");
						
						toBeDeletedChannelList.add(subscribersubbouquettranBean);
						
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
