package Singleton;


//enum�� �̿��� ���
//enum : ������ ����鸸 ��Ƴ��� Ŭ���� (Ŭ����ó�� �޼ҵ�, ������ ��� ���� �� ����)
//		     ���α׷� ������ �ѹ��� ����Ǵ� Ư¡�� �ִ�. ����̱� ������ �ѹ� ����Ǹ� ���� �Ұ���

public enum singleton {
	INSTANCE;	// enum���� ����� ����� �ڵ����� static, final �Ӽ��� ����
	
	public static singleton getInstance() {
		return INSTANCE;
	}
}
