package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Operations {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		// Intermediate - Filter
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		System.out.println();
		
		// Intermediate - Map
		memberNames.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println();
		
		// Intermediate - Sorted
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		System.out.println();
		
		// Terminal - Collect
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(memNamesInUppercase);
		
		// Terminal - Match
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);     //true
		 
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);     //false
		 
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));		 
		System.out.println(matchedResult);     //false
		
		// Terminal - Count
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();			 
		System.out.println(totalMatched);
		
		// Terminal - Reduce
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);		 
		reduced.ifPresent(System.out::println);
		
		// Short Circuit - FindFirst
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();	 
		System.out.println(firstMatchedName); 
	}

}
