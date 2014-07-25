package com.emerge.TMobile.server.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.emerge.TMobile.server.JobManager;

public class JobManagerServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JobManager jobManager;

	public void init() throws ServletException {
		 new JobManager().initialize();
		
	}
}
