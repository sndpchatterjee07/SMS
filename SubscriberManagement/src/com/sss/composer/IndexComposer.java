package com.sss.composer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;
import org.zkoss.zul.ComboitemRenderer;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.LcomasterBean;
import com.sss.core.bean.SubscribermasterBean;
import com.sss.core.bean.UsermasterBean;
import com.sss.core.dao.LcomasterDAO;
import com.sss.core.dao.SubscribermasterDAO;
import com.sss.core.database.DatabaseHandler;

public class IndexComposer extends GenericForwardComposer{

	private static final long serialVersionUID = 633395391422236472L;
	
	
	Window main;
	Combobox cmblco;
	Button b_load,b_edit,b_new;
	
	// SEARCH SUBSCRIBER //
	Label searchLabel;
	Combobox searchName;
	Textbox searchQuery;
	Button search;
	// SEARCH SUBSCRIBER //
	
	Listbox l_lco;
	LcomasterDAO lcomasterDAO = new LcomasterDAO();
	SubscribermasterDAO subscribermasterDAO = new SubscribermasterDAO();
	
	
	
	DatabaseHandler databaseHandler = DatabaseHandler.getNewInstance();
	
	Connection connection = null ;
	
	PreparedStatement preparedStatement = null;
	
	private int startFetchRow = 0 ;
	
	private int endFetchRow =	99999 ;
	
	private int dataviewsize = 100000;
	
	int lcoid;
	
