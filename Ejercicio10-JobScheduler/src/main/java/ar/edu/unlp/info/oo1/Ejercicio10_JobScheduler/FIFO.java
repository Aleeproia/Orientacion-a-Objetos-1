package ar.edu.unlp.info.oo1.Ejercicio10_JobScheduler;

import java.util.List;


public class FIFO implements Strategy {
	
	
	public JobDescription next(List<JobDescription>jobs) {
		return jobs.get(0);
	}

}
