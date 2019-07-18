package lambda2;

interface A1 {
	void x();
}

interface A2 {
	void x(int num);
}

interface A3 {
	int x();
}

interface A4 {
	int x(int num);
}


class B {
	public void y1(A1 a) {
		a.x();
	}

	public void y2(A2 a, int num) {
		a.x(num);
	}
	
	public void y3(A3 a) {
		System.out.println("3" + a.x());
	}
	
	public void y4(A4 a, int num ) {
		System.out.println("4" + a.x(num));
	}
}

public class Main {
	public static void main(String[] args) {
		B b = new B();
		int num = 10;

		b.y1(new A1() {

			public void x() {
				System.out.println("1");
			}
		});
		
		b.y1(() -> System.out.println("1"));
		
		
		b.y2(new A2() {
			public void x(int a) {
				System.out.println("2 - num : " + a);
			}
		}, num);
		
		b.y2((a) -> System.out.println("2 - num : " + a), num);
		
		b.y3(new A3() {
			public int x() {
				return num;
			}
		});
		
		b.y3(() -> num);
		
		b.y4(new A4() {
			public int x(int num) {
				return num + 10;
			}
		}, num);
		
		b.y4((a) -> {return num + 10;}, num);
	}
}
