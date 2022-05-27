package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Initialize {

	public static void main(String[] args) {
		
		
		String[] status = new String[] {"Active", "Passive", "Purged"};
		String[] status2 = {"Active", "Passive", "Purged"};
		System.out.println(status);
		System.out.println(Arrays.toString(status2));
		
		// For döngüsüyle
		int[] numbers = new int[5];
		Arrays.fill(numbers, 1);
		System.out.println(Arrays.toString(numbers));
		
		int[] squares = new int[5];
		Arrays.setAll(squares, p -> p*p);
		System.out.println(Arrays.toString(squares));
		
		// Stream ile dizi oluşturma
		int[] streamArray = IntStream.range(1, 11).toArray();
		int[] streamArray2 = IntStream.rangeClosed(1, 10).toArray();
		int[] streamArray3 = IntStream.of(1,2,3,4,5,6,7,8,9,10).toArray();		
		System.out.println(Arrays.toString(streamArray));
		System.out.println(Arrays.toString(streamArray2));
		System.out.println(Arrays.toString(streamArray3));
				
	}
}
