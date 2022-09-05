package JavaCore;

public class Equals {

	public static void main(String[] args) {
		
		// Heap alanında dinamlik olarak oluşturulur.
		String str1 = new String("ABCD");
		String str2 = new String("ABCD");

		/*	String Constant Pool' a eklenir	
 		String str1 = "ABCD";
		String str2 = "ABCD"; */
		String str3 = str2;
		
		// Reference Control 1
		if(str1 == str2)
			System.out.println("String 1 == String 2 is True");
		else
			System.out.println("String 1 == String 2 is False");
		System.out.println("----------------------------");
		
		// Reference Control 2
		if(str2 == str3)
			System.out.println("String 2 == String 3 is True");
		else
			System.out.println("String 2 == String 3 is False");
		System.out.println("----------------------------");
		
		// Contents Control
		if(str1.equals(str2))
			System.out.println("String 1 Equals String 2 is True");
		else
			System.out.println("String 1 Equals String 2 is False");
		System.out.println("----------------------------");
	}

}
