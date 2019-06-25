package hansung.designpatterns.decorator.starbuzz;

public class TallSize extends SizeDecorator {

    public TallSize(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 톨 사이즈";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
