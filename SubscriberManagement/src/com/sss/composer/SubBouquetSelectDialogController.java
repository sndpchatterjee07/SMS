package com.sss.composer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.BouquetmasterBean;
import com.sss.core.bean.SubbouquetchannelbindBean;
import com.sss.core.dao.SubbouquetchannelbindDAO;
import com.sss.util.SubBouquetViewRenderer;

public class SubBouquetSelectDialogController extends GenericForwardComposer {

	
	private static final long serialVersionUID = 8769107590603594678L;
	
	private Window _subBouquetSelectionWindow;
	
	private Button closeBtn;
	
	private Listbox listbox;
	
	SubbouquetchannelbindDAO subbouquetchannelbindDAO = new SubbouquetchannelbindDAO();
	
	ArrayList<SubbouquetchannelbindBean> subbouquetchannelbindBeans = new ArrayList<SubbouquetchannelbindBean>();
	
	SubBouquetViewRenderer subBouquetViewRenderer = new SubBouquetViewRenderer();

	Hashtable<String,SubbouquetchannelbindBean> subBouquetBeanBysubBouquetNameTable = new Hashtable<String,SubbouquetchannelbindBean>();	// SubbouquetchannelbindBean CORRESPONDING TO A PARTICULAR SUB-BOUQUETNAME.
	
	
	
	public void onSelect$listbox(){
		
		try{
			
			  closeBtn.setDisabled(false);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public void onCreate$_subBouquetSelectionWindow(){
		
		try{
				
				closeBtn.setDisabled(true);
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void onClick$closeBtn(){
		
		try{
				 
			    SubbouquetchannelbindBean _subbouquetchannelbindBean = subBouquetBeanBysubBouquetNameTable.get(listbox.getModel().getElementAt(listbox.getSelectedIndex()).toString()); 
			
				// System.out.println("SELECTED SUB-BOUQUET ID:"+_subbouquetchannelbindBean.getSubbouquetid());
			
				Sessions.getCurrent().setAttribute("selectedSubBouquet", _subbouquetchannelbindBean); 
				
				_subBouquetSelectionWindow.detach();
				
				subBouquetBeanBysubBouquetNameTable.clear();  // CLEAR THE HASHTABLE ON WINDOW DETACH.
				
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		try{
			   BouquetmasterBean _bouquetmasterBean  =  (BouquetmasterBean) Sessions.getCurrent().getAttribute("_selectedBouquetforSubBouquetOperation");
			
			   subbouquetchannelbindBeans = subbouquetchannelbindDAO.findBybouquetidAndStatus(_bouquetmasterBean.getId(),"a");
			   
			   ListModelList listModelList = new  ListModelList(subbouquetchannelbindBeans);
				
			   listbox.setModel(listModelList);
				
			   listbox.setItemRenderer(subBouquetViewRenderer);
			   
			   
			   
			   // Fetch SubbouquetchannelbindBean's CORRESPONDING TO A PARTICULAR SUB-BOUQUETNAME.
			   
			   List<SubbouquetchannelbindBean> _subbouquetchannelbindBeans = subbouquetchannelbindDAO.findAllSubBouquets();
			   
			   for(SubbouquetchannelbindBean bean : _subbouquetchannelbindBeans){
				   
				    subBouquetBeanBysubBouquetNameTable.put(bean.getSubbouquetname(), bean);
				   
			   }
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	

}
