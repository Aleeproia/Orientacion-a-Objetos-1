package ar.edu.unlp.info.oo1.Ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() { //Retorna la fecha de inicio del rango
		return this.from;
	}

	public LocalDate getTo() {   //Retorna la fecha de fin del rango
		return this.to;
	}

	public int sizeInDays() {   //Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
		return (int)ChronoUnit.DAYS.between(from,to);
	}


	public boolean includesDate(LocalDate fecha) {   //Recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario.
		return (fecha.isAfter(this.getFrom())||fecha.isEqual(this.getFrom())) && (fecha.isBefore(this.getTo())||fecha.isEqual(this.getTo()));
	}
	

}


