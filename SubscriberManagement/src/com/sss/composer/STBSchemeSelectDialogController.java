package com.sss.composer;

import java.util.ArrayList;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.SchememasterBean;
import com.sss.core.dao.SchememasterDAO;
import com.sss.util.STBSchemeViewRenderer;

public class STBSchemeSelectDialogController extends GenericForwardComposer {
	
	
	private static final long serialVersionUID = 3114166138779602893L;

	private Window modalDialog;
	
	private Button closeBtn;
	
	private Listbox listbox;
	
	SchememasterDAO schememasterDAO = new  SchememasterDAO();
	
	ArrayList<SchememasterBean> schememasterBeans = new ArrayList<SchememasterBean>();
	
	STBSchemeViewRenderer stbSchemeViewRenderer = new STBSchemeViewRenderer();
	


	
	public void onCreate$modalDialog(){
		
		
		try{
				closeBtn.setDisabled(true);
				
				
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
	}
	
	
	
	
	public void onSelect$listbox(){
		
		try{
			
			  closeBtn.setDisabled(false);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void onClick$closeBtn(){
		
		try{
			
					SchememasterBean schememasterBean = listbox.getSelectedItem().getValue();	
					
					// System.out.println("Inside Validate: "+schememasterBean.getId());
					
					Sessions.getCurrent().setAttribute("x", schememasterBean.getId());
					
					//Sessions.getCurrent().setAttribute("selectedScheme", schememasterBean);
					
					modalDialog.detach();
					
					//modalDialog.onClose();
					
					// modalDialog.setVisible(false);
							
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}


	/*private boolean validate() {
		
		boolean status = false;
		
		try{
			
			
				if(listbox.getSelectedCount() < 1 ){
				
					Messagebox.show("Please select a scheme !", "Warning", Messagebox.OK, Messagebox.EXCLAMATION);
					
					return status;
				}
			
				status = true;
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return status;
		
	}
*/

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		try{
				schememasterBeans =  schememasterDAO.fetchActiveSTBSchemes();
				
				ListModelList listModelList = new  ListModelList(schememasterBeans);
				
				listbox.setModel(listModelList);
				
				listbox.setItemRenderer(stbSchemeViewRenderer);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
