package com.sss.composer;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.MultiValueMap;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Include;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Popup;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Tree;
import org.zkoss.zul.Treecell;
import org.zkoss.zul.Treechildren;
import org.zkoss.zul.Treeitem;
import org.zkoss.zul.Treerow;
import org.zkoss.zul.Window;

import com.sss.core.bean.BouquetmasterBean;
import com.sss.core.bean.ChannelmasterBean;
import com.sss.core.bean.SettopboxmasterBean;
import com.sss.core.bean.SettopboxvcbindBean;
import com.sss.core.bean.SubbouquetchannelbindBean;
import com.sss.core.bean.SubscribersettopboxbindBean;
import com.sss.core.bean.SubscribersubbouquettranBean;
import com.sss.core.bean.UsermasterBean;
import com.sss.core.bean.VcbouquetbindBean;
import com.sss.core.bean.VcchannelbindBean;
import com.sss.core.bean.VcmasterBean;
import com.sss.core.custom.bean.CustomBouquet;
import com.sss.core.custom.bean.CustomChannel;
import com.sss.core.dao.BouquetmasterDAO;
import com.sss.core.dao.ChannelmasterDAO;
import com.sss.core.dao.SettopboxmasterDAO;
import com.sss.core.dao.SettopboxvcbindDAO;
import com.sss.core.dao.SubbouquetchannelbindDAO;
import com.sss.core.dao.SubscribersettopboxbindDAO;
import com.sss.core.dao.SubscribersubbouquettranDAO;
import com.sss.core.dao.VcbouquetbindDAO;
import com.sss.core.dao.VcchannelbindDAO;
import com.sss.core.dao.VcmasterDAO;
import com.sss.core.database.DatabaseHandler;
import com.sss.helper.SubscribersubbouquettranInfoUpdateHelper;
import com.sss.helper.VcBouquetBindInfoUpdateHelper;
import com.sss.helper.VcChannelBindInfoUpdateHelper;

public class ManagingComposer extends GenericForwardComposer{

	
	private static final long serialVersionUID = -2386162986501407823L;
	
	
	////////////////  START - ZUL SPECIFIC COMPONENT DECLARATIONS //////////////////////////////////////////////////////
	
	Textbox s1,s2;
	Button sb1,sb2;
	Tree roottree;
	Treechildren stbchilldren,vcchilldren;
	Treeitem stbIem,vcItem;
	Treerow stbrow,vcrow;
	Treecell stbcell,vccell,selectedSTBcell,selectedVCcell;
	CustomPopup pop;
	Button b_bouquet,b_subbou,b_channel,saveStbVcInfo,saveVcBouquetInfo,saveVcChannelInfo;
	Include inc;
	Label msg;
	Treeitem selectedSTBItem,selectedVCItem;
	Window main,window;
	Popup selectedVcInfoDisplay;
	Label detailedVcInfo;
	Textbox textbox1 = new Textbox();
	Textbox textbox2 = new Textbox();
	Textbox textbox3 = new Textbox();
	Button stb_scheme;
	Button saveBouquetSubBouquetInfo;
	Label searchLabel;
	Combobox searchName;
	Textbox searchQuery;
	Button search;
	Grid datagrid;
	Rows rows;
	
	////////////////  END - ZUL SPECIFIC COMPONENT DECLARATIONS ///////////////////////////////////////////////////////
	
	
	
	////////////////  START - CLASS SPECIFIC FIELD DECLARATIONS //////////////////////////////////////////////////////
	
	String style1 = "color:blue;font-weight:bold";
	String style2 = "color:red;font-weight:bold";
	String style3 = "color:yellow;font-weight:bold";
	String style4 = "font-family: Verdana; color: #6E6E6E;font-size: 10px;font-weight:bold;";
	String style5 = "font-family: Verdana; color: #6E6E6E;font-size: 8px;font-weight:bold;";
	String itemToSearch = null;  // USED AS A FLAG FOR SEARCH PURPOSE.
	int subscriberId,stbId,vcId = 0;
	int generatedsubscriberstbbindId = 0;
	int generatedstbvcBindId = 0;
	int lcoid = 0;
	int currentlyLoggedInUserId = 0;
	boolean checkboxCheckedFlag = false;
	
	////////////////   END 	- CLASS SPECIFIC FIELD DECLARATIONS   //////////////////////////////////////////////////
	
	
	////////////////	START - DAO DECLARATIONS //////////////////////////////////////////////////////////////////
	
	SubbouquetchannelbindDAO subbouquetchannelbindDAO = new SubbouquetchannelbindDAO();
	SubscribersubbouquettranDAO subscribersubbouquettranDAO = new SubscribersubbouquettranDAO();
	SettopboxmasterDAO settopboxmasterDAO = new SettopboxmasterDAO();
	VcmasterDAO vcmasterDAO = new VcmasterDAO();
	SubscribersettopboxbindDAO subscribersettopboxbindDAO = new SubscribersettopboxbindDAO();
	SettopboxvcbindDAO settopboxvcbindDAO = new SettopboxvcbindDAO();
	BouquetmasterDAO bouquetmasterDAO = new BouquetmasterDAO();
	VcbouquetbindDAO vcbouquetbindDAO = new VcbouquetbindDAO();
	ChannelmasterDAO channelmasterDAO = new ChannelmasterDAO();
	VcchannelbindDAO vcchannelbindDAO = new VcchannelbindDAO();
	
	////////////////    END  - DAO DECLARATIONS ///////////////////////////////////////////////////////////////////
	
	
	////////////////	START - LIST/HASHTABLE/SET/MAP DECLARATIONS ///////////////////////////////////////////////
	
	List<VcbouquetbindBean> _vcbouquetbindBeans  = new ArrayList<VcbouquetbindBean>();
	List<VcchannelbindBean> _vcchannelbindBeans = new ArrayList<VcchannelbindBean>();
	Hashtable<Integer,BouquetmasterBean> bouquetBeanByIdTable = new Hashtable<Integer, BouquetmasterBean>();
	Hashtable<Integer,ChannelmasterBean> channelBeanByIdTable = new Hashtable<Integer, ChannelmasterBean>();
	Hashtable<Integer,String> subBouquetNameByIdTable = new Hashtable<Integer, String>();  						// SUB-BOUQUET NAME CORRESPONDING TO A SUB-BOUQUETID. 
	List<SubbouquetchannelbindBean> _subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
	List<SubscribersubbouquettranBean> _subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>(); 
	ArrayList<SubscribersubbouquettranBean> subscribersubbouquettranBeans = new ArrayList<SubscribersubbouquettranBean>();
	Hashtable<Integer, Row> rowByBouquetId = new Hashtable<Integer, Row>();
	Hashtable<Integer, Row> rowByChannelId = new Hashtable<Integer, Row>();
	Hashtable<String,SettopboxmasterBean> stbTable = new Hashtable<String, SettopboxmasterBean>();   			// LIST OF UNASSIGNED STB'S ALLOTTED TO A PARTICULAR LCO.
	Hashtable<String,VcmasterBean> vcTable = new Hashtable<String, VcmasterBean>();								// LIST OF UNASSIGNED VC'S.
	Hashtable<Integer,SettopboxmasterBean> stbBeanByIdTable = new Hashtable<Integer, SettopboxmasterBean>();	// UNASSIGNED SettopboxmasterBean CORRESPONDING TO A PARTICULAR STB ID IN "stbTable".
	Hashtable<Integer,VcmasterBean> vcBeanByIdTable = new Hashtable<Integer, VcmasterBean>();					// UNASSIGNED VcmasterBean CORRESPONDING TO A PARTICULAR VC ID IN "vcTable".
	Hashtable<Integer,SettopboxmasterBean> stbBeanByIdTable2 = new Hashtable<Integer, SettopboxmasterBean>();   // SettopboxmasterBean CORRESPONDING TO A PARTICULAR STBID ASSIGNED TO A SUBSCRIBER.
	Hashtable<Integer,VcmasterBean> vcBeanByIdTable2 = new Hashtable<Integer, VcmasterBean>();					// VcmasterBean CORRESPONDING TO A PARTICULAR VCID BINDED WITH A PARTICULAR ASSIGNED STB.
	Hashtable<String,Integer> schemeIdBystbMakeNumber = new Hashtable<String, Integer>();						// SELECTED SCHEMEID CORRESPONDING TO AN UNASSIGNED SELECTED STB MAKENUMBER.
	Set <String> stbSet = new HashSet<String>();																// UNASSIGNED STB'S WHICH ARE BEING ADDED TO THE TREE.
	Set <String> vcSet = new HashSet<String>();																	// UNASSIGNED VC'S WHICH ARE BEING ADDED TO THE TREE.
	SubscribersettopboxbindBean[] subscribersettopboxbindBeans;
	SettopboxvcbindBean[] settopboxvcbindBeans;
	MultiValueMap subscriberStbMap = new MultiValueMap();  														// Subscriber-STB mapping information fetched from database for a particular Subscriber.
	MultiValueMap settopboxVcMap   = new MultiValueMap();  														// STB-VC mapping information fetched from database for a particular assigned STB.	
	List<SubscribersettopboxbindBean> dbListSubscriberSTB = new ArrayList<SubscribersettopboxbindBean>(); 		// List of assigned STB's to a particular subscriber fetched from database.
	List<SubscribersettopboxbindBean> treeListSubscriberSTB = new ArrayList<SubscribersettopboxbindBean>();     // List of unassigned STB's which are "GOING TO BE ALLOTTED" to a particular Subscriber.
	List<SettopboxvcbindBean> dbListStbVC = new ArrayList<SettopboxvcbindBean>();								// List of assigned VC's binded with the STB's in "dbListSubscriberSTB".
	List<SettopboxvcbindBean> treeListStbVC = new ArrayList<SettopboxvcbindBean>();								// List of unassigned VC's which are "GOING TO BE BINDED" to a particular STB.						
	List<SubscribersettopboxbindBean> addedSTBList  = new ArrayList<SubscribersettopboxbindBean>();				// List of unassigned STB'S which are newly added to the tree.
	List<SubscribersettopboxbindBean> deletedSTBList = new ArrayList<SubscribersettopboxbindBean>();			// List of STB'S which are deleted from the tree.
	List<SettopboxvcbindBean> addedVCList = new ArrayList<SettopboxvcbindBean>();								// List of VC's which are added to the tree.
	List<SettopboxvcbindBean> deletedVCList = new ArrayList<SettopboxvcbindBean>();								// List of VC's which are deleted from the tree.
	List<CustomBouquet> customBouquets = new ArrayList<CustomBouquet>();
	List<BouquetmasterBean> bouquets = new ArrayList<BouquetmasterBean>();										// List of "Active" Bouquets fetched from database.
	List<VcbouquetbindBean> vcbouquetbindBeans = new ArrayList<VcbouquetbindBean>();							// List of "VcbouquetbindBean" with mode = 'i'.
	List<CustomChannel> customChannels = new ArrayList<CustomChannel>();
	List<ChannelmasterBean> channels = new ArrayList<ChannelmasterBean>();										// List of "Active" Channels fetched from database.
	List<VcchannelbindBean> vcchannelbindBeans = new ArrayList<VcchannelbindBean>();
	
	////////////////	END - LIST/HASHTABLE/SET/MAP DECLARATIONS ///////////////////////////////////////////////
	
	
	
	public void onClick$saveStbVcInfo() throws Exception {
		
		DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
	    Connection conn = dbDatabaseHandler.getConnection();
	    
	    //Convert today's date to SQL Date
		Date todaysDate = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String STBAssignDate = fmt.format(todaysDate);
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(STBAssignDate));
	    
