package com.sss.composer;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.AreamasterBean;
import com.sss.core.bean.BillcyclemasterBean;
import com.sss.core.bean.SubscribermasterBean;
import com.sss.core.bean.TaxcombinationmasterBean;
import com.sss.core.bean.UsermasterBean;
import com.sss.core.dao.AreamasterDAO;
import com.sss.core.dao.BillcyclemasterDAO;
import com.sss.core.dao.SubscribermasterDAO;
import com.sss.core.dao.TaxcombinationmasterDAO;
import com.sss.core.database.DatabaseHandler;

public class BasicComposer extends GenericForwardComposer{
	
	private static final long serialVersionUID = -5124831571112253914L;
	
	Window main;
	Grid datagrid,formValidationGrid;
	
	
	
	private Textbox fname,mname,lname,saf,phone,mobile,email;
	private Textbox house,floor,complex,side,colony,road,block,sector,city,district,state,pin; // Installation Address
	private Textbox billingaddress; // Billing Address
	private Textbox showValidationMessages;
	private Combobox area,bcycle,tax,status;
	private Checkbox useInstallationAddress;
	private Button Save,Reset;
	AreamasterDAO areamasterDAO = new AreamasterDAO();
	BillcyclemasterDAO billcyclemasterDAO = new BillcyclemasterDAO();
	TaxcombinationmasterDAO taxcombinationmasterDAO = new TaxcombinationmasterDAO();
	String installationAddress,billingAddress = null;
	SubscribermasterBean subscribermasterBean ;
	SubscribermasterBean selectedSubscribermasterBean = null;
	SubscribermasterDAO subscribermasterDAO = new SubscribermasterDAO();
	int generatedKey = 0;
	
	
	
