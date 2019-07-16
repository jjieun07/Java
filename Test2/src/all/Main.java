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
// ex03 _ �������
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
// interface - �������� ��ü ���� �Ұ�, �̱��� �Լ��� ��� ����, �����Լ��� �ݵ�� public
interface Apple {
	void func1();
	void func2();
}

class Banana implements Apple {
	// interface ���� �Լ��� public!!
	public void func1() {
		
	}
	public void func2() {
		
	}
}
*/

/*
// ex06 _ ���� �������̽� ���
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
// ex07 _ ���� Ŭ���� ��� -> �Ұ�
class Apple {
	
}

class Banana {
	
}

class Orange extends Apple, Banana{
	
}
*/

/*
// ex08 _ class�� interface ���� ���
class Apple {
	
}

interface Banana {
	void func1();
}

interface Orange {
	void func2();
}

// class�� interface�� ���ÿ� ��ӹ��� ���� class ����!
class Kiwi extends Apple implements Banana, Orange {
	public void func1() {
		
	}
	
	public void func2() {
		
	}
}
*/

/*
// ex09 _ interface�� interface ���
interface Apple {
	void func1();
}

// interface�� interface�� ��ӹ��� ���� extends
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
// ex10 _ interface �ȿ� interface

// �ΰ��� �������̽��� ������ ���谡 ���� �� ���ο� ����
//  ex)
//	interface ���� {
//		interface �ѽ� {}
//		interface �߽� {}
//		interface �Ͻ� {}
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
	// ���� �������̽� �Ű�Ⱦ�
	public void func1() {
		
	}
}

// ���� �������̽� ���
class Kiwi implements Apple.Banana {
	public void func2() {
		
	}
}
*/

/*
// ex11 _ interface �ȿ� class
// interface �� class ���̿� ����ȯ ���谡 ���� �� ���
interface Apple {
	void func1();
	
	class Banana {
		void func2() {
			
		}
	}
}

// �ȿ� �ִ� Ŭ������ �Ⱦ��� ��� - Ŭ���� ����
class Orange implements Apple {
	public void func1() {
		
	}
}

// interface ���� Ŭ���� ���
class Kiwi extends Apple.Banana {
	
}
*/

/*
// ex12 _ class �ȿ� class
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
	//	Apple a = new Apple() 	-> Apple��ü ���� ���� _Apple�� �߻� class�̱� ����
	//	Apple a = new Banana();
	//	a.func1();
		
		////******************************////
		
		// ex12 ���� Apple a = new Apple(); a.func1();
		  
		//Apple.Banana b = a.new Banana(); //inner class ���� b.func2();
		 	
		////******************************////
		
	    ////******************************////
		// interface�� ��ü�� ������ �� ������ �͸�Ŭ������ �����ϸ� ���� ����	(ex13 ����)
		//Apple a = new Apple() {
		//	public void func1() {
		//		
		//	}
		//};	
		
	    
		//**********************************//
		// ��ü�� ���� ������ �޸𸮰� �����ڸ��� �����
		// �͸�ü(��ü �̸� ����) _ �ѹ����� �Ⱦ�
		new Apple() {
			public void func1() {
				
			}
		}.func1();
		
		////******************************////
	}
}
