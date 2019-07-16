package ex_anonymous3;

interface Apple{
	void func1();
}

class Banana implements Apple {
	public void func1() {
		System.out.println("Banana.func1");
	}
}

public class Main {
	public static void main(String[] args) {
		// ex01
		Banana b = new Banana();
		b.func1();
		
		// ex02
		Apple a = new Apple() {
			public void func1() {
				System.out.println("anonymous function func1");
			}
		};
		
		a.func1();
		
		// ex03_���� �ڵ� ����
		Banana ba = new Banana() {
			public void func1() {
				System.out.println("ba.func1");
			}
		};
		
		ba.func1();
	}
}
