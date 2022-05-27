package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		
		// Normal sıralama
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// Tesrten sıralama
		List<Integer> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList2);
		
		// Custom sıralama
		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
			  @Override
			  public int compare(Integer i1, Integer i2) {
			    return i2.compareTo(i1);
			  }
		}; 
		List<Integer> sortedList3 = list.stream().sorted(reverseComparator).collect(Collectors.toList());
		System.out.println(sortedList3);
		
		// Lambda ile sıralama
		List<Integer> sortedList4 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(sortedList4);

	}

}
