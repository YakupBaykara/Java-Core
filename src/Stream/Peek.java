package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {

	public static void main(String[] args) {
		
		// Mutlaka bir terminal operasyon ile kullanılmalıdır. Özellikle debug yapmak için kullanılır.
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);	     
		List<Integer> newList = list.stream().peek(System.out::println).collect(Collectors.toList());		 
		System.out.println(newList);

	}

}
