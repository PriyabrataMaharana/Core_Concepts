package map_Vs_flatmap_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataset {
	public static List<Customer> getAll() {
		return Stream.of(
				new Customer(101, "Priyabrata", "pm@gmail.com", Arrays.asList("7894561230", "4569871230")),
				new Customer(102, "Soumya", "soumya@gmail.com", Arrays.asList("7894561230", "4569871230")),
				new Customer(103, "Mittal", "mittal@gmail.com", Arrays.asList("7894561230", "4569871230")),
				new Customer(104, "Kiran", "kiran@gmail.com", Arrays.asList("7894561230", "4569871230")),
				new Customer(105, "Ruby", "ruby@gmail.com", Arrays.asList("7894561230", "4569871230"))
			).collect(Collectors.toList());
	}
}
