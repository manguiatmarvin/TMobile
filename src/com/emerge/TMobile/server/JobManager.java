package com.emerge.TMobile.server;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import com.emerge.TMobile.server.jobs.ProcessVis;

public class JobManager {

	static Scheduler sched;
	static SchedulerFactory schedFact;
	
    
	public void initialize() {
	
		try {
			  sched  = StdSchedulerFactory.getDefaultScheduler(); 
			  sched.getListenerManager().addSchedulerListener(new JobManagerListener());
			  sched.start();
			
		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}

	public void shutdown() {
		try {
			// Grab the Scheduler instance from the Factory
			if (sched != null) {
				StdSchedulerFactory.getDefaultScheduler().shutdown();
			}

		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}
	
	
	public  void testJobManager() throws SchedulerException{
		  // define the job and tie it to our HelloJob class
		  JobDetail job = newJob
				  (ProcessVis.class)
		      .withIdentity("myJob", "group1")
		      .build();

		  // Trigger the job to run now, and then every 40 seconds
		  Trigger trigger = newTrigger()
		      .withIdentity("myTrigger", "group1")
		      .startNow()
		      .withSchedule(simpleSchedule()
		          .withIntervalInSeconds(40)
		          .repeatForever())
		      .build();

		  // Tell quartz to schedule the job using our trigger
		  sched.scheduleJob(job, trigger);
		  System.out.print("testJobManager()");
	}
}
