package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sort {

	public static void main(String[] args) {
		
		// POJO sınıflarında yazılacak CompareTo metodu ile
		
		// Normal Sorting
		String[] tokens = {"A","C","B","E","D"};
		Arrays.sort(tokens);
		System.out.println(Arrays.toString(tokens));
		
		// Reverse Sortiing
		Arrays.sort(tokens, Collections.reverseOrder());
		System.out.println(Arrays.toString(tokens));
		
		// Stream ile 
		User user = new User(3, "Yakup", "BAYKARA");
		User user2 = new User(1, "Yusuf", "BAYKARA");
		User user3 = new User(2, "Ahmet", "BAYKARA");
		User user4 = new User(4, "Omer", "BAYKARA");
		
		List<User> users = Arrays.asList(user, user2, user3, user4);
		User[] userArray = users.toArray(User[]::new);
		System.out.println(Arrays.toString(userArray));
				
		// Id ye göre sıralar
		User[] sortedUserArray = users.stream().sorted().toArray(User[]::new);
		System.out.println(Arrays.toString(sortedUserArray));
		
		// Id ye göre ters
		User[] sortedUserArray2 = Stream.of(userArray).sorted(Comparator.reverseOrder()).toArray(User[]::new);
		System.out.println(Arrays.toString(sortedUserArray2));
		
		// İsme göre 
		Comparator<User> firstNameSorter = Comparator.comparing(User::getFirstName);
		Arrays.sort(sortedUserArray, firstNameSorter);
		System.out.println(Arrays.toString(sortedUserArray));
		
		// Tam isme göre
		Comparator<User> fullNameSorter = Comparator.comparing(User::getFirstName).thenComparing(User::getLastName);
		Arrays.sort(sortedUserArray, fullNameSorter);
		System.out.println(Arrays.toString(sortedUserArray));		
		}
}

