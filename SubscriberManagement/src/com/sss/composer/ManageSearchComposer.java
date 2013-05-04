package com.sss.composer;

import java.util.ArrayList;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Div;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;


import com.sss.core.bean.UsermasterBean;
import com.sss.core.custom.bean.CustomStb;
import com.sss.core.custom.bean.CustomVc;
import com.sss.core.dao.SettopboxmasterDAO;
import com.sss.core.dao.VcmasterDAO;
import com.sss.util.CustomStbViewRenderer;
import com.sss.util.CustomVcViewRenderer;


public class ManageSearchComposer extends GenericForwardComposer{

	private static final long serialVersionUID = 629934770145592656L;
	
	Div _stbdiv,_vcdiv;
	Listbox _stblistbox,_vclistbox;
	Textbox s1,s2;
	Button sb1,sb2;
	private int currentlyLoggedInUserId = 0;
	
	
	SettopboxmasterDAO settopboxmasterDAO = new SettopboxmasterDAO();
	VcmasterDAO vcmasterDAO = new VcmasterDAO();
	
	
	public void onCreate$main(){
		
		try{
				//System.out.println("Inside ManageSearchComposer main()...");
				
				System.out.println("Logged in User Id: " + currentlyLoggedInUserId);
				
				_stbdiv.setVisible(false);
				
				_vcdiv.setVisible(false);
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}

	
	public void onClick$sb1(){
		
		try{
			
			     _vcdiv.setVisible(false);
			     
			     _stbdiv.setVisible(true);
			     
			     CustomStb customStb  = settopboxmasterDAO.fetchStbDetailsByMakeNumber(s1.getValue().trim());
			     
			     System.out.println("Details of STB No. #"+ s1.getValue().trim() +": "+customStb.getModelnumber());
			     
			     if(customStb != null){
			    	 
			    	 ArrayList<CustomStb> customStbs = new ArrayList<CustomStb>();
			     
			    	 customStbs.add(customStb);
			    	 
			    	 ListModelList customstbModel = new ListModelList(customStbs); 
					     
					 _stblistbox.setModel(customstbModel);  										// SET MODEL.
					     
					 CustomStbViewRenderer customStbViewRenderer = new CustomStbViewRenderer(); 	// CREATE RENDERER.
					     
					 _stblistbox.setItemRenderer(customStbViewRenderer);				            // ASSIGN RENDERER TO LISTBOX.
			    	 
			     }
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

	
	
	public void onClick$sb2(){
		
		try{
			
			      _stbdiv.setVisible(false);
			      
				  _vcdiv.setVisible(true);
				  
				  CustomVc customVc = vcmasterDAO.fetchVcDetailsByVcNumber(s2.getValue().trim());
				  
				  System.out.println("Details of VC No. #"+ s2.getValue().trim() +": "+customVc.getVcnumber());
				  
				  if(customVc != null){
					  
					  ArrayList<CustomVc> customVcs = new ArrayList<CustomVc>();
					  
					  customVcs.add(customVc);
					  
					  ListModelList customvcModel = new ListModelList(customVcs); 
					  
					  _vclistbox.setModel(customvcModel);  										// SET MODEL.
					  
					  CustomVcViewRenderer customVcViewRenderer = new CustomVcViewRenderer();   // CREATE RENDERER.
					  
					  _vclistbox.setItemRenderer(customVcViewRenderer);				            // ASSIGN RENDERER TO LISTBOX.
				  
				  }
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	


	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		try{
				
				if(Sessions.getCurrent().getAttribute("logininfo") != null){
					
					currentlyLoggedInUserId = ((UsermasterBean) (Sessions.getCurrent().getAttribute("logininfo"))).getId();
					
				}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
	
	

}
