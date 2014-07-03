package com.emerge.TMobile.client;
import com.emerge.TMobile.client.Services.AuditService;
import com.emerge.TMobile.client.Services.AuditServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TMobile implements EntryPoint {
	
	private final AuditServiceAsync auditService = GWT
			.create(AuditService.class);
	public void onModuleLoad() {

		
		String initToken = History.getToken();
		if (initToken.length() == 0) {
			History.newItem("index");
		}

		History.addValueChangeHandler(new HistoryListener());
		History.fireCurrentHistoryState();
	}

}
