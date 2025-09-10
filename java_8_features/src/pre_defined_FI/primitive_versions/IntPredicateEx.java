package pre_defined_FI.primitive_versions;

import java.util.function.IntPredicate;

public class IntPredicateEx {
	public static void main(String[] args) {
		int [] x = {0, 5, 10, 15, 20, 25, 30};
		IntPredicate p = i -> i%2 == 0;
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.print(x1+" ");	// 0 10 20 30 
			}
		}
	}
}
