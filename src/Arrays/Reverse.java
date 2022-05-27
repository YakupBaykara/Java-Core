package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class Reverse {

	public static void main(String[] args) {
		
		String[] array = {"A", "B", "C", "D", "E"};
		
		// Colllection ile
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.toString(array));
		
		//ArraUtils ile
		ArrayUtils.reverse(array);
		System.out.println(Arrays.toString(array));
		
		// Stream ile (array dzisinde bir şey değişmedi. Çünkü yeni bir dizi oluşturuldu.)
		Object[] streamArray = IntStream.rangeClosed(1, array.length).mapToObj(i -> array[array.length-i]).toArray();
		System.out.println(Arrays.toString(streamArray));
 		
		// For döngüsü ile
		for (int i = 0; i < array.length/2; i++) {
			String temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
