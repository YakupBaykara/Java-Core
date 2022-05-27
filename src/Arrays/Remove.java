package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Remove {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// ArraysUtil - Apache Commons ile
		Integer[] array = {1,2,3,4,5,6,7,7,7,8,9};
		System.out.println(Arrays.toString(ArrayUtils.remove(array, 5)));						// Verilen indexi çıkarır.
		System.out.println(Arrays.toString(ArrayUtils.removeAll(array, 5,6,7)));				// Verilen indexler çıkarır.
		System.out.println(Arrays.toString(ArrayUtils.removeElement(array, 7)));				// Verilen elemanı çıkarır
		System.out.println(Arrays.toString(ArrayUtils.removeElements(array, 7,7)));				// Verilen elemanları çıkarır.
		System.out.println(Arrays.toString(ArrayUtils.removeAllOccurences(array, 7)));			// Tekrarlı elemanları çıkarır.
		
		// Listeye çevrilerek
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
//		list.removeAll(7);
		
		Integer[] newList = list.toArray(new Integer[0]);
		for(Integer i : newList) {
			System.out.print(i);
		}
		
		// Tanımlı metod ile
		removeIndexAndShift(array, 6);
	}
	
	static <T> void removeIndexAndShift(T[] array, int indexToRemove) {
		for (int i = indexToRemove; i < array.length - 1; i++) {
		  	array[i] = array[i + 1];
		}
		//optionally we can set the last element to null
		array[array.length - 1] = null;
	}

}