	    try{
	    		msg.setValue(null);
	    	
	    		saveStbVcInfo.setDisabled(true);    // DISABLE THE SAVE STB-VC INFO BUTTON.	
	    	
	    		Session session=Sessions.getCurrent();

	    		subscriberId = (Integer) session.getAttribute("subscriber");  // Fetch Subscriber information from session.
	    		
	    		/*
	    		 * 		1. Fetch the list of assigned STB's to a particular subscriber from database. 	
	    		 * 		2. Add those Subscriber-STB mapping information in a MultiValueMap. 
	    		 * 		3. Store this STB information in an ArrayList<SubscribersettopboxbindBean> and mark this as "dbListSubscriberSTB".
	    		 */
	    		
	    		subscribersettopboxbindBeans = subscribersettopboxbindDAO.findBysubscriber_id_modeIn(subscriberId); 
	    		
	    		for(SubscribersettopboxbindBean subscribersettopboxbindBean : subscribersettopboxbindBeans){
	    			
	    			subscriberStbMap.put(subscribersettopboxbindBean.getSubscriber_id(), subscribersettopboxbindBean.getSettopbox_id());
	    			
	    			dbListSubscriberSTB.add(subscribersettopboxbindBean);
	    			
	    		}
	    		
	    		
	    		/*
	    		 * 		1. Fetch the list of assigned VC's binded with the STB's in "dbListSubscriberSTB"
	    		 * 		2. Add those STB-VC mapping information in a MultiValueMap.
	    		 * 		3. Store this VC information in an ArrayList<SettopboxvcbindBean> and mark this as "dbListStbVC".
	    		 * 
	    		 * 
	    		 */
	    		
	    		Collection entrySet = subscriberStbMap.values();
	    		
	    		Iterator it = entrySet.iterator();
	    		
	    		//System.out.println("ITERATING SUBSCRIBER/STB ENTRIES...");
	    		
	    		while (it.hasNext()) {
	    			
	    			// System.out.println(it.next());
	    			
	    			int settopboxId = (Integer) it.next();
	    			
	    			settopboxvcbindBeans = settopboxvcbindDAO.findBysettopboxid_modeIn(settopboxId);
	    			
	    			for(SettopboxvcbindBean settopboxvcbindBean : settopboxvcbindBeans){
	    				
	    				settopboxVcMap.put(settopboxId, settopboxvcbindBean.getVcid());
	    				
	    				dbListStbVC.add(settopboxvcbindBean);
	    			
	    			}

	    		}
	    		
	    		
	    		
	    		/////////////////////////////////////   LISTS RETRIEVED FROM DATABASE ////////////////////////////////////
	    		
	    		// 1.  Subscriber-STB List
	    		
	    		//System.out.println("DATABASE LIST: Subscriber/STB");
	    		
	    		/*for(int i=0;i<dbListSubscriberSTB.size();i++){
	    			
	    			System.out.println("Subscriber Id:("+subscriberId+") ->"+dbListSubscriberSTB.get(i).getSettopbox_id());
	    		}*/
	    		
	    		// 2.  STB-VC List
	    		
	    		//System.out.println("DATABASE LIST: STB/VC");
	    		
	    		/*for(int i=0;i<dbListStbVC.size();i++){
	    			
	    			System.out.println(dbListStbVC.get(i).getSettopboxid()+"->"+dbListStbVC.get(i).getVcid());
	    		}*/
	    		//////////////////////////////////////////////////////////////////////////////////////////////////////////
	    		
	    		
	    		
	    		/////////////////////////////////////   MAPPING INFORMATION /////////////////////////////////////////////
	    		
	    		/*System.out.println("SUbSCRIBER/STB MAPPING INFORMATION:");
	    		
	    		// 1.  Subscriber-STB Mapping
	    		
	    		Set subscriberStbentrySet = subscriberStbMap.entrySet();
	            
	    		Iterator subscriberStbentrySetIterator = subscriberStbentrySet.iterator();
	            
	    		while (subscriberStbentrySetIterator.hasNext()) {
	            
	    			Map.Entry mapEntry = (Map.Entry) subscriberStbentrySetIterator.next();
	                
	    			List lst = (List) subscriberStbMap.get(mapEntry.getKey());
	                
	    			for (int i = 0; i < lst.size(); i++) {
	                
	    				System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
	                	
	                }
	            }
	    		
	    		
	    		System.out.println("STB/VC MAPPING INFORMATION:");
	    		
	    		// 2. STB-VC Mapping
	    		
	    		Set settopboxVcentrySet = settopboxVcMap.entrySet();
	    		
	    		Iterator settopboxVcentryIterator = settopboxVcentrySet.iterator();
	    		
	    		while(settopboxVcentryIterator.hasNext()){
	    			
	    			Map.Entry mapEntry = (Map.Entry) settopboxVcentryIterator.next();
	    			
	    			List lst = (List) settopboxVcMap.get(mapEntry.getKey());
	    			
	    			for (int i = 0; i < lst.size(); i++) {
		                
	    				System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
	                	
	                }
	    			
	    		}
*/	    		
	    		////////////////////////////////////////////////////////////////////////////////////////////////////////
	    		
	            if(subscribersettopboxbindBeans.length == 0){ // NEW SUBSCRIBER STB/VC ASSIGN(ACCRODING TO Subscriber/STB Bind Information)
	            	
	            	//Messagebox.show("New Subscriber STB/VC Assign!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
	            		
	            			if(stbchilldren!=null){
	    	    		
	            					List list = stbchilldren.getChildren();
		    		 
	            					for(int index = 0; index < list.size(); index++)
	            					{
			    	    	
	            						Treeitem treeitem = (Treeitem) list.get(index);
			    	    	
	            						Treerow settopboxrow =  treeitem.getTreerow();
			    	    	
	            						Treecell treecell = (Treecell) settopboxrow.getChildren().get(0);
			    	    	
	            						//System.out.println("stb :" +treecell.getLabel());
			    	    	
	            						if(treecell.getLabel() == null){
			    	    		
	            							System.out.println("NO STB found !");

	            						}else{
			    	    		
	            							stbId = (settopboxmasterDAO.findBymakenumber(treecell.getLabel())[0]).getId();
			    	    		
	            							SubscribersettopboxbindBean subscribersettopboxbindBean = new SubscribersettopboxbindBean();
	            							SettopboxmasterBean settopboxmasterBean = new SettopboxmasterBean();
			    	    		
	            							subscribersettopboxbindBean.setSubscriber_id(subscriberId);
	            							subscribersettopboxbindBean.setSettopbox_id(stbId);
	            							subscribersettopboxbindBean.setIndate(TodaysDate);
			    	    		
	            							//System.out.println("Subscriber Id: "+subscriberId + ", Set Top Box Id: "+stbId);
			    	    		
	            							generatedsubscriberstbbindId = subscribersettopboxbindDAO.insertAllCols(subscribersettopboxbindBean,conn);
			    	    		
	            							settopboxmasterBean.setStatus("a");
	            							settopboxmasterBean.setInstalldate(TodaysDate);
	            							settopboxmasterBean.setMakenumber(treecell.getLabel());
	            							settopboxmasterBean.setModifyby(currentlyLoggedInUserId);
	            							settopboxmasterBean.setModifydate(TodaysDate);
	            							settopboxmasterBean.setSchemeid(schemeIdBystbMakeNumber.get(treecell.getLabel()));
			    	    		
	            							settopboxmasterDAO.updateAllCols(settopboxmasterBean,conn);
	            						}
			    	    	
	            						Treechildren vcsInStbItem = treeitem.getTreechildren();
			    	    	
	            						List list2 = vcsInStbItem.getChildren();
	            						
	            						//System.out.println("---->"+list2.size());
			    	    
	            						for(int j = 0 ; j < list2.size() ; j++){
			    	    		
	            								Treeitem treeitem2 = (Treeitem) list2.get(j);
	            								
	            								Treerow vcrow =  treeitem2.getTreerow();
				    	    	
	            								Treecell treecell2 = (Treecell) vcrow.getChildren().get(0);
				    	    	
	            								//System.out.println("vc :" +treecell2.getLabel());
				    	    	
	            								if(treecell2.getLabel() == null){
				    	    		
	            										System.out.println("No VC found !");
				    	    		
	            								}else{
				    	    		
			            								vcId = (vcmasterDAO.findByvcnumber(treecell2.getLabel())[0]).getId();
						    	    		
			            								SettopboxvcbindBean settopboxvcbindBean = new SettopboxvcbindBean();
			            								VcmasterBean vcmasterBean = new VcmasterBean();
						    	    		
			            								settopboxvcbindBean.setSettopboxid(stbId);
			            								settopboxvcbindBean.setVcid(vcId);
			            								settopboxvcbindBean.setIndate(TodaysDate);
						    	    		
			            								//System.out.println("Set Top Box Id: "+stbId + ", VC Id: "+vcId);
						    	    		
			            								if(vcTable.containsKey(treecell2.getLabel())) {
			            									
			            									generatedstbvcBindId = settopboxvcbindDAO.insertAllCols(settopboxvcbindBean,conn);
			    						    	    		
				            								vcmasterBean.setStatus("a");
				            								vcmasterBean.setAssigndate(TodaysDate);
				            								vcmasterBean.setVcnumber(treecell2.getLabel());
				            								vcmasterBean.setModifyby(currentlyLoggedInUserId);
				            								vcmasterBean.setModifydate(TodaysDate);
							    	    		
				            								vcmasterDAO.updateAllCols(vcmasterBean,conn);
			            									
			            								}
	            								}
	            						 }
			    	    	
	            					}
	            				}
	            				
	            }else{  // EXISTING SUBSCRIBER STB/VC UPDATE...
	            	
	            				//Messagebox.show("Existing Subscriber STB/VC Update!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
	            	
	            				List list = stbchilldren.getChildren();
	            	
	            				for(int index = 0; index < list.size(); index++){
	            		
	            					Treeitem treeitem = (Treeitem) list.get(index);
			    	    	
	            					Treerow settopboxrow =  treeitem.getTreerow();
		    	
	            					Treecell treecell = (Treecell) settopboxrow.getChildren().get(0);
		    	
	            					//System.out.println("stb :" +treecell.getLabel());
	            					
	            					SubscribersettopboxbindBean sBean = new SubscribersettopboxbindBean();
	            					stbId = (settopboxmasterDAO.findBymakenumber(treecell.getLabel())[0]).getId();

	            					sBean.setSettopbox_id(stbId);
	            					sBean.setSubscriber_id(subscriberId);
	            					
	            					treeListSubscriberSTB.add(sBean);
	            					
	            					Treechildren treechildren =  treeitem.getTreechildren();
	            					
	            					if(treechildren!=null){
	            						
	            						List vcList = treechildren.getChildren();
	            						
	            						//System.out.println(vcList.size());
	            						
	            						if(vcList.size() > 0){
	            							
	            							for(int i = 0; i < vcList.size(); i++){

		            							Treeitem treeitem2 = (Treeitem) vcList.get(i);
		            							
		            							Treerow vcrow =  treeitem2.getTreerow();
		            							
		            							Treecell treecell2 = (Treecell) vcrow.getChildren().get(0);
		            							
		            							//System.out.println("vc :" +treecell2.getLabel());
		            							
		            							SettopboxvcbindBean settopboxvcbindBean = new SettopboxvcbindBean();
		            							vcId = (vcmasterDAO.findByvcnumber(treecell2.getLabel())[0]).getId();
		            							
		            							settopboxvcbindBean.setSettopboxid(stbId);
		            							settopboxvcbindBean.setVcid(vcId);
		            							
		            							treeListStbVC.add(settopboxvcbindBean);
		            						}

	            						}else{
	            							
	            								SettopboxvcbindBean[] settopboxvcbindBeans = settopboxvcbindDAO.findBysettopboxid_modeIn(stbId);
	            							
	            								if(settopboxvcbindBeans != null && settopboxvcbindBeans.length > 0){
	            									
	            									for(SettopboxvcbindBean bean : settopboxvcbindBeans){
		            									
		            									VcmasterBean vcmasterBean = new VcmasterBean();
		            									
		            									vcmasterBean.setId(bean.getVcid());
		            									
		            									vcmasterBean.setStatus("u");
		            									
		            									vcmasterBean.setUnassigndate(TodaysDate);
		            									
		            									vcmasterBean.setModifyby(currentlyLoggedInUserId);
		            									
		            									vcmasterDAO.unAssignVC(vcmasterBean,conn);
		            									
		            								}
		            								
		            								settopboxvcbindBeans[0].setMode("o");
		            								
		            								settopboxvcbindBeans[0].setOutdate(TodaysDate);
		            								
		            								settopboxvcbindDAO.removeStbVcBind(settopboxvcbindBeans[0], conn);
	            									
	            								}
	            							
	            						}
	            							            								
	            					}else{
	            						
	            						System.out.println("STB "+treecell.getLabel()+"has no VC in tree !");
	            					}
	            					
	            					
	            				}
	            	
	            				
	            				if(treeListSubscriberSTB.size() > 0){
	            					
	            					// compareLists(treeListSubscriberSTB,dbListSubscriberSTB,subscriberStbMap);  // Compare DB List with TreeList...
	            					
	            					compareSubscriberStbLists(treeListSubscriberSTB,dbListSubscriberSTB,treeListStbVC,dbListStbVC,subscriberStbMap,settopboxVcMap,conn); // Compare DB List with TreeList...
	            					
	            					
	            							//  1.  When addedSTBList is not empty...
	            					
	            							if(!addedSTBList.isEmpty()){
	            								
	            								    // System.out.println("addedSTBList is not empty...");
	            								
	            									for(int i = 0; i<addedSTBList.size(); i++){
	            										
	            										 subscribersettopboxbindDAO.insertAllCols(addedSTBList.get(i),conn);
	            										 
	            										 SettopboxmasterBean settopboxmasterBean = stbBeanByIdTable.get(addedSTBList.get(i).getSettopbox_id());
	            										 
	            										 settopboxmasterBean.setInstalldate(TodaysDate);
	            										 
	            										 settopboxmasterBean.setStatus("a");
	            										 
	            										 settopboxmasterBean.setModifyby(currentlyLoggedInUserId);
	            										 
	            										 settopboxmasterBean.setModifydate(TodaysDate);
	            										 
	            										 settopboxmasterBean.setSchemeid(schemeIdBystbMakeNumber.get(settopboxmasterBean.getMakenumber()));
	            										 
	            										 settopboxmasterDAO.updateAllCols(settopboxmasterBean,conn);
	            										
	            									}
	            							}
	            							
	            						   //  2.  When addedVCList is not empty...
	            							
	            						  if(!addedVCList.isEmpty()){
	            							   
	            							   // System.out.println("addedVCList is not empty...");
	            							   
	            							   for(int i = 0; i<addedVCList.size(); i++){
	            								   
	            								   settopboxvcbindDAO.insertAllCols(addedVCList.get(i), conn);
	            								   
	            								   //System.out.println(" in add vclist , vc id is "+ addedVCList.get(i).getVcid());
	            								   
	            								   VcmasterBean vcmasterBean = vcBeanByIdTable.get(addedVCList.get(i).getVcid());
	            								   
	            								   //System.out.println("PROBLEM...");
	            								   
	            								   vcmasterBean.setAssigndate(TodaysDate);
	            								   
	            								   vcmasterBean.setStatus("a");
	            								   
	            								   vcmasterBean.setModifyby(currentlyLoggedInUserId);
	            								   
	            								   vcmasterBean.setModifydate(TodaysDate);
	            								   
	            								   vcmasterDAO.updateAllCols(vcmasterBean, conn);
	            							   }
	            							   
	            							   
	            						   }
	            							
	            						// 3. When 	deletedSTBList is not empty...
	            						   
	            						if(!deletedSTBList.isEmpty()){
	            							
	            							// System.out.println("deletedSTBList is not empty...");
	            							
	            							for(int i=0; i<deletedSTBList.size();i++){
	            								
	            								SubscribersettopboxbindBean subscribersettopboxbindBean = deletedSTBList.get(i);
	            								
	            								subscribersettopboxbindDAO.updateAllCols(subscribersettopboxbindBean,conn);
	            								
	            								SettopboxmasterBean settopboxmasterBean = stbBeanByIdTable2.get(deletedSTBList.get(i).getSettopbox_id());
	            								
	            								settopboxmasterBean.setStatus("u");
	            								
	            								settopboxmasterBean.setModifyby(currentlyLoggedInUserId);
	            								
	            								settopboxmasterBean.setModifydate(TodaysDate);
	            								
	            								settopboxmasterDAO.unAssignSTB(settopboxmasterBean,conn);
	            								
	            							}
	            							
	            						}
	            						
	            					 // 4. When deletedVCList is not empty...
	            					  
	            					  if(!deletedVCList.isEmpty()){
	            						  
	            						  // System.out.println("deletedVCList is not empty...");
	            						  
	            						  for(int i = 0; i<deletedVCList.size();i++){
	            							  
	            							 SettopboxvcbindBean settopboxvcbindBean = deletedVCList.get(i);
	            							 
	            							 settopboxvcbindDAO.updateAllCols(settopboxvcbindBean,conn);
	            							 
	            							 VcmasterBean vcmasterBean = vcBeanByIdTable2.get(deletedVCList.get(i).getVcid());
	            							 
	            							 vcmasterBean.setStatus("u");
	            							 
	            							 vcmasterBean.setUnassigndate(TodaysDate);
	            							 
	            							 vcmasterBean.setModifyby(currentlyLoggedInUserId);
	            							 
	            							 vcmasterBean.setModifydate(TodaysDate);
	            							 
	            							 vcmasterDAO.unAssignVC(vcmasterBean,conn);
	            							  
	            						  }
	            						  
	            					  }
	            					
	            				}else{  //  REMOVE ALL  SUBSCRIBER-STB Mapping INFORMATION...
	            					
	            					 		// System.out.println("REMOVE ALL  SUBSCRIBER-STB Mapping INFORMATION...");
	            			    		
		            			    		Set subscriberStbentrySet = subscriberStbMap.entrySet();
		            			            
		            			    		Iterator subscriberStbentrySetIterator = subscriberStbentrySet.iterator();
		            			            
		            			    		while (subscriberStbentrySetIterator.hasNext()) {
		            			            
		            			    			Map.Entry mapEntry = (Map.Entry) subscriberStbentrySetIterator.next();
		            			                
		            			    			List lst = (List) subscriberStbMap.get(mapEntry.getKey());
		            			                
		            			    			for (int i = 0; i < lst.size(); i++) {
		            			                
		            			    				// System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
		            			    				
		            			    				SubscribersettopboxbindBean subscribersettopboxbindBean = new SubscribersettopboxbindBean();
		            			    				
		            			    				SettopboxmasterBean settopboxmasterBean = new SettopboxmasterBean();
		            			    				
		            			    				//  EXPLICITY SET "SubscribersettopboxbindBean" PROPERTIES...
		            			    				
		            			    				subscribersettopboxbindBean.setSubscriber_id(subscriberId);
		            			    				
		            			    				subscribersettopboxbindBean.setMode("o");
		            			    				
		            			    				subscribersettopboxbindBean.setOutdate(TodaysDate);
		            			    				
		            			    			   //  EXPLICITY SET "SettopboxmasterBean" PROPERTIES...
		            			    				
		            			    				settopboxmasterBean.setId((Integer) lst.get(i));
		            			    				
		            			    				settopboxmasterBean.setStatus("u");
		            			    				
		            			    				settopboxmasterBean.setModifyby(currentlyLoggedInUserId);
		            			    				
		            			    				settopboxmasterBean.setModifydate(TodaysDate);
		            			    				
		            			    				
		            			    				subscribersettopboxbindDAO.removeSubscriberStbBind(subscribersettopboxbindBean, conn);
		            			    				
		            			    				settopboxmasterDAO.unAssignSTB(settopboxmasterBean, conn);
		            			                }
		            			            }
		            			    		
		            			    		/*
		            			    		 * 
		            			    		 * 		REMOVE ALL STB-VC Mapping INFORMATION
		            			    		 * 
		            			    		 * 		[REASON: if(treeListSubscriberSTB.size() = 0) implies treeListStbVC is also equal to 0.]
		            			    		 * 
		            			    		 * 
		            			    		 */
		            			    		
		            			    		// System.out.println("REMOVE ALL STB-VC Mapping INFORMATION...");
		            			    		
		            			    		Set settopboxVcentrySet = settopboxVcMap.entrySet();
		            			    		
		            			    		Iterator settopboxVcentryIterator = settopboxVcentrySet.iterator();
		            			    		
		            			    		while(settopboxVcentryIterator.hasNext()){
		            			    			
		            			    			Map.Entry mapEntry = (Map.Entry) settopboxVcentryIterator.next();
		            			    			
		            			    			List lst = (List) settopboxVcMap.get(mapEntry.getKey());
		            			    			
		            			    			for (int i = 0; i < lst.size(); i++) {
		            				                
		            			    				// System.out.println("\t" + mapEntry.getKey() + "\t  " + lst.get(i));
		            			    				
		            			    				SettopboxvcbindBean settopboxvcbindBean = new SettopboxvcbindBean();
		            			    				
		            			    				VcmasterBean vcmasterBean = new VcmasterBean();
		            			    				
		            			    				//  EXPLICITY SET "SettopboxvcbindBean" PROPERTIES...
		            			    				
		            			    				settopboxvcbindBean.setSettopboxid((Integer) mapEntry.getKey());
		            			    				
		            			    				settopboxvcbindBean.setMode("o");
		            			    				
		            			    				settopboxvcbindBean.setOutdate(TodaysDate);
		            			    				
		            			    			    //  EXPLICITY SET "VcmasterBean" PROPERTIES...
		            			    				
		            			    				vcmasterBean.setStatus("u");
		            			    				
		            			    				vcmasterBean.setUnassigndate(TodaysDate);
		            			    				
		            			    				vcmasterBean.setModifyby(currentlyLoggedInUserId);
		            			    				
		            			    				vcmasterBean.setModifydate(TodaysDate);
		            			    				
		            			    				vcmasterBean.setId((Integer) lst.get(i));
		            			    				
		            			    				settopboxvcbindDAO.removeStbVcBind(settopboxvcbindBean, conn);
		            			    				
		            			    				vcmasterDAO.unAssignVC(vcmasterBean, conn);
		            			    				
		            			                }
		            			    			
		            			    		}
	            				}
	            }
	            
	            conn.commit();         // FINAL COMMIT FOR STB/VC.
	            
	            msg.setValue(null);
	            
	            //disableFields1();  // DISABLE ALL TEXTBOXES/BUTTONS.
	            
	            clearAllInfo();   // CLEAR ALL HASHTABLES,SETS,MAPS,LISTS.
	            
	            loadTree(); 
	            
	          	Messagebox.show("STB/VC information updated successfully!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
	          	
	          	// System.out.println("ALL DONE SUCESSFULLY...");
	            
	    }catch(Exception e){
	    	
	    	conn.rollback();
	    	
	    	msg.setValue("Error processing request ! ");
	    	msg.setStyle("font-weight:bold;color:red;");
	    	disableFields1(); // MAKE THE FORM FIELDS DISABLED
	    	
	    	e.printStackTrace();
	    	
	    }finally{
	    	
	    	dbDatabaseHandler.closeConnection();
	    }
		
	}
	
	
	public void onClick$saveVcBouquetInfo() throws Exception{
		
		DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
	    Connection conn = dbDatabaseHandler.getConnection();
	    
	    //Convert today's date to SQL Date
		Date todaysDate = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String STBAssignDate = fmt.format(todaysDate);
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(STBAssignDate));
		
