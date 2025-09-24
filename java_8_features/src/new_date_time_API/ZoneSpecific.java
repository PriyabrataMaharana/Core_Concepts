package new_date_time_API;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneSpecific {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);	// Asia/Calcutta
		
		ZoneId america = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zd = ZonedDateTime.now(america);
		System.out.println(zd);
		// 2025-09-22T05:04:50.106427200-07:00[America/Los_Angeles]
	}
}
