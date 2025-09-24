package new_date_time_API;

import java.time.LocalDateTime;

public class LocalDateTimeSpecific {
	public static void main(String[] args) {
		//			Ex:1
		// ========================
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Raw: "+dt);
		
		// Date Specific
		int date = dt.getDayOfMonth();
		int month = dt.getMonthValue();
		int year = dt.getYear();
		System.out.printf("Date: "+"%d:%d:%d", date, month, year);
		
		// Time Specific
		int hr = dt.getHour();
		int minute = dt.getMinute();
		int second = dt.getSecond();
		int nano = dt.getNano();
		System.out.printf("\nTime: "+"%d:%d:%d:%d", hr, minute, second, nano);
		
		// 			Ex:2
		// ========================
		LocalDateTime ldt = LocalDateTime.of(1995, 05, 28, 12, 45);
		System.out.println(ldt);	// 1995-05-28T12:45
		System.out.println("After six months: "+ldt.plusMonths(6));
		System.out.println("Before six months: "+ldt.minusMonths(6));
	}
}
