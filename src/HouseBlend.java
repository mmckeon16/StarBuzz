
public class HouseBlend extends CoffeeBeverage{
	
	@Override
	public String getDescription() {
		return "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.8;
	}
	
	@Override
	public String prepare() {
		return getDescription();
	}


}
