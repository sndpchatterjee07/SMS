package com.sss.composer;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Image;
import org.zkoss.zul.Include;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;

public class SubscriberComposer extends GenericForwardComposer {

	private static final long serialVersionUID = -3813943839803811681L;
	
	Tabbox tb;
	
	Tabpanel basic;
	
	Tabpanel stbvc;
	
	Include inc2;
	
	Image home,logout;
	
	
	
	public void onCreate$main(){
		
		try{
				Object var = Sessions.getCurrent().getAttribute("return");
			
				if(var!= null){
					
					tb.setSelectedPanel(stbvc);
					
					inc2.setSrc("stbvc.zul");
					
				}
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	public void onClick$home(){
		
		try{
				//alert("Home Clicked !");

				//Executions.getCurrent().sendRedirect("index.zul");
			
			     Executions.getCurrent().sendRedirect("home.zul");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	public void onClick$logout(){
		
		try{
				
				//alert("Logout Clicked !");
			    Sessions.getCurrent().invalidate();
			    
	            Executions.getCurrent().sendRedirect("../login.zul");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
	
	public void onSelect$tb(ForwardEvent fe) {
		
			try{
					Object o = fe.getOrigin().getTarget();
					
					if (o instanceof Tab) {
						
						Tab t = (Tab)o;
						
						Tabpanel tp = t.getLinkedPanel();
						
						tp.invalidate();
						
						if((tp.getId().equals("stbvc") && (Sessions.getCurrent().getAttribute("subscriber")==null))){
							
							Messagebox.show("Create Subscriber first,then assign STB/VC!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
							
							tb.setSelectedPanel(basic);
							
						}else{
							
							inc2.setSrc("stbvc.zul");
							
							System.out.println("Subscriber ID set in session...");
						}
					}
			}catch(Exception e){
				e.printStackTrace();
			}
	}

}
