package advanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("İstanbul");
		list.add("Ankara");
		list.add("Bursa");
		list.add("Adana");
		list.add("İzmir");
		
		// 1. Yol
		Stream<String> stream = list.stream();
		
		Stream<String> stream2 = stream.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
		});
		
		Stream<String> stream3 = stream2.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		});
	
		Stream<String> stream4 = stream3.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		stream4.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}	
		});
		System.out.println("---------------------------------");
		
		// 2. Yol
		list.stream()
					 .filter((s) -> s.startsWith("A"))
//					 .map((s) -> s.toUpperCase())
					 .map(String::toUpperCase)
//					 .sorted((s1,s2) -> s1.compareTo(s2))
					 .sorted()
					 .forEach(System.out::println);
	}

}
