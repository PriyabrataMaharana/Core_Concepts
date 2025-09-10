package pre_defined_FI.primitive_versions;

import java.util.function.IntFunction;

public class IntFunctionEx {
	public static void main(String[] args) {
		IntFunction f = i -> i*i;
		System.out.println(f.apply(4));
	}
}
