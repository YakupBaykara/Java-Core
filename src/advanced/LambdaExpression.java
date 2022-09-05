package advanced;

public class LambdaExpression {
	public static void main(String[] args) {
		
/*Anonim sınıf oluşuruldu.
 * 
		SayiOlustur sayiOlustur = new SayiOlustur() {
			
			@Override
			public double olustur() {
				return 15.0;
			}
		};
*/		

		/* İlk örnek
  		LambdaExamples sayi = () -> 15.0;  // Anonim sınıfın yaptığı işi yapıyor.s		
		System.out.println(sayi.sayiOlustur()); */
		

		/* 2. örnek
		LambdaExamples selam = () -> "Merhaba";
		System.out.println(selam.selam()); */
		
		/* 3. örnek
		LambdaExamples selam2 = (s) -> "Merhaba " + s;
		System.out.println(selam2.selam2("Yakup"));		*/
		
		/*
		LambdaExamples topla = (a, b) -> a+b;
		System.out.println(topla.topla(10.0, 15.0)); */
	}
}

interface LambdaExamples {

//	double sayiOlustur();    // İlk örnek için kullanıldı.
	
//	String selam();			 // 2. örnek için kullanıldı.
	
//	String selam2(String isim);
	
	double topla(double x, double y);
}

