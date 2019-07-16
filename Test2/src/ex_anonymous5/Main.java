package ex_anonymous5;

class Apple {
	interface Banana {
		void func1();
	}
	interface Orange {
		void func2();
	}
}


public class Main {
	public static void main(String[] args) {
		Apple.Banana ab = new Apple.Banana() {
			public void func1() {
				System.out.println("Apple.Banana.func1");
			}
		};
		
		ab.func1();
		
		new Apple.Orange() {
			public void func2() {
				System.out.println("Apple.Orange.func2");
			}
		}.func2();
	}
}
