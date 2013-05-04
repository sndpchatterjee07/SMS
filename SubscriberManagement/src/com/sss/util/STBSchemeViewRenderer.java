package com.sss.util;

import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.sss.core.bean.SchememasterBean;
import com.sss.core.bean.SettopboxmasterBean;

public class STBSchemeViewRenderer implements ListitemRenderer {
	
	SettopboxmasterBean _settopboxmasterBean = (SettopboxmasterBean)Sessions.getCurrent().getAttribute("_selectedSTBforSchemeUpdate");
	
	int stbSchemeId = 0;
	
	public void init(){
		
		try{
				// System.out.println("init() method called...");
			
				if(_settopboxmasterBean != null ){
					
					// System.out.println("INSIDE IF...");
				
					stbSchemeId = _settopboxmasterBean.getSchemeid();
				
				}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	

	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		
		try{
					
				SchememasterBean schememasterBean = (SchememasterBean) arg1;
				
				new Listcell().setParent(arg0);
				
				new Listcell(schememasterBean.getName()).setParent(arg0);
				
				new Listcell(String.format("%.2f",schememasterBean.getRate())).setParent(arg0);
			
				arg0.setValue(schememasterBean);
				
				
				if(stbSchemeId!=0){
					
					if(stbSchemeId == schememasterBean.getId()){
						
						//System.out.println("Set the selected item...");
						
						arg0.setSelected(true);
						
					}
					
				}
				
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

}
