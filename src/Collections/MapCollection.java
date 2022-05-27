package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

/*
containsKey() : Map içinde verilen değere karşılık key var mı
constainValue() : Map içinde verilen değere karşılık value var mı
entrySet() : Map içindeki elemanları Set koleksiyonuna çevirir.
get() : Map içindeki key'e eşit gelen elemanı verir.
keySet() : Map içindeki key' ler Set koleksiyonnuna çevirir.
put() : Girilen key ve value ile eleman ekler.
remove : Girilen key' e karışılık gelen elemanı siler.
values() : Map içindeki değerleri Collection öğesi olarak verir.
*/
// Map koleksiynları key'lerinde tekrarlı öğe bulundurmaz.
public class MapCollection {
	public static void main(String[] args) {
		
//		hashMap();
//		linkedHashMap();
		sortedMap();
	}
	
	static void hashMap() {
		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("Bir", 1);
		hMap.put("İki", 2);
		hMap.put("Üç", 3);
		
		Set<String> keys = hMap.keySet();
		Set<?> veri = hMap.entrySet();
		
		Iterator<?> i = veri.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------------------");
		Iterator<String> i2 = keys.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
	
	static void linkedHashMap() {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		for(int i = 65; i <= 90; i++) {
			lhm.put((char) i, i);
		}
		System.out.println(lhm);
		System.out.println("--------------------");
		Set<Object> keys = lhm.keySet();
		System.out.println(keys);
	}
	
	static void sortedMap() {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "Bir");
		tMap.put(3, "Üç");
		tMap.put(6, "Altı");
		tMap.put(4, "Dört");
		tMap.put(5, "Beş");
		tMap.put(2, "İki");
		
		System.out.println(tMap);
		System.out.println(tMap.ceilingEntry(3));   		// 3 veya 3 den sonraki en büyük veri çifti.
		System.out.println(tMap.descendingKeySet());		// Key'leri azalan şekilde sıralar.
		System.out.println(tMap.floorEntry(7));	 			// 7 veya 7 dens sonraki en büyük veri çifti.
		System.out.println(tMap.headMap(4));	 			// 4'ten küçük olan veri çiftleri.
		System.out.println(tMap.higherEntry(3));	 		// 3'ten büyük olan veri çifti.
		System.out.println(tMap.lowerKey(2));  				// 2'den küçük olan anahtar değeri.
		System.out.println(tMap.pollLastEntry());  			// Map içerisindeki son veri.
		System.out.println(tMap.subMap(2, 5));  			// [2, 5) arasındaki ver çiftleri.
		System.out.println(tMap.tailMap(4));  				// Key değeri 4 ve 4'ten büyük olan veri çiftleri. Son değer hariç.
	}
}
