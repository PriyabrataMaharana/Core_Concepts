package pre_defined_FI;

import java.util.function.Consumer;

class Movie {
	String name;
	
	Movie(String name) {
		this.name = name;
	}
}

public class ConsumerChaining {
	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name+": ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name+": released, but a bigger flop !!");
		Consumer<Movie> c3 = m -> System.out.println(m.name+": storing info in the database");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("Spider");
		cc.accept(m);
	}
}
