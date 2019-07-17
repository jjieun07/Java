package ex02;

class Apple {
	// 프로그램 시작 직전에 메모리 생성 (객체를 생성하지 않아도 사용가능)
	static void func1() {
		System.out.println('1');
		// func2(); -> static이 아니기 때문에 객체가 생성되기 전에 사용 불가
		func2_1();
	}

	void func2() {
	}

	static void func2_1() {
	}
}

public class Main {
	void func1() {
	} // Main에서 사용 불가

	static void func2() {
	}

	static void func3(int num) {
		int n = num, count = 0;
		String s = "";
		while (true) {
			s += Integer.toString(n % 2);
			n = n / 2;

			if (n == 1 || n == 0) {
				s += Integer.toString(n);
				break;
			}
		}

		int length = 32 - s.length();

		for (int i = 0; i < length; i++) {
			s += "0";
		}

		StringBuffer sb = new StringBuffer(s);

		for (int i = 1; i <= 32; i++) {
			int a = 32 - i;

			if (a % 4 == 0)
				sb.insert(a, " ");
		}

		System.out.println(sb.reverse());
	}

	// String과 StringBuffer
	// String : 객체 생성 후 내용 수정 불가, StringBuffer : 객체 갱신(CRUD) 가능
	static void func4(int num) {	// func3과 동일한 기능
		System.out.println(Integer.toBinaryString(num));

		String s1 = Integer.toBinaryString(num);

		char[] ar = new char[32 - s1.length()];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = '0';
		}

		// new String(배열) -> 문자열로 만듦
		String s2 = new String(ar);

		StringBuffer s4 = new StringBuffer(s2 + s1);

		for(int i = 0; i < 7; i++) {
		//	s4.insert((i+1) * 4 + i, ' ');
			s4.insert((7-i) * 4, ' ');
		}
		
		System.out.println(s4);
	}

	public static void main(String[] args) {
		Apple.func1();
		func3(0x3c94ab73);
		func4(0x3c94ab73);

		String s = "호랑이";

		// 새로운 객체 생성 (기존 객체 수정 아님_ 내부적으로 new String() 수행?)
		s = "코끼리";
	}
}
