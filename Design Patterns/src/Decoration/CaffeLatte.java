package Decoration;

public class CaffeLatte extends Beverage {
	public CaffeLatte() {
		super();
		description = "Ä«Æä¶ó¶¼";
	}

	@Override
	public int cost() {
		return 5000;
	}
}