package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Split {

	public static void main(String[] args) {
		
		// Arrays.copyOfRange ile
		int[] array = {1,2,3,4,5,6};
		int[] subArray1 = Arrays.copyOfRange(array, 0, 3);
		int[] subArray2 = Arrays.copyOfRange(array, 3, array.length);
		System.out.println(Arrays.toString(subArray1));
		System.out.println(Arrays.toString(subArray2));
		
		// Tanımlı metod ile
		List<Integer[]> list1 = splitArray(ArrayUtils.toObject(array), 3);
		for(Integer[] i : list1) {
			System.out.println(Arrays.toString(i));
		}
  	}
	
	public static <T extends Object> List<T[]> splitArray(T[] array, int splitSize) {

		int numberOfArrays = array.length / splitSize;
		int remainder = array.length % splitSize;

		int start = 0;
		int end = 0;

		List<T[]> list = new ArrayList<T[]>();
		for (int i = 0; i < numberOfArrays; i++) {
		  end += splitSize;
		  list.add(Arrays.copyOfRange(array, start, end));
		  start = end;
		}

		if(remainder > 0) {
		  list.add(Arrays.copyOfRange(array, start, (start + remainder)));
		}
		return list;
	}

}
