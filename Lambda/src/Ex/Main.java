package Ex;

//spring�� 3�� ���
//-������ ����(DI)
//-�������� ���α׷���(AOP)

public class Main {
	public static void main(String[] args) {

		System.out.println('1');

		// Thread.sleep -> ������ exception �߻�(try-catch �ʿ�)

		try {
			Thread.sleep(2000);
			System.out.println("ȣ����");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

		// ---------------------------------//

		System.out.println('1');

		try {
			Thread.sleep(2000);
			System.out.println("�ڳ���");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

		// ---------------------------------//

		System.out.println('1');

		try {
			Thread.sleep(2000);
			System.out.println("������");
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}

		System.out.println('2');

	}
}