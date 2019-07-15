package Adapter;

// ���� ������ �������ִ� Douzon�� Samsung�� �԰ݿ� ���� ������ �԰��� �����ֱ� ���� Ŭ����
public class Adapter implements SamsungModule{
	private Douzon douzon;
	
	public Adapter(Douzon douzon) {
		this.douzon = douzon;
	}
	
	@Override
	public void func1() {
		// ������ �������ִ� ������ ����� �̿��� �ＺŬ������ ���ϴ� ��� ������ش�.
		douzon.method1();
		douzon.method3();
	}

	@Override
	public void func2() {		
		// �� ����� ������ ���� �����ϴٰ� �ϸ� �׳� �������ش�.
	}
}
