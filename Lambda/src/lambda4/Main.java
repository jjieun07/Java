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
		 * ex01 _ interface -> 익명함수
		 * 
		 * Apple a = new Apple() { public void func1() {
		 * System.out.println("Apple.func1"); } };
		 * 
		 * a.func1();
		 */

		/*
		 * ex02 _ 람다식으로 변경
		 * 
		 * Apple a = () -> { System.out.println("Apple.func1"); };
		 * a.func1();
		 */

		/*
		 * ex03 _ 한 개의 인수 전달
		 * 
		 * Apple a = (num) -> {System.out.println("a.func2");};
		 * a.func1(10);
		 * 
		 * // 전달 인수가 한 개 일때만 괄호 생략 가능 Apple b = num -> {System.out.println("b.func2");};
		 * b.func1(10);
		 * 
		 * // 실행되는 문장이 단문장일 때 스코프 생략 가능 Apple c = num -> System.out.println("c.func2");
		 * c.func1(10);
		 * 
		 * // 실행문이 단문장이 아닐 때 스코프가 없는 경우 한문장만 람다식으로 인식 Apple c1 = num ->
		 * System.out.println("c1.func2"); System.out.println("c1.func2_1");
		 * 
		 * c1.func1(10);
		 */

		/*
		 * ex04 _ 두 개의 인수 전달 
		 * 
		 * Apple a = (n, s) -> {System.out.println("n = " + n + "\ns = " + s);}; 
		 * a.func1(3, "lambda");
		 */

		/*
		 * ex05 _ return 값 반환
		 * Apple a = () -> {return 100;}; a.func1();
		 * 
		 * // ****실행문이 단문장이여서 스코프를 지울 때 리턴문이 존재하는 경우 리턴도 같이 삭제*****중요(자주나옴) 
		 * Apple b = () -> 100; b.func1();
		 * 
		 * // 함수안에 함수가 있는 경우(IIFE문법) 
		 * //Apple c = () -> {return (100) -> {return 200;}};
		 */
		
		
		
		// ex06
		Apple a = (n) -> { return 100;};
		a.func1(10);

		Apple b = n -> 100;
		b.func1(10);

	}
}
