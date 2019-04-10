import java.util.*;

public class Program {
	
	//Alternate Bases
	public static Beverage mocha() {
		Beverage myBeverage = new Expresso();
		Ingredient chocolate = new Chocolate();
		
		chocolate.base = myBeverage;
		myBeverage = chocolate;
		return myBeverage;
	}
	
	public static Beverage latte() {
		Beverage myBeverage = new Expresso();
		Ingredient myMilk = new Milk();
		
		myMilk.base = myBeverage;
		myBeverage = myMilk;

		return myBeverage;
	}
	
	public static Beverage cappuccino() {
		Beverage myBeverage = new Expresso();
		Ingredient whip = new WhipCream();
		
		whip.base = myBeverage;
		myBeverage = whip;

		return myBeverage;
	}
	
	public static Beverage decafMocha() {
		Beverage myBeverage = new Decaf();
		Ingredient chocolate = new Chocolate();
		
		chocolate.base = myBeverage;
		myBeverage = chocolate;
		return myBeverage;
	}
	
	public static Beverage decafLatte() {
		Beverage myBeverage = new Decaf();
		Ingredient myMilk = new Milk();
		
		myMilk.base = myBeverage;
		myBeverage = myMilk;

		return myBeverage;
	}
	
	public static Beverage decafCappuccino() {
		Beverage myBeverage = new Decaf();
		Ingredient whip = new WhipCream();
		
		whip.base = myBeverage;
		myBeverage = whip;

		return myBeverage;
	}
	
	public static Beverage flowerTea() {
		Beverage myBeverage = new GreenTea();
		Ingredient jasmine = new Jasmine();
		
		jasmine.base = myBeverage;
		myBeverage = jasmine;

		return myBeverage;
	}
	
	public static Beverage gingerTea() {
		Beverage myBeverage = new GreenTea();
		Ingredient ginger = new Ginger();
		
		ginger.base = myBeverage;
		myBeverage = ginger;

		return myBeverage;
	}
	
	public static Beverage teaLatte() {
		Beverage myBeverage = new RedTea();
		Ingredient milk = new Milk();
		
		milk.base = myBeverage;
		myBeverage = milk;

		return myBeverage;
	}
	
	//Adding ingredients
	public static Beverage milk(Beverage myBeverage) {
		Ingredient milk = new Milk();
		milk.base = myBeverage;
		return milk;
	}
	
	public static Beverage chocolate(Beverage myBeverage) {
		Ingredient chocolate = new Chocolate();
		chocolate.base = myBeverage;
		return chocolate;
	}
	
	public static Beverage whippedCream(Beverage myBeverage) {
		Ingredient whippedCream = new WhipCream();
		whippedCream.base = myBeverage;
		return whippedCream;
	}
	
	public static Beverage jasmine(Beverage myBeverage) {
		Ingredient jasmine = new Jasmine();
		jasmine.base = myBeverage;
		return jasmine;
	}
	
	public static Beverage ginger(Beverage myBeverage) {
		Ingredient ginger = new Ginger();
		ginger.base = myBeverage;
		return ginger;
	}
	
	public static Beverage parseInput(ArrayList<String> ingredients) {
		String base = ingredients.get(0).toLowerCase();
		Beverage myBeverage;
		
		switch(base) {
			case "mocha":
				myBeverage = mocha();
				break;
			case "latte":
				myBeverage = latte();
				break;
			case "expresso":
				myBeverage = new Expresso();
				break;
			case "decaf":
				myBeverage = new Decaf();
				break;
			case "houseblend":
				myBeverage = new HouseBlend();
				break;
			case "cappuccino":
				myBeverage = cappuccino();
				break;
			case "decaf mocha":
				myBeverage = decafMocha();
				break;
			case "decaf latte":
				myBeverage = decafLatte();
				break;
			case "decaf cappuccino":
				myBeverage = decafCappuccino();
				break;
			case "green tea":
				myBeverage = new GreenTea();
				break;
			case "red tea":
				myBeverage = new RedTea();
				break;
			case "white tea":
				myBeverage = new WhiteTea();
				break;
			case "flower tea":
				myBeverage = flowerTea();
				break;
			case "ginger tea":
				myBeverage = gingerTea();
				break;
			case "tea latte":
				myBeverage = teaLatte();
				break;
			default:
				System.out.println("Beverage base is not a valid value: " + base);
				myBeverage = null;
				return null;
		}
		
		//Now add rest of ingredients
		for(int index = 1; index < ingredients.size(); index++) {
			
			switch(ingredients.get(index).toLowerCase()) {
			case "milk":
				myBeverage = milk(myBeverage);
				break;
			case "chocolate":
				myBeverage = chocolate(myBeverage);
				break;
			case "whipped cream":
				myBeverage = whippedCream(myBeverage);
				break;
			case "jasmine":
				myBeverage = jasmine(myBeverage);
				break;
			case "ginger":
				myBeverage = ginger(myBeverage);
				break;
			default:
				System.out.println("Sorry, "+ingredients.get(index)+" is an invalid ingredient");
			}
		}
		
		return myBeverage;
	}

	public static void main(String[] args) {
		Beverage myBeverage;
		while(true) {
			ArrayList<String> myIngredients = new ArrayList<String>();
			
			//adding base drink
			System.out.println("hello there, what base drink would you like to order?");
			Scanner scanner = new Scanner(System.in);
			String baseResponse = scanner.nextLine();
			myIngredients.add(baseResponse);
			
			System.out.println("add as many ingredients as you want, and type no when you are done with ingredients");
			while(true) {
				String ingredient = scanner.nextLine();
				if(ingredient.equalsIgnoreCase("no")) {
					break;
				} else {
					System.out.println("add another ingredient"); 
					myIngredients.add(ingredient);
				}
			}
			
			//Now parse into beverage
			myBeverage = parseInput(myIngredients);
			
			if(myBeverage == null ) { 
				System.out.println("sorry not a valid base!!");
			} else {
				System.out.println("The total cost of your order is: $"+ myBeverage.cost());
				System.out.println("The beverage is prepared as follows: "+ myBeverage.prepare());
			}
			
			
			System.out.println("if you would like to order another beverage, please say yes, otherwise type no");
			String response = scanner.nextLine(); 
			if(response.equalsIgnoreCase("no")) {
				break;
			}
		}
	}
}
