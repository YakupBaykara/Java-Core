package advanced;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class NestedClass {

	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setMarka("X marka");;
		araba.setModel("Y model");
		
		Araba.Motor motor = araba.new Motor();
		motor.setHacim(1300);
		
		araba.setMotor(motor);
		
		System.out.println(araba.getMarka());
		System.out.println(araba.getModel());
		System.out.println(araba.getMotor().getHacim());
		System.out.println();
		
		System.out.println(araba);
	}
}

@Getter @Setter @ToString
class Araba {

	private String marka;
	private String model;
	private Motor motor;
	
	@Getter @Setter @ToString
	public class Motor {
		private int hacim;
	}
}	
