package all;

/*
// ex01
class Apple {
	int num;
	
	Apple() {
		num = 3;
	}
	
	void func1() {
		System.out.println(num);
	}
}
*/

/*
// ex02
class Apple {
	void func1() {
		
	}
}

class Banana extends Apple {
	void func2() {
		
	}
	void func3() {
		
	}
}
*/

/*
// ex03 _ 계층상속
class Apple {
	void func1() {
		
	}
}

class Banana extends Apple {
	void func2() {
		
	}
}

class Orange extends Banana {
	void func3() {
		
	}
}
*/

/*
// ex04
abstract class Apple {
	void func1() {
		
	}
	
	abstract void func2();
}

class Banana extends Apple {
	
	void func2() {
		
	}
}
*/

/*
// ex05
// interface - 직접적인 객체 생성 불가, 미구현 함수는 모두 구현, 구현함수는 반드시 public
interface Apple {
	void func1();
	void func2();
}

class Banana implements Apple {
	// interface 구현 함수는 public!!
	public void func1() {
		
	}
	public void func2() {
		
	}
}
*/

/*
// ex06 _ 다중 인터페이스 상속
interface Apple {
	void func1();
}

interface Banana {
	void func2();
}

class Orange implements Apple, Banana { 
	public void func1() {
		
	}
	public void func2() {
		
	}
}
*/

/*
// ex07 _ 다중 클래스 상속 -> 불가
class Apple {
	
}

class Banana {
	
}

class Orange extends Apple, Banana{
	
}
*/

/*
// ex08 _ class와 interface 동시 상속
class Apple {
	
}

interface Banana {
	void func1();
}

interface Orange {
	void func2();
}

// class와 interface를 동시에 상속받을 때는 class 먼저!
class Kiwi extends Apple implements Banana, Orange {
	public void func1() {
		
	}
	
	public void func2() {
		
	}
}
*/

/*
// ex09 _ interface가 interface 상속
interface Apple {
	void func1();
}

// interface가 interface를 상속받을 때는 extends
interface Banana extends Apple {
	void func2();
}

class Orange implements Banana {
	public void func1() {
		
	}
	public void func2() {
		
	}
}
*/

/*
// ex10 _ interface 안에 interface

// 두개의 인터페이스가 밀접한 관계가 있을 때 내부에 포함
//  ex)
//	interface 음식 {
//		interface 한식 {}
//		interface 중식 {}
//		interface 일식 {}
//	}

interface Apple {
	void func1();
	interface Banana {
		void func2();
	}
	interface Melon {
		
	}
}

class Orange implements Apple {
	// 내부 인터페이스 신경안씀
	public void func1() {
		
	}
}

// 내부 인터페이스 사용
class Kiwi implements Apple.Banana {
	public void func2() {
		
	}
}
*/

/*
// ex11 _ interface 안에 class
// interface 와 class 사이에 밀접환 관계가 있을 때 사용
interface Apple {
	void func1();
	
	class Banana {
		void func2() {
			
		}
	}
}

// 안에 있는 클래스를 안쓰는 경우 - 클래스 무시
class Orange implements Apple {
	public void func1() {
		
	}
}

// interface 안의 클래스 사용
class Kiwi extends Apple.Banana {
	
}
*/

/*
// ex12 _ class 안에 class
class Apple {
	void func1() {
		
	}
	
	class Banana {
		void func2() {
			
		}
	}
}
*/


// ex13
interface Apple{
	void func1();
}

/*
 * class Banana implements Apple { public void func1() {
 * 
 * } }
 */

public class Main {
	public static void main(String[] args) {
	//	Apple a = new Apple() 	-> Apple객체 생성 ㄴㄴ _Apple이 추상 class이기 때문
	//	Apple a = new Banana();
	//	a.func1();
		
		////******************************////
		
		// ex12 예제 Apple a = new Apple(); a.func1();
		  
		//Apple.Banana b = a.new Banana(); //inner class 생성 b.func2();
		 	
		////******************************////
		
	    ////******************************////
		// interface는 객체를 생성할 수 없지만 익명클래스로 구현하면 생성 가능	(ex13 예제)
		//Apple a = new Apple() {
		//	public void func1() {
		//		
		//	}
		//};	
		
	    
		//**********************************//
		// 객체가 없기 때문에 메모리가 만들자말자 사라짐
		// 익명객체(객체 이름 없음) _ 한번쓰고 안씀
		new Apple() {
			public void func1() {
				
			}
		}.func1();
		
		////******************************////
	}
}
