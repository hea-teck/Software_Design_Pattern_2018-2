package hansung.designpatterns.decorator.starbuzz;

public abstract class SizeDecorator extends Beverage {
    protected Beverage beverage;

    public SizeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
