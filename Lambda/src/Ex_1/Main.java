package Ex_1;

interface T {
	void func1() throws Exception;
}

class A {
	void func2(T t) {
		System.out.println('1');
		
		try {
			t.func1();
		} catch (Exception e) {
			
		}
		
		System.out.println('2');
		
		
		/* 
		 System.out.println('1');
		 
		 try { Thread.sleep(2000); System.out.println("호랑이"); } catch
		 (InterruptedException e) { e.printStackTrace(); }
		 
		 System.out.println('2');
		 */
		 

	}
	void func1() {
		
		func2(new T() {
		// func1()에서 발생하는 exception을 책임지지 않기 때문에 func1을 부른 함수에게 책임 넘김.
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("호랑이");
			}
		});

		func2(new T() {
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("코끼리");
			}
		});

		func2(new T() {
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("독수리");
			}
		});

	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.func1();
	}
}
