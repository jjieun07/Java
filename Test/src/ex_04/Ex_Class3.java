package ex_04;

class Apple {
//	Banana ba;
//	Orange or;
	Fruit fr;

	/*
	 * Apple(Banana ba) { this.ba = ba; }
	 * 
	 * Apple(Orange or) { this.or = or; }
	 */

	Apple(Fruit fr) {		// ����(injection) - �������� �̿��Ͽ� �μ� ����
		this.fr = fr;
	}

	void func1() {
		//ba.func3();
		//or.func3();
		fr.func3();
	}

	void func2() {
		//ba.func3();
		//or.func3();
		fr.func3();
	}
}

class Fruit {
	Fruit() {
	
	}

	void func3() {

	}
}

class Banana extends Fruit {
	Banana() {
	}

	void func3() {
		System.out.println("banana.func3");
	}
}

class Orange extends Fruit {
	Orange() {
	}

	void func3() {
		System.out.println("orange.func3");
	}
}

public class Ex_Class3 {
	public static void main(String[] args) {

		/*
		 * Apple a1 = new Apple();
		 * 
		 * a1.func1(new Banana()); a1.func2(new Banana());
		 */

		// ������ �ٳ����� �����Ͽ� ���� ��ü ���, �Լ��� ���� �μ��� �������� ��� ����
		Apple a1 = new Apple(new Banana());

		a1.func1();
		a1.func2();
	}
}
