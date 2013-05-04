package com.sss.helper;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections.map.MultiValueMap;


import com.sss.core.bean.VcbouquetbindBean;
import com.sss.core.bean.VcmasterBean;
import com.sss.core.custom.bean.CustomBouquet;
import com.sss.core.dao.VcbouquetbindDAO;

public class VcBouquetBindInfoUpdateHelper {

	
	VcbouquetbindDAO vcbouquetbindDAO = new VcbouquetbindDAO();
	List<VcbouquetbindBean> vcbouquetbindBeans = new ArrayList<VcbouquetbindBean>();           // VC-BOUQUET bind list fetched from database.
	List<VcbouquetbindBean> toBeAddedBouquetList  = new ArrayList<VcbouquetbindBean>();		  
	List<VcbouquetbindBean> toBeDeletedBouquetList = new ArrayList<VcbouquetbindBean>();
	MultiValueMap vcBouquetMap = new MultiValueMap();  								           // VC-BOUQUET mapping information fetched from database for a particular VC.

	List<VcbouquetbindBean> toBeUpdatedBouquetList = new ArrayList<VcbouquetbindBean>();
	List<VcbouquetbindBean> diffEndDateButInDbList = new ArrayList<VcbouquetbindBean>();
	
	
	
	// Call from ManagingComposer.java
	public void processInformation(VcmasterBean vcmasterBean,
			List<CustomBouquet> customBouquets, Connection conn) throws Exception {
		
		try{
			
				
				/*
	    		 * 		1. Fetch the list of Bouquet's binded to this VC from database. 	
	    		 * 		2. Add those VC-BOUQUET mapping information in a MultiValueMap. 
	    		 * 		3. Store this VC information in an ArrayList<VcbouquetbindBean> and mark this as "dbListVcBouquet".
	    		 */
				
				vcbouquetbindBeans = vcbouquetbindDAO.fetchVcBouquetBind_modeIn(vcmasterBean.getId(),conn);
				
				for(VcbouquetbindBean vcbouquetbindBean : vcbouquetbindBeans){
					
					vcBouquetMap.put(vcbouquetbindBean.getVcid(), vcbouquetbindBean.getBouquet_id());
					
				}
				
			
				/////////////////////////////////////   LISTS RETRIEVED FROM DATABASE ////////////////////////////////////
				
				// 1.  VC-BOUQUET List
	    		
	    		/*System.out.println("DATABASE LIST: VC-BOUQUET");
	    		
	    		for(int i=0;i<vcbouquetbindBeans.size();i++){
	    			
	    			System.out.println("VC Id:("+vcmasterBean.getId()+") ->"+vcbouquetbindBeans.get(i).getBouquet_id());
	    		}*/
				
				//////////////////////////////////////////////////////////////////////////////////////////////////////////
	    		
	    		
	    		
	    		/////////////////////////////////////   MAPPING INFORMATION /////////////////////////////////////////////
	    		
	    		/*System.out.println("VC/BOUQUET MAPPING INFORMATION:");
	    		
	    		// 1.  VC-BOUQUET Mapping
	    		
	    		Set vcBouquetentrySet = vcBouquetMap.entrySet();
	            
	    		Iterator vcBouquetentrySetIterator = vcBouquetentrySet.iterator();
	            
	    		while (vcBouquetentrySetIterator.hasNext()) {
	            
	    			Map.Entry mapEntry = (Map.Entry) vcBouquetentrySetIterator.next();
	                
	    			List lst = (List) vcBouquetMap.get(mapEntry.getKey());
	                
	    			for (int i = 0; i < lst.size(); i++) {
	                
	    				System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
	                	
	                }
	            }*/
	    		
	    		//////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				// VC/BOUQUET DATABASE LIST AND GRID LIST COMPARISON ...
				
				compareVcBouquetLists(customBouquets,vcbouquetbindBeans,vcBouquetMap,vcmasterBean,conn);
				
				// 1. When toBeAddedBouquetList is not empty ...
				
				if(!toBeAddedBouquetList.isEmpty()){
					
					//System.out.println("toBeAddedBouquetList is not empty...");
					
					for(int i = 0;i<toBeAddedBouquetList.size();i++){
						
						vcbouquetbindDAO.insertAllCols(toBeAddedBouquetList.get(i),conn);
						
					}
					
				}
				
				
				// 2. When toBeDeletedBouquetList is not empty ...
				
				if(!toBeDeletedBouquetList.isEmpty()){
					
					// System.out.println("toBeDeletedBouquetList is not empty...");
					
					for(int i = 0;i < toBeDeletedBouquetList.size();i++){
						
						vcbouquetbindDAO.updateAllCols(toBeDeletedBouquetList.get(i),conn);

					}
				}
				
				//////////////////////////////////////////  TESTING ETIME CHANGE ///////////////////////////////
				
				// 3. When toBeUpdatedBouquetList is not empty ...
				if(!toBeUpdatedBouquetList.isEmpty()){
					
					// System.out.println("toBeUpdatedBouquetList is not empty...");
					
					//System.out.println("->" + toBeUpdatedBouquetList.size());
					
					for(int i = 0;i < toBeUpdatedBouquetList.size();i++){
					
						 for(int j = 0; j<vcbouquetbindBeans.size();j++){

							// if((vcbouquetbindBeans.get(i).getEdate() != null) && vcbouquetbindBeans.get(i).getEdate().compareTo(toBeUpdatedBouquetList.get(j).getEdate()) != 0){ // DOES NOT MATCH.
							
							 if(toBeUpdatedBouquetList.get(i).getBouquet_id() == vcbouquetbindBeans.get(j).getBouquet_id()){
							 
								if(vcbouquetbindBeans.get(j).getEdate() != null){  // DB EDATE IS NOT NULL
									
									/*System.out.println(toBeUpdatedBouquetList.get(i).getBouquet_id() + "  "+ toBeUpdatedBouquetList.get(i).getEdate()
											+"  "+vcbouquetbindBeans.get(j).getBouquet_id() + "  "+ vcbouquetbindBeans.get(j).getEdate()); */
									
									
									if(toBeUpdatedBouquetList.get(i).getEdate() != null){
										
										if(vcbouquetbindBeans.get(j).getEdate().compareTo(toBeUpdatedBouquetList.get(i).getEdate()) != 0){ // DOES NOT MATCH...
											
											System.out.println("Case 1 !"); // WHEN DB EDATE AND UI EDATE DOES NOT MATCH...
											
											diffEndDateButInDbList.add(toBeUpdatedBouquetList.get(i));
											
										}	
									
									}else{ 
											
											diffEndDateButInDbList.add(toBeUpdatedBouquetList.get(i));
											
											System.out.println("Case 2 !");
										
									}
								
								}else{ // DB EDATE IS NULL 
									
									// 1. if ui edate is null,nothing to do.
									
									// 2. if ui is not null,then update...
									/* System.out.println(toBeUpdatedBouquetList.get(i).getBouquet_id() + "  "+ toBeUpdatedBouquetList.get(i).getEdate()
											+"  "+vcbouquetbindBeans.get(j).getBouquet_id() + "  "+ vcbouquetbindBeans.get(j).getEdate()); */
									
									
									if(toBeUpdatedBouquetList.get(i).getEdate()!= null){
										
										diffEndDateButInDbList.add(toBeUpdatedBouquetList.get(i));
										
										System.out.println("Case 3 !"); // WHEN UI EDATE IS NOT NULL...
										
										// UPDATE QUERY ...
										
									}
									
								}
							
							}
							
						}
						
					}
					
					for(int i = 0;i < diffEndDateButInDbList.size();i++){
						
						//System.out.println("Updating Edate for VCBouquetBindBean :"+ diffEndDateButInDbList.get(i).getId());
						
						vcbouquetbindDAO.updateEDates(diffEndDateButInDbList.get(i),conn);

					}
					
				}
				
				//////////////////////////////////////////  END - TESTING ETIME CHANGE   ///////////////////////////////
				
				
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			throw new Exception();			
		
		}finally{ // CLEAR ALL MAPS,LISTS.
			
			vcbouquetbindBeans.clear();
			
			toBeAddedBouquetList.clear();
			
			toBeDeletedBouquetList.clear();
			
			toBeUpdatedBouquetList.clear();
			
			diffEndDateButInDbList.clear();
			
			vcBouquetMap.clear(); 								  
			
		}
		
	}




