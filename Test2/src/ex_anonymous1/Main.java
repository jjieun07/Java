package ex_anonymous1;

interface Apple {
	void func1();
}

class Banana {
	void func2() {
		System.out.println("Banana.func2");
	}
	
	void func3(Apple apple) {
		System.out.println("Banana.func3");
		apple.func1();
	}
}

class Orange implements Apple {
	public void func1() {
		System.out.println("Orange.func1");
	}
}
public class Main {
	public static void main(String[] args) {
		// ex01
		Orange o = new Orange();
		
		// ex02
		Banana m = new Banana();
		m.func3(new Apple() {
			// 함수 인수로 코드를 전달
			public void func1() {
				System.out.println("Apple.func1 (ex02)");
			}
		});
		
		// ex03
		new Apple() {
			public void func1() {
				System.out.println("Apple.func1 (ex03)");
			}
		}.func1();
	}
}
