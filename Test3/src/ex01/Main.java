package ex01;

public class Main {
	public static void main(String[] args) {
		short a = 3, b;
		
		// 대입연산자는 타입이 같아야 한다. (오칙연산은 무조건 int로 변환? 계산?)
		b = (short)(a + 1);
		
		
		// 4바이트 이하는 int로 변환, 4바이트 이상(long)은 큰 타입으로 변환
		long a1 = 10;
		int b1;
		b1 = (int)(a1 + 1);		
		
		// Integer 최대값 출력
		System.out.println(Integer.MAX_VALUE);
		
		// 10진수를 16진수를 변환
		System.out.println(Integer.toHexString(1234));
		System.out.println(Integer.toHexString(Integer.MAX_VALUE));
		
		// 0x3c94ab73	0011 1100 1001 0100 1010 1011 0111 0011
		
		// 0x -> 16진수	0 -> 8진수
		int b2 = 00037;
		
		// a2 = 0378 -> 0부터 시작하기 때문에 8진수로 인식 but 8진수는 0~7까지 사용가능 하기때문에 8이 포함되어 있어 에러
		int a2 = 0376;		
	}
}
