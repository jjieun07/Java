package Adapter;

//��� ������ ����� �ҽ��ڵ�� ���� ������ �׳� ���ǻ� �ҽ��� ��� ġ��.
public class Samsung {
	private SamsungModule samsungModule;
	
	public Samsung(SamsungModule samsungModule) {
		this.samsungModule = samsungModule;
	}
	
	public void useful1() {
		System.out.println("������ ��� 1���!");
	}

	public void useful2() {
		System.out.println("������ ��� 2���!");
	}
}
