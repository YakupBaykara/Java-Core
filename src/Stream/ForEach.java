package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
		Consumer<Integer> action = System.out::println;		 
		list.stream().forEach(action);
		
		for (Integer i : list) {
			System.out.print(i +"\t");
		}
		
		// ForEachOredered. ForEach'in paralel de hangi sıralamayla sonuç vereceği belli değil.
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);		 
		list2.stream().parallel().forEach( System.out::println ); 	 
		list2.stream().parallel().forEachOrdered( System.out::println );
	}

}