	private void compareVcBouquetLists(List<CustomBouquet> customBouquets,
			List<VcbouquetbindBean> vcbouquetbindBeans,
			MultiValueMap vcBouquetMap, VcmasterBean vcmasterBean, Connection conn) {
		
			
			//Convert today's date to SQL Date
			Date todaysDate = new Date();
			
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			
			String tempDate = fmt.format(todaysDate);
			
			java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(tempDate));
		
		
		    // NEWLY ADDED BINDS's...
			
			// System.out.println("Testing CustomBouquets size: " +customBouquets.size());
			
			for(int i = 0; i< customBouquets.size(); i++){
				
				boolean found = false;
				
				for(int j = 0; j<vcbouquetbindBeans.size();j++){
					
					//System.out.println("Custom Bouquet Edate:" +new Timestamp(customBouquets.get(i).getEtime().getTime()));
					
					//System.out.println("EDate fetched from DB:"+ vcbouquetbindBeans.get(j).getEdate());
					
					// if(customBouquets.get(i).getBouquetId() == vcbouquetbindBeans.get(j).getBouquet_id()   ||  vcBouquetMap.containsValue(customBouquets.get(i).getBouquetId())){
					
					if(customBouquets.get(i).getBouquetId() == vcbouquetbindBeans.get(j).getBouquet_id()){
					
						// System.out.println("MATCH FOUND !");
						
						//////////////    ADD THE VcbouquetbindBean TO toBeUpdatedBouquetList ////////////////////
						
						VcbouquetbindBean vcbouquetbindBean = new VcbouquetbindBean();
						
						vcbouquetbindBean.setId(vcbouquetbindBeans.get(j).getId());
						
						vcbouquetbindBean.setBouquet_id(customBouquets.get(i).getBouquetId());
						
						vcbouquetbindBean.setIndate(TodaysDate);
						
						vcbouquetbindBean.setMode("i");

						vcbouquetbindBean.setSdate(new Timestamp(customBouquets.get(i).getStime().getTime()));
						
						if(customBouquets.get(i).getEtime()==null){
							
							// SET ETIME AS NULL IN DAO.
							
						   // System.out.println("etime is NULL");
							
						}else{
							
						   // System.out.println("etime is not NULL");
							
							vcbouquetbindBean.setEdate(new Timestamp(customBouquets.get(i).getEtime().getTime()));
						}
						
						toBeUpdatedBouquetList.add(vcbouquetbindBean);
						
						//////////////	 END - ADD THE VcbouquetbindBean TO toBeUpdatedBouquetList //////////////
						
						found = true;
						
						break;
						
					}
					
				}
				
				
				
				if(!found){ // INSERT
					
					VcbouquetbindBean vcbouquetbindBean = new VcbouquetbindBean();
					
					vcbouquetbindBean.setVcid(vcmasterBean.getId());
					
					vcbouquetbindBean.setBouquet_id(customBouquets.get(i).getBouquetId());
					
					vcbouquetbindBean.setIndate(TodaysDate);
					
					vcbouquetbindBean.setMode("i");
					
					//vcbouquetbindBean.setSdate((Timestamp) customBouquets.get(i).getStime());
					
					vcbouquetbindBean.setSdate(new Timestamp(customBouquets.get(i).getStime().getTime()));
					
					//vcbouquetbindBean.setEdate((Timestamp) customBouquets.get(i).getEtime());
					
					
					if(customBouquets.get(i).getEtime()==null){
						
						// SET ETIME AS NULL IN DAO.
						
						System.out.println("etime is NULL");
						
					}else{
						
						System.out.println("etime is not NULL");
						
						vcbouquetbindBean.setEdate(new Timestamp(customBouquets.get(i).getEtime().getTime()));
					}
					
					toBeAddedBouquetList.add(vcbouquetbindBean);
					
				}
				
			}
		
		
			System.out.println("toBeAddedBouquetList Bouque id's: ");
			
