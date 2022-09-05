package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Methodreferance {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(6);
		numbers.add(10);
		numbers.add(3);
		
		numbers.forEach((x) -> System.out.println(x));
		
		// Static metoda referans
		numbers.forEach(System.out::println);
		System.out.println("-------------------------");
		
		ArrayList<Bisiklet> bisikletList = new ArrayList<>();
		bisikletList.add(new Bisiklet("X Marka", 18));
		bisikletList.add(new Bisiklet("Y Marka", 12));
		bisikletList.add(new Bisiklet("Z Marka", 21));
		
		BisikletKarsilatirici bisikletKarsilatirici = new BisikletKarsilatirici();
		
//		Collections.sort(bisikletList, new BisikletKarsilatirici());
		// Instance Metoda Referans
		Collections.sort(bisikletList, bisikletKarsilatirici::compare);   
		bisikletList.forEach(System.out::println);
		
		List<String> markalar = new ArrayList<>();
		markalar.add("X marka");
		markalar.add("Y marka");
		markalar.add("Z marka");

		/*
		List<Bisiklet> bisikletler = markalar.stream().map(new Function<String, Bisiklet>() {

			@Override
			public Bisiklet apply(String t) {
				return new Bisiklet(t);
			}
		}).collect(Collectors.toList()); */
		
		// Constructora referans
		List<Bisiklet> bisikletler = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
		System.out.println(bisikletler);
	}

}

@Data @AllArgsConstructor @NoArgsConstructor
class Bisiklet {
	
	public Bisiklet(String marka) {
		this.marka = marka;
	}
	private String marka;
	private int vitesSayisi;
}

class BisikletKarsilatirici implements Comparator<Bisiklet>{

	@Override
	public int compare(Bisiklet o1, Bisiklet o2) {
		return o1.getVitesSayisi() - o2.getVitesSayisi();
	}
	
}


