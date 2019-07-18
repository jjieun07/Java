package lambda6;

// ----------실전예제---------- //
interface A {
	void func1();
}

interface B {
	A func2();
}

public class Main {
	public static void main(String[] args) {
		B b1 = new B() {
			public A func2() {
				return new A() {
					public void func1() {
						System.out.println("1");
					}
				};
			}
		};

		System.out.println("----anonymous----");
		A a1 = b1.func2();
		a1.func1();

		System.out.println("----Lambda----");
		
		B b2 = () -> () -> {System.out.println("2");};
		
		A a2 = b2.func2();
		a2.func1();

	}
}
