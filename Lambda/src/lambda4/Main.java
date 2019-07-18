package lambda4;

interface Apple {
//	void func1();					//ex01
//	void func1(int num);			//ex02
//	void func1(int n, String s);	//ex03
//	int func1();					//ex04
	int func1(int n);				//ex05
}

public class Main {
	public static void main(String[] args) {

		/*
		 * ex01 _ interface -> �͸��Լ�
		 * 
		 * Apple a = new Apple() { public void func1() {
		 * System.out.println("Apple.func1"); } };
		 * 
		 * a.func1();
		 */

		/*
		 * ex02 _ ���ٽ����� ����
		 * 
		 * Apple a = () -> { System.out.println("Apple.func1"); };
		 * a.func1();
		 */

		/*
		 * ex03 _ �� ���� �μ� ����
		 * 
		 * Apple a = (num) -> {System.out.println("a.func2");};
		 * a.func1(10);
		 * 
		 * // ���� �μ��� �� �� �϶��� ��ȣ ���� ���� Apple b = num -> {System.out.println("b.func2");};
		 * b.func1(10);
		 * 
		 * // ����Ǵ� ������ �ܹ����� �� ������ ���� ���� Apple c = num -> System.out.println("c.func2");
		 * c.func1(10);
		 * 
		 * // ���๮�� �ܹ����� �ƴ� �� �������� ���� ��� �ѹ��常 ���ٽ����� �ν� Apple c1 = num ->
		 * System.out.println("c1.func2"); System.out.println("c1.func2_1");
		 * 
		 * c1.func1(10);
		 */

		/*
		 * ex04 _ �� ���� �μ� ���� 
		 * 
		 * Apple a = (n, s) -> {System.out.println("n = " + n + "\ns = " + s);}; 
		 * a.func1(3, "lambda");
		 */

		/*
		 * ex05 _ return �� ��ȯ
		 * Apple a = () -> {return 100;}; a.func1();
		 * 
		 * // ****���๮�� �ܹ����̿��� �������� ���� �� ���Ϲ��� �����ϴ� ��� ���ϵ� ���� ����*****�߿�(���ֳ���) 
		 * Apple b = () -> 100; b.func1();
		 * 
		 * // �Լ��ȿ� �Լ��� �ִ� ���(IIFE����) 
		 * //Apple c = () -> {return (100) -> {return 200;}};
		 */
		
		
		
		// ex06
		Apple a = (n) -> { return 100;};
		a.func1(10);

		Apple b = n -> 100;
		b.func1(10);

	}
}
