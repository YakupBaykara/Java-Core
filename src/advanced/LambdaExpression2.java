package advanced;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import advanced.Kisi.Cinsiyet;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class LambdaExpression2 {
	
	public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
		
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getCinsiyet().equals(cinsiyet))
				System.out.println(kisi);
		}
	}
	
	public static void yasaGöreFiltrele(List<Kisi> kisiler, int min, int max) {
		
		for(int i=0; i<kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getYas() >= min && kisi.getYas() <= max)
				System.out.println(kisi);
		}
	}
		
	// Anonim class için filtreleme metodu
	public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {
		
		for(int i=0; i<kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisiFiltresi.filtrele(kisi))
				System.out.println(kisi);
		}
	}

	public static void main(String[] args) {
	
		Kisi kisi = new Kisi("Yakup", LocalDate.parse("1990-05-16"), "xxx@gmail.com", Cinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("Yusuf", LocalDate.parse("2020-07-10"), "yyy@gmail.com", Cinsiyet.ERKEK);
		Kisi kisi3 = new Kisi("Kudret", LocalDate.parse("1997-01-09"), "zzz@gmail.com", Cinsiyet.KADIN);
			
		ArrayList<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		
		// Normal metdolar
		cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.ERKEK);
		System.out.println("-------------------------------");
		
		yasaGöreFiltrele(kisiler, 1, 40);
		System.out.println("-------------------------------");
		
		// Anonim class kullanımı
		System.out.println("Anonim class ile filtre");
		kisiFiltrele(kisiler, new KisiFiltresi() {
			
			@Override
			public boolean filtrele(Kisi kisi) {
				return kisi.getYas() >= 1 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.KADIN);
			}
		});
		System.out.println("-------------------------------");
		
		// Lambda kullanımı
		System.out.println("Lambda ile filtreleme");
		kisiFiltrele(kisiler, (x) -> x.getYas() >= 1 && x.getCinsiyet().equals(Kisi.Cinsiyet.KADIN) );
	}

}

@Getter @Setter @AllArgsConstructor @EqualsAndHashCode
class Kisi {

	public enum Cinsiyet {KADIN, ERKEK}
	
	private String isim;
	private LocalDate dogumTarihi;
	private String email;
	private Cinsiyet cinsiyet;
	
	public int getYas() {
		return LocalDate.now().getYear() - dogumTarihi.getYear();
	}

	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", dogumTarihi=" + dogumTarihi + ", email=" + email + ", cinsiyet=" + cinsiyet +", Yas=" +getYas() +"]";
	}		
}

interface KisiFiltresi {
	boolean filtrele(Kisi kisi);
}
