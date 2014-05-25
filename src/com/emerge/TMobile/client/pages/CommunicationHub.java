package com.emerge.TMobile.client.pages;

import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;

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
		this.addChild(label);
	}
}
