package pre_defined_FI;

import java.util.function.Supplier;

// Supplier for random OTP generate(6 digit)
public class SupplierExample2 {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";
			for(int i = 0; i < 6; i++) {
				otp = otp+(int) (Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
	}
}
