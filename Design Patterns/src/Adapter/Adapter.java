package Adapter;

// 내가 기존에 가지고있던 Douzon이 Samsung의 규격에 맞지 않으니 규격을 맞춰주기 위한 클래스
public class Adapter implements SamsungModule{
	private Douzon douzon;
	
	public Adapter(Douzon douzon) {
		this.douzon = douzon;
	}
	
	@Override
	public void func1() {
		// 기존에 가지고있던 더존의 기능을 이용해 삼성클래스가 원하는 기능 만들어준다.
		douzon.method1();
		douzon.method3();
	}

	@Override
	public void func2() {		
		// 이 기능은 더존과 전혀 무관하다고 하면 그냥 구현해준다.
	}
}
