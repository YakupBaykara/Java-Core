package Scanner;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class VeriAlma {

	public static void main(String[] args) {
		
//		kelimelereAyir();
//		sayiTahmin();
		sayiTahminJOption();

	}
/*	
	scanner.nextInt();				// Klavyeden int değerler okur.
	scanner.nextByte();				// Klavyeden byte değerler okur.
	scanner.nextFloat();			// Klavyeden float değerler okur.
	scanner.nextDouble();			// Klavyeden double değerler okur.
	scanner.nextBoolean();			// Klavyeden mantıksal değerler okur.
	scanner.nextLine();				// Klavyeden String değerler okur. Boşluk varsa bile tamamını okur
	scanner.next();					// Klavyeden String değerleri boşluğa kadar okur. 
*/	
/*
	JOptionPane.showMessageDialog(null, "Bilgilendirme Mesajı");
	JOptionPane.showInternalMessageDialog(null, "Bilgilendirme Mesajı", "Sonuç", JOptionPane.OK_OPTION);
*/
	
	static void kelimelereAyir() {
		System.out.println("Bir cümle giriniz");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			String veri = scanner.next();
			System.out.println(veri);		
		}
	}
	
	static void sayiTahmin() {
		int deger = 1;
		Random r = new Random();
		int sayi = r.nextInt(10);						// 0-10 arasında rastgeler int sayılar üretir. 10 dahil değil
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Lütfen tahmin girin (0-10) :");
			int tahmin = scanner.nextInt();
			if (tahmin == sayi) {
				System.out.println(deger+ ". tahminde bildiniz");
				break;
			} else {
				deger += 1;
			}
		}
 	}
	
	static void sayiTahminJOption() {
		int deger = 1;
		Random r = new Random();
		int sayi = r.nextInt(10);						// 0-10 arasında rastgeler int sayılar üretir. 10 dahil değil
		
		while(true) {
			String tahmin = JOptionPane.showInputDialog("Tahmin Gir: ");
			int t = Integer.parseInt(tahmin);
			if (t == sayi) {
				String mesaj = "Tahmin doğru! - " +deger+". tahminde bildiniz";
				JOptionPane.showMessageDialog(null, mesaj);
				break;
			} else {
				deger++;
			}
		}
	}
}
