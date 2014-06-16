package com.emerge.TMobile.server;

import java.util.List;

import com.emerge.TMobile.client.Models.Audit;
import com.emerge.TMobile.client.Services.AuditService;
import com.emerge.TMobile.server.Db.DAO.AuditsDAO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class AuditServiceImpl  extends RemoteServiceServlet implements
AuditService {

	@Override
	public String sayHello(String input) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return "Hello "+input;
	}

	@Override
	public List getAllAudits(int offset, int noOfRecords)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		AuditsDAO auditDAO = new AuditsDAO();
		return auditDAO.getAllAudit(offset, noOfRecords);
		
	}



}
