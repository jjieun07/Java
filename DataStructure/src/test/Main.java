package test;

import java.util.*;

public class Main {
	// 3�� 4�� / 2�� 7�� �� ������ �����ִ� static �Լ�
	static int pow(int a, int b) {
		if (b == 0)
			return 1;
		else if (b == 1)
			return a;
		int banSu = pow(a, b / 2);
		return b % 2 == 0 ? banSu * banSu : banSu * banSu * a;
	}

	// n! �Լ� (��ͻ��)
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {
			System.out.printf("5 * %d = %d\n", i, 5 * i);
		}
		System.out.println("------------------------------");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		System.out.println(n);

		Random random = new Random();
		// 0~100 ���� ���� ���� 10��
		System.out.println("<0~100 ���� ���� ���� 10��>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(100) + " ");
		}
		System.out.println("\n------------------------------");

		// 50~100 ���� ���� ���� 10��
		System.out.println("<50~100 ���� ���� ���� 10��>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(50) + 50 + " ");
		}
		System.out.println("\n------------------------------");

		// -10 ~ +10 ���� ���� ���� 10�� (-10, +10 ���� �� ����) ////////////////
		System.out.println("<-10~+10 ���� ���� ���� 10��>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(21) - 10 + " ");
		}
		System.out.println("\n------------------------------");

		// 0.0���� 1.0 ���� ���� ���� 10��
		System.out.println("<0.0~1.0 ���� ���� ���� 10��>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextFloat() + " ");
		}
		System.out.println("\n------------------------------");

