package Decoration;

public class Customer {

	public static void main(String[] args) {
		Beverage beverage = new Americano();
		beverage = new Shot(beverage);
		beverage = new Shot(beverage);
		System.out.println("�޴� : "+beverage.getDescription()+" , ���� : "+beverage.cost());
	}

}
