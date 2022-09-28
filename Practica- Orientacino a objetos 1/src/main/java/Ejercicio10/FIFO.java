package Ejercicio10;

import java.util.List;

public class FIFO implements strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(0);
	}
	
	

}
