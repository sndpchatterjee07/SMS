package com.sss.composer;



import org.zkoss.zk.ui.Executions;

import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.sss.core.bean.UsermasterBean;
import com.sss.core.dao.UsermasterDAO;


public class LoginComposer extends GenericForwardComposer{

	Window window;
	Button login;
	Label msg;
	Textbox username, password;
	
	public void onCreate$window(){
		
		window.doOverlapped();
		window.setPosition("center");
		window.setSizable(true);
		if(Executions.getCurrent().getParameter("msg")!=null){
			Session session=Sessions.getCurrent();
			session.removeAttribute("logininfo");
			msg.setValue(Executions.getCurrent().getParameter("msg"));
		
		}else{
			
			msg.setValue("");
			
		}
		
		
	}
	
	public void onOK$password()throws Exception{
				
		Session session=Sessions.getCurrent();
		String loginstatus="notloggedin";
		UsermasterDAO userdao=new UsermasterDAO();
		UsermasterBean[] userList=userdao.findAll();
		
		for(int i=0;i<userList.length;i++){
			
			if(username.getValue().equals(userList[i].getName()) && password.getValue().equals(userList[i].getPassword())){
				
				loginstatus="loggedin";
				
				session.setAttribute("logininfo", userList[i]);
				
				// System.out.println("logininfo set in session...");
				
				// Executions.sendRedirect("pages/index.zul");
				
				Executions.sendRedirect("pages/home.zul");
			}
			
		}
		
		if(loginstatus.equals("notloggedin")){
			
			// msg.setValue("username password doesnt match");
			
			msg.setValue("Username/Password does not match !");
		}
		
	}
	
	public void onClick$login() throws Exception{
		
		Session session=Sessions.getCurrent();
		String loginstatus="notloggedin";
		UsermasterDAO userdao=new UsermasterDAO();
		UsermasterBean[] userList=userdao.findAll();
		
		for(int i=0;i<userList.length;i++){
			
			if(username.getValue().equals(userList[i].getName()) && password.getValue().equals(userList[i].getPassword())){
				loginstatus="loggedin";
				session.setAttribute("logininfo", userList[i]);
				//Executions.sendRedirect("pages/index.zul");
				Executions.sendRedirect("pages/home.zul");
			}
			
		}
		
		if(loginstatus.equals("notloggedin")){
			
			// msg.setValue("username password doesnt match");
			
			msg.setValue("Username/Password does not match !");
		}
		

	}
}
