package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MathOperations {

	public static void main(String[] args) {
		
		// Min - Max
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		Optional<Integer> minNumber = list.stream().min((i, j) -> i.compareTo(j));
		Optional<Integer> maxNumber = list.stream().min((i, j) -> j.compareTo(i));
		System.out.print(minNumber.get() +"\t");
		System.out.println(maxNumber.get());
		
		// Min  - Max with Comparator
		Comparator<Integer> minComparator = new Comparator<Integer>() {			   
			  @Override
			  public int compare(Integer n1, Integer n2) {
			    return n1.compareTo(n2);
			  }
		};		
		Optional<Integer> minNumber2 = list.stream().min(minComparator);
		System.out.print(minNumber2.get() +"\t");
		
		Comparator<Integer> maxComparator = new Comparator<Integer>() {			   
			  @Override
			  public int compare(Integer n1, Integer n2) {
			    return n2.compareTo(n1);
			  }
		};
		Optional<Integer> maxNumber2 = list.stream().min(maxComparator);
		System.out.println(maxNumber2.get());
		
		//Count
		long count = Stream.of("how","to","do","in","java").count();
		System.out.println(count);
		
		long count2 = IntStream.of(1,2,3,4,5,6,7,8,9).count();
		System.out.println(count2);
		
		long count3 = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
		System.out.println(count3);
		
		// Average - Sum 
		int max = IntStream.of(10, 18, 12, 70, 5).max().getAsInt();
		System.out.println(max);

		double avg = IntStream.of(1, 2, 3, 4, 5).average().getAsDouble();
		System.out.println(avg);

		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);
		
		// SummaryStatistics
		IntSummaryStatistics summary = IntStream.of(10, 18, 12, 70, 5).summaryStatistics();
		int max2 = summary.getMax();
		System.out.println(max2);
		
		double avg2 = summary.getAverage();
		System.out.println(avg2);
		
		int sum2 = (int) summary.getSum();
		System.out.println(sum2);
	}

}
