package basic;

import java.util.Random;

public class Ex_for {
	public static void main(String[] args) {

		int a, b, c;
		int m;

		Random random = new Random();

		/*
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * a = random.nextInt(100); b = random.nextInt(100); c = random.nextInt(100);
		 * 
		 * if (a > b) { m = a > c ? Math.max(b, c) : a; } else {
		 * 
		 * m = a < c ? Math.min(b, c) : a; }
		 * 
		 * System.out.println(a + " " + b + " " + c); System.out.println(m); }
		 */

		/*
		 * for (int i = 0; i < 10; i++) { a = (random.nextInt(3));
		 * 
		 * switch (a) { case 0: System.out.println("ȣ����"); break; case 1:
		 * System.out.println("������"); break; case 2: System.out.println("�ڳ���"); break; }
		 * }
		 */

		String[] str = new String[] { "ȣ����", "������", "�ڳ���" };
		String s;

		for (int i = 0; i < 10; i++) {
			a = (random.nextInt(3));

			System.out.println(str[a]);
		}

	}
}
