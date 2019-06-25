package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		water();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void water();

	abstract void brew();
 
	abstract void addCondiments();

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
