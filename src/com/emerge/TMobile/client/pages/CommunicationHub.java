package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.Navigation;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class CommunicationHub extends Canvas {


	public CommunicationHub() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label("Communication Hub Content here ");
		label.setWidth100();
		label.setHeight100();
		label.setPadding(5);
		label.setValign(VerticalAlignment.TOP);
		
		VLayout vl = new VLayout();
		vl.setWidth100();
		vl.setMembers(new Navigation(),label);
		this.addChild(vl);
	}
}
