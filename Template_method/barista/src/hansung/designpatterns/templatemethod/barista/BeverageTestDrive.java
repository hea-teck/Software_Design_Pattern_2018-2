package hansung.designpatterns.templatemethod.barista;


public class BeverageTestDrive {
	public static void main(String[] args) {
 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		DutchCoffeeWithHook dutchCoffeeHook = new DutchCoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();

		System.out.println("\nMaking dutchcoffee...");
		dutchCoffeeHook.prepareRecipe();


	}
}
