package com.emerge.TMobile.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TMobile implements EntryPoint {

	public void onModuleLoad() {
		
		RootPanel.get("loading").clear(true);
		
		String initToken = History.getToken();
		if (initToken.length() == 0) {
			History.newItem("index");
		}

		History.addValueChangeHandler(new HistoryListener());
		History.fireCurrentHistoryState();
	}

}
