package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.Navigation;
import com.emerge.TMobile.client.widgets.VerticalContainer;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class CommHub extends Canvas {

	VerticalContainer vc;
	
	public CommHub() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label("Communication Hub Content here ");
		label.setWidth100();
		label.setHeight100();
		label.setValign(VerticalAlignment.TOP);
        
		vc = new VerticalContainer();
		vc.addMember(new Navigation());	
		vc.addMember(label);
		this.addChild(vc);
	}
}
