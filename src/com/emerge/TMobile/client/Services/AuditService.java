package com.emerge.TMobile.client.Services;

import java.util.List;

import com.emerge.TMobile.client.Models.Audit;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("audit")
public interface AuditService extends RemoteService{

	String sayHello(String input)throws IllegalArgumentException;
	
	List<Audit> getAllAudits(int Offset, int noOfRecords)throws IllegalArgumentException;
}
