
public class RedTea extends TeaBeverage{
	
	@Override
	public String getDescription() {
		return "RedTea";
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
