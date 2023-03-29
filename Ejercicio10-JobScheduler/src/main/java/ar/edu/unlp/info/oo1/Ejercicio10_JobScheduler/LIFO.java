package ar.edu.unlp.info.oo1.Ejercicio10_JobScheduler;

import java.util.List;


public class LIFO implements Strategy {
	
	public JobDescription next(List<JobDescription>jobs) {
		return jobs.get(jobs.size()-1);
	}

}
