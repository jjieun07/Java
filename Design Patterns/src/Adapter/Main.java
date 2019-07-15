package Adapter;

public class Main {
	public static void main(String[] args) {
		/*
		삼성에서 라이브러리를 하나 사왔다. 사온 클래스이름은 Samsung이다.
		Samsung은 SamsungMoule이란 규격에 맞춰 기능을 한다.
		그런데 내가 가지고 있는건 Douzon 클래스 이다.
		삼성클래스를 쓰려면 Douzon을 Samsung이 요구하는 규격에 맞춰야 한다.
		*/
		Adapter adapter = new Adapter(new Douzon());
		//그냥 더존을 넘겨주고 싶지만 규격이 안맞으니 어뎁터를 만들어 넘겨준다.
		Samsung samsung = new Samsung(adapter);
		
		samsung.useful1();
		samsung.useful2();
	}
}
