package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {

	public static void main(String[] args) {

		Integer[] firstArray = { 0, 2, 4, 6, 8 };
		Integer[] secondArray = { 1, 3, 5, 7, 9 };

		HashSet<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(firstArray));
		set.addAll(Arrays.asList(secondArray));
		System.out.println(set);

		// convert to array
		Integer[] union = {};
		union = set.toArray(union);
		System.out.println(Arrays.toString(union));
	}
}