		try{    
				msg.setValue(null);
				
				saveVcBouquetInfo.setDisabled(true);	// DISABLE THE BUTTON "SAVE VC-BOUQUET INFO"
				
				VcmasterBean vcmasterBean = vcmasterDAO.fetchVCDetailsFromVCNumber(Sessions.getCurrent().getAttribute("selectedVCforBouquetBind").toString(),conn);
				
				customBouquets = fetchSelectedBouques();
								
				//System.out.println("SELECTED BOUQUETS: "+customBouquets.size());
				
				VcBouquetBindInfoUpdateHelper  vcBouquetBindInfoUpdateHelper = new VcBouquetBindInfoUpdateHelper();
				
				vcBouquetBindInfoUpdateHelper.processInformation(vcmasterBean,customBouquets,conn);  
				
				//System.out.println("Yes....done !!!");
				
				conn.commit();            // FINAL COMMIT FOR VC/BOUQUET.
				
				msg.setValue(null);
				
				rowByBouquetId.clear();   // CLEAR HASHTABLE
				
				Sessions.getCurrent().removeAttribute("selectedVCforBouquetBind");
	            
				disableFields2();   // DISABLE ALL TEXTBOXES/BUTTONS.
	            
	          	Messagebox.show("Information updated successfully!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
			
		}catch(Exception e){
			
			conn.rollback();
	    	
	    	msg.setValue("Error processing request ! ");
	    	msg.setStyle("font-weight:bold;color:red;");
	    	
	    	disableFields2(); // MAKE THE FORM FIELDS DISABLED
	    	
	    	e.printStackTrace();
			
		}finally{
			
			dbDatabaseHandler.closeConnection();
			
		}
		
	}
	
	
	
	public void onClick$saveVcChannelInfo() throws Exception {
		
		DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
	    Connection conn = dbDatabaseHandler.getConnection();
	    
	    //Convert today's date to SQL Date
	  	Date todaysDate = new Date();
	  	SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
	  	String STBAssignDate = fmt.format(todaysDate);
	  	java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(STBAssignDate));
		
		try{
				msg.setValue(null);
			
				saveVcChannelInfo.setDisabled(true);  // DISABLE THE BUTTON "SAVE VC-CHANNEL INFO"
				
				VcmasterBean vcmasterBean = vcmasterDAO.fetchVCDetailsFromVCNumber(Sessions.getCurrent().getAttribute("selectedVCforChannelBind").toString(),conn);
				
				customChannels = fetchSelectedChannels();
				
				//System.out.println("SELECTED CHANNELS..."+customChannels.size());
				
				VcChannelBindInfoUpdateHelper  vcChannelBindInfoUpdateHelper = new VcChannelBindInfoUpdateHelper();
				
				vcChannelBindInfoUpdateHelper.processInformation(vcmasterBean,customChannels,conn);  
				
				// System.out.println("Yesss....done !!!");
				
				conn.commit();        // FINAL COMMIT FOR VC/CHANNEL.
				
				msg.setValue(null);
				
				rowByChannelId.clear(); // CLEAR HASHTABLE. 
				
				Sessions.getCurrent().removeAttribute("selectedVCforChannelBind");
				
				disableFields3(); // DISABLE ALL FORM FIELDS INSIDE GRID.
				
				Messagebox.show("VC/Channel Info updated successfully!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
			
		}catch(Exception e){
			
			conn.rollback();
	    	
	    	msg.setValue("Error processing request ! ");
	    	msg.setStyle("font-weight:bold;color:red;");
	    	
	    	disableFields3(); // MAKE THE FORM FIELDS DISABLED
	    	
	    	e.printStackTrace();

			
		}finally{
			
			dbDatabaseHandler.closeConnection();
			
		}
		
	}
	
	
	public void onClick$search(){
		
		String searchString = null ;
		
		try{
			
				msg.setValue(null);
			
				//System.out.println("Search Flag: "+itemToSearch);
			
				if(searchName.getSelectedItem() == null){
					
					alert("Enter some Search Type !");
					
				}else if(searchName.getSelectedItem().getLabel().equals("Name")){
						
						//System.out.println("Search by Name...");
						
						searchString = searchQuery.getValue();
						
						// System.out.println("Search String: "+searchString);
						
						createCustomGridByName(searchString);
						
				}else if(searchName.getSelectedItem().getLabel().equals("Code")){
						
						//System.out.println("Search by Code...");
						
						searchString = searchQuery.getValue();
						
						System.out.println("Search String: "+searchString);
						
						createCustomGridByCode(searchString);
						
				}

		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		searchQuery.setValue("");
	}
	
	
	

	
	private void createCustomGridByCode(String searchString) {
		
		try{
				
				long currentSeconds = System.currentTimeMillis();
				
				customBouquets.clear();
				
				customChannels.clear();
				
				removedatagridComponents();
				
				datagrid.setVisible(true);
				
				searchLabel.setVisible(true);
				
				searchName.setVisible(true);
				
				searchQuery.setVisible(true);
				
				search.setVisible(true);
				
				// 1. CREATE CUSTOM GRID BY ENTERED/SEARCHED BOUQUET CODE
				
				if(itemToSearch.equals("bouquet")){
				
					// FETCH THE VCID OF THE SELECTED ASSIGNED VCNUMBER
					
					VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforBouquetBind").toString());
					
					// FETCH THE LIST OF VcbouquetbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
					
					vcbouquetbindBeans = vcbouquetbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId()); 
					
					ArrayList<BouquetmasterBean> fetchedBouquets = bouquetmasterDAO.searchByBouquetCode(searchString);
					
					//System.out.println("fetchedBouquets SIZE: "+fetchedBouquets.size());
					
					//////////////////////////////// GRID CREATION  ///////////////////////////////////////
					
					if(fetchedBouquets.size() > 0){
						
						// System.out.println("CREATING CUSTOM GRID BY ENTERED/SEARCHED BOUQUET CODE...");
						
						for(int i = 0; i < fetchedBouquets.size() ; i ++){
							
							rows.appendChild(rowByBouquetId.get(fetchedBouquets.get(i).getId()));
							
						}
						
					}
					
					//////////////////////////////// END - GRID CREATION  ////////////////////////////////
				}
				
				// 2. CREATE CUSTOM GRID BY ENTERED/SEARCHED CHANNEL CODE
				
				if(itemToSearch.equals("channel")){
					
					VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforChannelBind").toString());
					
					// FETCH THE LIST OF VcchannelbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
					
					vcchannelbindBeans = vcchannelbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId()); 

					ArrayList<ChannelmasterBean> fetchedChannels = channelmasterDAO.searchByChannelCode(searchString);
					
					//System.out.println("fetchedChannels SIZE: "+fetchedChannels.size());
					
					//////////////////////////////  GRID CREATION  ///////////////////////////////////////
					
					if(fetchedChannels.size() > 0){
					
						// System.out.println("CREATING CUSTOM GRID BY ENTERED/SEARCHED CHANNEL CODE...");
						
						for(int i = 0 ; i < fetchedChannels.size() ; i++){
							
							rows.appendChild(rowByChannelId.get(fetchedChannels.get(i).getId()));
							
						}
						
					}	
					
					//////////////////////////////END - GRID CREATION  ////////////////////////////////
					
				}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}


