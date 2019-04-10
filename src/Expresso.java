
public class Expresso extends CoffeeBeverage{
	
	@Override
	public String getDescription() {
		return "Expresso";
	}

	@Override
	public double cost() {
		return 1.0;
	}
	
	@Override
	public String prepare() {
		return getDescription();
	}


}
