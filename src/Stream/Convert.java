package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Convert {

	public static void main(String[] args) {
		
		int[] intArray = new int[]{1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(p -> System.out.print(p +"\t"));
		System.out.println();

		// long[] -> Stream
		long[] longArray = new long[]{1, 2, 3, 4, 5};
		LongStream longStream = Arrays.stream(longArray);
		longStream.forEach(p -> System.out.print(p +"\t"));
		System.out.println();

		// double[] -> Stream
		double[] doubleArray = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(p -> System.out.print(p +"\t"));
		System.out.println();
		
		// List to Primitive Stream
		List<Integer> integerList = List.of(1, 2, 3, 4, 5);
		IntStream intStream2 = integerList.stream().mapToInt(i -> i);		// mapToDouble, mapToLong 
		intStream2.forEach(p -> System.out.print(p +"\t"));
		System.out.println();
		
		// Primitive Array to IntStream and Object Stream
		int[] array = {0,1,2,3,4};
		IntStream stream = Arrays.stream(array);						// Primitive Array
		stream.forEach(s -> System.out.print(s));
		System.out.println();
		
		Stream<Integer> stream2 = Arrays.stream(array).boxed();			// Object Array
		stream2.forEach(s -> System.out.print(s));
		System.out.println();
		
		// IntStream to Primitive Array
		IntStream stream3 = Arrays.stream(new int[] {1,2,3,4});
		int[] array3 = stream3.toArray();
		System.out.println(Arrays.toString(array3));
		
		// Object Stream to Object Array
		Stream<String> stream4 = Arrays.stream(new String[] {"a","b","c","d"});
		String[] array4 = stream4.toArray(String[]::new);
		System.out.println(Arrays.toString(array4));
//		String[] array41 = stream4.toArray(new String[0]);				// Listenin array'e çevrilmesinde kullanılabilir
	}

}
