package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 1, 3, 5 };
		System.out.println(Arrays.toString(numbers));

		// Set e dönüştürerek
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
		Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

		// Tamınlı metod ile
		Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
		System.out.println(Arrays.toString(origArray));
		Integer[] tempArray = removeDuplicates(origArray);
		System.out.println(Arrays.toString(tempArray));
		
		// Stream ile
		List<Integer> list = Arrays.asList(origArray).stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

	private static Integer[] removeDuplicates(Integer[] origArray) {

		Integer[] tempArray = new Integer[origArray.length];
		int indexJ = 0;
		for (int indexI = 0; indexI < origArray.length - 1; indexI++) {
			Integer currentElement = origArray[indexI];
			if (currentElement != origArray[indexI + 1])
				tempArray[indexJ++] = currentElement;
		}
		tempArray[indexJ++] = origArray[origArray.length - 1];
		return tempArray;
	}

}
