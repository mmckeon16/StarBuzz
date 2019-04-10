
public class Chocolate extends Ingredient{
	
	public String getDescription() {
		return "Chocolate";
	}
	
	public double cost() {
		return base.cost()+0.3;
	}
	
	public String prepare() {
		return base.prepare() + ", Chocolate";
	}
}
