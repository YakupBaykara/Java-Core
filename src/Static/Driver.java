package Static;

class A{
	static int i = 100;
	
	static {
		i = i-- - --i;
		System.out.println("First :" +i);
	}
	
	// Instance block
	
	{
		i = i++ + ++i;
		System.out.println("Second 1:" +i);
	}
	
	public A() {

		i = i++ + ++i;
		System.out.println("Second 2 :" +i);
	}
}

class B extends A{
	static {
		i = --i - i--;
		System.out.println("Third :" +i);
	}
	{
		i = ++i + i++;
		System.out.println("Forth :" +i);
	}
}

public class Driver {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.i);
	}

}
