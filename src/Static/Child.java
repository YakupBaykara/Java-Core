package Static;

class Parent {

	public static void foo() {
		System.out.println("I am foo in Super");
	}
	public void bar() {
		System.out.println("I am bar in Super");
	}
}

class Child extends Parent {
	
	public static void foo() {
		System.out.println("I am foo in Child");
	}
	public void bar() {
		System.out.println("I am bar in Child");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent par = new Child();
		Child child = new Child();
		
		par.foo();
		child.foo();
		System.out.println("--------------");
		
		par.bar();
		child.bar();
		
	}
}
