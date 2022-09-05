package Arrays;

import java.util.Arrays;

public class Exception {


	@SuppressWarnings({ "removal", "deprecation" })
	public static void main(String[] args) {
		
		Number[] numbers = new Number[3];
		numbers[0] = 10;
		numbers[1] = new Integer(10);
		System.out.println(Arrays.toString(numbers));

		/*
		Integer[] integerArray = {1,2,3,4};					// Asıl dizi
		Number[] numberArray = integerArray;				// Referans dizi
		numberArray[0] = 10;								// 10.01 veremeyiz. Çünkü numberArray bir referans dizi
		System.out.println(Arrays.toString(integerArray));
		System.out.println(Arrays.toString(numberArray)); */
		
		// Exception Handling
		Integer[] integerArray2 = {1,2,3,4};
		Number[] numberArray2 = integerArray2;
		
		double value = 10.01;
		if(integerArray2.getClass().getComponentType() == ((Object) value).getClass())
			numberArray2[0] = value;
	    else 
			System.out.println("Incompatible type");
	}

}