		// 0���� 100 ������ ���� �� 4�� ����� ���� ���
		System.out.println("<0~100 ���� ���� �� 4�� ���>");
		int count = 0;
		while (count < 10) {
			int n = random.nextInt(100);
			if (n % 4 == 0) {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println("\n------------------------------");

		// 3�� 4�� / 2�� 7�� �� ������ �����ִ� static �Լ�
		System.out.println("<���� ���ϴ� �Լ�>");
		System.out.println(pow(2, 5));
		System.out.println("------------------------------");

		// n! �Լ� (��ͻ��)
		System.out.println("<n! �Լ� (��ͻ��)>");
		System.out.println(factorial(5));
		System.out.println("------------------------------");

		// �Ǻ���ġ ���� 30�ڸ� ���
		// ex> 0, 1, 1, 2, 3, 5, 8,....
		System.out.println("<�Ǻ���ġ>");
		int fibo1 = 0, fibo2 = 1;
		System.out.print(fibo1 + " ");

		for (int i = 0; i < 29; i++) {
			int fibo3;
			fibo3 = fibo2;
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo3;
			System.out.print(fibo1 + " ");
		}
		System.out.println("\n------------------------------");

		// 0���� 100 ������ ���� �Ѱ��� �̾Ƽ� ���ڸ��� ���� ���
		// ex> ���� 38 -> ��� 11
		System.out.println("<0���� 100 ������ ���� �Ѱ��� �̾Ƽ� ���ڸ��� ���� ���>");
		int num1 = random.nextInt(100);
		System.out.println("��� �� = " + num1 + ", ��� = " + ((num1 % 10) + (num1 / 10)));
		System.out.println("------------------------------");

		// 0���� 100������ ���� 10���� �̾� �����ڸ� ���ڳ��� �� , �����ڸ� ���� �� (�迭 ��� ����)
		System.out.println("<0���� 100������ ���� 10���� �̾� �����ڸ� ���ڳ��� �� , �����ڸ� ���� ��>");
		int f = 0, s = 0;
		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(100);
			f += n / 10;
			s += n % 10;
			System.out.print(n + " ");
		}
		System.out.println("\n���� �ڸ� ������ �� = " + f + "\n���� �ڸ� ������ �� = " + s);
		System.out.println("------------------------------");

		// 100���� 1000 ������ ���� ���� 10�� ���. ��, �� �ڸ��� ���ڰ� �ߺ��Ǹ� �ȵ� (122 -> 2�� �ߺ� ��)
		System.out.println("<100���� 1000 ������ ���� ���� 10�� ���. ��, �� �ڸ���  ���ڰ� �ߺ��Ǹ� �ȵ�>");
		count = 0;
		while (true) {
			int n = random.nextInt(900) + 100;
			int n1 = n / 100;
			int n2 = n % 100 / 10;
			int n3 = n % 100 % 10;

			if (n1 == n2 || n1 == n3 || n2 == n3)
				continue;
			System.out.print(n + " ");
			count++;

			if (count == 10)
				break;
		}
		System.out.println("\n------------------------------");

		// Integer�� MaxValue�� ���� ���� ���
		// ex> ���� ���� 123456 -> ��� 6 5 4 3 2 1
		System.out.println("<Integer�� MaxValue�� ���� ���� ���>");
		int int_max = random.nextInt(Integer.MAX_VALUE);
		int[] arr = new int[10];
		int n = int_max;
		for (int i = 0; i < 10; i++) {
			if (n < 10) {
				arr[i] = n;
				break;
			}
			arr[i] = n % 10;
			n = n / 10;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		
		System.out.println("��� �� = " + int_max);
		System.out.print("��� = ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n------------------------------");
		
		// int h = 2, m = 17, s = 45 -> �� �� ȯ��
		System.out.println("<�ð��� �ʷ� ȯ��>");
		int h = 2, m = 17;
		s = 45;
		
		System.out.println(h + "�� " + m + "�� " + s + "�ʴ�" + ((h*60*60) + (m*60) + s) + "�� �Դϴ�.");
		System.out.println("------------------------------");
		
		// s = 1234 -> ��, ��, �� �� ȯ��
		System.out.println("<�ʸ� �ð����� ȯ��>");
		s = 8265;
		n = s;
		h = s / 60 /60 ;
		m = s / 60 % 60;	
		s = s % 60;
		System.out.println(n + "�ʴ� " + h + "�� " + m + "�� " + s + "�� �Դϴ�.");
		System.out.println("------------------------------");
		
		// ox�� �����ϰ� 10�� ���, o, x�� �����ؼ� ���� ���� ���� Ƚ�� (�迭 ��� ����)
		int xCount = 0, oCount = 0;
		int xMax = 0, oMax = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = random.nextInt(2);
			
			if(num == 0) {
				xCount = 0;
				System.out.print("O ");
				oCount++;
				if(oCount > oMax) oMax = oCount;
			} else {
				oCount = 0;
				System.out.print("X ");
				xCount++;
				if(xCount > xMax) xMax = xCount;
			}
		}
		System.out.println("\nO�� ���� ���� ���� Ƚ�� : " + oMax + "\nX�� ���� ���� ���� Ƚ�� : " + xMax);
		System.out.println("------------------------------");
		
		// 2019�� 1�� 1��  -> ȭ���� 	=> 2019�⵵ �޷� ���
		System.out.println("<2019�⵵ �޷� ���>");
		int start = 3;	// ȭ����
		
		for(int i = 1; i <= 12; i++) {
			System.out.println("------------------\t" + i + "��\t------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			System.out.println("---------------------------------------------------");
			
			for(int j = 1; j < start % 7; j++) {
				System.out.print("\t");
			}
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:
				for(int j = 1; j <= 31; j++) {
					System.out.print(j + "\t");
					
					if(start % 7 == 0 || j == 31) System.out.println();
					start++;
				}
				break;
			case 2:
				for(int j = 1; j <= 28; j++) {
					System.out.print(j + "\t");
					
					if(start % 7 == 0 || j == 28) System.out.println();
					start++;
				}
				break;
			case 4, 6, 9, 11:
				for(int j = 1; j <= 30; j++) {
					System.out.print(j + "\t");
					
					if(start % 7 == 0 || j == 30) System.out.println();
					start++;
				}
				break;
	
			}
			System.out.println("---------------------------------------------------");
			System.out.println();
		}
		
	}
}

//int(4)
//char(2)
//long(8)
//boolean(1)
//byte(1)
//float(4)
//double(8)
//short(2)