package new_date_time_API;

import java.time.Year;
import java.util.Scanner;

public class YearSpecific {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check: ");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("%d is Leap Year", n);
		} else {
			System.out.printf("%d is Leap Year", n);
		}
	}
}
