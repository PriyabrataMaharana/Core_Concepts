package map_Vs_flatmap_method;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Customer> customers = EKartDataset.getAll();
		
		// Converting List<Customer> object to List<emails>
		// Mapping : customer -> customer.getEmail()
		// One customer is having one email --> One-to-One Mapping
		List<String> emails = customers.stream()
				.map(customer -> customer.getEmail())
				.collect(Collectors.toList());
		System.out.println(emails);
		
		// Now, let's say I want to fetch phone numbers
		// Mapping : customer -> customer.getPhoneNumbers()
		// One customer is having multiple phone numbers --> One-to-Many Mapping
		List<String> phoneNumbers = customers.stream()
				.flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
	}
}
