package com.sss.util;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import com.sss.core.bean.SubbouquetchannelbindBean;

public class SubBouquetViewRenderer implements ListitemRenderer {

	public void render(Listitem arg0, Object arg1, int arg2) throws Exception {
		
		SubbouquetchannelbindBean subbouquetchannelbindBean = (SubbouquetchannelbindBean) arg1;
		
		new Listcell().setParent(arg0);
		
		new Listcell(subbouquetchannelbindBean.getSubbouquetname()).setParent(arg0);
		
		
	}

}
