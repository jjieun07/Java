package Decoration;

public class CaffeLatte extends Beverage {
	public CaffeLatte() {
		super();
		description = "ī���";
	}

	@Override
	public int cost() {
		return 5000;
	}
}