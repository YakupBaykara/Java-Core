package Math;

public class Faktoriyel {

	public static void main(String[] args) {
		
		System.out.println(recursiveFaktoriyel(5));
		System.out.println(iterativeFakoriyel(5));
		
	}
	
	static int recursiveFaktoriyel(int sayi) {
		
		if(sayi == 1)
			return 1;
		else
			return (sayi*(recursiveFaktoriyel(sayi-1)));
	}
	
	static int iterativeFakoriyel(int sayi) {
		
		int deger = 1;
		for (int i = sayi; i > 0; i--) {
			deger *= i;
		}
		return deger;
	}
}
