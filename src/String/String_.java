package String;

import java.util.StringTokenizer;

public class String_ {

	public static void main(String[] args) {
		
		char[] dizi = {'B', 'a', 'y', 'k', 'a', 'r', 'a'};
		String katar = new String(dizi);
		System.out.println(katar);		
		System.out.println("-------------------");				
		System.out.println(katar.length());
		
		String ad = "Yakup";
		String soyad = "BAYKARA";
		System.out.println(ad+ " " +soyad);	
		
		System.out.println("-------------------");				
		System.out.println(ad.concat(soyad));
		if(ad == soyad)
			System.out.println("Ad ve soyad aynı");
		else 
			System.out.println("Ad ve soyad farklı");
		
		System.out.println("-------------------");				
		System.out.println(ad.equals(soyad));
		
		System.out.println("-------------------");
		String ad2 = "yakup";
		System.out.println(ad.equalsIgnoreCase(ad2));
		
		System.out.println("-------------------");				
		String ad3 = "YAKUP";
		System.out.println(ad.compareTo(ad3));                   // Pozitif değer dönerse daha büyük. Yani sözlükte daha sonradır. Eksi değer tam teersi durum.
		System.out.println(ad.compareToIgnoreCase(ad3));   		 // O ise birbirlerine eşittir.	
		System.out.println(ad.compareTo(soyad));
		System.out.println(soyad.compareToIgnoreCase(ad)); 
		
		System.out.println("-------------------");				
		System.out.println(ad.regionMatches(3, soyad, 0, soyad.length()));  	// Metnin bir kısmını karşılaşırır.
		
		System.out.println("-------------------");				
		System.out.println(ad.startsWith("Ya"));
		System.out.println(ad.endsWith("p"));
		System.out.println(soyad.startsWith("AY", 1));    		// 1. indisten itibaren karşılaştırır.
		
		System.out.println("-------------------");				
		String adSoyad = ad+ " " +soyad;
		char[] altDizi = new char[6];		
		adSoyad.getChars(3, 9, altDizi, 0);						// Stringden bir bölümü diziye aktarma.
		System.out.println(altDizi);
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.charAt(7));	 				// String içindeki karaktere ulaşmak.
		
		System.out.println("-------------------");				
		char[] dizi2 = new char[adSoyad.length()];
		dizi2 = adSoyad.toCharArray();							// String karakter dizisine çevirmek.
		for (char c : dizi2) {
			System.out.print(c +"\t");
		}
		System.out.println();
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.indexOf("a"));				// a'nın olduğu ilk indis değerini verir.
		System.out.println(adSoyad.indexOf("up"));
		System.out.println(adSoyad.lastIndexOf("A"));	  		// A' nın olduğu son indisi verir.
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.substring(5, 8));
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.replace('u', 'o'));		    // u' yu o ile değiştiri
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.trim());  					// String ifadenin yanındaki boşlukları siler.
		
		System.out.println("-------------------");				
		System.out.println(adSoyad.toUpperCase());				// Büyük - küçük harf yapmak.
		System.out.println(adSoyad.toLowerCase());
		
		System.out.println("-------------------");				
		int i = 10;
		double d = 5.00;
		String s = "";
		s =String.valueOf(i);									// Tüm tipleri String.valueOf() ile String' e çevirebiliriz.
		s = s+ "-" +String.valueOf(d);
		System.out.println(s);
		
		System.out.println("-------------------");
		String cumle = "Yenilirsen değil vazgeçersen kaybedersin";
		String bolucu =",";
		StringTokenizer st = new StringTokenizer(cumle);	
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(cumle, bolucu);	// Özel bir bölücü istenirse verilebilir. Default değer boşluktur.
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("-------------------");
		// StringBuffer işlemleri
		StringBuffer sb = new StringBuffer("Yakup");
		sb.append(" BAYKARA");
		System.out.println(sb);
		sb.replace(0, 5, "YAKUP");
		System.out.println(sb);
		System.out.println(sb.delete(5, 13));
		System.out.println(sb.reverse());
	}
}
