package ar.edu.unlp.info.oo1.Ejercicio10_JobScheduler;

import java.util.List;


public interface Strategy {
	
		JobDescription next(List<JobDescription>jobs);
}