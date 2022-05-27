package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {

		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);

		// Person sınıfı oluşturulur ve equals metodu yazılır. Id' ye göre filtreler.
/*		List<Person> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);*/
		
		// Person sınıfı oluşturulur ve equals metodu yazılır. DistinctByKey ile özel filtreleme yapılabilir.
/*		List<Person> distinctElements2 = list.stream().filter( distinctByKey(p -> p.getFname() + " " + p.getLname())).collect( Collectors.toList() );
		System.out.println( distinctElements );*/
	}

}
