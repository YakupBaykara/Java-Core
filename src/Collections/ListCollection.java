package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListCollection {

	public static void main(String[] args) {
	
		// Liste yapılarının dizilerden en önemli farkı boyutunun belirli olmamasıdır.
		// Collection öğeleri tanımlanırken tip belirtilmezse farklı tipte elemanlar eklenebilir. Object olarak algılar
		
		arrayList();
		linkedList();
	}
	
	static void arrayList() {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		System.out.println(aList.get(2));
		aList.set(2, 4);
		ListIterator<Integer> i = aList.listIterator();
		
		System.out.println("Listeyi baştan sonra sıralama");
		while (i.hasNext()) {
			System.out.println(i.nextIndex() +". eleman :" +i.next());
			
		}
		System.out.println("Listeyi sondan başa sıralama");
		while(i.hasPrevious()) {
			System.out.println(i.previousIndex() +". eleman :" +i.previous());
		}
	}
	
	static void linkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.addFirst(4);
		linkedList.addLast(0);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.get(2));
	}
}