		 	Iterator iterator1 = toBeAddedBouquetList.iterator();
		 	
		 	while(iterator1.hasNext()){
		 		
		 		System.out.println(iterator1.next().toString());
		 	}
		
		
		
		
		
		
		
		   // DELETED BINDS's...
		 	
		  for(int i=0 ; i< vcbouquetbindBeans.size();i++){
			  
			  boolean found = false;
			  
			  for(int j=0; j<customBouquets.size(); j++){
				  
				  if(vcbouquetbindBeans.get(i).getBouquet_id() == customBouquets.get(j).getBouquetId()){
					  
					  found = true;
					  
					  break;
					  
				  }
				  
			  }
			  
			  if(!found){  // DELETE
				  
				  VcbouquetbindBean vcbouquetbindBean = new VcbouquetbindBean();
				  
				  vcbouquetbindBean.setId(vcbouquetbindBeans.get(i).getId());
				  
				  vcbouquetbindBean.setOutdate(TodaysDate);
				  
				  vcbouquetbindBean.setMode("o");
				  
				  toBeDeletedBouquetList.add(vcbouquetbindBean);
				  
			  }
			  
		  }
		  
		  
		  System.out.println("toBeDeletedBouquetList Bouquet id's: ");
			 
			 Iterator iterator2 = toBeDeletedBouquetList.iterator();
			 
			 while(iterator2.hasNext()){
			 
				 System.out.println(iterator2.next().toString());
			 
		 }
		
	}
	
	
	
	
	
	
	
		
	

}
