package hansung.designpatterns.decorator.starbuzzalternative;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setMocha(true);
        beverage2.setWhip(true);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSoy(true);
        beverage3.setMocha(true);
        beverage3.setWhip(true);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
