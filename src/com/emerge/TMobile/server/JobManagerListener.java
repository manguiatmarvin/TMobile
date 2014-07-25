package com.emerge.TMobile.server;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.Trigger;
import org.quartz.TriggerKey;


public class JobManagerListener implements  SchedulerListener {

	@Override
	public void jobAdded(JobDetail arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobAdded(): ");
	}

	@Override
	public void jobDeleted(JobKey arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobDeleted(): ");
	}

	@Override
	public void jobPaused(JobKey arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobPaused(): ");
	}

	@Override
	public void jobResumed(JobKey arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobResumed(): ");
	}

	@Override
	public void jobScheduled(Trigger arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobScheduled(): ");
	}

	@Override
	public void jobUnscheduled(TriggerKey arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobUnscheduled(): ");
	}

	@Override
	public void jobsPaused(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobsPaused(): ");
	}

	@Override
	public void jobsResumed(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("jobsResumed(): ");
	}

	@Override
	public void schedulerError(String arg0, SchedulerException arg1) {
		// TODO Auto-generated method stub
		System.out.println("schedulerError(): ");
	}

	@Override
	public void schedulerInStandbyMode() {
		// TODO Auto-generated method stub
		System.out.println("schedulerInStandbyMode(): ");
		
	}

	@Override
	public void schedulerShutdown() {
		// TODO Auto-generated method stub
		System.out.println("schedulerShutdown(): ");
	}

	@Override
	public void schedulerShuttingdown() {
		// TODO Auto-generated method stub
		System.out.println("schedulerShuttingdown(): ");
	}

	@Override
	public void schedulerStarted() {
		// TODO Auto-generated method stub
		System.out.println("schedulerStarted(): ");
	}

	@Override
	public void schedulerStarting() {
		// TODO Auto-generated method stub
		System.out.println("schedulerStarting(): ");
	}

	@Override
	public void schedulingDataCleared() {
		// TODO Auto-generated method stub
		System.out.println("schedulingDataCleared(): ");
	}

	@Override
	public void triggerFinalized(Trigger arg0) {
		// TODO Auto-generated method stub
		System.out.println("triggerFinalized(): ");
	}

	@Override
	public void triggerPaused(TriggerKey arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void triggerResumed(TriggerKey arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void triggersPaused(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void triggersResumed(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
