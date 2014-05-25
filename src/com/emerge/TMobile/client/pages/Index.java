package com.emerge.TMobile.client.pages;

import com.google.gwt.user.client.History;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;

public class Index extends Canvas {


public Index() {
		super();
		this.setWidth100();
		this.setHeight100();
		Label label = new Label(
				"<b>Severity 1</b> - Critical problem<br/>System is unavailable in production or is corrupting data, and the error severely impacts the user's operations.<br/><br/>"
						+ "<b>Severity 2</b> - Major problem<br/>An important function of the system is not available in production, and the user's operations are restricted.<br/><br/>"
						+ "<b>Severity 3</b> - Minor problem<br/>Inability to use a function of the system occurs, but it does not seriously affect the user's operations.");
		label.setWidth100();
		label.setHeight100();
		label.setPadding(5);
		label.setValign(VerticalAlignment.TOP);
		
		label.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("Communication");
			}
			
		});
		
		this.addChild(label);
	}

}
