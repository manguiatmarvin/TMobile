package com.emerge.TMobile.client.pages;

import com.emerge.TMobile.client.widgets.Navigation;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.Canvas;

public class BeginAudit extends Canvas {
	public BeginAudit() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label("Begin Audit Hub Content here ");
		label.setWidth100();
		label.setHeight100();
		label.setPadding(5);
		label.setValign(VerticalAlignment.TOP);

		VLayout vl = new VLayout();
		vl.setWidth100();
		vl.setMembers(Navigation.getInstance(), label);
		this.addChild(vl);
	}
}
