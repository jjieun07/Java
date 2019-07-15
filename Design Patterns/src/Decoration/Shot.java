package Decoration;

public class Shot extends CondimentDecorator {
	Beverage beverage;

	public Shot(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" + ��";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 400;
	}
}