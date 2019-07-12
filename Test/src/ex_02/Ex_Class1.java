package ex_02;
class Apple {
	int num;
	
	//1번 : 생성자 이름은 항상 class 이름과 동일해야 한다. 객체가 생성될 때 단 한번 실행
	Apple() {
		num = 0;
		System.out.println("생성자 Call");
		System.out.println(this.hashCode());
	}
	
	Apple(int a, int b) {
		num = a + b;
	}
	
	Apple(int num) {
		this.num = num;
	}
	
	void func01() {
		System.out.println("func01 Call");
	}
	
	void func02(int a, int b) {
		System.out.println(a + " " + b);
	}
	
	int func03() {
		return 100;
	}
	
	int func04(int a, int b) {
		return a + b;
	}
	
	Apple func05() {	// 디버깅 용도로 자주 사용
		return this;
	}
	
	void func06() {
		System.out.println("func06 Call");
	}
	
	int func06(int a) {
		return 0;
	}
}

public class Ex_Class1 {		// 하나의 파일안에 public class는 단 하나!!
	public static void main(String[] args) {
		Apple a = new Apple();
		
		System.out.println(a.hashCode());
		System.out.println(a.num);
		a.func01();
		a.func02(1, 2);
		System.out.println(a.func03());
		System.out.println(a.func04(1, 2));
		
		a.func05();
		
		
		//chaining 구조
		a.func05().func05().func06();	
		
		a
		.func05()
		.func05()
		.func06();
	
	}
}
