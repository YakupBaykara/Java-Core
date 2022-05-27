package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Resize {

	public static void main(String[] args) {
		
		// Arrays.copyOf ile
		String[] originalArray = {"A", "B", "C", "D", "E"};       
		String[] resizedArray = Arrays.copyOf(originalArray, 10);
		resizedArray[5] = "F";
		System.out.println(Arrays.toString(resizedArray));
		
		// Listeye çevrilerek
		ArrayList<String> list = new ArrayList<>(Arrays.asList(originalArray));
		list.add("F");
		System.out.println(list);
	}
}
