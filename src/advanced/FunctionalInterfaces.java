package advanced;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		/* Anonim class
		Matematik matematik = new Matematik() {
			
			@Override
			public void islem(double a, double b) {
				System.out.println(a+b);
			}
		}; */
		
		// Functional Interface : Lambda ifadelerini kullanmak için oluşturulan interfacedir.
		Matematik matematik = (x,y) -> System.out.println(x+y);		
		matematik.islem(10.0, 15.0);
		
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("İstanbul");
		sehirler.add("Ankara");
		sehirler.add("Malatya");
		sehirler.add("Van");
		sehirler.add("Adıyaman");
		
		// Consumer Functional Interface
		sehirler.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});		
		System.out.println("-------------------------");
		
		sehirler.forEach((s) -> System.out.println(s));		// Lambda ile
		System.out.println("-------------------------");
		
		// Predicate Functional Interface
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.startsWith("M");
			}
		};
		for(int i=0; i < sehirler.size(); i++) {
			String sehir = sehirler.get(i);
			if(predicate.test(sehir))
				System.out.println(sehir);
		}		
		
		// Predicate Lambda ile
		Predicate<String> predicate2 = (s) -> s.startsWith("İ");
		for(int i=0; i < sehirler.size(); i++) {
			String sehir = sehirler.get(i);
			if(predicate2.test(sehir))
				System.out.println(sehir);
		}
	}
}

@FunctionalInterface
interface Matematik {
	void islem(double a, double b);
}
