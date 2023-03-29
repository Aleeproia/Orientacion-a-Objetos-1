package ar.edu.unlp.info.oo1.Ejercicio10_JobScheduler;

import java.util.List;


public class MostEffort implements Strategy{
	
	public JobDescription next(List<JobDescription>jobs) {
		return jobs.stream().max((c1,c2)->Double.compare(c1.getEffort(), c2.getEffort())).orElse(null);
	}

}
