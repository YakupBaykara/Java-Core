package advanced;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTime {
	public static void main(String[] args) {
		
		// Date 
		System.out.println(new Date());
		System.out.println("------------------------------");
		
		System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
		System.out.println("------------------------------");
		
		// Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 6, 30);
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println("------------------------------");
		
		//  LocalTime ve LocalDateTime sınıflarında da aynı işlemler yapılabilir.		 
		System.out.println(LocalDate.now());
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.of(2022, 6, 30));
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.parse("2022-06-30"));
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.now().plus(1, ChronoUnit.DAYS));
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.now().plusDays(1));
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.parse("2022-06-30").getDayOfWeek());
		System.out.println("------------------------------");
		
		System.out.println(LocalDate.now().isBefore(LocalDate.parse("2022-05-25")));
		System.out.println("------------------------------"); 
		
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now()));  // SHORT, MEDIUM, LONG, FULL
		System.out.println("------------------------------"); 
		
		System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(LocalDate.now()));
		System.out.println("------------------------------"); 
		
//		example();
		
//		getCustomCalendar(30, 06, 2022);		// 06->Temmuz. index olarak 0'dan başladığı için
					
	}
	
	public static void example() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tarih Giriniz: ");
		LocalDate tarih = LocalDate.parse(scanner.nextLine());
		
		System.out.print("Saat Giriniz: ");
		LocalTime saat = LocalTime.parse(scanner.nextLine());
		
		LocalDateTime tarihSaat = LocalDateTime.of(tarih, saat);
		System.out.println(tarihSaat);
		
		System.out.println("İşlem (0 Ekle), (1 Çıkar)");
		int islem = Integer.parseInt(scanner.nextLine());
		if(islem ==0 || islem == 1) {
			
			ChronoUnit[] chronoUnits = ChronoUnit.values();
			System.out.print("Birim: ");
			for(int i = 0; i < chronoUnits.length; i++) {
				System.out.print(chronoUnits[i] + "(" + (i) + ") ");
			}
			
			ChronoUnit birim = chronoUnits[Integer.parseInt(scanner.nextLine())];
			System.out.print("Değer: ");
			int deger = Integer.parseInt(scanner.nextLine());
			if (islem == 0) {
				System.out.println(tarihSaat.plus(deger, birim));
			} else {
				System.out.println(tarihSaat.minus(deger, birim));
			}
 		} else {
 			System.out.println("Lütfen 0 veya 1 giriniz!");
 		}
		
		scanner.close();
	}
	
	public static void getCustomCalendar(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);

		Date date = calendar.getTime();
		System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(date));
	}
}
