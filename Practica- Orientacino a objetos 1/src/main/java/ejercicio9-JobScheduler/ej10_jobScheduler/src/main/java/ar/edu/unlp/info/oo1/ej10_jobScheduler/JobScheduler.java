package ar.edu.unlp.info.oo1.ej10_jobScheduler;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;
     
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
    
    public Strategy getStrategy() {
    	
//    	jobs.stream().map(job -> job.getDescription()).collect(Collectors.toList()); Devuelve una lista de descripciones (mismo tamaño que la coleccion original)
    	return this.strategy; 
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    public void setStrategy(Strategy aStrategy) {
    	this.strategy = aStrategy; 
    }
    
    public JobDescription next() {
    	JobDescription nextJob = null;
    	switch (strategy) {
    	case "FIFO": 
    		nextJob = jobs.get(0);
        	

    	case "LIFO": 
    		nextJob = jobs.get(jobs.size()-1);


    	case "HighestPriority": 
    		nextJob = jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);

        	
    	case "MostEffort":
		     nextJob = jobs.stream()
     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);


 	
    	}
    	
//    	strategy.next(jobs);
    	this.unschedule(nextJob);
    	return nextJob;
      	return null;
    }
    
}

