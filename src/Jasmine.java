
public class Jasmine extends Ingredient{
	
	public String getDescription() {
		return "Jasmine";
	}
	
	public double cost() {
		return base.cost()+0.5;
	}
	
	public String prepare() {
		return base.prepare() + ", Jasmine";
	}
}
