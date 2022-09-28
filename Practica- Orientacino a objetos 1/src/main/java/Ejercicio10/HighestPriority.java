package Ejercicio10;

import java.util.List;

public class HighestPriority implements strategy {

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.stream().max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
	}

}
