package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		
		// List - Stream - List
		Stream<Integer> stream = list.stream();
		List<Integer> list2 = stream.filter(i -> i%2 == 0).collect(Collectors.toList());	// Listeye çevirme
		System.out.print(list2 +"\t");
		System.out.println();
		
		// List - Stream - Array
		Stream<Integer> stream2 = list.stream();
		Integer[] array = stream2.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
 	}

}
