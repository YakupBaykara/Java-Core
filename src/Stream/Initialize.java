package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Initialize {

	public static void main(String[] args) {

		// Stream.of
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9); // from var args
		stream.forEach(p -> System.out.print(p + "\t"));
		System.out.println();

		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }); // from array
		stream2.forEach(p -> System.out.print(p + "\t"));
		System.out.println();

		// List to Stream
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}		
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(p -> System.out.print(p + "\t"));
		System.out.println();
		
		// Map to Stream
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		Stream<String> keyStream = map.keySet().stream();
		keyStream.forEach(p -> System.out.println(p));
		Stream<Integer> valueStream = map.values().stream();
		valueStream.forEach(p -> System.out.println(p));
		Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
		entryStream.forEach(p -> System.out.println(p));

		// Stream.generate
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(10).forEach(System.out::println);

		// Stream.iterate
		List<Integer> numbers = Stream.iterate(1, i -> i + 1).limit(10).collect(Collectors.toList());
		System.out.print(numbers +"\t");
		System.out.println();
		
		// Stream.builder
		Stream<String> streamBuilder = Stream.<String>builder().add("A").add("B").build();
		streamBuilder.forEach(p -> System.out.print(p +"\t"));
		System.out.println();

		List<Integer> numbers2 = Stream.iterate(1, i -> i <= 10, i -> i + 1).collect(Collectors.toList());
		System.out.println(numbers2);

		// Stream of Nullable
		Stream<String> stream10 = Stream.ofNullable("123");
		System.out.println(stream10.count());

		stream10 = Stream.ofNullable(null);
		System.out.println(stream10.count());

		// Stream of Stream Chars ot Tokens
		IntStream stream4 = "12345_abcdefg".chars();
		stream4.forEach(p -> System.out.print(p + "\t"));
		System.out.println();

		Stream<String> stream5 = Stream.of("A$B$C".split("\\$"));
		stream5.forEach(p -> System.out.print(p + "\t"));
		System.out.println();

		// Parallel Stream
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		Stream<Integer> stream6 = list2.parallelStream();
		Integer[] evenNumbersArr = stream6.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evenNumbersArr));
	}

}
