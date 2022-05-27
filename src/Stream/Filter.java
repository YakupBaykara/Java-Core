package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		// Filter
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);		 
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        
        // Filter and Convert List
        List<Integer> evenNumbers = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        // Filter with Map 
        List<Integer> evenNumbers2 = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());    
        System.out.println(evenNumbers2);
        
        // Exception
/*      List<Integer> evenNumbers3 = list.stream().filter(a -> {
        	            try {
        	                return a.someMethodThrowingCheckedException();
        	            } catch (IOException e) {
        	                throw new Exception(e);
        	            }
        	        }).collect(Collectors.toList()); */

        // Filter with Predicate
        Predicate<Integer> condition = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0) 
                    return true;
                return false;
            }
        }; 
        list.stream().filter(condition).forEach(System.out::println);
      
	}
}
