package Math;

import java.util.Random;

public class Formuller {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(3, 4));
		System.out.println("-------------------");
		
		System.out.println(Math.sqrt(81));
		System.out.println("-------------------");
		
		System.out.println(Math.abs(-40));						// Mutak değer alır.
		System.out.println("-------------------");
		
		System.out.println(Math.floor(45.5));					// Küsüratı atar. alta yuvarlar
		System.out.println("-------------------");
		
		System.out.println(Math.ceil(45.2));					// Küsüratı atar ve 1 ekler. Üste yuvarlar
		System.out.println("-------------------");
		
		System.out.println(Math.max(5, 8));						// return (a >= b) ? a:b; 
		System.out.println("-------------------");
		
		System.out.println(Math.min(15, 25));
		System.out.println("-------------------");
		
		System.out.println(Math.random());
		System.out.println("-------------------");				// [0, 1) arasında değerler verir.
		
		System.out.println((int) (Math.random()*10));			//  [0, 9] arasında değerler verir
		System.out.println("-------------------");
		
		System.out.println(Math.toDegrees(0.5));				// Radyanı dereceye çevirir.
		System.out.println("-------------------");

		System.out.println(Math.toRadians(45));					// Dereceyi radyana çevirir.
		System.out.println("-------------------");
		
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.asin(1));
		System.out.println(Math.sin(0.7));
		System.out.println("-------------------");

		System.out.println(Math.log10(5));
		System.out.println("-------------------");
		
		RandomArray();
		
		Random();
	}
	
	static void RandomArray() {
		int[] array = new int[6];
		Random r = new Random();								// Random sınıfı ile sayı üretme.
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);							// [0, 99] araasında değerler verir.
		}
		for (int i : array) {
			System.out.print(i +"\t");
		}
		System.out.println();
		System.out.println("-------------------");				

	}
	
	static void Random() {
		Random r = new Random();
		
		System.out.println("Int : " +r.nextInt());				// [-21474883648, 21474883647] arasında değerler verir.
		System.out.println("Int : " +r.nextInt(10));			// [0, 9] araasında değerler verir.
		System.out.println("Boolean : " +r.nextBoolean());
		System.out.println("Double : " +r.nextDouble());
		System.out.println("Float : " +r.nextFloat());
		System.out.println("Long : " +r.nextFloat());
		System.out.println("Gaussian : " +r.nextGaussian());
	}
}