	public void onCreate$main(){
		
		Session session = Sessions.getCurrent();
		l_lco.setVisible(false);
		b_edit.setDisabled(true);
				
		try{
				
			if(connection == null){
				
				connection = databaseHandler.getConnection();
				
			}
		
			preparedStatement = connection.prepareStatement(sql());
			
			int lcoid = ((UsermasterBean) (session.getAttribute("logininfo"))).getLcoid();
			
			if(lcoid==0){
				
				LcomasterBean lcomasterBean[] = lcomasterDAO.findAll();

				cmblco.setModel(new ListModelList(lcomasterBean));
				
				cmblco.setItemRenderer(new ComboitemRenderer() {

					public void render(Comboitem item, Object data, int index)
							throws Exception {
						
						
						LcomasterBean lcomasterBean = (LcomasterBean) data;
						
						item.setValue(lcomasterBean);
						
						item.setLabel(lcomasterBean.getName());
						
					}
				});
				
				
			}else{
				
				List<LcomasterBean> lcomasterBeans = new ArrayList<LcomasterBean>();
				
				LcomasterBean lcomasterBean = lcomasterDAO.findByid(lcoid);
				
				lcomasterBeans.add(lcomasterBean);
				
				cmblco.setModel(new ListModelList(lcomasterBeans));
				
				cmblco.setItemRenderer(new ComboitemRenderer() {

					public void render(Comboitem item, Object data, int index)
							throws Exception {
						
						
						LcomasterBean lcomasterBean = (LcomasterBean) data;
						
						item.setValue(lcomasterBean);
						
						item.setLabel(lcomasterBean.getName());
						
					}
				});
				
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public void onClick$search(){
		
		String searchString = null ;
		
		try{
			
				if(searchName.getSelectedItem() == null){
					
					alert("Enter some Search Type !");
					
				}else if(searchName.getSelectedItem().getLabel().equals("Name")){
					
					System.out.println("Search by Subscriber Name...");
					
					searchString = searchQuery.getValue();
					
					//System.out.println("Search String: "+searchString);
					
					//System.out.println("LCO ID:"+lcoid);
					
					List<SubscribermasterBean> subscribermasterBeans = subscribermasterDAO.searchBySubscriberName(lcoid,searchString);
					
					// System.out.println("Searched Subscriber List Size: "+subscribermasterBeans.size());
					
					l_lco.setModel(new ListModelList(subscribermasterBeans));
					
					l_lco.setItemRenderer(new ListitemRenderer() {

						public void render(Listitem listItem, Object data ,int index)
								throws Exception {
							
							final SubscribermasterBean subscriberBean = (SubscribermasterBean) data;
							
							listItem.setValue(subscriberBean);
							
							new Listcell(subscriberBean.getCode()).setParent(listItem);
							
							new Listcell(subscriberBean.getName()).setParent(listItem);
							
							String value = getRow(subscriberBean.getId());
							
							if(value != null){
								
								String values[] = value.split("-");
								
								new Listcell(values[0]).setParent(listItem);
								
								new Listcell(values[1]).setParent(listItem);
								
							}else{
								
								new Listcell("").setParent(listItem);
								
								new Listcell("").setParent(listItem);
								
							}
							
						}
					
					});	
					
				}else if(searchName.getSelectedItem().getLabel().equals("Code")){
					
					System.out.println("Search by Subscriber Code...");
					
					searchString = searchQuery.getValue();
					
					//System.out.println("Search String: "+searchString);
					
					//System.out.println("LCO ID:"+lcoid);
					
					List<SubscribermasterBean> subscribermasterBeans = subscribermasterDAO.searchBySubscriberCode(lcoid,searchString);
					
					//System.out.println("Searched Subscriber List Size: "+subscribermasterBeans.size());
					
					l_lco.setModel(new ListModelList(subscribermasterBeans));
					
					l_lco.setItemRenderer(new ListitemRenderer() {

						public void render(Listitem listItem, Object data ,int index)
								throws Exception {
							
							final SubscribermasterBean subscriberBean = (SubscribermasterBean) data;
							
							listItem.setValue(subscriberBean);
							
							new Listcell(subscriberBean.getCode()).setParent(listItem);
							
							new Listcell(subscriberBean.getName()).setParent(listItem);
							
							String value = getRow(subscriberBean.getId());
							
							if(value != null){
								
								String values[] = value.split("-");
								
								new Listcell(values[0]).setParent(listItem);
								
								new Listcell(values[1]).setParent(listItem);
								
							}else{
								
								new Listcell("").setParent(listItem);
								
								new Listcell("").setParent(listItem);
								
							}
							
						}
						
					});
				}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		searchQuery.setValue("");
	}
	
	
	
	public void onClick$b_new(){
		
		try {
				if(cmblco.getSelectedItem()!=null){
					
					
					Sessions.getCurrent().removeAttribute("subscriber");
					
					Sessions.getCurrent().removeAttribute("selectedSubscriber");
				
					Executions.sendRedirect("Subscriber.zul");
					
				}else{
					
					Messagebox.show("Select LCO", "Information", Messagebox.OK, Messagebox.INFORMATION);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void onClick$b_edit(){
		
		try{

				if(cmblco.getSelectedItem()==null){
					
					Messagebox.show("Select Subscriber !", "Information", Messagebox.OK, Messagebox.INFORMATION);
					
				}else{
					
					Executions.sendRedirect("Subscriber.zul");
				}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public void onChange$cmblco(){
		
		lcoid =((LcomasterBean)(cmblco.getSelectedItem().getValue())).getId();
		
		Sessions.getCurrent().setAttribute("currentLcoid",lcoid);
		
	
	}
	
	public void onClick$next() throws Exception{
		
		startFetchRow = startFetchRow + dataviewsize ;
		
		endFetchRow   = endFetchRow + dataviewsize ;
		
		loadData() ;
		
	}
	
	public void onClick$prev() throws Exception{
		
		if(startFetchRow >= 100){
			
			startFetchRow = startFetchRow - dataviewsize ;
			
			endFetchRow   = endFetchRow   - dataviewsize ;
			
			loadData() ;
			
		}
				
	}
	
	public void loadData() throws Exception{
		
		try {

			
			List<SubscribermasterBean> subscriberBeans = subscribermasterDAO.findAllByLco(startFetchRow,endFetchRow,lcoid);
		
			l_lco.setModel(new ListModelList(subscriberBeans));

			l_lco.setItemRenderer(new ListitemRenderer() {				
				
				public void render(Listitem listItem, Object data ,int index) throws Exception {
					
					final SubscribermasterBean subscriberBean = (SubscribermasterBean) data;
					
					listItem.setValue(subscriberBean);	
					
					new Listcell(subscriberBean.getCode()).setParent(listItem);
					
					new Listcell(subscriberBean.getName()).setParent(listItem);
					
					//System.out.println("Testing purpose: "+subscriberBean.getId());
					
					String value = getRow(subscriberBean.getId());
										
					if(value != null){
						
						String values[] = value.split("-");
						
						new Listcell(values[0]).setParent(listItem);
						
						new Listcell(values[1]).setParent(listItem);
						
					}else{
						
						new Listcell("").setParent(listItem);
						
						new Listcell("").setParent(listItem);
					}
																		
				}
				
			});
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}

	
	public void onClick$b_load() throws Exception{
		
		if(cmblco.getSelectedItem()!=null){
			
			l_lco.setVisible(true);
			
			searchLabel.setVisible(true);
			
			searchName.setVisible(true);
			
			searchQuery.setVisible(true);
			
			search.setVisible(true);
			
			loadData();
			
		}else{
			
			Messagebox.show("Select LCO", "Information", Messagebox.OK, Messagebox.INFORMATION);

		}
	
	}
	
	
	public void onSelect$l_lco(){
		
		System.out.println("Selected Subscriber: "+l_lco.getSelectedItem().getValue());   // Selected Subscriber ID
		
		try {
				
				SubscribermasterBean subscribermasterBean = new SubscribermasterBean();
				
				subscribermasterBean = subscribermasterDAO.findByid(Integer.parseInt(l_lco.getSelectedItem().getValue().toString()));
				
				//System.out.println("Selected Subscriber Details: "+subscribermasterBean.getId()+ "," + subscribermasterBean.getCode());
				
				Sessions.getCurrent().setAttribute("subscriber", subscribermasterBean.getId());
				
				Sessions.getCurrent().setAttribute("selectedSubscriber", subscribermasterBean);
				
				b_edit.setDisabled(false);
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public String getRow(int subid){
		
		ResultSet resultSet = null;
		
		String returnValue = null;
				
		try{			
		
			preparedStatement.setInt(1,subid);		
		
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String stb = resultSet.getString("stb");
				 
				String vc = resultSet.getString("vc");
				
				returnValue =  stb+"-"+vc;
				
			}	
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
				
		return returnValue;
		
	}
		
	public String sql(){
		
		String sql= "select s3.id as subid, group_concat(distinct(s2.makenumber) ORDER BY s2.makenumber ASC SEPARATOR ' ') as stb," +
					"group_concat(distinct(v.vcnumber) ORDER BY v.vcnumber ASC SEPARATOR ' ') as vc " +
					"from subscribersettopboxbind s,settopboxvcbind s1,settopboxmaster s2,vcmaster v," +
					"subscribermaster s3" +
					" where  s.mode='i' and s1.mode='i' and s.settopbox_id=s1.settopboxid and " +
					"v.id=s1.vcid and  s1.settopboxid=s2.id and s3.id=s.subscriber_id and " +
					"s3.id=? group by s.subscriber_id ";
		
				
		return sql;
	
	}
	
}
                                    