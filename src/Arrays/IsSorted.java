package Arrays;

import java.util.Comparator;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class IsSorted {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		boolean isSorted = checkIsSortedPrimitiveArrayWithStream(array);
		System.out.println(isSorted);

		// Dizi elemanları Comparable inteface i implemente eden türdense kullanılabilir.
//		Integer[] array2 = { 1, 2, 3, 4, 5 };
//		boolean isSorted2 = checkIsSortedObjectArrayWithStream(ArrayUtils.toObject(array2));
//		System.out.println(isSorted2);
		
		// Comparable inteface i implemente etmiyorsa dizi elemanları compareTo kullanılabilir.
//		User[] users = getSortedArray();
//		Comparator<User> firstNameSorter = Comparator.comparing(User::firstName);
//		boolean isSorted3 = checkIsSortedObjectArrayForCustomSort(users, firstNameSorter);
//		System.out.println(isSorted);
		
		// Apache Commons ile
//		User[] users = getSortedArray();
		boolean isSorted4 = ArrayUtils.isSorted(array);	
		System.out.println(isSorted4);	
//		boolean isSorted5 = ArrayUtils.isSorted(array, Comparator.comparing(User::firstName));	
//		System.out.println(isSorted5);

	}

	public static boolean checkIsSortedPrimitiveArrayWithStream(final int[] array) {
		if (array == null || array.length <= 1)
			return true;
		return IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1]);
	}

	public static <T extends Comparable<? super T>> boolean checkIsSortedObjectArrayWithStream(final T[] array2) {
		if (array2.length <= 1)
			return true;
		return IntStream.range(0, array2.length - 1).noneMatch(i -> array2[i].compareTo(array2[i + 1]) > 0);
	}

	public static <T> boolean checkIsSortedObjectArrayForCustomSort(final T[] array, final Comparator<T> comparator) {
		if (comparator == null) 
			throw new IllegalArgumentException("Comparator should not be null.");
		if (array.length <= 1)
			return true;
		return IntStream.range(0, array.length - 1).noneMatch(i -> comparator.compare(array[i], array[i + 1]) > 0);
	}
}
