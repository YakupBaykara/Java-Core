package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindItem {

	public static void main(String[] args) {

		// Liste ile
		ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "guava", "apple", "cheeku"));
		System.out.println(list.contains("apple"));
		System.out.println(list.indexOf("apple"));
		System.out.println(list.contains("lion"));
		System.out.println(list.indexOf("lion"));

		// Dizi ile
		String[] fruits = new String[] { "banana", "guava", "apple", "cheeku" };
		System.out.println(Arrays.asList(fruits).contains("apple"));
		System.out.println(Arrays.asList(fruits).indexOf("apple"));
		System.out.println(Arrays.asList(fruits).contains("lion"));
		System.out.println(Arrays.asList(fruits).indexOf("lion"));

		// Stream ile
		boolean result = Arrays.asList(fruits).stream().anyMatch(x -> x.equalsIgnoreCase("apple")); // true
		boolean result2 = Arrays.asList(fruits).stream().anyMatch(x -> x.equalsIgnoreCase("lion")); // false
		System.out.println(result);
		System.out.println(result2);
	}

}
