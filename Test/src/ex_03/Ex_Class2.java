package ex_03;
import java.util.Random;

/*class Apple {

	Apple() {}	// ����ִ� �����ڶ� ����� ����!!
		
	Apple(int n) {}
	
	void func1() {
		System.out.println("func1 call");
	}
	
	void func3() {
		System.out.println("apple func3 call");
	}
	
	void func5() {
		func6();
		func7();
	}
	
	void func6() {
		System.out.println("apple func6 call");
	}
	
	void func7() {
		System.out.println("func7 call");
	}
}

class Orange extends Apple {		//���
	void func2() {
		System.out.println("func2 call");
	}
	
	void func3() {
		System.out.println("orange func3 call");
	}
	
	void func4() {
		super.func3();
	}
	
	void func6() {
		System.out.println("orange func6 call");
	}
}


public class Ex_Class2 {
	public static void main(String[] args) {
		Apple a1 = new Apple();
		Apple a2 = new Apple(10);
		
		Orange a3 = new Orange();
		
		
		// �θ�� �ڽĿ��� ���� �̸��� �Լ��� ���� �� �ڽ��� �Լ��� ���� ã�� ������ �θ��� �Լ��� '��������'��� ǥ��
		// �������̵� �� �Լ��� ������ �ڽĿ��� �Լ��� �ִ��� ���� ã�ƿ´�!
		
		a3.func1(); 	// orange���� �Լ� ã�� ������ apple���� �Լ� ã�� �Ѵ� ������ ����
		a3.func2();
		a3.func3();
		a3.func4();
		a3.func5();
	}
}

*/

class Apple {
	Apple() {
	}

	void func1() {

	}

	void func3() {
		System.out.println("apple.func3");
	}
}

class Orange extends Apple {
	Orange() {
	}

	void func2() {

	}

	void func3() {
		System.out.println("orange.func3");
	}
}

class Banana extends Apple {
	Banana() {
	}

	void func3() {
		System.out.println("banana.func3");
	}
}

class Kiwi extends Apple {
	Kiwi() {
	}

	void func3() {
		System.out.println("kiwi.func3");
	}
}

class Dog {
	Dog() {
	}
	/*
	 * void func1(Orange o) { o.func3(); }
	 * 
	 * void func2(Banana b) { b.func3(); }
	 * 
	 * void func3(Kiwi k) { k.func3(); }
	 */

	void func1(Apple a) {
		a.func3();
	}
}

public class Ex_Class2 {
	public static void main(String[] args) {

		/*
		 * Apple a1 = new Orange();
		 * 
		 * a1.func1(); // a1.func2(); -> �ڽ� Ŭ������ �޸𸮴� ���������� ������ �θ��� ������ �����ϱ� ������ �� �� ����.
		 * a1.func3(); // �������̵� �Ǿ��ֱ� ������ ����
		 */

		Apple a1 = new Orange();
		Apple a2 = new Banana();
		Apple a3 = new Kiwi();

		Random random = new Random();

		int num = random.nextInt(3);

		switch (num) {
		case 0:
			a1.func3();
			break;
		case 1:
			a2.func3();
			break;
		case 2:
			a3.func3();
			break;
		}

		Apple[] a4 = new Apple[3];

		a4[0] = new Orange();
		a4[1] = new Banana();
		a4[2] = new Kiwi();

		a4[num].func3(); // ���� ����ġ ���� ���� (������)

		Dog dog = new Dog();
		dog.func1(new Orange());
		dog.func1(new Banana());
		dog.func1(new Kiwi());
	}
}