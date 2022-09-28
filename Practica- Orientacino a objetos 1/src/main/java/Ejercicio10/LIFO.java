package Ejercicio10;

import java.util.List;

public class LIFO implements strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}

}
