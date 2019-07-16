package ex_anonymous4;

interface Apple {
	void func1();
}

abstract class Banana implements Apple {
//	public void func1() {}		-> ���� ���ص��� (interface �ȿ� interface�� �ִ� �Ͱ� ����)
	abstract void func2();
}

public class Main {
	public static void main(String[] args) {
		Banana b = new Banana() {
			public void func1() {
				System.out.println("b.func1");
			}
			public void func2() {
				System.out.println("b.func2");
			}
		};
		
		b.func1();
		b.func2();
		
		new Banana() {
			public void func1() {
				System.out.println("b.func1");
			}
			public void func2() {
				System.out.println("b.func2");
			}
		}.func1();
	}
}
