package ex_01;

public class Ex_for {
	public static void main(String[] args) {
		for(int i = 5; i < 9; i++) {		// �̷� for���� ����/Ȱ�� �ȵ� (�� ��� -> �޸𸮳� �ӵ� �κп��� ���ϱ޼������� ��ȭ�� ������)
			System.out.println(i);
		}
		
		//**************************************//
		
		
		int s = 5, e = 8;
		int size = e-s+1;
		
		for(int i = 0; i < size; i++) {
			System.out.println(5+i);
		}
		
		
		//**************************************//
		
		//**************************************//
		//������ �����ڵ�
		int i = 0;
		for(i = 0; i < 5; i++);		// for������ {}�� ������ �� �ִ� ��� -> �ѹ��� ������ ��
		System.out.println(i + 10);	// ���������� ���� ���α׷����� ����� �� �ʿ�
	}
}
