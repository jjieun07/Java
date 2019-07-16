package ex_anonymous6;

/*
class A {
	interface B {
		void func1();
	}	
}

class C {
	void func2(A.B ab) {
		ab.func1();
	}
}

public class Main {
	public static void main(String[] args) {
		C c = new C();
		c.func2(new A.B() {
			public void func1() {
				System.out.println("A.B.func1");
			}
		});
	}
}
*/

// 실전 예제 _ 안드로이드 setOnClickListener

class View {
	interface onClickListener {
		void func1();
	}	
}

class Button {
	void setOnClickListener(View.onClickListener ab) {
		ab.func1();
	}
}

public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListener(new View.onClickListener() {
			public void func1() {
				System.out.println("View.onClickListener.func1");
			}
		});
	}
}
