package Adapter;

public class Main {
	public static void main(String[] args) {
		/*
		�Ｚ���� ���̺귯���� �ϳ� ��Դ�. ��� Ŭ�����̸��� Samsung�̴�.
		Samsung�� SamsungMoule�̶� �԰ݿ� ���� ����� �Ѵ�.
		�׷��� ���� ������ �ִ°� Douzon Ŭ���� �̴�.
		�ＺŬ������ ������ Douzon�� Samsung�� �䱸�ϴ� �԰ݿ� ����� �Ѵ�.
		*/
		Adapter adapter = new Adapter(new Douzon());
		//�׳� ������ �Ѱ��ְ� ������ �԰��� �ȸ����� ��͸� ����� �Ѱ��ش�.
		Samsung samsung = new Samsung(adapter);
		
		samsung.useful1();
		samsung.useful2();
	}
}
