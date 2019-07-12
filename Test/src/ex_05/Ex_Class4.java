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
		
		System.out.println("대국을 시작합니다.");
	}
	
	public void play() {
		ai.func1();
		
		System.out.println("대국이 진행중입니다.");
	}
	
	public void end() {
		ai.func1();
		
		System.out.println("대국을 종료합니다.");
	}
	
	public void pan() {		// Factory 함수 (함수를 여러가지 넣어 세트 단위로 실행시키는 것)
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
		
		System.out.println("대국을 시작합니다.");
	}
	
	public void play() {
		ai.func1();
		
		System.out.println("대국이 진행중입니다.");
	}
	
	public void end() {
		ai.func1();
		
		System.out.println("대국을 종료합니다.");
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
		System.out.println("내 이름은 알파고");
	}
}

class Betago implements Ai {
	Betago() {}
	
	public void func1() {
		System.out.println("내 이름은 베타고");
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
	
	public void func1() {		// interface의 함수를 상속받을 때 함수는 무조건 public
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
