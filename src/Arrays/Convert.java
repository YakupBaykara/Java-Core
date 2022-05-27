package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;

public class Convert {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Primitive to Object Array - Stream ile
		int[] primitiveArray = new int[]{0, 1, 2, 3, 4, 5};
		Integer[] outputArray = Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(outputArray));
		
		// Object to Primitive Array - Stream ile
		Integer[] objectArray = new Integer[]{0, 1, 2, 3, 4, 5};
		int[] outputArray2 = Arrays.stream(objectArray).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(outputArray2));
		
		// Primitive to Object Array - Apache Commons ile 
		Integer[] outputArray3= ArrayUtils.toObject(primitiveArray);
		System.out.println(Arrays.toString(outputArray3));
		
		// Object to Primitive Array - Apache Commons ile 
		int[] outputArray4 = ArrayUtils.toPrimitive(objectArray);
		System.out.println(Arrays.toString(outputArray4));
		
		// List to Array
		List<String> list = Arrays.asList("A", "B", "C");
		String[] stringArray;
		Object[] objArray = list.toArray();
		System.out.println(Arrays.toString(objArray));
		
		stringArray = list.toArray(new String[0]);			// 1. Yol
		System.out.println(Arrays.toString(stringArray));
		stringArray = list.toArray(String[]::new);			// 2. Yol
		System.out.println(Arrays.toString(stringArray));
		
		// List to Array - Stream ile
		String[] stringArray2 = list.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(stringArray2));
		
		String[] filteredArray = list.stream().filter(s -> s.equals("A")).toArray(String[]::new);
		System.out.println(Arrays.toString(filteredArray));
		
		// Array to List - Stream ile
		String[] stringArray3 = new String[]{"D", "E", "F"};
		List<String> list2 = Arrays.asList(stringArray3);
		list2.set(0, "Q");									// Dizi ve listenin ikiside etkilenir.							
		System.out.println(list2);
		System.out.println(Arrays.toString(stringArray3));
//		list2.add("W");										// Çalışmaz çünkü asıl olan dizidir.
		
		List<String> list3 = Stream.of(stringArray).collect(Collectors.toList());	// Listeye ekleme yapılabilir. Dizi değişmez.
		list3.add("W");
		System.out.println(list3);
		System.out.println(Arrays.toString(stringArray3));
		
		// Primitive Array to Stream
		int[] primitiveArray2 = {0,1,2,3,4};
		IntStream intStream = Arrays.stream(primitiveArray2);					
		Stream<Integer> integerStream = Arrays.stream(primitiveArray2).boxed();
		
		// Stream to Primitive Array
		IntStream intStream2 = Arrays.stream(new int[]{1,2,3});
		int[] primitiveArray3 = intStream2.toArray();
		
		Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3}); 
		int[] primitiveArray4 = integerStream2.mapToInt(i -> i).toArray();
		
		// Object Array to Stream
		String[] stringArray5 = {"a", "b", "c", "d", "e"};
		Stream<String> strStream = Arrays.stream(stringArray5);
		
		// Stream to Object Array
		Stream<String> strStream2 = Arrays.stream(new String[]{});
		String[] stringArray6 = strStream.toArray(String[]::new);
		
		// String to String Array
		String names = "alex,brian,charles,david";
		String[] namesArray = names.split(",");				// Virgüle göre parçala
		System.out.println(Arrays.toString(namesArray));
		
		// String to String Array - Pattern ile
		Pattern pattern = Pattern.compile(",");
	    namesArray = pattern.split( names );
	    System.out.println(Arrays.toString(namesArray));
	    
	    // String Array to String
	    String[] tokens = {"How","To","Do","In","Java"};	     
	    String blogName1 = String.join("", tokens);   //without space	 
	    String blogName2 = String.join(" ", tokens);  //with one space	 
	    String blogName3 = String.join("-", tokens);  //with hyphen	     
	    System.out.println(blogName1);
	    System.out.println(blogName2);
	    System.out.println(blogName3);
	}

}
