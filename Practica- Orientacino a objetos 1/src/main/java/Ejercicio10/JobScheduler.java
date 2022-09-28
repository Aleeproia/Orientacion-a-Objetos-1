package Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	
	protected List<JobDescription> jobs;
    protected strategy strategy;
     
    public JobScheduler () {
    	this.jobs = new ArrayList<>(); 
    	this.strategy = new FIFO();
    }
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public strategy getStrategy() {
    	return this.strategy; 
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    public void setStrategy(strategy aStrategy) {
    	this.strategy = aStrategy; 
    }
    
    public JobDescription next() {
    	JobDescription nextJob = strategy.next(jobs);
		this.unschedule(nextJob);
		return nextJob;

    }

}
