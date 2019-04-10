
public class Milk extends Ingredient{
	
	public String getDescription() {
		return "Milk";
	}
	
	public double cost() {
		return base.cost()+0.3;
	}
	
	public String prepare() {
		return base.prepare() + ", Milk";
	}
}
