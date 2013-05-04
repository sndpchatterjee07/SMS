package com.sss.composer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Row;
import org.zkoss.zul.RowRenderer;
import org.zkoss.zul.Window;

import com.sss.core.bean.ChannelmasterBean;
import com.sss.core.custom.bean.CustomChannel;
import com.sss.core.dao.ChannelmasterDAO;


public class ChannelComposer extends GenericForwardComposer{

	Window main;
	Grid datagrid;
	ChannelmasterDAO channelmasterDAO = new ChannelmasterDAO();
	List<CustomChannel> customChannels = new ArrayList<CustomChannel>();
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		super.doAfterCompose(comp);
		
		ArrayList<ChannelmasterBean> channels = channelmasterDAO.findAll();
		
		for(ChannelmasterBean channelmasterBean : channels){
			
			CustomChannel customChannel = new CustomChannel();
			
			customChannel.setChannelId(channelmasterBean.getId());
			
			customChannel.setName(channelmasterBean.getName());
			
			customChannels.add(customChannel);
			
		}
		
		
	}
	
	public void onCreate$main(){
		
		datagrid.setModel(new ListModelList(customChannels));
		
		datagrid.setRowRenderer(new RowRenderer<Object>() {

			public void render(Row row, Object data, int index) throws Exception {
				
				CustomChannel customChannel = (CustomChannel) data;
				
				Datebox stime = new Datebox(new Date(System.currentTimeMillis()));
				Datebox etime = new Datebox(customChannel.getEtime());
				stime.setFormat("long+medium");
				etime.setFormat("long+medium");
				stime.setMold("rounded");
				etime.setMold("rounded");
				stime.setWidth("220px");
				etime.setWidth("220px");
				
				row.setValue(customChannel);
				
				new Label(customChannel.getName()).setParent(row);
				stime.setParent(row);
				etime.setParent(row);
				
			}
		});
		
	}
	
	
}
