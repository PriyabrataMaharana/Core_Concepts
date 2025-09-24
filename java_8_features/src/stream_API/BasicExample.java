package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i <= 20; i++) {
			l.add(i);
		}
		// create a separate list containing even numbers only from the previous list
		// by using Streams
		List<Integer> l1 = 
				l.stream().filter(i -> i %2 == 0).collect(Collectors.toList());
		System.out.println(l1);
	}
}
