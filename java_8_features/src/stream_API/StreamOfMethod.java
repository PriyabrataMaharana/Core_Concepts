package stream_API;

import java.util.stream.Stream;

// Use of Stream.of()
public class StreamOfMethod {
	public static void main(String[] args) {
		// Use - 1
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);
		
		// Use - 2
		Integer [] i = {10, 15, 20, 25, 30};
		Stream.of(i).forEach(System.out::println);
	}
}
