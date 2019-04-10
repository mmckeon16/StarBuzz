
public class WhiteTea extends TeaBeverage{
	
	@Override
	public String getDescription() {
		return "WhiteTea";
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
