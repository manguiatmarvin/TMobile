package com.emerge.TMobile.client;

import com.emerge.TMobile.client.widgets.MainWindow;
import com.emerge.TMobile.shared.MyHistoryListener;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TMobile implements EntryPoint {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	// widgets
	MainWindow mw;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

//		String initToken = History.getToken();
//		if (initToken.length() == 0) {
//			History.newItem("page1");
//		}
		
		mw = new MainWindow("TMOBILE System");
		mw.hideControls();
		mw.draw();
		
//		 History.addValueChangeHandler(new MyHistoryListener());
//	     History.fireCurrentHistoryState(); 

	}



}
