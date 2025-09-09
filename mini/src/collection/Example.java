package collection;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		for(char i = 'A'; i <='z'; i++) {
			al.add(i);
		}
		System.out.println(al);
	}
}
