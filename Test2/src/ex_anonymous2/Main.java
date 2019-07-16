package ex_anonymous2;

// Ŭ������ �������̽� ���̿� �Լ��� ������ ����. (���� ���� ����)
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
