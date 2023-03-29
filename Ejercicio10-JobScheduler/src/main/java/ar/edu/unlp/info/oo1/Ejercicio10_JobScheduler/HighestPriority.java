package ar.edu.unlp.info.oo1.Ejercicio10_JobScheduler;

import java.util.List;


public class HighestPriority implements Strategy {
	
	
	public JobDescription next(List<JobDescription>jobs) {
		return jobs.stream().max((c1,c2) -> Integer.compare(c1.getPriority(), c2.getPriority())).orElse(null);		
	}

}
