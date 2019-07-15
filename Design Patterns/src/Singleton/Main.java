package Singleton;

class Singleton_1 {
	// static으로 생성할 "단 하나의 인스턴스"를 담을 변수를 선언
	private static Singleton_1 instance;
	
	// 생성자가 private로 선언되어 있으면 new 키워드로 인스턴스 생성 불가
	private Singleton_1() {}
	
	// new가 아닌, getInstance()라는 메소드를 이용하여 객체 생성 (외부에서 접근이 가능해야 하기 때문에 public)
	public static Singleton_1 getInstance() {
		/*
		 * if문을 이용하여 메로리 낭비 방지 
		 * static은 컴파일시 메모리를 할당하지만 static이어도 객체를 생성하는 부분이 있을 경우 객체가 처음 생성될 때 메모리 할당
		 */
		
		// instance가 null인 경우에만 객체를 생성
		if(instance == null) {
			instance = new Singleton_1();
		}
		return instance;	// 외부에서 get 함수를 호출하면 유일한 인스턴스를 반환
	}
}

// Thread safe Lazy initalization
class Singleton_2 {
	private static Singleton_2 instance;
	private Singleton_2() {}	
	
	// synchronized를 이용하여 동기화 _ but 자바 내부적으로 메서드나 변수에 동기화를 위한 block과 unblock을 처리하면서 성능 저하
	public static synchronized Singleton_2 getInstance() {
		if(instance == null) {
			instance = new Singleton_2();
		}
		return instance;
	}
}

// Thread safe Lazy initalization + Double-checked locking
class Singleton_3 {
	private static Singleton_3 instance;
	private Singleton_3() {}	
	
	// 인스턴스가 없는 경우에만 synchronized 사용
	// 성능저하는 완화시킬 수 있으나 근본적인 해결책은 ㄴㄴ
	public static Singleton_3 getInstance() {
		synchronized (Singleton_3.class) {
			if (instance == null) {
				instance = new Singleton_3();
			}
		}
		return instance;
	}
}
// Holder에 의한 초기화
class Singleton_4 {
	private static class LazyHolder {
		// instance가 static이기 때문에 클래스 로딩시점에 한번만 호출
		// final을 사용하여 값이 다시 할당되지 않도록 만듦
		static final Singleton_4 instance = new Singleton_4();
	}
	
	// getInstance() 함수가 호출되는 순간 위 코드 발동(유일한 인스턴스 생성)
	public static Singleton_4 getInstance() {
		return LazyHolder.instance;
	}
}

public class Main {
	public static void main(String[] args) {
		/*
		Singleton_1 s1 = Singleton_1.getInstance();
		Singleton_1 s2 = Singleton_1.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		*/
	}
}
