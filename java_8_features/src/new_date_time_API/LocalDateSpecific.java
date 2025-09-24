package new_date_time_API;

import java.time.LocalDate;

public class LocalDateSpecific {
	public static void main(String[] args) {
		LocalDate date  = LocalDate.now();
		System.out.println(date);	// 2025-09-21
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day+".."+month+".."+year);
		System.out.printf("%d-%d-%d",day, month, year);
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getMonthValue());
//		System.out.println(date.getYear());
	}
}
