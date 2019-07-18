package Ex_2;

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
	}

	void func1() {

		func2(() -> {
			Thread.sleep(2000);
			System.out.println("È£¶ûÀÌ");
		});

		func2(() -> {
			Thread.sleep(2000);
			System.out.println("ÄÚ³¢¸®");
		});

		func2(() -> {
			Thread.sleep(2000);
			System.out.println("µ¶¼ö¸®");
		});

	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.func1();
	}
}
