package com.emerge.TMobile.client.pages;

import org.moxieapps.gwt.uploader.client.Uploader;
import org.moxieapps.gwt.uploader.client.events.*;

import com.emerge.TMobile.client.widgets.UploadVrhWidget;
import com.emerge.TMobile.client.widgets.VerticalContainer;
import com.emerge.TMobile.client.widgets.uploadVisWidget;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;

public class Index extends Canvas {
	VerticalContainer vc;
    private boolean visUploaded = false;
    private boolean vrhUploaded = false;
    
	public Index() {
		super();
		this.setWidth100();
		this.setHeight100();
		 VLayout vLayout = new VLayout();
		 vLayout.setMembers(new uploadVisWidget(), new UploadVrhWidget());
		this.addChild(vLayout);
	}


}