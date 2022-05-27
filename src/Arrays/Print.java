package Arrays;

import java.util.Arrays;
import java.util.List;

public class Print {

	public static void main(String[] args) {
		
		// Tek boyutlu dizi
		String[] array = new String[] { "First", "Second", "Third", "Fourth" };
		System.out.println( Arrays.toString(array));
		System.out.println(Arrays.asList(array));
		
		// Çok boyutlu dizi
		String[] arr1 = new String[] { "Fifth", "Sixth" };
		String[] arr2 = new String[] { "Seventh", "Eight" };		 
		String[][] arrayOfArray = new String[][] { arr1, arr2 };  
		System.out.println(Arrays.deepToString(arrayOfArray));
		
		// Liste
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		
	}

}
