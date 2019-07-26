package test;

import java.util.*;

public class Main {
	// 3의 4승 / 2의 7승 등 지수를 구해주는 static 함수
	static int pow(int a, int b) {
		if (b == 0)
			return 1;
		else if (b == 1)
			return a;
		int banSu = pow(a, b / 2);
		return b % 2 == 0 ? banSu * banSu : banSu * banSu * a;
	}

	// n! 함수 (재귀사용)
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
		// 0~100 사이 숫자 랜덤 10개
		System.out.println("<0~100 사이 숫자 랜덤 10개>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(100) + " ");
		}
		System.out.println("\n------------------------------");

		// 50~100 사이 숫자 랜덤 10개
		System.out.println("<50~100 사이 숫자 랜덤 10개>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(50) + 50 + " ");
		}
		System.out.println("\n------------------------------");

		// -10 ~ +10 사이 숫자 랜덤 10개 (-10, +10 나올 수 있음) ////////////////
		System.out.println("<-10~+10 사이 숫자 랜덤 10개>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt(21) - 10 + " ");
		}
		System.out.println("\n------------------------------");

		// 0.0부터 1.0 사이 숫자 랜덤 10개
		System.out.println("<0.0~1.0 사이 숫자 랜덤 10개>");
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextFloat() + " ");
		}
		System.out.println("\n------------------------------");

		// 0부터 100 사이의 숫자 중 4의 배수만 랜덤 출력
		System.out.println("<0~100 사이 숫자 중 4의 배수>");
		int count = 0;
		while (count < 10) {
			int n = random.nextInt(100);
			if (n % 4 == 0) {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println("\n------------------------------");

		// 3의 4승 / 2의 7승 등 지수를 구해주는 static 함수
		System.out.println("<지수 구하는 함수>");
		System.out.println(pow(2, 5));
		System.out.println("------------------------------");

		// n! 함수 (재귀사용)
		System.out.println("<n! 함수 (재귀사용)>");
		System.out.println(factorial(5));
		System.out.println("------------------------------");

		// 피보나치 수열 30자리 출력
		// ex> 0, 1, 1, 2, 3, 5, 8,....
		System.out.println("<피보나치>");
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

		// 0부터 100 사이의 숫자 한개를 뽑아서 두자리를 합한 결과
		// ex> 랜덤 38 -> 출력 11
		System.out.println("<0부터 100 사이의 숫자 한개를 뽑아서 두자리를 합한 결과>");
		int num1 = random.nextInt(100);
		System.out.println("출력 값 = " + num1 + ", 결과 = " + ((num1 % 10) + (num1 / 10)));
		System.out.println("------------------------------");

		// 0부터 100사이의 숫자 10개를 뽑아 십의자리 숫자끼리 합 , 일의자리 숫자 합 (배열 사용 ㄴㄴ)
		System.out.println("<0부터 100사이의 숫자 10개를 뽑아 십의자리 숫자끼리 합 , 일의자리 숫자 합>");
		int f = 0, s = 0;
		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(100);
			f += n / 10;
			s += n % 10;
			System.out.print(n + " ");
		}
		System.out.println("\n십의 자리 숫자의 합 = " + f + "\n일의 자리 숫자의 합 = " + s);
		System.out.println("------------------------------");

		// 100부터 1000 사이의 숫자 랜덤 10개 출력. 단, 각 자리의 숫자가 중복되면 안됨 (122 -> 2가 중복 됨)
		System.out.println("<100부터 1000 사이의 숫자 랜덤 10개 출력. 단, 각 자리의  숫자가 중복되면 안됨>");
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

		// Integer의 MaxValue로 숫자 랜덤 출력
		// ex> 랜덤 숫자 123456 -> 출력 6 5 4 3 2 1
		System.out.println("<Integer의 MaxValue로 숫자 랜덤 출력>");
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

		
		System.out.println("출력 값 = " + int_max);
		System.out.print("결과 = ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n------------------------------");
		
		// int h = 2, m = 17, s = 45 -> 초 로 환산
		System.out.println("<시간을 초로 환산>");
		int h = 2, m = 17;
		s = 45;
		
		System.out.println(h + "시 " + m + "분 " + s + "초는" + ((h*60*60) + (m*60) + s) + "초 입니다.");
		System.out.println("------------------------------");
		
		// s = 1234 -> 시, 분, 초 로 환산
		System.out.println("<초를 시간으로 환산>");
		s = 8265;
		n = s;
		h = s / 60 /60 ;
		m = s / 60 % 60;	
		s = s % 60;
		System.out.println(n + "초는 " + h + "시 " + m + "분 " + s + "초 입니다.");
		System.out.println("------------------------------");
		
		// ox를 랜덤하게 10개 출력, o, x가 연속해서 가장 많이 나온 횟수 (배열 사용 ㄴㄴ)
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
		System.out.println("\nO가 가장 많이 나온 횟수 : " + oMax + "\nX가 가장 많이 나온 횟수 : " + xMax);
		System.out.println("------------------------------");
		
		// 2019년 1월 1일  -> 화요일 	=> 2019년도 달력 출력
		System.out.println("<2019년도 달력 출력>");
		int start = 3;	// 화요일
		
		for(int i = 1; i <= 12; i++) {
			System.out.println("------------------\t" + i + "월\t------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
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