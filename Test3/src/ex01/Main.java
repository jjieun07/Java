package ex01;

public class Main {
	public static void main(String[] args) {
		short a = 3, b;
		
		// ���Կ����ڴ� Ÿ���� ���ƾ� �Ѵ�. (��Ģ������ ������ int�� ��ȯ? ���?)
		b = (short)(a + 1);
		
		
		// 4����Ʈ ���ϴ� int�� ��ȯ, 4����Ʈ �̻�(long)�� ū Ÿ������ ��ȯ
		long a1 = 10;
		int b1;
		b1 = (int)(a1 + 1);		
		
		// Integer �ִ밪 ���
		System.out.println(Integer.MAX_VALUE);
		
		// 10������ 16������ ��ȯ
		System.out.println(Integer.toHexString(1234));
		System.out.println(Integer.toHexString(Integer.MAX_VALUE));
		
		// 0x3c94ab73	0011 1100 1001 0100 1010 1011 0111 0011
		
		// 0x -> 16����	0 -> 8����
		int b2 = 00037;
		
		// a2 = 0378 -> 0���� �����ϱ� ������ 8������ �ν� but 8������ 0~7���� ��밡�� �ϱ⶧���� 8�� ���ԵǾ� �־� ����
		int a2 = 0376;		
	}
}
