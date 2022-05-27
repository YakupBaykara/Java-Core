package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Compare {

	public static void main(String[] args) {

		String[] a1 = {"A", "B", "C"};
		String[] a2 = {"A", "B", "C"};
		String[] a3 = {"X", "Y", "Z"};
		boolean matches = Arrays.equals(a1, a2);
//		boolean matches = Arrays.deepEquals(a1, a2);    	// Çok boyutlu diziler için kullanılır.
		boolean matches2 = Arrays.equals(a1, a3);
		System.out.println(matches);
		System.out.println(matches2);
		
		System.out.println(checkArrayEqualityWithForLoop(a1, a3));
		
		// Stream ile
		System.out.println(IntStream.range(0, a1.length).allMatch(i -> a1[i].equals(a2[i])));
		
	}
	
	// For döngüsü ile
	public static boolean checkArrayEqualityWithForLoop(String[] a1, String[] a2) {
		if (a1 == a2) 
			return true;
		
		if (a1 == null || a2 == null) 
			return false;
		
		int n = a1.length;
		if (n != a2.length) 
			return false;

		for (int i = 0; i < n; i++) {
			if (!a1[i].equals(a2[i]))
				return false;				
		}
		return true;
	}
}
