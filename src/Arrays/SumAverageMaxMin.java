package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;

import org.apache.commons.lang3.ArrayUtils;

public class SumAverageMaxMin {

	public static void main(String[] args) {
		
		// Stream ile Sum
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		long sum = Arrays.stream(intArray).sum();
		long sum2 = Arrays.stream(integerArray).mapToInt(i -> i).sum();
		long sum3 = Arrays.stream(intArray).summaryStatistics().getSum();
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		
		// For döngüsü ile Sum
		long sum4 = 0;
		for (int value : intArray) {
		  sum4 += value;
		}
		System.out.println(sum4);
		
		// Stream ile Average
		double average = Arrays.stream(intArray).average().orElse(Double.NaN);
		double average2 = Arrays.stream(intArray).summaryStatistics().getAverage();
		System.out.println(average);
		System.out.println(average2);
		
		// For döngüsü ile Average
		long sum5=0;
		double average3=0;
		for (int value : intArray) {
			sum5 += value;					
		}
		average3=(double) sum5/(intArray.length);
		System.out.println(average3);
		
		// Stream ile Max and Min
		int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };
		int max = Arrays.stream(items).max().getAsInt(); 
		int min = Arrays.stream(items).min().getAsInt();
		System.out.println(max);
		System.out.println(min);
		
		IntSummaryStatistics stats = Arrays.stream(items).summaryStatistics();
		System.out.println(stats.getMax());	
		System.out.println(stats.getMin());
		
		// Collections ile Max and Min
		Integer min2 = Collections.min(Arrays.asList(ArrayUtils.toObject(items)));
		Integer max2 = Collections.max(Arrays.asList(ArrayUtils.toObject(items)));
		System.out.println(max2);
		System.out.println(min2);
		
		// Sort ile Max and Min
		Arrays.sort(items);
		int max3 = items[items.length - 1];  	
		int min3 = items[0];
		System.out.println(max3);
		System.out.println(min3);
		
		// For döngüsü ile Max and Min
		int max4 = items[0];
		int min4 = items[0];
		for (int i = 1; i < items.length; i++) {
		  if (items[i] > max4) 
		    max4 = items[i];
		 else if (items[i] < min4) 
		    min4 = items[i];
		}
		System.out.println(max4);	
		System.out.println(min4);
	}
}
