package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i <= 5; i++) {
			l.add(i);
		}
		// create a separate list containing even numbers only from the previous list
		// by using Streams
		List<Integer> l1 = 
				l.stream().map(i -> 2*i).sorted().collect(Collectors.toList());
		System.out.println(l1);
	}
}
