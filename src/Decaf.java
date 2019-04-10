
public class Decaf extends CoffeeBeverage{
	
	@Override
	public String getDescription() {
		return "Decaf";
	}

	@Override
	public double cost() {
		return 0.5;
	}
	
	@Override
	public String prepare() {
		return getDescription();
	}


}
