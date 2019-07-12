package ex_05;

interface Boardgame {
	void start();
	void play();
	void end();
	void pan();
}

class Janggi implements Boardgame {
	Ai ai;
	Janggi(Ai ai) {
		this.ai = ai;
	}
	
	public void start() {
		ai.func1();
		
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	public void play() {
		ai.func1();
		
		System.out.println("�뱹�� �������Դϴ�.");
	}
	
	public void end() {
		ai.func1();
		
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	public void pan() {		// Factory �Լ� (�Լ��� �������� �־� ��Ʈ ������ �����Ű�� ��)
		this.start();
		this.play();
		this.end();
	}
}

class Baduk implements Boardgame{
	Ai ai;
	Baduk(Ai ai) {
		this.ai = ai;
	}
	
	public void start() {
		ai.func1();
		
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	public void play() {
		ai.func1();
		
		System.out.println("�뱹�� �������Դϴ�.");
	}
	
	public void end() {
		ai.func1();
		
		System.out.println("�뱹�� �����մϴ�.");
	}
	
	public void pan() {
		this.start();
		this.play();
		this.end();
	}
}

interface Ai {
	void func1();
}

class Alphago implements Ai {
	Alphago() {}
	
	public void func1() {
		System.out.println("�� �̸��� ���İ�");
	}
}

class Betago implements Ai {
	Betago() {}
	
	public void func1() {
		System.out.println("�� �̸��� ��Ÿ��");
	}
}


/*
 * abstract class Animal { abstract void func1(); }
 * 
 * class Dog extends Animal { Dog() {}
 * 
 * void func1() { System.out.println("Dog.func1"); }
 * 
 * void func2() { System.out.println("Dog.func2"); }
 * 
 * void func3() { System.out.println("Dog.func3"); }
 * 
 * }
 */


interface Animal {
	void func1();
	void func2();
}

class Dog implements Animal {
	Dog() {}
	
	public void func1() {		// interface�� �Լ��� ��ӹ��� �� �Լ��� ������ public
		System.out.println("Dog.func1");
	}
	
	public void func2() {
		System.out.println("Dog.func2");
	}
	
}public class Ex_Class4 {
	public static void main(String[] args) {

		Janggi janggi = new Janggi(new Alphago());
		
		/*
		 * janggi.start(); janggi.play(); janggi.end();
		 */
		janggi.pan();
		
		System.out.println("---------------------");
		
		Baduk baduk = new Baduk(new Betago());
		
		/*
		 * janggi.start(); janggi.play(); janggi.end();
		 */
		baduk.pan();
		
		System.out.println("=======================");
		
		Dog d = new Dog();
		d.func1();
	}
}
