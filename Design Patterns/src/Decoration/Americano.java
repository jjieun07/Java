package Decoration;

public class Americano extends Beverage {
	public Americano() {
		super();
		description = "�Ƹ޸�ī��";
	}

	@Override
	public int cost() {
		return 4000;
	}
}