	public void onCreate$main(){
	
		try{
				//if(Sessions.getCurrent().getAttribute("subscriber")!=null){
			  if((Sessions.getCurrent().getAttribute("subscriber")!=null) && (Sessions.getCurrent().getAttribute("selectedSubscriber")!=null)){

					selectedSubscribermasterBean = (SubscribermasterBean) Sessions.getCurrent().getAttribute("selectedSubscriber");
					
					fname.setValue(selectedSubscribermasterBean.getFirstname());
					
					mname.setValue(selectedSubscribermasterBean.getMiddlename());
					
					lname.setValue(selectedSubscribermasterBean.getLastname());
					
					/////////////////////////////////////////////////////////////////////////////
					AreamasterBean areamasterBean = areamasterDAO.findByid(selectedSubscribermasterBean.getAreaid());
					area.setValue(areamasterBean.getName());
					
					
					BillcyclemasterBean billcyclemasterBean = billcyclemasterDAO.findByid(selectedSubscribermasterBean.getBillcycleid());
					bcycle.setValue(billcyclemasterBean.getName());
					
					
					TaxcombinationmasterBean taxcombinationmasterBean = taxcombinationmasterDAO.findByid(selectedSubscribermasterBean.getTaxcombinationid());
					tax.setValue(taxcombinationmasterBean.getCode());
					
					
					if(selectedSubscribermasterBean.getStatus().equals("1")){
						status.setValue("Active");
	    			}
	    			
	    			if(selectedSubscribermasterBean.getStatus().equals("2")){
	    				status.setValue("Deactive");
	    			}
	    			
	    			if(selectedSubscribermasterBean.getStatus().equals("3")){
	    				status.setValue("Discontinue");
	    			}
	    			/////////////////////////////////////////////////////////////////////////////
					
					
					
					
					saf.setValue(selectedSubscribermasterBean.getSaff_no());
					
					phone.setValue(selectedSubscribermasterBean.getPhone());
					
					mobile.setValue(selectedSubscribermasterBean.getMobile());
					 
					email.setValue(selectedSubscribermasterBean.getEmail());
					
					house.setValue(selectedSubscribermasterBean.getHouseNo());
					
					floor.setValue(selectedSubscribermasterBean.getFloor());
					   
					complex.setValue(selectedSubscribermasterBean.getComplexName());
					
					side.setValue(selectedSubscribermasterBean.getSide());
					
					colony.setValue(selectedSubscribermasterBean.getColony());
					
					//road.setValue(selectedSubscribermasterBean.getRoad());
					
					block.setValue(selectedSubscribermasterBean.getBlockNo());
					
					sector.setValue(selectedSubscribermasterBean.getSector());
					
					city.setValue(selectedSubscribermasterBean.getCity());
					
					district.setValue(selectedSubscribermasterBean.getDistrict());
					
					state.setValue(selectedSubscribermasterBean.getState());
					
					pin.setValue(selectedSubscribermasterBean.getPin());
					
					billingaddress.setValue(selectedSubscribermasterBean.getBillingaddr());
					
				}else{
					
					System.out.println("New Form...");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	private void disableFormFields() {
		
		try{
			   fname.setDisabled(true);
			   mname.setDisabled(true);
			   lname.setDisabled(true);
			   area.setDisabled(true);
			   bcycle.setDisabled(true);
			   tax.setDisabled(true);
			   status.setDisabled(true);
			   saf.setDisabled(true);
			   phone.setDisabled(true);
			   mobile.setDisabled(true);
			   email.setDisabled(true);
			   house.setDisabled(true);
			   floor.setDisabled(true);
			   complex.setDisabled(true);
			   side.setDisabled(true);
			   colony.setDisabled(true);
			   road.setDisabled(true);
			   block.setDisabled(true);
			   sector.setDisabled(true);
			   city.setDisabled(true);
			   district.setDisabled(true);
			   state.setDisabled(true);
			   pin.setDisabled(true);
			   useInstallationAddress.setDisabled(true);
			   billingaddress.setDisabled(true);
			   showValidationMessages.setDisabled(true);
			   Save.setDisabled(true);
		}catch(Exception e){
			
			  e.printStackTrace();
		}
		
	}




	public void onClick$Reset(){
		try{
		   
			   fname.setValue(null);
			   mname.setValue(null);
			   lname.setValue(null);
			   area.setValue("Select");
			   bcycle.setValue("Select");
			   tax.setValue("Select");
			   status.setValue("Select");
			   saf.setValue(null);
			   phone.setValue(null);
			   mobile.setValue(null);
			   email.setValue(null);
			   house.setValue(null);
			   floor.setValue(null);
			   complex.setValue(null);
			   side.setValue(null);
			   colony.setValue(null);
			   road.setValue(null);
			   block.setValue(null);
			   sector.setValue(null);
			   city.setValue(null);
			   district.setValue(null);
			   state.setValue(null);
			   pin.setValue(null);
			   
			   useInstallationAddress.setChecked(false);
			   billingaddress.setValue(null);
			   showValidationMessages.setValue(null);
			   
			   
			   Save.setDisabled(false);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	public void onClick$useInstallationAddress(){
		if(useInstallationAddress.isChecked()){ // Billing Address is the same as Installation Address.
			billingaddress.setReadonly(true);
			billingaddress.setValue(house.getValue()+" "+floor.getValue()+" "+complex.getValue()+" "+side.getValue()+" "+colony.getValue()+" "+road.getValue()+" "+block.getValue()+" "+sector.getValue()+" "+city.getValue()+" "+district.getValue()+" "+state.getValue()+" "+pin.getValue());
		}else{                                // Billing Address and Installation Address are not same.
			billingaddress.setReadonly(false);
			billingaddress.setValue(billingaddress.getValue());
		}
	}


	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		try{
			   
				AreamasterBean[] areamasterBeans = areamasterDAO.findAll();
				ListModelList areaModel = new ListModelList(areamasterBeans);
				area.setModel(areaModel);
				
				BillcyclemasterBean[] billcyclemasterBeans = billcyclemasterDAO.findAll();
				ListModelList billCycleModel = new ListModelList(billcyclemasterBeans);
				bcycle.setModel(billCycleModel);
				
				
				TaxcombinationmasterBean[] taxcombinationmasterBeans = taxcombinationmasterDAO.findAll();
				ListModelList taxModel = new ListModelList(taxcombinationmasterBeans);
				tax.setModel(taxModel);
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void onClick$Save() throws Exception{
		
		DatabaseHandler dbDatabaseHandler = DatabaseHandler.getNewInstance();
	    Connection conn = dbDatabaseHandler.getConnection();
	    
	    try{ 
	    		if(!validate()){
	    			
	    			//System.out.println("after validate...");
	    			
	    			showValidationMessages.setVisible(true);
	    			
	    			
	    		}else{
	    			
	    			
	    			 if(Sessions.getCurrent().getAttribute("subscriber")==null){ // ADD NEW SUBSCRIBER DETAILS...
	    				 
	    				 	System.out.println("New Subscriber Create...");
	    			
	    					Save.setDisabled(true);
	    			
	    					subscribermasterBean = new SubscribermasterBean();
	    			
	    					Session session=Sessions.getCurrent();
	    					UsermasterBean usermasterBean =  (UsermasterBean) session.getAttribute("logininfo");
	    			
			    			// 1. First Name
			    			String firstName = fname.getValue();
			    			
			    			// 2. Middle Name
			    			String middleName = mname.getValue();
			    			
			    			// 3. Last Name.
			    			String lastName = lname.getValue();
			    			
			    			// 4. Area.
			    			String Area = area.getValue();
			    			AreamasterBean areamasterBean = (AreamasterBean)area.getSelectedItem().getValue();
			    			System.out.println(((AreamasterBean)area.getSelectedItem().getValue()).getId()+"  ");
			    			
			    			// 5. Bill Cycle.
			    			String billCycle = bcycle.getValue();
			    			BillcyclemasterBean billcyclemasterBean = (BillcyclemasterBean)bcycle.getSelectedItem().getValue();
			    			System.out.println(((BillcyclemasterBean)bcycle.getSelectedItem().getValue()).getId()+"  ");
			    			
			    			// 6. Tax Combination.
			    			String taxCombination = tax.getValue();
			    			TaxcombinationmasterBean taxcombinationmasterBean = (TaxcombinationmasterBean)tax.getSelectedItem().getValue();
			    			System.out.println(((TaxcombinationmasterBean)tax.getSelectedItem().getValue()).getId()+"  ");
			    			
			    			// 7. Status
			    			String Status = status.getValue();
	    			
			    			// 8. String SAF Number.
			    			String safNo = saf.getValue();
			    			
			    			
			    			// 9. Phone.
			    			String Phone = phone.getValue();
			    			
			    			// 10. Mobile.
			    			String Mobile = mobile.getValue();
			    			
			    			// 11. EMail
			    			String Email = email.getValue();
	    			
			    			///////////////////////////////////////////////////////////////////////////////////////////////
	    			
			    			subscribermasterBean.setFirstname(firstName);
			    			subscribermasterBean.setMiddlename(middleName);
			    			subscribermasterBean.setLastname(lastName);
			    			subscribermasterBean.setName(firstName+middleName+lastName);
			    			subscribermasterBean.setAreaid(((AreamasterBean)area.getSelectedItem().getValue()).getId());
			    			subscribermasterBean.setBillcycleid(((BillcyclemasterBean)bcycle.getSelectedItem().getValue()).getId());
			    			subscribermasterBean.setTaxcombinationid((((TaxcombinationmasterBean)tax.getSelectedItem().getValue()).getId()));
	    			
			    			if(Status.equals("Active")){
			    				subscribermasterBean.setStatus("1");
			    			}
			    			
			    			if(Status.equals("Deactive")){
			    				subscribermasterBean.setStatus("2");
			    			}
			    			
			    			if(Status.equals("Discontinue")){
			    				subscribermasterBean.setStatus("3");
			    			}
	    			
	    			
			    			subscribermasterBean.setSaff_no(safNo);
			    			subscribermasterBean.setPhone(phone.getValue());
			    			subscribermasterBean.setMobile(mobile.getValue());
			    			subscribermasterBean.setEmail(email.getValue());
			    			subscribermasterBean.setHouseNo(house.getValue());
			    			subscribermasterBean.setFloor(floor.getValue());
			    			subscribermasterBean.setComplexName(complex.getValue());
			    			subscribermasterBean.setSide(side.getValue());
			    			subscribermasterBean.setColony(colony.getValue());
			    			subscribermasterBean.setBlockNo(block.getValue());
			    			subscribermasterBean.setSector(sector.getValue());
			    			subscribermasterBean.setCity(city.getValue());
			    			subscribermasterBean.setDistrict(district.getValue());
			    			subscribermasterBean.setState(state.getValue());
			    			subscribermasterBean.setPin(pin.getValue());
			    			subscribermasterBean.setLcoid((Integer) session.getAttribute("currentLcoid"));
			    			
			    			System.out.println("LCO ID fetched from session..."+(Integer) session.getAttribute("currentLcoid"));
	    			
	    			
			    			//Convert today's date to SQL Date
							Date todaysDate = new Date();
							SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
							String CreationDate = fmt.format(todaysDate);
							java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(CreationDate));
	    			
	    			
							subscribermasterBean.setCreatedate(TodaysDate);
					
							// 12. Billing Address.
	    			
							if(useInstallationAddress.isChecked()==true){ // Billing Address is the same as Installation Address.
	    				
									billingAddress = house.getValue()+" "+floor.getValue()+" "+complex.getValue()+" "+side.getValue()+" "+colony.getValue()+" "+road.getValue()+" "+block.getValue()+" "+sector.getValue()+" "+city.getValue()+" "+district.getValue()+" "+state.getValue()+" "+pin.getValue();
									billingaddress.setValue(billingAddress);
	    				
									subscribermasterBean.setBillingaddr(billingAddress);
	    				
							}else{  // Billing Address and Installation Address are not same.

									subscribermasterBean.setBillingaddr(billingaddress.getValue());
							}
	    			
							subscribermasterBean.setCreateby(usermasterBean.getId());
	    			
							generatedKey = subscribermasterDAO.insertAllCols(subscribermasterBean,conn);
	    			
							System.out.println("Subscriber Id set in session: "+generatedKey);
	    			
							conn.commit();
	    			
							session.setAttribute("subscriber", generatedKey);
	    			
	    			
							// DISABLE ALL FORM FIELDS...
							disableFormFields();
	    			
							Messagebox.show("Subscriber created ! Assign STB/VC.", "Warning", Messagebox.OK, Messagebox.INFORMATION);
							
	    			 }	else{   // UPDATE EXISTING SUBSCRIBER...
	    				  
	    				  selectedSubscribermasterBean = (SubscribermasterBean) Sessions.getCurrent().getAttribute("selectedSubscriber");
	    				  
	    				  // System.out.println(selectedSubscribermasterBean.getCode());
	    				  if(!validate()){
	    					  
	    					  showValidationMessages.setVisible(true);
	    					  
	    				  }else{
	    					  
	    					  	System.out.println("Update Existing Subscriber...");
	    					  
	    					  	Save.setDisabled(true);
	    					  
	    					  	Session session=Sessions.getCurrent();
		    					UsermasterBean usermasterBean =  (UsermasterBean) session.getAttribute("logininfo");
		    			
				    			// 1. First Name
				    			String firstName = fname.getValue();
				    			
				    			// 2. Middle Name
				    			String middleName = mname.getValue();
				    			
				    			// 3. Last Name.
				    			String lastName = lname.getValue();
				    			
				    			// 4. Area.
				    			String Area = area.getValue();
				    			AreamasterBean areamasterBean = (AreamasterBean)area.getSelectedItem().getValue();
				    			System.out.println(((AreamasterBean)area.getSelectedItem().getValue()).getId()+"  ");
				    			
				    			// 5. Bill Cycle.
				    			String billCycle = bcycle.getValue();
				    			BillcyclemasterBean billcyclemasterBean = (BillcyclemasterBean)bcycle.getSelectedItem().getValue();
				    			System.out.println(((BillcyclemasterBean)bcycle.getSelectedItem().getValue()).getId()+"  ");
				    			
				    			// 6. Tax Combination.
				    			String taxCombination = tax.getValue();
				    			TaxcombinationmasterBean taxcombinationmasterBean = (TaxcombinationmasterBean)tax.getSelectedItem().getValue();
				    			System.out.println(((TaxcombinationmasterBean)tax.getSelectedItem().getValue()).getId()+"  ");
				    			
				    			// 7. Status
				    			String Status = status.getValue();
		    			
				    			// 8. String SAF Number.
				    			String safNo = saf.getValue();
				    			
				    			
				    			// 9. Phone.
				    			String Phone = phone.getValue();
				    			
				    			// 10. Mobile.
				    			String Mobile = mobile.getValue();
				    			
				    			// 11. EMail
				    			String Email = email.getValue();

				    			/////////////////////////////////////////////////////////////////////////////////////////////////////////
				    			
				    			selectedSubscribermasterBean.setFirstname(firstName);
				    			selectedSubscribermasterBean.setMiddlename(middleName);
				    			selectedSubscribermasterBean.setLastname(lastName);
				    			selectedSubscribermasterBean.setName(firstName+middleName+lastName);
				    			selectedSubscribermasterBean.setAreaid(((AreamasterBean)area.getSelectedItem().getValue()).getId());
				    			selectedSubscribermasterBean.setBillcycleid(((BillcyclemasterBean)bcycle.getSelectedItem().getValue()).getId());
				    			selectedSubscribermasterBean.setTaxcombinationid((((TaxcombinationmasterBean)tax.getSelectedItem().getValue()).getId()));
				    			
				    			if(Status.equals("Active")){
				    				selectedSubscribermasterBean.setStatus("1");
				    			}
				    			
				    			if(Status.equals("Deactive")){
				    				selectedSubscribermasterBean.setStatus("2");
				    			}
				    			
				    			if(Status.equals("Discontinue")){
				    				selectedSubscribermasterBean.setStatus("3");
				    			}
		    			
		    			
				    			selectedSubscribermasterBean.setSaff_no(safNo);
				    			selectedSubscribermasterBean.setPhone(phone.getValue());
				    			selectedSubscribermasterBean.setMobile(mobile.getValue());
				    			selectedSubscribermasterBean.setEmail(email.getValue());
				    			selectedSubscribermasterBean.setHouseNo(house.getValue());
				    			selectedSubscribermasterBean.setFloor(floor.getValue());
				    			selectedSubscribermasterBean.setComplexName(complex.getValue());
				    			selectedSubscribermasterBean.setSide(side.getValue());
				    			selectedSubscribermasterBean.setColony(colony.getValue());
				    			selectedSubscribermasterBean.setBlockNo(block.getValue());
				    			selectedSubscribermasterBean.setSector(sector.getValue());
				    			selectedSubscribermasterBean.setCity(city.getValue());
				    			selectedSubscribermasterBean.setDistrict(district.getValue());
				    			selectedSubscribermasterBean.setState(state.getValue());
				    			selectedSubscribermasterBean.setPin(pin.getValue());
				    			selectedSubscribermasterBean.setLcoid((Integer) session.getAttribute("currentLcoid"));

	    					  
				    			//Convert today's date to SQL Date
								Date todaysDate = new Date();
								SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
								String CreationDate = fmt.format(todaysDate);
								java.sql.Date TodaysDate = java.sql.Date.valueOf(new String(CreationDate));
		    			
		    			
								//selectedSubscribermasterBean.setCreatedate(TodaysDate);  // NOT REQUIRED
								
								// 12. Billing Address.
				    			
								if(useInstallationAddress.isChecked()==true){ // Billing Address is the same as Installation Address.
		    				
										billingAddress = house.getValue()+" "+floor.getValue()+" "+complex.getValue()+" "+side.getValue()+" "+colony.getValue()+" "+road.getValue()+" "+block.getValue()+" "+sector.getValue()+" "+city.getValue()+" "+district.getValue()+" "+state.getValue()+" "+pin.getValue();
										billingaddress.setValue(billingAddress);
		    				
										selectedSubscribermasterBean.setBillingaddr(billingAddress);
		    				
								}else{  // Billing Address and Installation Address are not same.

										selectedSubscribermasterBean.setBillingaddr(billingaddress.getValue());
								}
		    			
								// selectedSubscribermasterBean.setCreateby(usermasterBean.getId()); // // NOT REQUIRED
								
								subscribermasterDAO.updateAllCols(selectedSubscribermasterBean,conn);
				    			
								System.out.println("Subscriber Id: "+selectedSubscribermasterBean.getId()+" updated successfully !");
		    			
								conn.commit();
		    			
								//session.setAttribute("subscriber", generatedKey);
		    			
								// DISABLE ALL FROM FIELDS...
								disableFormFields();
		    			
								Messagebox.show("Subscriber updated Successfully !", "Warning", Messagebox.OK, Messagebox.INFORMATION);

	    				  }
	    			 }
	    			
	    		}
	    }catch(Exception e){
	    	conn.rollback();
	    	e.printStackTrace();
	    }
	}


	private boolean validate() {
		boolean validationtatus = true;
		try{
			    String msg = "";
				if((fname.getValue()=="")|| (fname.getValue().trim().length()==0)){
					msg = "First Name is left blank! \n" ;
				}if((lname.getValue()=="")|| (lname.getValue().trim().length()==0)){
					msg=msg+"Last Name is left blank! \n";
				}if (area.getValue().equals("Select")) {
					msg=msg+"Please select Area! \n";
				}if (bcycle.getValue().equals("Select")) {
					msg=msg+"Please select Bill Cycle! \n";
				}if (tax.getValue().equals("Select")) {
					msg=msg+"Please select Tax Combination! \n";
				}if (status.getValue().equals("Select")) {
					msg=msg+"Please select Status! \n";
				}
				
				
				
				if(useInstallationAddress.isChecked()==true){ // Billing Address and Installation Address are same.
					if((billingaddress.getValue()=="")|| (billingaddress.getValue().trim().length()==0)){
						msg=msg+"Billing address cannot be left blank! \n";
					}
				}
				
				if(useInstallationAddress.isChecked()==false){ // Billing Address and Installation Address are not same.
					
					billingAddress = house.getValue()+" "+floor.getValue()+" "+complex.getValue()+" "+side.getValue()+" "+colony.getValue()+" "+road.getValue()+" "+block.getValue()+" "+sector.getValue()+" "+city.getValue()+" "+district.getValue()+" "+state.getValue()+" "+pin.getValue();
					
					if((billingAddress == "") || (billingAddress.trim().length() == 0)){
						msg=msg+"Installation address cannot be left blank! \n";
					}
					
				}
				
				
				
				if(!msg.equals("")){
					//System.out.println("IN...");
					validationtatus = false;
					showValidationMessages.setValue(msg);
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return validationtatus;
	}
	
	
	
	 

}
