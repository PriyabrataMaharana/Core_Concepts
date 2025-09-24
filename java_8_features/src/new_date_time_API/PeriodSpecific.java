package new_date_time_API;

import java.time.LocalDate;
import java.time.Period;

public class PeriodSpecific {
	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1999, 06, 25);
		LocalDate today = LocalDate.now();
		Period p = Period.between(dateOfBirth, today);
		System.out.printf("Age is %d Years %d Months %d Days only..", 
				p.getYears(), p.getMonths(), p.getDays());
		
		// 		Special case
		// =======================
		LocalDate deathDate = LocalDate.of(1999+60, 06, 25);
		Period p1 = Period.between(today, deathDate);
		int days = p1.getYears()*365+p1.getMonths()*30+p1.getDays(); 
		System.out.printf("\nYou are on Earth only for %d days more !!", days);
	}
}
