package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaces2 {
	public static void main(String[] args) {

		Supplier<Urun> supplier = new Supplier<>() {
			
			@Override
			public Urun get() {
				return new Urun(1, "Laptop", 2500.0);
			}
		};
		System.out.println(supplier.get());
		System.out.println("------------------------------");
		
		Supplier<Urun> supplier2 = () -> new Urun(1, "Laptop", 2500.0);
		System.out.println(supplier2.get());
		System.out.println("------------------------------");
		
		Supplier<List<Urun>> supplier3 = () -> {
			List<Urun> urunler = new ArrayList<>();
			urunler.add(new Urun(1, "Laptop", 2500.0));
			urunler.add(new Urun(2, "TV", 3500.0));
			urunler.add(new Urun(3, "Yazıcı", 1000.0));
			return urunler;
		};
		supplier3.get().forEach((u) -> System.out.println(u));
		System.out.println("------------------------------");
		
		supplier3.get().forEach(System.out::println);
		System.out.println("------------------------------");
		
		
		List<Urun> urunler = new ArrayList<>();
		urunler.add(new Urun(1, "Laptop", 2500.0));
		urunler.add(new Urun(2, "TV", 3500.0));
		urunler.add(new Urun(3, "Yazıcı", 1000.0));
/*
		Collections.sort(urunler, new Comparator<Urun>() {

			@Override
			public int compare(Urun o1, Urun o2) {
				return (int) (o1.getFiyat() - o2.getFiyat());
			}
		}); */
		
		Collections.sort(urunler, (a,b) -> (int) (a.getFiyat() - b.getFiyat()));  // Fiyata göre sıralama
		urunler.forEach(System.out::println);
		System.out.println("------------------------------");
		
		Collections.sort(urunler, (a,b) -> a.getAdi().compareTo(b.getAdi()));	  // Ada göre sıralama
		urunler.forEach(System.out::println);
	}
}

@Data @AllArgsConstructor
class Urun {
	private int id;
	private String adi;
	private double fiyat;
}
