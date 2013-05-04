package com.sss.util;

import java.util.Hashtable;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.sss.core.bean.CasmasterBean;
import com.sss.core.custom.bean.CustomStb;
import com.sss.core.dao.CasmasterDAO;


public class CustomStbViewRenderer implements ListitemRenderer{
	
	
	Hashtable<Integer,CasmasterBean> casBeanByIdTable = new Hashtable<Integer, CasmasterBean>();	// ACTIVE CasmasterBean CORRESPONDING TO A PARTICULAR CAS ID IN "casBeanByIdTable".
	
	CasmasterDAO casmasterDAO = new CasmasterDAO();
	
	
	
	
	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		
		try{
			
				CustomStb customStb = (CustomStb) arg1;
				
				// System.out.println("OBJECT REFERENCE..."+customStb);  // If no STB found in DB, null
				  	
				if(customStb != null ){  	
				
				  	// 1. Makenumber.
				
				  	Listcell stbmakenumberListCellRef = new Listcell(customStb.getMakenumber());
				
				  	stbmakenumberListCellRef.setParent(arg0);
				
				
				  	// 	2. Modelnumber.
				
				  	Listcell stbmodelnumberListCellRef = new Listcell(customStb.getModelnumber());
				
				  	stbmodelnumberListCellRef.setParent(arg0);
				
				
				  	// 3. CAS Name.
				
				  	fetchActiveCasDetails();
				  	
				  	if(customStb.getCasId() != 0){ 
					
				  		Listcell casidListCellRef = new Listcell(casBeanByIdTable.get(customStb.getCasId()).getName());
					
				  		casidListCellRef.setParent(arg0);
				  	}		

				
					// 4. Status.
				  	
				  	if(customStb.getStatus() != null ){
				
							if(customStb.getStatus().equals("u")){
							
							   Listcell stbstatusListCellRef = new Listcell("Unassigned");
							   
							   stbstatusListCellRef.setParent(arg0);
							   
							}else if(customStb.getStatus().equals("a")){
							
							   Listcell stbstatusListCellRef = new Listcell("Assigned");
							   
							   stbstatusListCellRef.setParent(arg0);
							}
				  	}		
				}		
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}







	private void fetchActiveCasDetails() {
		
		try{
			
				CasmasterBean[] casmasterBeans = casmasterDAO.findBystatus("a");
			
				// System.out.println("casmasterBeans SIZE: "+ casmasterBeans.length);
			
				for(CasmasterBean casmasterBean : casmasterBeans){
				
					casBeanByIdTable.put(casmasterBean.getId(), casmasterBean);
				
					// System.out.println("Cas Details fectched : "+casBeanByIdTable.get(1));
				
				}

				//////// END - Fetch Active CasmasterBean's CORRESPONDING TO A PARTICULAR CAS ID IN "casBeanByIdTable". ///
		
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

}
