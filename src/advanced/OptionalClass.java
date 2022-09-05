package advanced;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
	
		Optional<String> bosNesne = Optional.empty();
		System.out.println(bosNesne.isPresent());
		
		String deger = "Merhaba";
		Optional<String> optional = Optional.of(deger);
		System.out.println(optional.isPresent());
		
		String s = null;
//		Optional<String> optional2 = Optional.of(s);
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		String s2 = "Selam";
		if(s2 != null)
			System.out.println(s2.length());
		
		Optional<String> optional3 = Optional.ofNullable(s2);
		optional3.ifPresent((x)-> System.out.println(x.length()));
		
		String bosIsim = null;
		String isim = Optional.ofNullable(bosIsim).orElse("Yakup");
		String isim2 = Optional.ofNullable(bosIsim).orElseGet(()->"Yakup");
		System.out.println(isim);
		System.out.println(isim2);
		

		String bos = null;
		String string = Optional.ofNullable(bos).orElse(test());			// test metodu, bos nesnesi null olsa da olmasa da çalışır.
		String string2 = Optional.ofNullable(bos).orElseGet(()->test());	// test metodu, bos nesnesi sadece null olduğu zaman çalışır. 	
		System.out.println(string);
		System.out.println(string2);
		
	}
	
	public static String test() {
		System.out.println("Test çalıştı");
		return "test";
	}
}
