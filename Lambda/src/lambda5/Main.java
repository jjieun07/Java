package lambda5;

interface Apple {
	void func1(int n, String s);
}

class Banana {
	void func2(Apple apple) {
		apple.func1(8, "apple");
	}
}
public class Main {
	public static void main(String[] args) {
		Banana b = new Banana();
		System.out.println("----anonymous----");
		b.func2(new Apple() {
			public void func1(int n, String s) {
				System.out.println("n = " + n + "\ns = " + s);
			}
		});
		
		System.out.println("----Lambda----");
		b.func2((n, s) -> {System.out.println("n = " + n + "\ns = " + s);});
	}
}
