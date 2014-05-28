package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.Navigation;
import com.emerge.TMobile.client.widgets.VerticalContainer;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;

public class Reporting extends Canvas {
	VerticalContainer vc;

	public Reporting() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label("Reporting ");
		label.setWidth100();
		label.setHeight100();
		label.setValign(VerticalAlignment.TOP);
        
		vc = new VerticalContainer();
		vc.addMember(new Navigation());	
		vc.addMember(label);
		this.addChild(vc);
	}
}
