package Singleton;


//enum을 이용한 방식
//enum : 고정된 상수들만 모아놓은 클래스 (클래스처럼 메소드, 생성자 모두 가질 수 있음)
//		     프로그램 내에서 한번만 실행되는 특징이 있다. 상수이기 때문에 한번 실행되면 변경 불가능

public enum singleton {
	INSTANCE;	// enum으로 선언된 상수는 자동으로 static, final 속성이 붙음
	
	public static singleton getInstance() {
		return INSTANCE;
	}
}
