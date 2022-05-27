package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {

	public static void main(String[] args) {

		Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
		List<Integer> newList = evenNumInfiniteStream.limit(10).collect(Collectors.toList());
		System.out.println(newList);
		
		// Skip() girilen değere kadar olanı diziden atar ve sonrasındakileri verir.
		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(6).collect(Collectors.toList());
		System.out.println(list);
		
		// TakeWhile
		List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");		 
		List<String> subset1 = alphabets.stream().takeWhile(s -> !s.equals("d")).collect(Collectors.toList());		 
		System.out.println(subset1);
		
		// DropWhile
		List<String> subset2 = alphabets.stream().dropWhile(s -> !s.equals("d")).collect(Collectors.toList());		 
		System.out.println(subset2);
	}

}
