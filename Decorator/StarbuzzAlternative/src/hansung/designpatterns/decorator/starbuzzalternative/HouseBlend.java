package hansung.designpatterns.decorator.starbuzzalternative;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    public double cost() {
        return super.cost()+0.89;
    }
}
