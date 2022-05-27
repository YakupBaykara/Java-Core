package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		
//		exaple1();
		example2();
		linkedHashSet();
		sortedSet();
	}
	
	static void exaple1() {
		
		HashSet<String> hSet = new HashSet<>();		
		hSet.add("Ali");
		hSet.add("Ahmet");
		hSet.add("Mehmet");
		hSet.add("Fatma");
		hSet.add("Ali");					// Aynı isimde eleman tutmaz. 
		hSet.remove("Fatma");
		
		Iterator<String> i = hSet.iterator();
		while (i.hasNext()) {
			System.out.println("Küme elemanı : " +i.next());
		}
	}
	
	static void example2() {
		
		String[] dizi = {"Ali", "Ahmet", "Mehmet", "Fatma", "Ali"};
		boolean b;
		HashSet<String> hSet = new HashSet<>();
		for (String s : dizi) {
			b = hSet.add(s);
			if(!b)
				System.out.println("Kopya eleman bulundu! :" +s);
		}
		
		Iterator<String> i = hSet.iterator();
		while(i.hasNext()) {
			System.out.println("Küme elemanı : " +i.next());
		}
	}
	
	static void linkedHashSet() {
		System.out.println("Verileri sıralı şekilde tutar.");
	}
	
	static void sortedSet() {
		System.out.println("Set arayüzünün alt arayüzüdür. Elemanlı sıralı şekilde tutar. TreeSet kullanılan sınıfıdır.");
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(1);
		tSet.add(7);
		tSet.add(13);
		tSet.add(6);
		tSet.add(10);
		System.out.println(tSet);
		System.out.println(tSet.first());
		System.out.println(tSet.last());
		System.out.println(tSet.headSet(7));				// 7 den küçük elemanları verir.
		System.out.println(tSet.subSet(6, 13));				// 6 ile 13 arasındaki elemanları verir.
		System.out.println(tSet.tailSet(7));				// 7 ve daha büyük elemanları verir.
	}
}
