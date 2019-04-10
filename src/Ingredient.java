
public class Ingredient implements Beverage{
	
	Beverage base = null;
	
	@Override
	public String getDescription() {
		return "";
	}
	
	@Override
	public double cost() {
		return 0.0;
	}
	
	@Override
	public String prepare() {
		return "";
	}
	
}
