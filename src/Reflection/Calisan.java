package Reflection;

public class Calisan {

	public String isim;
	public String soyisim;
	public int maas;
	@SuppressWarnings("unused")
	private int calisan_no;
	@SuppressWarnings("unused")
	private float calisan_seviye;
	
	Calisan() {}
	
	public Calisan(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;
		System.out.println("Public Constructor");
	}
	
	public String isimSoyisimGetir() {
		return this.isim +" " +this.soyisim;
	}
	
	public void maasDegis(int maas) {
		this.maas = maas;
	}
}
