package hansung.designpatterns.decorator.starbuzzalternative;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    public double cost() {
        return 1.99+super.cost();
    }
}
