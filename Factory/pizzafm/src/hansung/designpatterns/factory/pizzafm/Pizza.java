package hansung.designpatterns.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	String kimchi;
	String bulgogi;

	ArrayList<String> toppings = new ArrayList<String>();
 
	void prepare() {
		System.out.println("Prepare " + name);
//		System.out.println("Tossing dough...");
//		System.out.println("Adding sauce...");
//		System.out.println("Adding toppings: ");
//		for (String topping : toppings) {
//			System.out.println("   " + topping);
//		}
	}
  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append("\t"+dough + "\n");
		display.append("\t"+sauce + "\n");
		display.append("\t"+kimchi + "\n");
		display.append("\t"+bulgogi + "\n");
		for (String topping : toppings) {
			display.append("\t"+topping + "\n");
		}
		return display.toString();
	}
}

 
 
