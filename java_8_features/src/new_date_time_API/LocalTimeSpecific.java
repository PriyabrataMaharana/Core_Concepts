package new_date_time_API;

import java.time.LocalTime;

public class LocalTimeSpecific {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int hr = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		System.out.println(time);
		System.out.println(hr+".."+minute+".."+second+".."+nano);
		System.out.printf("%d : %d : %d : %d", hr, minute, second, nano);
	}
}
