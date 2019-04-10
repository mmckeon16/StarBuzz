
public class GreenTea extends TeaBeverage{
	
	@Override
	public String getDescription() {
		return "GreenTea";
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
