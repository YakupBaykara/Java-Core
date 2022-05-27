package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class Concanate {

	public static void main(String[] args) {
		
		// For döngüsü ile
		int[] intArray1 = {1, 2, 3};
		int[] intArray2 = {4, 5, 6};

		int[] result = new int[intArray1.length + intArray2.length];
		int index = 0;

		for (int item: intArray1) {
		  result[index++] = item;
		}
		for (int item: intArray2) {
		  result[index++] = item;
		}
		System.out.println(Arrays.toString(result));
		
		// System ile
		int[] result2 = new int[intArray1.length + intArray2.length];
		System.arraycopy(intArray1, 0, result2, 0, intArray1.length);
		System.arraycopy(intArray2, 0, result2, intArray1.length, intArray1.length);
		System.out.println(Arrays.toString(result2));
		
		// Stream ile
		String[] strArray1 = {"1", "2", "3"};
		String[] strArray2 = {"4", "5", "6"};
		String[] result3 = Stream.concat(Arrays.stream(strArray1), Arrays.stream(strArray2))  // 2 den fazla da yazılabilir.
								 .toArray(String[]::new);  // Referans tip olduğu için new yapılır.
		System.out.println(Arrays.toString(result3));
		
		int[] int1 = {1, 2, 3};
		int[] int2 = {4, 5, 6};
		int[] result4 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2))
								 .toArray();               // Primitive tip olduğu için new yapılmıyor.
		System.out.println(Arrays.toString(result4));
		
		// ArrayUtils ile (Apache CommonLang)
		String[] result5 = ArrayUtils.addAll(strArray1, strArray2);
		System.out.println(Arrays.toString(result5));

		int[] result6 = ArrayUtils.addAll(intArray1, intArray2);
		System.out.println(Arrays.toString(result6));
		
		// Guava APIs ile
		String[] result7 = ObjectArrays.concat(strArray1, strArray2, String.class);
		System.out.println(Arrays.toString(result7));
		
		int[] result8 = Ints.concat(int1, int2);
		System.out.println(Arrays.toString(result8));
	}
	
}
