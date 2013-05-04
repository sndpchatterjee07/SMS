package com.sss.composer;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.SchememasterBean;
import com.sss.core.bean.SettopboxmasterBean;
import com.sss.core.bean.UsermasterBean;
import com.sss.core.dao.SchememasterDAO;
import com.sss.core.dao.SettopboxmasterDAO;
import com.sss.core.database.DatabaseHandler;
import com.sss.util.STBSchemeViewRenderer;

public class STBSchemeUpdateDialogController extends GenericForwardComposer {

	private static final long serialVersionUID = 2629538189994543541L;
	
	private Window _modalDialog;
	
	private Button closeBtn;
	
	private Listbox listbox;
	
	SchememasterDAO schememasterDAO = new  SchememasterDAO();
	
	SettopboxmasterDAO settopboxmasterDAO = new SettopboxmasterDAO();
	
	ArrayList<SchememasterBean> schememasterBeans = new ArrayList<SchememasterBean>();
	
	STBSchemeViewRenderer stbSchemeViewRenderer = new STBSchemeViewRenderer();

	
	
	public void onClick$closeBtn() throws Exception{  // UPDATE STB-SCHEME OPERATION.
		
		DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
	    
		Connection conn = dbDatabaseHandler.getConnection();
		
		//Convert today's date to SQL Date
		Date todaysDate = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String STBSchemeUpdateDate = fmt.format(todaysDate);
		java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(STBSchemeUpdateDate));
		
		try{
				
				closeBtn.setDisabled(true);    // DISABLE THE SAVE BUTTON.
				
				SchememasterBean schememasterBean = listbox.getSelectedItem().getValue();
				
				// System.out.println(schememasterBean.getId());
				
				SettopboxmasterBean settopboxmasterBean = (SettopboxmasterBean) Sessions.getCurrent().getAttribute("_selectedSTBforSchemeUpdate");
				
				int currentlyLoggedInUserId = ((UsermasterBean) (session.getAttribute("logininfo"))).getId();
				
				// System.out.println("STB SCHEME MODIFIED BY: " + currentlyLoggedInUserId);
				
				settopboxmasterBean.setSchemeid(schememasterBean.getId());
				
				settopboxmasterBean.setModifyby(currentlyLoggedInUserId);
				
				settopboxmasterBean.setModifydate(TodaysDate);
				
				settopboxmasterDAO.updateSTBScheme(settopboxmasterBean,conn);
				
				conn.commit();         // FINAL COMMIT FOR STB SCHEME UPDATE.
				
				Sessions.getCurrent().removeAttribute("_selectedSTBforSchemeUpdate");
				
				Sessions.getCurrent().setAttribute("stbSchemeChanged", true);  // FLAG TO TRACK WHETHER STB SCHEME CHANGED OR NOT.
				
				// Messagebox.show("STB Scheme updated successfully!", "Warning", Messagebox.OK, Messagebox.INFORMATION);
				
				_modalDialog.detach();
				
		}catch(Exception e){
			
			conn.rollback();
			
			e.printStackTrace();
			
		}finally{
	    	
	    	dbDatabaseHandler.closeConnection();
	    }
		
	}
	
	
	
	
	public void onSelect$listbox(){
		
		try{
			
			  closeBtn.setDisabled(false);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		try{
				
				System.out.println("SELECTED STB'S SCHEME ID :"+((SettopboxmasterBean)Sessions.getCurrent().getAttribute("_selectedSTBforSchemeUpdate")).getSchemeid());
			
				schememasterBeans =  schememasterDAO.fetchActiveSTBSchemes();
			
				ListModelList listModelList = new  ListModelList(schememasterBeans);
			
				listbox.setModel(listModelList);
				
				stbSchemeViewRenderer.init();
			
				listbox.setItemRenderer(stbSchemeViewRenderer);
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
	
	

}