	private void createCustomGridByName(String searchString) {
		
		try{
					
					long currentSeconds = System.currentTimeMillis();
					
					customBouquets.clear();
					
					customChannels.clear();
					
					removedatagridComponents();
					
					datagrid.setVisible(true);
					
					searchLabel.setVisible(true);
					
					searchName.setVisible(true);
					
					searchQuery.setVisible(true);
					
					search.setVisible(true);
					
			
					// 1. CREATE CUSTOM GRID BY ENTERED/SEARCHED BOUQUET NAME
			
					if(itemToSearch.equals("bouquet")){
						
						// FETCH THE VCID OF THE SELECTED ASSIGNED VCNUMBER
						
						VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforBouquetBind").toString());
						
						// FETCH THE LIST OF VcbouquetbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
						
						vcbouquetbindBeans = vcbouquetbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId()); 
						
						ArrayList<BouquetmasterBean> fetchedBouquets = bouquetmasterDAO.searchByBouquetName(searchString);
						
						//System.out.println("fetchedBouquets SIZE: "+fetchedBouquets.size());
						
						////////////////////////////////  GRID CREATION  ///////////////////////////////////////
						
						if(fetchedBouquets.size() > 0){ 
							
							// System.out.println("CREATING CUSTOM GRID BY ENTERED/SEARCHED BOUQUET NAME...");
							
							for(int i = 0 ; i < fetchedBouquets.size() ; i++){
								
								rows.appendChild(rowByBouquetId.get(fetchedBouquets.get(i).getId()));
							}
							
						}
						
						/////////////////////////////////    END - GRID CREATION  //////////////////////////////
						
					}
			
					// 2. CREATE CUSTOM GRID BY ENTERED/SEARCHED CHANNEL NAME
					
					if(itemToSearch.equals("channel")){
						
						VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforChannelBind").toString());
						
						// FETCH THE LIST OF VcchannelbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
						
						vcchannelbindBeans = vcchannelbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId()); 

						ArrayList<ChannelmasterBean> fetchedChannels = channelmasterDAO.searchByChannelName(searchString);
						
						//System.out.println("fetchedChannels SIZE: "+fetchedChannels.size());
						
						////////////////////////////////GRID CREATION  ///////////////////////////////////////

						
						if(fetchedChannels.size() > 0){
							
							// System.out.println("CREATING CUSTOM GRID BY ENTERED/SEARCHED CHANNEL NAME...");
							
							for(int i = 0 ; i < fetchedChannels.size() ; i ++){
								
								rows.appendChild(rowByChannelId.get(fetchedChannels.get(i).getId()));
								
							}
							
						}
						
						//////////////////////////////  END - GRID CREATION /////////////////////////////////
						
					}
					
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}


	private void disableFields3() {
		
		try{
				b_channel.setDisabled(true);
				
				saveVcChannelInfo.setDisabled(true);
				
				searchName.setDisabled(true);
				
				searchQuery.setDisabled(true);
				
				search.setDisabled(true);
				
			    ////// DISABLE THE VC/CHANNEL FORM FIELDS INSIDE GRID /////
				
				List<Component> rows =   datagrid.getRows().getChildren();
				
				for(int i =0 ; i < rows.size();i++){
				
					Row row = (Row) rows.get(i);
					
					Checkbox checkbox = (Checkbox) row.getChildren().get(0);
					
					Label label = (Label) row.getChildren().get(1);
					
					Datebox sdate = (Datebox) row.getChildren().get(2);
					
					Datebox edate = (Datebox) row.getChildren().get(3);
					
					checkbox.setDisabled(true);
					
					sdate.setDisabled(true);
					
					edate.setDisabled(true);
				}	
				
		     //////  END - DISABLE THE VC/CHANNEL FORM FIELDS INSIDE GRID ////	
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	}


	private List<CustomChannel> fetchSelectedChannels() {

		List<CustomChannel> listSelectedChannels = new ArrayList<CustomChannel>();
		
		try{
				// System.out.println("Inside fetchSelectedChannels");
			
				List<Component> rows =   datagrid.getRows().getChildren();
				
				for(int i =0 ; i < rows.size();i++){
					
					Row row = (Row) rows.get(i);
					
					Checkbox checkbox = (Checkbox) row.getChildren().get(0);
					
					if(checkbox.isChecked()){
						
						CustomChannel channel = new CustomChannel();
						
						channel.setChannelId(((ChannelmasterBean) row.getValue()).getId());
						
						Label channelName = (Label) row.getChildren().get(1);
						
						Datebox sdate = (Datebox) row.getChildren().get(2);
						
						Datebox edate = (Datebox) row.getChildren().get(3);
						
						channel.setStime(sdate.getValue());
						
						channel.setEtime(edate.getValue());
						
						listSelectedChannels.add(channel);
						
					}else{
						
						saveVcChannelInfo.setDisabled(true);  // ENABLE THE SAVE VC-CHANNEL INFO BUTTON.
						
					}
				}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}

		return listSelectedChannels;
		
	}


	private void disableFields2() {
		
		try{
				
				b_bouquet.setDisabled(true);
			
				saveVcBouquetInfo.setDisabled(true);
				
				searchName.setDisabled(true);
				
				searchQuery.setDisabled(true);
				
				search.setDisabled(true);
				
				////// DISABLE THE VC/BOUQUET FORM FIELDS INSIDE GRID /////
				
				List<Component> rows =   datagrid.getRows().getChildren();
				
				for(int i =0 ; i < rows.size();i++){
					
						Row row = (Row) rows.get(i);
						
						Checkbox checkbox = (Checkbox) row.getChildren().get(0);
						
						Label label = (Label) row.getChildren().get(1);
						
						Datebox sdate = (Datebox) row.getChildren().get(2);
						
						Datebox edate = (Datebox) row.getChildren().get(3);
						
						checkbox.setDisabled(true);
						
						sdate.setDisabled(true);
						
						edate.setDisabled(true);
					
				}
				
				//////  END - DISABLE THE VC/BOUQUET FORM FIELDS INSIDE GRID ////
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}


	private void clearAllInfo() {
		
		try{
					// 1. HASHTABLES.(7)
			
					stbTable.clear();
					
					vcTable.clear();
					
					stbBeanByIdTable.clear();
					
					vcBeanByIdTable.clear();
					
					stbBeanByIdTable2.clear();
					
					vcBeanByIdTable2.clear();
					
					schemeIdBystbMakeNumber.clear();
					
					// 2. SETS.(2)
					
					stbSet.clear();
					
					vcSet.clear();
					
					
					// 3. MULTIVALUEMAPS.(2)
					
					subscriberStbMap.clear();
					
					settopboxVcMap.clear();
					
					// 4. LISTS.(10)
					
					//subscriberstbbind.clear();
					
					//stbvcBind.clear();
					
					dbListSubscriberSTB.clear();
					
					treeListSubscriberSTB.clear();
					
					dbListStbVC.clear();
					
					treeListStbVC.clear();
					
					addedSTBList.clear();
					
					deletedSTBList.clear();
					
					addedVCList.clear();
					
					deletedVCList.clear();
					
					roottree.clear();   // REFRESH THE TREE...
					
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}





	private void compareSubscriberStbLists(
			List<SubscribersettopboxbindBean> treeListSubscriberSTB,
			List<SubscribersettopboxbindBean> dbListSubscriberSTB, 
			
			List<SettopboxvcbindBean> treeListStbVC, 
			List<SettopboxvcbindBean> dbListStbVC, 
			
			MultiValueMap subscriberStbMap, MultiValueMap settopboxVcMap, Connection conn) {
		
		//Convert today's date to SQL Date
		Date todaysDate = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String STBAssignDate = fmt.format(todaysDate);
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(STBAssignDate));
		
		
		try{
			
				//   A.   SUBSCRIBER/STB DATABASE LIST AND TREE LIST COMPARISON ... 
				
			
				// NEWLY ADDED STB's...
				
			 	for (int i = 0; i < treeListSubscriberSTB.size(); i++) {
			 		
			 		boolean found = false;
			 		
			 		for(int j = 0; j < dbListSubscriberSTB.size(); j++ ){
			 					
			 					//System.out.println("DBList STB Id: "+dbListSubscriberSTB.get(j).getSettopbox_id());
			 					
			 					if(treeListSubscriberSTB.get(i).getSettopbox_id() == dbListSubscriberSTB.get(j).getSettopbox_id()  ||  subscriberStbMap.containsValue(treeListSubscriberSTB.get(i).getSettopbox_id())){ // NO ACTION
			 						
			 						
			 						//System.out.println(treeListSubscriberSTB.get(i).getSettopbox_id()+" already in database !");
			 						
			 						found = true ;
			 						
			 						break;
			 						
			 						
			 					}
			 				
			 			}
			 		
			 		if(!found){  // INSERT
			 			
			 			SubscribersettopboxbindBean subscribersettopboxbindBean = new SubscribersettopboxbindBean();
						
		 				subscribersettopboxbindBean.setSubscriber_id(treeListSubscriberSTB.get(i).getSubscriber_id());
		 						
		 				subscribersettopboxbindBean.setSettopbox_id(treeListSubscriberSTB.get(i).getSettopbox_id());
		 						
		 				subscribersettopboxbindBean.setIndate(TodaysDate);
		 						
		 				addedSTBList.add(subscribersettopboxbindBean);
			 		}
			 		
			 		
	 						
			 	}
			 	
			 	
			 	/*System.out.println("addedSTBList STB id's: ");
			 	Iterator iterator1 = addedSTBList.iterator();
			 	while(iterator1.hasNext()){
			 		System.out.println(iterator1.next().toString());
			 	}*/
			 	
			 	
			 	
			 // DELETED STB's...
			 	
			 for(int i = 0; i < dbListSubscriberSTB.size(); i++ ){	
				 
				 	boolean found = false;
				 
			 	
				 	for (int j = 0; j < treeListSubscriberSTB.size(); j++) {
			 	
		 					// System.out.println("DBList STB Id: "+treeListSubscriberSTB.get(j).getSettopbox_id());
		 					
		 					if(dbListSubscriberSTB.get(i).getSettopbox_id() == treeListSubscriberSTB.get(j).getSettopbox_id()){ // NO ACTION
		 						
		 						//System.out.println("Inside Delete List..... "+treeListSubscriberSTB.get(j).getSettopbox_id());
		 						
		 						found = true ;
		 						
		 						break;
		 						
		 						
		 					}
				 		
			 		}
				 	
				 	if(!found){  // DELETE
				 		
				 		SubscribersettopboxbindBean subscribersettopboxbindBean = new SubscribersettopboxbindBean();
				 		
				 		subscribersettopboxbindBean.setId(dbListSubscriberSTB.get(i).getId());
 						
 						subscribersettopboxbindBean.setSubscriber_id(dbListSubscriberSTB.get(i).getSubscriber_id());
 						
 						subscribersettopboxbindBean.setSettopbox_id(dbListSubscriberSTB.get(i).getSettopbox_id());
 						
 						subscribersettopboxbindBean.setOutdate(TodaysDate);
 						
 						subscribersettopboxbindBean.setMode("o");
 						
 						deletedSTBList.add(subscribersettopboxbindBean);
				 		
				 	}
			 } 		
			 
			 
			 /*System.out.println("deletedSTBList STB id's: ");
			 
			 Iterator iterator2 = deletedSTBList.iterator();
			 
			 while(iterator2.hasNext()){
			 
				 System.out.println(iterator2.next().toString());
			 
			 }*/
			 
			 
			 
			 //   B.   STB/VC DATABASE LIST AND TREE LIST COMPARISON ...
			 
			 if(treeListStbVC.size() > 0){
			 
				 	compareStbVcLists(treeListStbVC,dbListStbVC,settopboxVcMap);
				 	
			 }else{ // When the Tree has atleast one STB/VC Binding....
				 
				 // System.out.println("Unassign existing DB Components(VC)...");
				 
				 if(deletedVCList.size() > 0){
					 
					 // System.out.println("When the Tree has atleast one STB/VC Binding....");
					 
									 
					 for(int i = 0;i < deletedVCList.size();i++){
						 
						 SettopboxvcbindBean settopboxvcbindBean = deletedVCList.get(i);
						 
						 VcmasterBean vcmasterBean = new VcmasterBean();
						 
						 vcmasterBean.setId(settopboxvcbindBean.getVcid());
						 
						 vcmasterBean.setStatus("u");
						 
						 vcmasterBean.setUnassigndate(TodaysDate);
						 
						 vcmasterBean.setModifyby(currentlyLoggedInUserId);
						 
						 vcmasterBean.setModifydate(TodaysDate);
					 
						 
						 settopboxvcbindDAO.removeStbVcBind(settopboxvcbindBean, conn); 
						 
						 vcmasterDAO.unAssignVC(vcmasterBean, conn);
					 }
				 }else{
					 
					 // Track STB,remove stbvc bind,unassign vc...DONE 
					 
				 }
				 
			 }
			 
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}





	private void compareStbVcLists(List<SettopboxvcbindBean> treeListStbVC,
			List<SettopboxvcbindBean> dbListStbVC,
			MultiValueMap settopboxVcMap) {
		
		
				/*System.out.println("--------------------------------------");
				System.out.println(treeListStbVC);
				System.out.println("--------------------------------------");
				System.out.println(dbListStbVC);
				System.out.println("--------------------------------------");*/
		
				//Convert today's date to SQL Date
				Date todaysDate = new Date();
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				String VCAssignDate = fmt.format(todaysDate);
				java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(VCAssignDate));
				
				try{
						
						// NEWLY ADDED VC's...
					
					   for (int i = 0; i < treeListStbVC.size(); i++) {
						   
						   boolean found = false;
						   
						   for(int j = 0; j < dbListStbVC.size(); j++ ){
							   
							   if(treeListStbVC.get(i).getVcid() == dbListStbVC.get(j).getVcid()  ||  settopboxVcMap.containsValue(treeListStbVC.get(i).getVcid())){ // NO ACTION
								   
								   found = true ;
								   
								   break;
								   
							   }
							   
						   }
						   
						   if(!found){  // INSERT
							   
							   //if(!settopboxvcbindDAO.findBySTBandVCid(treeListStbVC.get(i).getSettopboxid(),treeListStbVC.get(i).getVcid())){
								
							   // if(vcBeanByIdTable2.containsKey(treeListStbVC.get(i).getVcid())) { 
							   
							   //System.out.println(" not found ");
							   
							   if(vcBeanByIdTable.containsKey(treeListStbVC.get(i).getVcid())) {
								
								 //  System.out.println("vc unassigned in db");
								   
								   SettopboxvcbindBean settopboxvcbindBean = new SettopboxvcbindBean();
								   
								   settopboxvcbindBean.setSettopboxid(treeListStbVC.get(i).getSettopboxid());
								   
								   settopboxvcbindBean.setVcid(treeListStbVC.get(i).getVcid());
								   
								   settopboxvcbindBean.setIndate(TodaysDate);
								   
								   addedVCList.add(settopboxvcbindBean);
								   
							   }							   						   
						   }
					   }
						
					   /*System.out.println("addedVCList VC id's: ");
					   Iterator iterator1 = addedVCList.iterator();
					   
					   while(iterator1.hasNext()){
						   
						   System.out.println(iterator1.next().toString());
					   }*/
					   
					
					   
					   
					// DELETED VC's...
					for(int i = 0; i < dbListStbVC.size(); i++ ){
						
						boolean found = false;
						
						for (int j = 0; j < treeListStbVC.size(); j++) {
							
							//System.out.println(":D "+dbListStbVC.get(i).getVcid()+treeListStbVC.get(j).getVcid());
							
							if(dbListStbVC.get(i).getVcid() == treeListStbVC.get(j).getVcid()){ // NO ACTION
								
								found = true ;
								
								break;
							}
							
						}
						
						
						if(!found){  // DELETE
							
							// System.out.println("Time to delete VC ...");
							
							SettopboxvcbindBean settopboxvcbindBean = new SettopboxvcbindBean();
							
							settopboxvcbindBean.setId(dbListStbVC.get(i).getId());
							
							// System.out.println("-> "+settopboxvcbindBean.getId());
							
							settopboxvcbindBean.setSettopboxid(dbListStbVC.get(i).getSettopboxid());
							
							settopboxvcbindBean.setVcid(dbListStbVC.get(i).getVcid());
							
							settopboxvcbindBean.setMode("o");
							
							settopboxvcbindBean.setOutdate(TodaysDate);
							
							deletedVCList.add(settopboxvcbindBean);
							
							// System.out.println(settopboxvcbindBean.getId()+"added !");
							
						}
						
					}
					
					/*System.out.println("deletedVCList VC id's: ");
					
					Iterator iterator2 = deletedVCList.iterator();
					
					 while(iterator2.hasNext()){
						 
						 System.out.println(iterator2.next().toString());
					 
					 }*/
					
					
				}catch(Exception e){
					
					e.printStackTrace();
					
				}
	}





	private void disableFields1() {
		
		try{
				//s1.setDisabled(true);
				//sb1.setDisabled(true);
				
				//s2.setDisabled(true);
				//sb2.setDisabled(true);
				
				saveStbVcInfo.setDisabled(true);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	

	public void onClick$b_channel(){
	
		try{
			    msg.setValue(null);
				
				itemToSearch = "channel";  // SETTING SEARCH FLAG AS "channel"
				
				long currentSeconds = System.currentTimeMillis();
				
				channels = channelmasterDAO.findAll();
				
				saveVcBouquetInfo.setDisabled(true);
				
				saveBouquetSubBouquetInfo.setDisabled(true);
				
				///////////////////////////////////////////////////
				
				customBouquets.clear();
				
				customChannels.clear();
				
				removedatagridComponents();
				
				////////////////////////////////////////////////////
				
				datagrid.setVisible(true);
				
				searchLabel.setVisible(true);
				
				searchName.setVisible(true);
				
				searchQuery.setVisible(true);
				
				search.setVisible(true);
				
				// FETCH THE VCID OF THE SELECTED ASSIGNED VCNUMBER
				
				VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforChannelBind").toString());
				
				// FETCH THE LIST OF VcchannelbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
				
				vcchannelbindBeans = vcchannelbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId());
				
				/////////////////////////////////////////////////////////////////////////////////////////////////////
				
				for(int i = 0; i < channels.size(); i++){
					
						//System.out.println("->"+i);
					
						ChannelmasterBean currentBean = channels.get(i);
						
						VcchannelbindBean currentDbBean = null;
						
						int channelIdOfCurrentRow = currentBean.getId();
						
						boolean found = false;
						
						//////////////////////////  GRID CREATION /////////////////////////////////////////////////
						
						Row row = new Row();
						
						row.setValue(currentBean);
						
						Checkbox checkbox = new Checkbox();
						
						checkbox.addEventListener(Events.ON_CHECK,new EventListener<Event>() {

							public void onEvent(Event arg0) throws Exception {
								
								saveVcChannelInfo.setDisabled(false);  // ENABLE THE SAVE VC-CHANNEL INFO BUTTON HERE.
								
							}
					
						});	
						
						Datebox stime = new Datebox(new Date(currentSeconds));
						Datebox etime = new Datebox();
						stime.setFormat("long+medium");
						etime.setFormat("long+medium");
						stime.setMold("rounded");
						etime.setMold("rounded");
						stime.setWidth("180px");
						etime.setWidth("180px");
						
						
						etime.addEventListener(Events.ON_CHANGE,new EventListener<Event>() {

							public void onEvent(Event arg0) throws Exception {
								
								saveVcChannelInfo.setDisabled(false);  // ENABLE THE SAVE VC-CHANNEL INFO BUTTON HERE.
								
							}
							
						});	
						
						row.appendChild(checkbox);
						
						row.appendChild(new Label(currentBean.getName()));
						
						row.appendChild(stime);
						
						row.appendChild(etime);
						
						rows.appendChild(row);
						
						rowByChannelId.put(channelIdOfCurrentRow, row);
						
						/////////////////////  END - GRID CREATION /////////////////////////////////////////////////
						
						for(int j = 0; j < vcchannelbindBeans.size(); j ++){
							
							if(channelIdOfCurrentRow == vcchannelbindBeans.get(j).getChannel_id()){
								
								found = true;
								
								//System.out.println("YES...FOUND !");
								
								currentDbBean = vcchannelbindBeans.get(j);
								
								break;
								
							}
							
						}
						
						if(found){
							
							checkbox.setChecked(true);
							
							stime.setValue(currentDbBean.getSdate());
							
							etime.setValue(currentDbBean.getEdate());
							
						}
				}
				
				//System.out.println("out");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	
	}	
	
	

	private void removedatagridComponents() {
		
		try{
				  
				  for(Iterator it = new ArrayList(rows.getChildren()).iterator(); it.hasNext();){
					  
					  rows.removeChild((Component) it.next());
					  
				  }
				  
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}


	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		try{
				currentlyLoggedInUserId = ((UsermasterBean) (session.getAttribute("logininfo"))).getId();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}





	public void onCreate$main(){
		
		try {
			
					stbSet.clear();
					
					vcSet.clear();
					
					///////////////////////////  DISABLE ALL BUTTONS  //////////////////////////////////
					
					// msg.setValue("Dummy Message");
					
					msg.setValue(null);
					
					b_bouquet.setDisabled(true);    	// DISABLE THE BUTTON "Bouquet"
					
					b_subbou.setDisabled(true);	   		// DISABLE THE BUTTON "Sub-Bouquet"	
					
					b_channel.setDisabled(true);   		// DISABLE THE BUTTON "Channel"
					
					saveStbVcInfo.setDisabled(true); 	// DISABLE THE BUTTON "SAVE STB-VC INFO"
					
					saveVcBouquetInfo.setDisabled(true);// DISABLE THE BUTTON "SAVE VC-BOUQUET INFO"
					
					saveVcChannelInfo.setDisabled(true);// DISABLE THE BUTTON "SAVE VC-CHANNEL INFO"
					
					////////////////////////////////////////////////////////////////////////////////////
					
			
					if(Sessions.getCurrent().getAttribute("subscriber")==null){
						
						//Messagebox.show("Create Subscriber first,then assign STB/VC!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
						
					}else{
						
						Session currentSession = Sessions.getCurrent();
						
						lcoid = ((Integer) (currentSession.getAttribute("currentLcoid")));
						
						SettopboxmasterBean[] stbs = settopboxmasterDAO.findBylcoidAndStatus(lcoid,"u");
						
						VcmasterBean[] vcs = vcmasterDAO.findBystatus("u");
						
						for(SettopboxmasterBean settopboxmasterBean : stbs){
							
							stbTable.put(settopboxmasterBean.getMakenumber(), settopboxmasterBean);
							
							stbBeanByIdTable.put(settopboxmasterBean.getId(), settopboxmasterBean);
						}
						
						for(VcmasterBean vcmasterBean : vcs){
							
							vcTable.put(vcmasterBean.getVcnumber(), vcmasterBean);
							
							vcBeanByIdTable.put(vcmasterBean.getId(), vcmasterBean);
							
						}
						
						loadTree();
						
						msg.setStyle(style2);
						
						
						////////////////  START - FETCH ALL BOUQUET AND CHANNEL DETAILS ////////////////
						
						bouquets = bouquetmasterDAO.findAll();
						
						channels = channelmasterDAO.findAll();
						
						for(BouquetmasterBean _bouquetmasterBean : bouquets){
							
							bouquetBeanByIdTable.put(_bouquetmasterBean.getId(), _bouquetmasterBean);
						}
						
						for(ChannelmasterBean _channelmasterBean : channels){
							
							channelBeanByIdTable.put(_channelmasterBean.getId(), _channelmasterBean);
							
						}
						
						////////////////   END - FETCH ALL BOUQUET AND CHANNEL DETAILS ////////////////
						
						////////////////   START - FETCH SUB-BOUQUET NAMES     ///////////////////////
						
						_subbouquetchannelbindBeans = subbouquetchannelbindDAO.findAllSubBouquets();
						
						for(SubbouquetchannelbindBean _subbouquetchannelbindBean : _subbouquetchannelbindBeans){
							
							// System.out.println(_subbouquetchannelbindBean.getSubbouquetname());
							
							subBouquetNameByIdTable.put(_subbouquetchannelbindBean.getSubbouquetid(),_subbouquetchannelbindBean.getSubbouquetname());
						}
						
						
						////////////////   END - FETCH ALL BOUQUET AND CHANNEL DETAILS ////////////////
						
						
					}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void onClick$sb1() throws Exception{
		
		try{
			 
			stb_scheme.setVisible(false);
			
			if(s1.getValue()!=null && !s1.getValue().trim().equals("")){
				
				msg.setValue("");
								
				if(stbTable.containsKey(s1.getValue().trim())){
						
						if(stbSet.contains(s1.getValue())){
							
							Messagebox.show("STB already added !", "Warning", Messagebox.OK, Messagebox.INFORMATION);
							
						}else{
							
							/* OPEN A MODAL WINDOW TO SELECT SETTOPBOX SCHEME */
							
							window = (Window)Executions.createComponents("stbSchemeSelect_dialog.zul", null , null);
								
							window.doModal();
						
							// System.out.println("Back...");
						
							// System.out.println(Sessions.getCurrent().getAttribute("x"));
						
						   /* END....OPEN A MODAL WINDOW TO SELECT SETTOPBOX SCHEME */
							
							if(Sessions.getCurrent().getAttribute("x")!=null){
								
								int x = (Integer) Sessions.getCurrent().getAttribute("x");
								
								schemeIdBystbMakeNumber.put(s1.getValue(),x); 
								
								Sessions.getCurrent().removeAttribute("x");
								
								saveStbVcInfo.setDisabled(false); // ENABLE THE SAVE STB/VC INFO BUTTON
								
								if(stbchilldren == null){
									stbchilldren = new Treechildren();
									roottree.appendChild(stbchilldren);
								}
								
								
								stbSet.add(s1.getValue());
								
								final Treechildren currentTreeChildren = new Treechildren();
								
								selectedSTBcell = null;
								stbIem = new Treeitem();
								stbIem.setId(s1.getValue());
								
								stbrow = new Treerow();
								stbcell = new Treecell(s1.getValue());
								stbcell.setId("s"+s1.getValue());
								stbcell.setStyle(style2 );
								
								
								stbcell.addEventListener("onClick",new EventListener<Event>() {

									public void onEvent(Event arg0) throws Exception {
										
										msg.setValue(null);
										
										selectedSTBcell = (Treecell) arg0.getTarget();
										selectedSTBItem = (Treeitem) selectedSTBcell.getParent().getParent();
										vcchilldren = currentTreeChildren;
										
									    ////// WHENEVER AN STB IS SELECTED(ALWAYS UNASSIGNED STB),FOLLOWING COMPONENTS WILL ALWAYS BE DISABLED. ////////
										
										saveStbVcInfo.setDisabled(false);
										
										saveVcBouquetInfo.setDisabled(true);
										saveVcChannelInfo.setDisabled(true);
										
										b_bouquet.setDisabled(true);
										b_subbou.setDisabled(true);
										b_channel.setDisabled(true);
										datagrid.setVisible(false);
										
										searchLabel.setVisible(false);
										searchName.setVisible(false);
										searchQuery.setVisible(false);
										search.setVisible(false);
										
										stb_scheme.setVisible(false);
										saveBouquetSubBouquetInfo.setDisabled(true);
										
										////////////////////////////////////////////////////////////////////////////////
										
									}
								});
								
								stbcell.addEventListener("onRightClick",new EventListener<Event>() {

									public void onEvent(Event arg0) throws Exception {
										
										selectedSTBcell = (Treecell) arg0.getTarget();
										selectedSTBItem = (Treeitem) selectedSTBcell.getParent().getParent();
										
										 pop = new CustomPopup();
										 pop.setStyle("background:transparent");
									     pop.setParent(selectedSTBcell);
									     pop.open(selectedSTBcell, "overlap_end");
									  
										
									}
								});
								stbrow.appendChild(stbcell);
								stbIem.appendChild(stbrow);
								
								//  Checking if the STB to be assigned already has a default VC...
								
								SettopboxmasterBean bean1 =  stbTable.get(s1.getValue().trim());
								
								SettopboxvcbindBean[] settopboxvcbindBeans = settopboxvcbindDAO.findBysettopboxid_modeIn(bean1.getId());
								
								for(SettopboxvcbindBean bindBean : settopboxvcbindBeans ){
									
									VcmasterBean bean2 = vcmasterDAO.findByid(bindBean.getVcid());
									
									//System.out.println("--->" + bean2.getId());
									
			/*						if(vcchilldren == null){
										vcchilldren = new Treechildren();
										stbIem.appendChild(vcchilldren);
									}
		*/							
									stbIem.appendChild(currentTreeChildren);
									
									
									vcSet.add(bean2.getVcnumber());
									
									vcItem = new Treeitem();
									
									vcrow = new Treerow();
									
									vccell = new Treecell(bean2.getVcnumber());
									vccell.setId("v"+bean2.getVcnumber());
									vccell.setStyle(style2);	
									
									vccell.addEventListener("onClick",new EventListener<Event>() {

										public void onEvent(Event arg0) throws Exception {
											
											msg.setValue(null);
											
											selectedVCcell = (Treecell) arg0.getTarget();
											selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
											
										   ////// CHECKING IF THE SELECTED VC IS ASSIGNED OR NOT,ACCORDINGLY BUTTONS WILL BE ENABLED/DISABLED. ////////
											
											// System.out.println("A: SELECTED VC(Inside onClick$sb1):  "+selectedVCcell.getLabel());
											
											// If "vcTable"(List of unassigned VC's) does not contain the selected VC.
											
											if(!vcTable.containsKey(selectedVCcell.getLabel())){  // Selected VC is assigned !
												
												// System.out.println("Inside ooo 1...Selected VC is assigned !");
												
												b_bouquet.setDisabled(true);           // DISABLE THE BUTTON "Bouquet".
					    						
					    						b_subbou.setDisabled(true);            // DISABLE THE BUTTON "Sub-Bouquet".
					    						
					    						b_channel.setDisabled(true);           // DISABLE THE BUTTON "Channel".
					    						
					    						saveStbVcInfo.setDisabled(false);      // ENABLE THE BUTTON "SAVE STB-VC INFO".
					    						
					    						saveVcBouquetInfo.setDisabled(true);   // DISABLE THE BUTTON "SAVE VC-BOUQUET INFO".
					    						
					    						saveVcChannelInfo.setDisabled(true);   // DISABLE THE BUTTON "SAVE VC-CHANNEL INFO".
					    						
					    						searchLabel.setVisible(false);
					    						
					    						searchName.setVisible(false);
					    						
					    						searchQuery.setVisible(false);
					    						
					    						search.setVisible(false);
					    						
					    						datagrid.setVisible(false);
					    						
					    						stb_scheme.setVisible(false);
					    						
					    						saveBouquetSubBouquetInfo.setDisabled(true);
											
											}else if(addedVCList.isEmpty()){  // Selected VC is unassigned !  
												
												// System.out.println("Inside ooo 2...Selected VC is unassigned !");
												
												// System.out.println("Inside else part $sb1...Selected VC is unassigned !");  
												
												// System.out.println("B: SELECTED VC(Inside onClick$sb1):  "+selectedVCcell.getLabel());
												
												b_bouquet.setDisabled(true);  // DISABLE THE BUTTON "Bouquet".
												
												b_subbou.setDisabled(true);   // DISABLE THE BUTTON "Sub-Bouquet".
												
												b_channel.setDisabled(true);  // DISABLE THE BUTTON "Channel".
					        					
					        					saveStbVcInfo.setDisabled(false);// ENABLE THE BUTTON "SAVE STB-VC INFO".
					        					
					        					saveVcBouquetInfo.setDisabled(true);// DISABLE THE BUTTON "SAVE VC-BOUQUE INFO".
					        					
					        					saveVcChannelInfo.setDisabled(true);   // DISABLE THE BUTTON "SAVE VC-CHANNEL INFO".
					        					
					        					datagrid.setVisible(false);
					        					
					        					searchLabel.setVisible(false);
					        					
					        					searchName.setVisible(false);
					        					
					        					searchQuery.setVisible(false);
					        					
												search.setVisible(false);
												
												stb_scheme.setVisible(false);
												
												saveBouquetSubBouquetInfo.setDisabled(true);
											
											}
											
										   ////////////////////////////////////////////////////////////////////////////////
										}
									});
									
									
									vccell.addEventListener("onRightClick",new EventListener<Event>() {

										public void onEvent(Event arg0) throws Exception {
											
											selectedVCcell = (Treecell) arg0.getTarget();
											selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
											
											pop = new CustomPopup();
											pop.setStyle("background:transparent");
										    pop.setParent(selectedVCcell);
										    pop.open(selectedVCcell, "overlap_end");
										  
											
										}
									});
									
									vcrow.appendChild(vccell);
									vcItem.appendChild(vcrow);
									currentTreeChildren.appendChild(vcItem);

									
								}						
								
								stbchilldren.appendChild(stbIem);
								
							}else{ // STB SHOULD NOT BE ADDED INTO THE TREE
								
								
								System.out.println("No scheme selected ...");
							}
													
						}
						
				}else{
					
					msg.setValue("No Settopbox found");
					
				}
				
			}else{
				
				msg.setValue("Enter STB ID");
				
			}
			
		}catch(Exception e){
			
			//e.printStackTrace();
			
			if (e instanceof UiException){   // IF BROWSER IS REFRESHED WHILE MODAL WINDOW IS ALIVE....
				
				System.out.println("Browser being refreshed while modal window is alive...");

				throw e;
			
			}else{
					
				e.printStackTrace();
			
			}
			
			e.printStackTrace();
			
		}
		
	}
	
	public void onClick$sb2(){
		
		try{
			
			stb_scheme.setVisible(false);
			
			if(s2.getValue()!=null && !s2.getValue().trim().equals("")){
				
				msg.setValue("");
				
				if(selectedSTBcell != null){

					if(vcTable.containsKey(s2.getValue().trim())){

						//System.out.println(" xx  "+selectedSTBcell.getLabel());
						
						saveStbVcInfo.setDisabled(false); // ENABLE THE SAVE STB/VC INFO BUTTON
						
						Treerow treerow = (Treerow) selectedSTBcell.getParent();
						
						Treeitem treeitem = (Treeitem) treerow.getParent();
						
						vcchilldren = (Treechildren) treeitem.getTreechildren();
						
						//System.out.println(" yy "+stbIem.getId());
						
						if(vcchilldren == null){
							
							vcchilldren = new Treechildren();
							
							selectedSTBItem.appendChild(vcchilldren);
						}
						
						
						if(vcSet.contains(s2.getValue())){
							
							Messagebox.show("VC already added !", "Warning", Messagebox.OK, Messagebox.INFORMATION);
							
						}else{
							
							vcSet.add(s2.getValue());
							
							vcItem = new Treeitem();
							
							vcrow = new Treerow();
							
							vccell = new Treecell(s2.getValue());
							vccell.setId("v"+s2.getValue());
							vccell.setStyle(style2);	
							
							vccell.addEventListener("onClick",new EventListener<Event>() {

								public void onEvent(Event arg0) throws Exception {
									
									msg.setValue(null);	
									
									selectedVCcell = (Treecell) arg0.getTarget();
									selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
									
									////// CHECKING IF THE SELECTED VC IS ASSIGNED OR NOT,ACCORDINGLY BUTTONS WILL BE ENABLED/DISABLED. ////////
									
									// System.out.println("SELECTED VC(Inside onClick$sb2):  "+selectedVCcell.getLabel());
									
									// If "vcTable"(List of unassigned VC's) does not contain the selected VC.
									
									if(!vcTable.containsKey(selectedVCcell.getLabel())){  // Selected VC is assigned !
										
										// System.out.println("Inside if...Selected VC is assigned !");
										
										b_bouquet.setDisabled(false);  // ENABLE THE BUTTON "Bouquet".
			    						
			    						b_subbou.setDisabled(true);   // DISABLE THE BUTTON "Sub-Bouquet".
			    						
			    						b_channel.setDisabled(false);  // ENABLE THE BUTTON "Channel".
			    						
			    						saveStbVcInfo.setDisabled(true);// DISABLE THE BUTTON "SAVE STB-VC INFO".
			    						
			    						//saveVcBouquetInfo.setDisabled(false);// ENABLE THE BUTTON "SAVE VC-BOUQUET INFO".
			    						
			    						stb_scheme.setVisible(false);
			    						
			    						saveBouquetSubBouquetInfo.setDisabled(true);
			    						
									}else{ // Selected VC is unassigned !   
										
										// System.out.println("Inside else...Selected VC is unassigned !");  
										
										b_bouquet.setDisabled(true);  		// DISABLE THE BUTTON "Bouquet".
										
										b_subbou.setDisabled(true);   		// DISABLE THE BUTTON "Sub-Bouquet".
										
										b_channel.setDisabled(true);        // DISABLE THE BUTTON "Channel".
			        					
			        					saveStbVcInfo.setDisabled(false);   // ENABLE THE BUTTON "SAVE STB-VC INFO".
			        					
			        					saveVcBouquetInfo.setDisabled(true); // DISABLE THE BUTTON "SAVE VC-BOUQUE INFO".
			        					
			        					saveVcChannelInfo.setDisabled(true); // DISABLE THE BUTTON "SAVE VC-BOUQUE INFO". 
			        					
			        					datagrid.setVisible(false);
			        					
			        					searchLabel.setVisible(false);
			        					
			        					searchName.setVisible(false);
			        					
			        					searchQuery.setVisible(false);
			        					
										search.setVisible(false);
										
										stb_scheme.setVisible(false);
										
										saveBouquetSubBouquetInfo.setDisabled(true);
									}
									
									
									//////////////////////////////////////////////////////////////////////////////////
									
								}
							});
							
							vccell.addEventListener("onRightClick",new EventListener<Event>() {

								public void onEvent(Event arg0) throws Exception {
									
									 selectedVCcell = (Treecell) arg0.getTarget();
									 selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
									 
									 pop = new CustomPopup();
									 pop.setStyle("background:transparent");
								     pop.setParent(selectedVCcell);
								     pop.open(selectedVCcell, "overlap_end");
									
								}
							});
							
							vcrow.appendChild(vccell);
							vcItem.appendChild(vcrow);
							vcchilldren.appendChild(vcItem);
						}
					
					}else{

						msg.setValue("No VC found");
				
					}
				
				}else{
					
					msg.setValue("Select STB ID");
				}
				
			}else{
				
				msg.setValue("Enter VC Number");
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	private List<CustomBouquet> fetchSelectedBouques(){ 
		
		List<Component> rows =   datagrid.getRows().getChildren();
		
		List<CustomBouquet> customBouquets = new ArrayList<CustomBouquet>();
		
		for(int i =0 ; i < rows.size();i++){
			
			Row row = (Row) rows.get(i);
			
			Checkbox checkbox = (Checkbox) row.getChildren().get(0);
			
			if(checkbox.isChecked()){
					
				CustomBouquet customBouquet = new CustomBouquet();
				
				customBouquet.setBouquetId(((BouquetmasterBean) row.getValue()).getId());
				
				Label bouquetName = (Label) row.getChildren().get(1);
				
				Datebox sdate = (Datebox) row.getChildren().get(2);
				
				Datebox edate = (Datebox) row.getChildren().get(3);
				
				customBouquet.setStime(sdate.getValue());
				
				customBouquet.setEtime(edate.getValue());
				
				//System.out.println("new etime: "+edate.getValue());
				
				customBouquets.add(customBouquet);
				
			}else{
				
				saveVcBouquetInfo.setDisabled(true); // ENABLE THE SAVE STB-VC INFO BUTTON.
			}
			
		}
		
		// System.out.println("Search/Save Problem: "+customBouquets.size());
		
		return customBouquets;
		
	}
	
	
	public void onClick$b_bouquet(){
		
		try {
			    msg.setValue(null);
				
				itemToSearch = "bouquet";  // SETTING SEARCH FLAG AS "bouquet"
			
				long currentSeconds = System.currentTimeMillis();
			
				bouquets = bouquetmasterDAO.findAll();
				
				saveVcChannelInfo.setDisabled(true);
				
				saveBouquetSubBouquetInfo.setDisabled(true);
				
				//////////////////////////////////////////////////////
				
				customBouquets.clear();
				
				customChannels.clear();
				
				removedatagridComponents();
				
				//////////////////////////////////////////////////////
				
			
				datagrid.setVisible(true);
				
				searchLabel.setVisible(true);
				
				searchName.setVisible(true);
				
				searchQuery.setVisible(true);
				
				search.setVisible(true);
			
				// FETCH THE VCID OF THE SELECTED ASSIGNED VCNUMBER
				
				VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforBouquetBind").toString());
				
				// FETCH THE LIST OF VcbouquetbindBean's CORRESPONDING TO THIS VCID WITH MODE = 'i'
				
				vcbouquetbindBeans = vcbouquetbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId()); 
				
				/////////////////////////////////////////////////////////////////////////////////////////////////////////
			
				for(int i = 0 ; i < bouquets.size();i++){
						
						BouquetmasterBean  currentBean =  bouquets.get(i);
						
						VcbouquetbindBean currentDbBean = null ;
						
						final int bouquetIdOfCurrentRow = currentBean.getId();
						
						boolean found = false;
						
						///////////////////////////   GRID CREATION  /////////////////////////////////////////////////////
						
						Row row = new Row();
						
						row.setValue(currentBean);
						
						Checkbox checkbox = new Checkbox();
						
						checkbox.addEventListener(Events.ON_CHECK,new EventListener<Event>() {

							public void onEvent(Event arg0) throws Exception {
								
								System.out.println("CHECKBOX ON_CHECK FIRED....");
								
								checkboxCheckedFlag = true;
								
								saveVcBouquetInfo.setDisabled(false); // ENABLE THE SAVE VC-BOUQUET INFO BUTTON HERE.
								
								b_subbou.setDisabled(true);			  // DISABLE THE Sub-Bouquet BUTTON HERE.
								
							}
							
						});
						
						
						Datebox stime = new Datebox(new Date(currentSeconds));
						Datebox etime = new Datebox();
						stime.setFormat("long+medium");
						etime.setFormat("long+medium");
						stime.setMold("rounded");
						etime.setMold("rounded");
						stime.setWidth("180px");
						etime.setWidth("180px");
						etime.addEventListener(Events.ON_CHANGE,new EventListener<Event>() {

							public void onEvent(Event arg0) throws Exception {
								
								saveVcBouquetInfo.setDisabled(false); // ENABLE THE SAVE VC-BOUQUET INFO BUTTON HERE.
							}
							
						});
						
						row.appendChild(checkbox);
						
						row.appendChild(new Label(currentBean.getName()));
						
						row.appendChild(stime);
						
						row.appendChild(etime);
						
						
						//////////////////  EVENTLISTENER TO ENABLE "b_subbou" BUTTON IF THE SELECTED ROW HAS "Checkbox" component checked ///
						
						
						row.addEventListener(Events.ON_CLICK, new EventListener<Event>() {

							public void onEvent(Event arg0) throws Exception {
								
								System.out.println("ROW'S ON_CLICK FIRED....");
								
								// CHECK CONDITION HERE...
								
								for(int j = 0; j < vcbouquetbindBeans.size(); j ++){
									
									if(bouquetIdOfCurrentRow == vcbouquetbindBeans.get(j).getBouquet_id()){
										
										if(bouquetBeanByIdTable.get(bouquetIdOfCurrentRow).getNooffreechannel() > 0){
											
											// System.out.println("SELECTED BOUQUET HAS NO. OF FREE CHANNELS > 0");
											
											b_subbou.setDisabled(false); // ENABLE THE "b_subbou" BUTTON HERE.
											
											Sessions.getCurrent().setAttribute("selectedBouquetforSubBouquetOperation", bouquetIdOfCurrentRow);
											
											break;
										
										}else{
											
											// System.out.println("SELECTED BOUQUET HAS NO FREE CHANNELS !");
											
											Messagebox.show("Bouquet not eligible for Sub-Bouquet !", "Warning", Messagebox.OK, Messagebox.INFORMATION);
											
											b_subbou.setDisabled(true); // DISABLE THE "b_subbou" BUTTON HERE.
										}
									
									}else{
										
										b_subbou.setDisabled(true); // DISABLE THE "b_subbou" BUTTON HERE.
									}
								}
								
								if(Sessions.getCurrent().getAttribute("selectedBouquetforSubBouquetOperation") != null){
									
									// System.out.println("HELLO: "+Sessions.getCurrent().getAttribute("selectedBouquetforSubBouquetOperation").toString());
									
									/*if(!saveVcBouquetInfo.isDisabled()){ // "SAVE VC-BOUQUET INFO" IS ENABLED.
										
										System.out.println("11111");
										
									}else{   							// "SAVE VC-BOUQUET INFO" IS DISABLED.
										
										System.out.println("22222");
									}*/
									
								}
								
								if(checkboxCheckedFlag){
									
									// System.out.println("checkboxCheckedFlag is true...");
									
									b_subbou.setDisabled(true);
									
								}
								
							}
							
						});

						
						//////////////////  END - EVENTLISTENER TO ENABLE "b_subbou" BUTTON IF THE SELECTED ROW HAS "Checkbox" component checked ///
						
						rows.appendChild(row);
						
						rowByBouquetId.put(bouquetIdOfCurrentRow, row);
						
						/////////////////////  END - GRID CREATION /////////////////////////////////////////////////
						
						for(int j = 0; j < vcbouquetbindBeans.size(); j ++){
														
							if(bouquetIdOfCurrentRow == vcbouquetbindBeans.get(j).getBouquet_id()){
								
								found = true ;
								
								currentDbBean = vcbouquetbindBeans.get(j);
								
								break;
								
							}
						}
						
						if(found){
							
							checkbox.setChecked(true);
							
							stime.setValue(currentDbBean.getSdate());
							
							etime.setValue(currentDbBean.getEdate());
							
						}
					}
					
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
    class CustomPopup extends Popup{

		  public CustomPopup() {
			  	    
			   Button deleteBtn = new Button("delete");
			
			   deleteBtn.addEventListener(Events.ON_CLICK, new EventListener<Event>() {
			           
				   public void onEvent(Event aEvent) throws Exception {
					 
					 saveStbVcInfo.setDisabled(false);  // ENABLE THE SAVE STB/VC INFO BUTTON.
					 
					 
					 ///////////////////  ADDED LINES /////////////////
					 
					 msg.setValue(null);
					 
					 datagrid.setVisible(false);	    

					 saveVcBouquetInfo.setDisabled(true);
					 
					 saveVcChannelInfo.setDisabled(true);
					 
					 saveBouquetSubBouquetInfo.setDisabled(true);
					 
					 stb_scheme.setVisible(false);
					 
					 ///////////////////  ADDED LINES /////////////////
					 
					 
					 
					   
					 Treecell cell = (Treecell) aEvent.getTarget().getParent().getParent();
					 String cellId =  cell.getId();
					 String itemId = cellId.substring(1,cellId.length());
					
					 if(cellId.startsWith("s")){
						 
						 pop.close();
						 
						 pop.setParent(null);
						 
						 Treecell tc = (Treecell) selectedSTBItem.getTreerow().getChildren().get(0);
						 
						 //System.out.println("stb label "+tc.getLabel());
						 
						 stbSet.remove(tc.getLabel());
						 
						 roottree.getChildren().get(0).removeChild(selectedSTBItem);
						 
						 vcchilldren = null;
						 
					 }else{
						 
						 pop.close();
						 
						 pop.setParent(null);
						 
						 // btn-popup-cell-row-item-treechildren
						 
						 // System.out.println("vc label "+cell.getLabel());
						 
						 vcSet.remove(cell.getLabel());
						 
						 cell.getParent().getParent().getParent().removeChild(selectedVCItem);
						 						 
					 }
					 
					 
		           }
				 
			   });
			   
			   appendChild(deleteBtn);

			  }
		
	}
    
    void loadTree() throws Exception{
    	
    	int subscriberId = (Integer) Sessions.getCurrent().getAttribute("subscriber");
    	
    	SubscribersettopboxbindBean beans1[] = subscribersettopboxbindDAO.findBysubscriber_id_modeIn(subscriberId);
		
    	for(SubscribersettopboxbindBean _bean1 : beans1 ){
    		
    		SettopboxmasterBean _stb = settopboxmasterDAO.findByid(_bean1.getSettopbox_id());
    		
    		stbBeanByIdTable2.put(_bean1.getSettopbox_id(), _stb); 
    		
    		if(stbchilldren == null){
    			stbchilldren = new Treechildren();
    			roottree.appendChild(stbchilldren);
    		}
    		
    		selectedSTBcell = null;
    		stbIem = new Treeitem();
    		stbIem.setId(_stb.getMakenumber());
    		stbIem.setOpen(false);
    		
    		
    		stbrow = new Treerow();
    		stbcell = new Treecell(_stb.getMakenumber());
    		stbcell.setId("s"+_stb.getMakenumber());
    		stbcell.setStyle(style1 );
    		
    		
    		stbcell.addEventListener("onClick",new EventListener<Event>() {

    			public void onEvent(Event arg0) throws Exception {
    				
    				selectedSTBcell = (Treecell) arg0.getTarget();
    				selectedSTBItem = (Treeitem) selectedSTBcell.getParent().getParent();
    				
    			    //////     WHENEVER AN STB IS SELECTED(Always Assigned),FOLLOWING COMPONENTS WILL ALWAYS BE DISABLED. ////////
    				
    				System.out.println("Setting Selected assigned STB in session for Scheme update...");
    				
    				Sessions.getCurrent().setAttribute("selectedSTBforSchemeUpdate", selectedSTBcell.getLabel());
    				
    				msg.setValue(null);
    				
    				saveStbVcInfo.setDisabled(true);
    				saveVcBouquetInfo.setDisabled(true);
    				saveVcChannelInfo.setDisabled(true);
    				b_bouquet.setDisabled(true);
    				b_subbou.setDisabled(true);
    				b_channel.setDisabled(true);
    				datagrid.setVisible(false);
    				
    				searchLabel.setVisible(false);
    				searchName.setVisible(false);
    				searchQuery.setVisible(false);
    				search.setVisible(false);
    				
    				stb_scheme.setVisible(true);
    				saveBouquetSubBouquetInfo.setDisabled(true);
    				
    			  /////////////////////////////////////////////////////////////////////////////////////////	
    				
    			}
    		});
    		
    		stbcell.addEventListener("onRightClick",new EventListener<Event>() {

    			public void onEvent(Event arg0) throws Exception {
    				
    				selectedSTBcell = (Treecell) arg0.getTarget();
    				selectedSTBItem = (Treeitem) selectedSTBcell.getParent().getParent();
    				
    				 pop = new CustomPopup();
    				 pop.setStyle("background:transparent");
    			     pop.setParent(selectedSTBcell);
    			     pop.open(selectedSTBcell, "overlap_end");
    			  
    				
    			}
    		});
    		
    		stbrow.appendChild(stbcell);
    		stbIem.appendChild(stbrow);
    		
    		// vc operation
    		
    		SettopboxvcbindBean beans2[] = settopboxvcbindDAO.findBysettopboxid_modeIn(_stb.getId());
    		
    		for(SettopboxvcbindBean _bean2 : beans2){
    			
    			VcmasterBean vcmasterBean = vcmasterDAO.findByid(_bean2.getVcid());
    			
    			vcBeanByIdTable2.put(_bean2.getVcid(), vcmasterBean);
    			
        		vcchilldren = (Treechildren) stbIem.getTreechildren();
    			    			
    			if(vcchilldren == null){
    				vcchilldren = new Treechildren();
    				stbIem.appendChild(vcchilldren);
    			}
    			    			
    			vcItem = new Treeitem();
    			
    			vcrow = new Treerow();
    			
    			vccell = new Treecell(vcmasterBean.getVcnumber());
    			vccell.setId("v"+vcmasterBean.getVcnumber());
    			vccell.setStyle(style1);
    			
    			
    			///// TESTING POP-UP FOR DISPLAYING VC-BOUQUET/VC-CHANNEL INFORMATION ON MOUSEHOVER-MOUSEOUT  ///////
    			
    			vccell.addEventListener("onMouseOver",new EventListener<Event>() {

					public void onEvent(Event arg0) throws Exception {
						
						/////// 1.	START TEXTBOX PROPERTIES FOR DISPLAYING VC-BOUQUET INFORMATION ///////
						
						textbox1.setWidth("580px");
						
						textbox1.setReadonly(true);
						
						textbox1.setMultiline(true);
						
						/////// 1.	END - TEXTBOX PROPERTIES FOR DISPLAYING VC-BOUQUET INFORMATION ///////
						
						
						/////// 2.	START TEXTBOX PROPERTIES FOR DISPLAYING VC-CHANNEL INFORMATION ///////
						
						textbox2.setWidth("580px");
						
						textbox2.setReadonly(true);
						
						textbox2.setMultiline(true);
						
						/////// 2.	END - TEXTBOX PROPERTIES FOR DISPLAYING VC-CHANNEL INFORMATION ///////
						
						/////// 3.	START TEXTBOX PROPERTIES FOR DISPLAYING SUB-BOUQUET INFORMATION ///////
						
						textbox3.setWidth("580px");
						
						textbox3.setReadonly(true);
						
						textbox3.setMultiline(true);
						
						
						/////// 3.	END - TEXTBOX PROPERTIES FOR DISPLAYING SUB-BOUQUET INFORMATION ///////
						
						selectedVCcell = (Treecell) arg0.getTarget();
						
						if(!vcTable.containsKey(selectedVCcell.getLabel())){  // Selected VC is assigned !
							
							VcmasterBean[] vcmasterBeans = vcmasterDAO.findByvcnumber(selectedVCcell.getLabel());
							
							_vcbouquetbindBeans = vcbouquetbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId());
							
							_vcchannelbindBeans = vcchannelbindDAO.findByvc_id_modeIn(vcmasterBeans[0].getId());
							
							_subscribersubbouquettranBeans = subscribersubbouquettranDAO.findByvc_idAndSubscriber_id_modeIn(vcmasterBeans[0].getId(),(Integer) Sessions.getCurrent().getAttribute("subscriber"));
							
							/*for(SubscribersubbouquettranBean bean : _subscribersubbouquettranBeans){
								
								System.out.println(subBouquetNameByIdTable.get(bean.getSubbouquetid()));;
							}*/
							
							detailedVcInfo.setValue("DETAILS FOR VC NUMBER: "+selectedVCcell.getLabel());
							
							detailedVcInfo.setStyle(style4);
							
							/////// 1.	START DISPLAY VC/BOUQUET BIND INFORMATION... ///////
							
							if(_vcbouquetbindBeans.size() > 0){
								
								// System.out.println("_vcbouquetbindBeans SIZE: " + _vcbouquetbindBeans.size());
								
								String text = "" ;
								
								boolean first = true;
								
								int bouquetHeight = 15*_vcbouquetbindBeans.size();
								
								for(int i = 0 ; i < _vcbouquetbindBeans.size() ; i++){
									
									int _bouquetId = _vcbouquetbindBeans.get(i).getBouquet_id();
									
									String _bouquetName = bouquetBeanByIdTable.get(_bouquetId).getName();
									
									String _inDate = _vcbouquetbindBeans.get(i).getIndate().toString();
									
									String _startDate = _vcbouquetbindBeans.get(i).getSdate().toString();
									
									String _endDate = null;
									
									if(_vcbouquetbindBeans.get(i).getEdate() != null){
										
										_endDate = _vcbouquetbindBeans.get(i).getEdate().toString();
									
									}else{
										
										_endDate = "";
									}
									
									if(first){
										
										first = false;
										
										String _header = "VC/BOUQUET INFORMATION:	";
										
										text = 	_header+"\n\n"+_bouquetName+"\t\t"+_startDate+"\t\t"+_endDate ;
										
									}else{
										
									    text = text + "\n"+_bouquetName+"\t\t"+_startDate+"\t\t"+_endDate ;  
										
									}
									
								}
								
								textbox1.setValue(text);
								
								textbox1.setHeight(bouquetHeight+"px");
								
								textbox1.setParent(selectedVcInfoDisplay);
								
							}else{
								
								// NO BOUQUET ATTACHED TO THIS VC.
								
							}
							
						    /////// 1.	END - DISPLAY VC/BOUQUET BIND INFORMATION... ///////
							
							
							///////  2.	START DISPLAY VC/CHANNEL BIND INFORMATION... ///////
							
							
							if(_vcchannelbindBeans.size() > 0){ 
								
								String text = "" ;
								
								boolean first = true;
								
								int channelHeight = 15*_vcchannelbindBeans.size();
								
								for(int i = 0 ; i < _vcchannelbindBeans.size() ; i++){
								
									int _channelId = _vcchannelbindBeans.get(i).getChannel_id();
									
									String _channelName = channelBeanByIdTable.get(_channelId).getName();
									
									String _inDate = _vcchannelbindBeans.get(i).getIndate().toString();
									
									String _startDate = _vcchannelbindBeans.get(i).getSdate().toString();
									
									String _endDate = null;
									
									if(_vcchannelbindBeans.get(i).getEdate() != null){
										
										_endDate = _vcchannelbindBeans.get(i).getEdate().toString();
									
									}else{
										
										_endDate = "";
									}
									
									if(first){
										
										first = false;
										
										String _header = "VC/CHANNEL INFORMATION:	";
										
									    text = _header+"\n\n"+_channelName+"\t\t"+_startDate+"\t\t"+_endDate ;
										
									}else{
										
									    text = text + "\n"+_channelName+"\t\t"+_startDate+"\t\t"+_endDate ;  
										
									}
								
									
								}
								
								textbox2.setValue(text);
								
								textbox2.setHeight(channelHeight+"px");
								
								textbox2.setParent(selectedVcInfoDisplay);
								
							}else{
								
								// NO CHANNEL ATTACHED TO THIS VC.
								
							}
							
							/////// 2.	END - DISPLAY VC/CHANNEL BIND INFORMATION... ///////
							
							
						    /////// 3.	START - DISPLAY SUB-BOUQUET INFORMATION... ////////
							
							if(_subscribersubbouquettranBeans.size() > 0){
								
								String text = "" ;
								
								boolean first = true;
								
								int subbouquetHeight = 15*_subscribersubbouquettranBeans.size();
								
								for(int i = 0 ; i < _subscribersubbouquettranBeans.size() ; i++){
								
									int _subbouquetId = _subscribersubbouquettranBeans.get(i).getSubbouquetid();
									
									String _subbouquetName = subBouquetNameByIdTable.get(_subbouquetId);
									
									String _inDate = _subscribersubbouquettranBeans.get(i).getIndate().toString();
									
									String _startDate = _subscribersubbouquettranBeans.get(i).getSdate().toString();
									
									String _endDate = null;
									
									if(_subscribersubbouquettranBeans.get(i).getEdate() != null){
										
										_endDate = _subscribersubbouquettranBeans.get(i).getEdate().toString();
									
									}else{
										
										_endDate = "";
									}
									
									if(first){
										
										first = false;
										
										String _header = "VC/SUB-BOUQUET INFORMATION:	";
										
									    text = _header+"\n\n"+_subbouquetName+"\t\t"+_startDate+"\t\t"+_endDate ;
										
									}else{
										
									    text = text + "\n"+_subbouquetName+"\t\t"+_startDate+"\t\t"+_endDate ;  
										
									}
								
								}
								
								textbox3.setValue(text);
								
								textbox3.setHeight(subbouquetHeight+"px");
								
								textbox3.setParent(selectedVcInfoDisplay);
									
							}else{
								
								// NO SUB-BOUQUET ATTACHED TO THIS VC.
								
							}
							
						    /////// 3.	END - DISPLAY SUB-BOUQUET INFORMATION... ///////
							
							
							selectedVCcell.setTooltip(selectedVcInfoDisplay);   // POP-UP FOR DISPLAYING VC-BOUQUET/VC-CHANNEL INFORMATION ON MOUSEHOVER
							
						}else{ // Selected VC is unassigned !   
						
							// NOTHING TO DISPLAY IN POPUP.
						}
					}
    			
    			});
    			
    			
    			
    			
    			vccell.addEventListener("onMouseOut",new EventListener<Event>() {

					public void onEvent(Event arg0) throws Exception {
						
						selectedVCcell = null;
						
						_vcbouquetbindBeans.clear();
						
						_vcchannelbindBeans.clear();
						
						_subscribersubbouquettranBeans.clear();
						
						textbox1.setValue(null);
						
						textbox2.setValue(null);
						
						textbox3.setValue(null);
						
					}
    				
    			});
    			
    		    ////// END - TESTING POP-UP FOR DISPLAYING VC-BOUQUET/VC-CHANNEL INFORMATION ON MOUSEHOVER-MOUSEOUT ///////
    			
    			
    			
    			vccell.addEventListener("onClick",new EventListener<Event>() {

    				public void onEvent(Event arg0) throws Exception {
    					
    					msg.setValue(null);
    					
    					checkboxCheckedFlag = false;
    					
    					selectedVCcell = (Treecell) arg0.getTarget();
    					selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
    					
    					////// CHECKING IF THE SELECTED VC IS ASSIGNED OR NOT,ACCORDINGLY BUTTONS WILL BE ENABLED/DISABLED. ////////
    					
    					//System.out.println("SELECTED VC(Inside loadTree()):  "+selectedVCcell.getLabel());
    					
    					if(!vcTable.containsKey(selectedVCcell.getLabel())){  // Selected VC is assigned !
    						
    						//System.out.println("Inside if...Selected VC is assigned !");
    						
    						//// 1. STORING THE SELECTED ASSIGNED VC IN SESSION FOR BINDING IT WITH SELECTED BOUQUES ///
    						
    						System.out.println("Setting Selected assigned VC in session...");
    						
    						Sessions.getCurrent().setAttribute("selectedVCforBouquetBind", selectedVCcell.getLabel());
    						
    						//// 2. STORING THE SELECTED ASSIGNED VC IN SESSION FOR BINDING IT WITH SELECTED CHANNELS ///
    						
    						Sessions.getCurrent().setAttribute("selectedVCforChannelBind", selectedVCcell.getLabel());
    						
    						//// 3. STORING THE SELECTED ASSIGNED VC IN SESSION FOR FETCHING DATA FROM "subscribersubbouquettran" TABLE ///
    						
    						Sessions.getCurrent().setAttribute("selectedVCforSubBouquetTran", selectedVCcell.getLabel());
    						
    						/////////////////////////////////////////////////////////////////////////////////////////
    						
    						b_bouquet.setDisabled(false);  // ENABLE THE BUTTON "Bouquet".
    						
    						b_subbou.setDisabled(true);   // DISABLE THE BUTTON "Sub-Bouquet".
    						
    						b_channel.setDisabled(false);  // ENABLE THE BUTTON "Channel".
    						
    						saveStbVcInfo.setDisabled(true);// DISABLE THE BUTTON "SAVE STB-VC INFO".
    						
    						stb_scheme.setVisible(false);
    						
    						saveBouquetSubBouquetInfo.setDisabled(true);
    						
    						datagrid.setVisible(false);
        					
        					searchLabel.setVisible(false);
        					
        					searchName.setVisible(false);
        					
    						searchQuery.setVisible(false);
    						
    						search.setVisible(false);
    					
    					}else{ // Selected VC is unassigned !   
    						
    						// System.out.println("Inside else...Selected VC is unassigned !");  
    						
        					b_bouquet.setDisabled(false);  // ENABLE THE BUTTON "Bouquet".
        					
        					saveStbVcInfo.setDisabled(true);// ENABLE THE BUTTON "Bouquet".
        					
        					datagrid.setVisible(false);
        					
        					searchLabel.setVisible(false);
        					
        					searchName.setVisible(false);
        					
    						searchQuery.setVisible(false);
    						
    						search.setVisible(false);
    						
    						stb_scheme.setVisible(false);
    						
    						saveBouquetSubBouquetInfo.setDisabled(true);
    					}
    					    					
    					//////////////////////////////////////////////////////////////////////////////////
    					
    				}
    			});
    			
    			vccell.addEventListener("onRightClick",new EventListener<Event>() {

    				public void onEvent(Event arg0) throws Exception {
    					
    					selectedVCcell = (Treecell) arg0.getTarget();
    					selectedVCItem = (Treeitem) selectedVCcell.getParent().getParent();
    					
    					 pop = new CustomPopup();
    					 pop.setStyle("background:transparent");
    				     pop.setParent(selectedVCcell);
    				     pop.open(selectedVCcell, "overlap_end");
    				  
    					
    				}
    			});
    			
    			vcrow.appendChild(vccell);
    			vcItem.appendChild(vcrow);
    			vcchilldren.appendChild(vcItem);
        		
    			stbIem.appendChild(vcchilldren);
    			
    		}
    		
    		stbchilldren.appendChild(stbIem);
    		
    	}
     	
    }
    
    
    
    public void onClick$stb_scheme() throws Exception{
    	
    	try{  // MODAL WINDOW FOR UPDATING STB-SCHEME INFORMATION.
    		
    			msg.setValue(null);
    			
    			stb_scheme.setDisabled(true);
    			
    			saveBouquetSubBouquetInfo.setDisabled(true);
    		
    			System.out.println("SELECTED ASSIGNED STB FETCHED FROM SESSION FOR SCHEME UPDATE: "+Sessions.getCurrent().getAttribute("selectedSTBforSchemeUpdate").toString());
    			
    			SettopboxmasterBean _settopboxmasterBean =  settopboxmasterDAO.findBymakenumberforSchemeUpdate(Sessions.getCurrent().getAttribute("selectedSTBforSchemeUpdate").toString());
    			
    			Sessions.getCurrent().removeAttribute("selectedSTBforSchemeUpdate");  // REMOVE AND RE-SET.
    			
    			Sessions.getCurrent().setAttribute("_selectedSTBforSchemeUpdate", _settopboxmasterBean);
    			
    			Window _window = (Window)Executions.createComponents("stbSchemeUpdate_dialog.zul", null , null);
    			
    			_window.doModal();
    			
    			System.out.println("I AM BACK FROM STB SCHEME SELECT MODAL WINDOW!");
    			
    			/////  START REFRESHING THE BROWSER AND SET THE TABPANEL SELECTED TO "stbvc" /////

    			if(Sessions.getCurrent().getAttribute("stbSchemeChanged")!=null){  // STB SCHEME CHANGED
    				
    				System.out.println("STB Scheme changed !");
    				
    				Sessions.getCurrent().removeAttribute("stbSchemeChanged");
    				
    				Sessions.getCurrent().setAttribute("return",1);
    				
    				Executions.sendRedirect(null);  // RELOAD THE SAME PAGE....WORKING FINE.
    				
    				msg.setValue("STB Scheme updated successfully !");
    				
    				msg.setStyle("font-family: Verdana; color: #6E6E6E;font-size: 10px; font-weight:bold;");
    				
    			}else{ // STB SCHEME NOT CHANGED....
    				
    				System.out.println("Scheme not changed !");
    				
    				Sessions.getCurrent().setAttribute("return",1);
    				
    				Executions.sendRedirect(null);  // RELOAD THE SAME PAGE....WORKING FINE.
    				
    			}
   			
    		    /////  END - REFRESHING THE BROWSER AND SET THE TABPANEL SELECTED TO "stbvc" /////
    		
    	}catch(Exception e){
    		
    		if (e instanceof UiException){   // IF BROWSER IS REFRESHED WHILE MODAL WINDOW IS ALIVE....
				
				System.out.println("Browser being refreshed while STB Scheme Update modal window is alive...");

				throw e;
			
			}else{
					
				e.printStackTrace();
			
			}
			
			e.printStackTrace();
			
		}
    	
    }
    
    
    public void onClick$b_subbou() throws Exception{
    	
    	try{
    		
    		   msg.setValue(null);
    		   
    		   long currentSeconds = System.currentTimeMillis();
    		   
    		   saveStbVcInfo.setDisabled(true);
    		   
    		   saveVcBouquetInfo.setDisabled(true);
    		   
    		   saveVcChannelInfo.setDisabled(true);
    		   
    		   int _selectedBouquetIdForSubBouquetAssignment = (Integer) Sessions.getCurrent().getAttribute("selectedBouquetforSubBouquetOperation");
    		   
    		   BouquetmasterBean _bouquetmasterBean = bouquetBeanByIdTable.get(_selectedBouquetIdForSubBouquetAssignment);
    		   
    		   System.out.println("FETCHED BOUQUET NAME FOR SUB-BOUQUET OPERATION :	"+_bouquetmasterBean.getName());
    		   
    		   Sessions.getCurrent().removeAttribute("selectedBouquetforSubBouquetOperation");  // REMOVE THE ATTRIBUTE AND RE-SET AGAIN...
    		   
    		   Sessions.getCurrent().setAttribute("_selectedBouquetforSubBouquetOperation", _bouquetmasterBean);
    		   
    		   Window _subBouquetSelectionWindow = (Window)Executions.createComponents("subBouquetSelection_dialog.zul", null , null); // MODAL WINDOW FOR SELECTING SUB-BOUQUET-NAME.
   			
    		   _subBouquetSelectionWindow.doModal();
   			
   			   System.out.println("BACK FROM SUB-BOUQUET SELECTION MODAL WINDOW!");
    		  
   			   b_subbou.setDisabled(true);
   			   
   			   
   			   ////   START FETCHING REQUIRED SESSION VALUES ////
   			   
   			   /* int _subscriberId = (Integer) Sessions.getCurrent().getAttribute("subscriber");
   			   
   			   String _selectedAssignedVc = Sessions.getCurrent().getAttribute("selectedVCforSubBouquetTran").toString();
   			   
   			   System.out.println("SESSION VALUE 1 (SUBSCRIBER ID): "+_subscriberId);	 // 2515
   			   
   			   System.out.println("SESSION VALUE 2 (VCNUMBER): "+_selectedAssignedVc);   // 1000100050380555
   			   
   			   System.out.println("SESSION VALUE 3 (SUB-BOUQUET): "+(SubbouquetchannelbindBean) Sessions.getCurrent().getAttribute("selectedSubBouquet")); // _SCPL PLATINUM PLUS
   			   
   			   */
   			   
   			   ////   END FETCHING REQUIRED SESSION VALUES ////
   			   
   			  if(Sessions.getCurrent().getAttribute("subscriber")!= null && Sessions.getCurrent().getAttribute("selectedVCforSubBouquetTran")!=null && Sessions.getCurrent().getAttribute("selectedSubBouquet")!=null){ 
   				   
   				   System.out.println("ALL REQUIRED SESSION VALUES FETCHED...");
   				   
   	   			   if(Sessions.getCurrent().getAttribute("selectedSubBouquet")!= null){  // PROVIDE OPTION TO SELECT CHANNELS... 
   	   				   
   	   				  // START - FETCH THE LIST OF CHANNELS CORRESPONDING TO THE selectedSubBouquet //
   	   				  
   	   				  SubbouquetchannelbindBean _selected = (SubbouquetchannelbindBean) Sessions.getCurrent().getAttribute("selectedSubBouquet");
   	   				   
   	   				  // System.out.println("Fetch channel list for Sub-Bouquet: "+_selected.getSubbouquetid());
   	   				  
   	   				  List<SubbouquetchannelbindBean> subbouquetchannelbindBeans = subbouquetchannelbindDAO.findChannelsBySubBouquetId(_selected.getSubbouquetid());
   	   				  
   	   				  // START FETCH DATA FROM "subscribersubbouquettran" TABLE //
   	   				  
   	   				  int _subscriberId = (Integer) Sessions.getCurrent().getAttribute("subscriber");
   					
   					  VcmasterBean[] _vcmasterBeans = vcmasterDAO.findByvcnumber(Sessions.getCurrent().getAttribute("selectedVCforBouquetBind").toString());
   					  
   					  Sessions.getCurrent().setAttribute("selectedVcIdForSubscriberSubBouquetTran", _vcmasterBeans[0].getId());
   	   				  
   	   				  subscribersubbouquettranBeans = subscribersubbouquettranDAO.find_subBouquet_ChannelList_modeIn(_subscriberId,_vcmasterBeans[0].getId(),_selected.getSubbouquetid());
   	   				  
   	   				  // System.out.println("subscribersubbouquettranBeans.size(): "+subscribersubbouquettranBeans.size());  // ???
   	   				  
   	   				  // END FETCH DATA FROM "subscribersubbouquettran" TABLE //
   	   				   
   	   				  if(subbouquetchannelbindBeans.size() > 0){
   	   					  
   	   					  ///////////////////////////////////////////////////
   	   					
   	   					  customBouquets.clear();

   	   					  customChannels.clear();

   	   					  removedatagridComponents();
   	   					  
   	   					  datagrid.setVisible(true);
   	   					
   	   					  searchLabel.setVisible(true);
   	   					
   	   					  searchName.setVisible(true);
   	   					
   	   					  searchQuery.setVisible(true);
   	   					
   	   					  search.setVisible(true);
   	   					  

   	   					  searchName.setDisabled(true);
   	 					
   	 					  searchQuery.setDisabled(true);
   	 					
   	 					  search.setDisabled(true);

   	   					  ////////////////////////////////////////////////////
   	   					  
   	   					  for(int i = 0; i < subbouquetchannelbindBeans.size(); i++){
   	   						  
   	   						   SubbouquetchannelbindBean currentBean = subbouquetchannelbindBeans.get(i);
   	   						   
   	   						   SubscribersubbouquettranBean currentDbBean = null;
   	   						   
   	   						   int channelIdOfCurrentRow = currentBean.getChannelid();
   	   						  
   	   						   boolean found = false;
   	   						   
   	   						   ////////////////////////// GRID CREATION /////////////////////////////////////////////////
   	   						   
   	   						   Row row = new Row();
   	   						   
   	   						   row.setValue(currentBean);
   	   						   
   	   						   Checkbox checkbox = new Checkbox();
   	   						   
   	   						   checkbox.addEventListener(Events.ON_CHECK,new EventListener<Event>() {

   								public void onEvent(Event arg0) throws Exception {
   									
   									saveBouquetSubBouquetInfo.setDisabled(false);  // ENABLE THE SAVE BOUQUET-SUBBOUQUET INFO BUTTON.
   									
   								}
   						
   	   							});
   	   						   
   	   						   
   	   						    Datebox stime = new Datebox(new Date(currentSeconds));
   	   						    Datebox etime = new Datebox();
   	   						    stime.setFormat("long+medium");
   	   						    etime.setFormat("long+medium");
   	   						    stime.setMold("rounded");
   	   						    etime.setMold("rounded");
   	   						    stime.setWidth("180px");
   	   						    etime.setWidth("180px");
   							
   							
   	   						    etime.addEventListener(Events.ON_CHANGE,new EventListener<Event>() {

   								public void onEvent(Event arg0) throws Exception {
   									
   									saveBouquetSubBouquetInfo.setDisabled(false);  // ENABLE THE SAVE BOUQUET-SUBBOUQUET INFO BUTTON.
   									
   								}
   								
   	   						    });	
   	   						   
   	   						   
   	   						    row.appendChild(checkbox);
   	 						
   	   						    row.appendChild(new Label(channelBeanByIdTable.get(channelIdOfCurrentRow).getName()));
   	 						
   	   						    row.appendChild(stime);
   	 						
   	   						    row.appendChild(etime);
   	 						
   	   						    rows.appendChild(row);
   	   						    
   	   						   /////////////////////  END - GRID CREATION /////////////////////////////////////////////////
   	   						    
   	   						    for(int j = 0; j < subscribersubbouquettranBeans.size(); j ++){ 
   	   						    	
   	   						    	if(channelIdOfCurrentRow == subscribersubbouquettranBeans.get(j).getChannelid()){
   	   									
   	   									found = true;
   	   									
   	   									// System.out.println("YES...FOUND !");
   	   									
   	   									currentDbBean = subscribersubbouquettranBeans.get(j);
   	   									
   	   									break;
   	   									
   	   								}
   	   						    	
   	   						    }
   	   						    
   	   						    if(found){
   	 							
   	   						    	checkbox.setChecked(true);
   	 							
   	   						    	stime.setValue(currentDbBean.getSdate());
   	 							
   	   						    	etime.setValue(currentDbBean.getEdate());
   	 							
   	   						    }
   	   					  
   	   					  }
   	   					  
   	   				  }else{ // SUBBOUQUET HAS NO CHANNELS...
   	   					  
   	   					  System.out.println("SUBBOUQUET HAS NO CHANNELS...");
   	   					  
   	   				  }
   	   				  
   	   				  // END - FETCH THE LIST OF CHANNELS CORRESPONDING TO THE selectedSubBouquet // 
   	   				   
   	   			   }else{
   	   				   
   	   				   // System.out.println("NOTHING TO DO...");
   	   				   
   	   			   }
   				   
   			   }else{
   				   
   				   
   				   System.out.println("ALL REQUIRED SESSION VALUES NOT FETCHED...");
   				   
   				   //  MESSAGE BOX;
   				   
   				   
   			   }
    		
    	}catch(Exception e){
    		
    		if (e instanceof UiException){   // IF BROWSER IS REFRESHED WHILE MODAL WINDOW IS ALIVE....
				
				System.out.println("Browser being refreshed while Sub-Bouquet selection modal window is alive...");

				throw e;
			
			}else{
					
				e.printStackTrace();
			
			}
			
			e.printStackTrace();
    		
    	}
    	
    }
    
    
    public void onClick$saveBouquetSubBouquetInfo() throws Exception{
    	
    	DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
    	
    	Connection conn = dbDatabaseHandler.getConnection();
    	
    	//Convert today's date to SQL Date
    	
    	Date todaysDate = new Date();
    	
    	SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
    	
    	String BouquetSubBouquetAssignDate = fmt.format(todaysDate);
    	
    	java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(BouquetSubBouquetAssignDate));
    	
    	try{
    			
    			msg.setValue(null);
    	    	
    			saveBouquetSubBouquetInfo.setDisabled(true);   // DISABLE THE SAVE BOUQUET-SUBBOUQUET INFO BUTTON.	
    			
    			customChannels = fetchSelectedChannelsForSubscriberSubBouquettran();
    			
    			//////////////////////  START - TEST WHETHER ALL REQUIRED VALUES ARE FETCHED PROPERLY ///////////////////////////////
    			
    			int _subscriberId = (Integer) Sessions.getCurrent().getAttribute("subscriber");
    			
    			BouquetmasterBean _bouquetmasterBean = (BouquetmasterBean) Sessions.getCurrent().getAttribute("_selectedBouquetforSubBouquetOperation");
    			
    			int _vcId = (Integer) Sessions.getCurrent().getAttribute("selectedVcIdForSubscriberSubBouquetTran");
    			
    			SubbouquetchannelbindBean _subbouquetchannelbindBean = (SubbouquetchannelbindBean) Sessions.getCurrent().getAttribute("selectedSubBouquet");
    			
    			System.out.println("1.	SUBSCRIBER ID FOR SUBSCRIBER SUB-BOUQUET TRAN: "+_subscriberId); // 2515
    			
    			System.out.println("2.	BOUQUET ID FOR SUBSCRIBER SUB-BOUQUET TRAN: "+_bouquetmasterBean.getId()); // 5
    			
    			System.out.println("3.	SUB-BOUQUET ID FOR SUBSCRIBER SUB-BOUQUET TRAN: "+_subbouquetchannelbindBean.getSubbouquetid()); // 3
    			
    			System.out.println("4.	VCID FOR SUBSCRIBER SUB-BOUQUET TRAN: "+_vcId); // 2919
    			
    			////////////////////  END - TEST WHETHER REQUIRED VALUES ARE FETCHED PROPERLY ////////////////////////////////////////////////////
    			
    			SubscribersubbouquettranInfoUpdateHelper subscribersubbouquettranInfoUpdateHelper = new SubscribersubbouquettranInfoUpdateHelper();
    			
    			subscribersubbouquettranInfoUpdateHelper.processInformation(_subscriberId,_bouquetmasterBean,_vcId,_subbouquetchannelbindBean,customChannels,conn);
    			
    			conn.commit();     // FINAL COMMIT FOR BOUQUET/SUB-BOUQUET.
	            
	            msg.setValue(null);
	            
	            disableFields3();
	            
	            Sessions.getCurrent().removeAttribute("_selectedBouquetforSubBouquetOperation");
	            
	           // Sessions.getCurrent().removeAttribute("selectedVCforSubBouquetTran");
	            
	           // Sessions.getCurrent().removeAttribute("selectedVcIdForSubscriberSubBouquetTran");
	            
	            Sessions.getCurrent().removeAttribute("selectedSubBouquet");
	            
	          	Messagebox.show("Sub-Bouquet information updated successfully!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
    		
    	}catch(Exception e){
    		
    		conn.rollback();
	    	
	    	msg.setValue("Error processing request ! ");
	    	
	    	msg.setStyle("font-weight:bold;color:red;");
	    	
	    	saveBouquetSubBouquetInfo.setDisabled(true);  // DISABLE THE SAVE BOUQUET-SUBBOUQUET INFO BUTTON.	
	    	
	    	e.printStackTrace();
    		
    	}finally{
	    	
    		dbDatabaseHandler.closeConnection();
    		
    	}
    	
    	
    }


	private List<CustomChannel> fetchSelectedChannelsForSubscriberSubBouquettran() {
		
		List<CustomChannel> listSelectedChannels = new ArrayList<CustomChannel>();
		
		try{
				
				List<Component> rows =   datagrid.getRows().getChildren();
				
				for(int i =0 ; i < rows.size();i++){
				
					Row row = (Row) rows.get(i);
					
					Checkbox checkbox = (Checkbox) row.getChildren().get(0);
					
					if(checkbox.isChecked()){
						
						CustomChannel channel = new CustomChannel();
						
						channel.setChannelId(((SubbouquetchannelbindBean) row.getValue()).getChannelid());
						
						Label channelName = (Label) row.getChildren().get(1);
						
						Datebox sdate = (Datebox) row.getChildren().get(2);
						
						Datebox edate = (Datebox) row.getChildren().get(3);
						
						channel.setStime(sdate.getValue());
						
						channel.setEtime(edate.getValue());
						
						listSelectedChannels.add(channel);
						
					}else{
						
						saveBouquetSubBouquetInfo.setDisabled(true);
						
					}
				}	
					
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return listSelectedChannels;
	}
    
	
}
