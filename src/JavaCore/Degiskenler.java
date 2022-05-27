package JavaCore;


public class Degiskenler {
	
/*  Metod dışında değişken tanımlanırken aynı satırda değeri verilmelidir.
	int x;
	x = 5; */

	public static void main(String[] args) {
		
//	Döngü içerisinde tanımlanan bir deişkene döngü dışından erişilemez. Lokal değişkendir.
		
/*  Değer atanmadığı için bellekte yer ayrılmaz ve ekrana yazdırılamaz.
		int x;   			 
		System.out.println(x); */

/*  Değişken tipi verilmediği için hata verir.
 		a=10;	*/	 
 
//  Değişken isimleri sayı ile başlamaz ve içerisinde boşuk bırakılmaz.		
		
/*	İlki primitif tiptir ve belleğin stack kısmında yer alır. 2. referans tiptir ve belleğin heap kısmında yer alır.
		int i = 5;
		Integer j = new Integer(5);
*/	

/*	Referans tiplere null değeri verilebilirken primitif tiplere verilemez.
		int a = null;
		Integer b = null;
*/ 
		
/*	2 lik tabandaki sayılar int, float, byte gibi değişkenlerde tutabiliriz.
		int a = Integer.parseInt("001100", 2);
		System.out.println(a); 
*/	
/*	
		int[] dizi = {0b1100, 0b011110, 0b10010};
		for (int i = 0;  i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
*/		
/*		
		int a = 5;
		Integer b =  new Integer(a);  // Boxing
		int y = b.intValue();         // Unboxing
*/
	}
	
	 public static void Primitif_Degiskenler() {
		
		 @SuppressWarnings("unused")
		 byte sayi = 5;				// 8 bittir. Tamsayı türündedir. -128 ~ 127 arasında değer alıt. Default değeri: 0' dır.
		 
		 @SuppressWarnings("unused")
		 short sayi1 = 32767;		// 16 bittir. Tamsayı türündedir. -32768 ~ 32767 arasında değer alır. Default değeri: 0' dır.
				 
		 @SuppressWarnings("unused")
		 int sayi2 = 1453;			// 32 bittir. Tamsayı türündedir. -2^31 ~ (2^31 -1) arasında değer alır. Default değeri: 0' dır.
		 
		 @SuppressWarnings("unused")
		 long sayi3 = (long) 6666;	// 64 bittir. Tamsayı türündedir. -2^63 ~ (2^63 -1) arasında değer alır. Default değeri: 0' dır.
		 
		 @SuppressWarnings("unused")
		 float sayi4 = 4.0f;		// 32 bittir. Ondalık sayı türündedir. Default değeri: 0.0f' dir. Default değeri: 0.0f' dir.
		 
		 @SuppressWarnings("unused")
		 double sayi5 = 5.111;      // 64 bittir. Ondalık sayı türündedir. Default değeri: 0.0f' dir. Default değeri: 0.0f' dir.
		 
		 @SuppressWarnings("unused")
		 char deger = 'M';			// 16 bittir. İçinde sadece 1 harf, rakan veya işaret olabilir.
	}
	 
	public static void Referans_Degiskenler() {
		
	/*	Array, class ve interface olarak 3 referans tip vardır.
		new anahtar kelimesi ile türetilirler.
		Referans tiplerde bellkte adresler tutulduğu için orjinal değerleri değişir. Primitif tiplerde değişmez.
		Primitif değişkenler serileştirme işlemine tabi tutulamazlar.
	*/
		String yazi1 ="Yakup";  //String referans tiptir. Char'ların birleşimi gibi düşünülebilir.
		String yazi2 = "BAYKARA";
		System.out.println(yazi1+ " " +yazi2);
	}

}
