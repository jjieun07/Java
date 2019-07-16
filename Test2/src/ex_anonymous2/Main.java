package ex_anonymous2;

// 클래스와 인터페이스 사이에 함수를 만들지 않음. (만들 수는 있음)
class Apple {
	interface Banana {
		void func1();
	}
}

class Orange implements Apple.Banana {
	public void func1() {
		System.out.println("Orange.func1");
	}
}

public class Main {
	public static void main(String[] args) {
		Orange o = new Orange();
		o.func1();

		Apple.Banana ab = new Apple.Banana() {
			public void func1() {
				System.out.println("ab.func1");
			}
		};
		
		ab.func1();
		
		new Apple.Banana() {
			public void func1() {
				System.out.println("Apple.Banana.func1");
			}
		}.func1();
	}
}
