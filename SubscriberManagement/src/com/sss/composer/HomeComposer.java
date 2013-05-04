package com.sss.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Image;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;

public class HomeComposer extends GenericForwardComposer{

	
	
	private static final long serialVersionUID = -1970845316494767888L;
	
	
	Tabbox tb;
	
	Tabpanel basic;
	
	Image logout;
	
	

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		
		try{
				if(Sessions.getCurrent().getAttribute("logininfo")==null){
					
					// System.out.println("Login Required...");
					
					Executions.getCurrent().sendRedirect("../login.zul");
				
				}else{
					
					
				}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public void onCreate$main(){
		
		try{
				
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void onSelect$tb(ForwardEvent fe) {
	
			try{
					
				
				
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
	
	}
	
	
	public void onClick$logout(){
		
		try{

			    Sessions.getCurrent().invalidate();
			    
	            Executions.getCurrent().sendRedirect("../login.zul");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
}
