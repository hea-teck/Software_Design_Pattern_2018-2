package hansung.designpatterns.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	String description = beverage.getDescription();
	String[] category = description.split(",");
 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {

		for(int i=0; i<category.length; i++) {
			if (category[i].equals("티")) {
				return beverage.getDescription();
			}
		}
		return beverage.getDescription() + ", 휘핑";
	}
 
	public double cost() {

		for(int i=0; i<category.length; i++) {
			if (category[i].equals("티")) {
				return beverage.cost();
			}
		}
		return .10 + beverage.cost();
	}
}
