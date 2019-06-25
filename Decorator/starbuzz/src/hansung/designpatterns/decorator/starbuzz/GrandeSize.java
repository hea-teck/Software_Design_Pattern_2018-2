package hansung.designpatterns.decorator.starbuzz;

public class GrandeSize extends SizeDecorator {

    public GrandeSize(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 그랑데 사이즈";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
