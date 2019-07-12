package ex_03;
import java.util.Random;

/*class Apple {

	Apple() {}	// 비어있는 생서자라도 만들어 놓자!!
		
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

class Orange extends Apple {		//상속
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
		
		
		// 부모와 자식에게 같은 이름의 함수가 있을 때 자식의 함수를 먼저 찾기 때문에 부모의 함수가 '가려졌다'라고 표현
		// 오버라이딩 된 함수는 무조건 자식에게 함수가 있는지 먼저 찾아온다!
		
		a3.func1(); 	// orange에서 함수 찾고 없으면 apple에서 함수 찾음 둘다 없으면 에러
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
		 * a1.func1(); // a1.func2(); -> 자식 클래스의 메모리는 존재하지만 문법은 부모의 문법만 가능하기 때문에 쓸 수 없다.
		 * a1.func3(); // 오버라이딩 되어있기 때문에 실행
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

		a4[num].func3(); // 위의 스위치 문과 동일 (다형성)

		Dog dog = new Dog();
		dog.func1(new Orange());
		dog.func1(new Banana());
		dog.func1(new Kiwi());
	}
}