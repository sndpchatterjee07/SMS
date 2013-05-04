package com.sss.util;

import java.util.Hashtable;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.sss.core.bean.CasmasterBean;
import com.sss.core.custom.bean.CustomVc;
import com.sss.core.dao.CasmasterDAO;

public class CustomVcViewRenderer implements ListitemRenderer{
	
	
    Hashtable<Integer,CasmasterBean> casBeanByIdTable = new Hashtable<Integer, CasmasterBean>();	// ACTIVE CasmasterBean CORRESPONDING TO A PARTICULAR CAS ID IN "casBeanByIdTable".
	
	CasmasterDAO casmasterDAO = new CasmasterDAO();
	
	

	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		
		try{
				CustomVc customVc = (CustomVc) arg1;
				
				System.out.println("OBJECT REFERENCE..."+customVc);  // If no VC found in DB, null
				
				if(customVc != null ){

					// 1. Vcnumber.
					
					Listcell vcnumberListCellRef = new Listcell(customVc.getVcnumber());
					
					vcnumberListCellRef.setParent(arg0);
					
					
					// 2. CAS Name.
					
				  	fetchActiveCasDetails();
				  	
				  	if(customVc.getCasId() != 0){ 
					
				  		Listcell casidListCellRef = new Listcell(casBeanByIdTable.get(customVc.getCasId()).getName());
					
				  		casidListCellRef.setParent(arg0);
				  	}
					
				    // 3. Status.
				  	
				  	if(customVc.getStatus() != null ){
				  		
				  		if(customVc.getStatus().equals("u")){
							
							   Listcell vcstatusListCellRef = new Listcell("Unassigned");
							   
							   vcstatusListCellRef.setParent(arg0);
							   
						}else if(customVc.getStatus().equals("a")){
							
							   Listcell vcstatusListCellRef = new Listcell("Assigned");
							   
							   vcstatusListCellRef.setParent(arg0);
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
			
				// 	System.out.println("Cas Details fectched : "+casBeanByIdTable.get(1));
			
			}

			//////// END - Fetch Active CasmasterBean's CORRESPONDING TO A PARTICULAR CAS ID IN "casBeanByIdTable". ///
	
		}catch(Exception e){
		
			e.printStackTrace();
		}
		
	}

}
