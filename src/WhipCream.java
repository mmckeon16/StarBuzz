
public class WhipCream extends Ingredient{
	
	public String getDescription() {
		return "Whipped Cream";
	}
	
	public double cost() {
		return base.cost()+0.3;
	}
	
	public String prepare() {
		return base.prepare() + ", Whipped Cream";
	}
}
