package pre_defined_FI;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a,b) -> (a+b) %2 == 0;
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(15, 20));
		System.out.println(bp.test(11, 22));
		System.out.println(bp.test(25, 25));
	}
}
