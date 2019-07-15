package Adapter;

//사실 구매한 모듈은 소스코드로 주진 않지만 그냥 편의상 소스도 줬다 치자.
public class Samsung {
	private SamsungModule samsungModule;
	
	public Samsung(SamsungModule samsungModule) {
		this.samsungModule = samsungModule;
	}
	
	public void useful1() {
		System.out.println("유용한 기능 1사용!");
	}

	public void useful2() {
		System.out.println("유용한 기능 2사용!");
	}
}
