package doubts;

public class Hello {

	public static void main(String[] args) {
		// Outer loop
		for(int i = 1; i <= 5; i++) {
			// inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print(j+"* ");
			}
			System.out.println();
		}

	}

}
