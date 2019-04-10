
public class Ginger extends Ingredient{
	
	public String getDescription() {
		return "Ginger";
	}
	
	public double cost() {
		return base.cost()+0.6;
	}
	
	public String prepare() {
		return base.prepare() + ", Ginger";
	}
}
