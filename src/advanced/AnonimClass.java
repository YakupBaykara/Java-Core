package advanced;

import java.util.Arrays;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AnonimClass {

	public static void main(String[] args) {

		Elma[] elmalar = {
				new Elma(10),
				new Elma(40),
				new Elma(20),
				new Elma(5)
		};
		
		System.out.println(Arrays.toString(elmalar));

		/* ElmaComparator yerine Comparator functional interface kullanılır.		
		Arrays.sort(elmalar, new ElmaComparator());
		System.out.println(Arrays.toString(elmalar)); */
		
		Arrays.sort(elmalar, new Comparator<Elma>() {
			@Override
			public int compare(Elma o1, Elma o2) {
				Elma e1 = (Elma) o1;
				Elma e2 = (Elma) o2;
				return e1.getAgirlik() - e2.getAgirlik();
			}
		});
		
		System.out.println(Arrays.toString(elmalar));
 	}
}

@Getter @Setter @AllArgsConstructor @ToString
class Elma {
	
	private int agirlik;
}


/*
 * class ElmaComparator implements Comparator<Elma> {
 * 
 * @Override public int compare(Elma o1, Elma o2) { Elma e1 = (Elma) o1; Elma e2
 * = (Elma) o2; return e1.getAgirlik() - e2.getAgirlik(); }
 * 
 * }
 */