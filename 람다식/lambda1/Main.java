package lambda1;

interface A {
	void add(int a, int b);
}

public class Main {
	public static void main(String[] args) {

		A a1 = new A() {
			public void add(int a, int b) {
				System.out.println(a + b);
			}
		};

		A a2 = (int a, int b) -> System.out.println(a + b);

		a1.add(2, 8);
		a2.add(3, 4);
	}

}
