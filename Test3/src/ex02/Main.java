package ex02;

class Apple {
	// ���α׷� ���� ������ �޸� ���� (��ü�� �������� �ʾƵ� ��밡��)
	static void func1() {
		System.out.println('1');
		// func2(); -> static�� �ƴϱ� ������ ��ü�� �����Ǳ� ���� ��� �Ұ�
		func2_1();
	}

	void func2() {
	}

	static void func2_1() {
	}
}

public class Main {
	void func1() {
	} // Main���� ��� �Ұ�

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

	// String�� StringBuffer
	// String : ��ü ���� �� ���� ���� �Ұ�, StringBuffer : ��ü ����(CRUD) ����
	static void func4(int num) {	// func3�� ������ ���
		System.out.println(Integer.toBinaryString(num));

		String s1 = Integer.toBinaryString(num);

		char[] ar = new char[32 - s1.length()];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = '0';
		}

		// new String(�迭) -> ���ڿ��� ����
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

		String s = "ȣ����";

		// ���ο� ��ü ���� (���� ��ü ���� �ƴ�_ ���������� new String() ����?)
		s = "�ڳ���";
	}
}
