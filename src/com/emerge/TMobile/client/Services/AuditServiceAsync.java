package com.emerge.TMobile.client.Services;

import java.util.List;

import com.emerge.TMobile.client.Models.Audit;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AuditServiceAsync {
	void sayHello(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;

	void getAllAudits(int Offset, int noOfRecords, AsyncCallback<List<Audit>> callback);
}
