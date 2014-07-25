package com.emerge.TMobile.server.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ProcessVis implements Job {

	@Override
	public void execute(JobExecutionContext jec) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("ProcessVis kicks in!");
	}

}
