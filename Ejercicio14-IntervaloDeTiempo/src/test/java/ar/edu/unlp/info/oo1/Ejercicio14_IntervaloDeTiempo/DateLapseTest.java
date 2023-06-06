package ar.edu.unlp.info.oo1.Ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	private DateLapse dateLapse;
	
	@BeforeEach
	void setUp() {
		this.dateLapse = new DateLapse(LocalDate.of(2023,06,03),LocalDate.of(2023,06,10));
	}
	
	
	@Test
	public void sizeInDaysTest() {
		assertEquals(7,this.dateLapse.sizeInDays());
	}
	
	@Test
	public void includesDateTest() {
		assertFalse(this.dateLapse.includesDate(LocalDate.of(2023,06,02)));
		assertTrue(this.dateLapse.includesDate(LocalDate.of(2023,06,03)));
		assertTrue(this.dateLapse.includesDate(LocalDate.of(2023,06,10)));
		assertFalse(this.dateLapse.includesDate(LocalDate.of(2023,06,11)));
	}

}
