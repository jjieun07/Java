package Ex;

//spring의 3대 요소
//-의존적 주입(DI)
//-관점지향 프로그래밍(AOP)

public class Main {
	public static void main(String[] args) {

		System.out.println('1');

		// Thread.sleep -> 무조건 exception 발생(try-catch 필요)

		try {
			Thread.sleep(2000);
			System.out.println("호랑이");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

		// ---------------------------------//

		System.out.println('1');

		try {
			Thread.sleep(2000);
			System.out.println("코끼리");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

		// ---------------------------------//

		System.out.println('1');

		try {
			Thread.sleep(2000);
			System.out.println("독수리");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

	}
}