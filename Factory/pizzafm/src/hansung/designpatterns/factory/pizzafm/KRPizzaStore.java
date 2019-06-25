package hansung.designpatterns.factory.pizzafm;

public class KRPizzaStore extends PizzaStore  {

    Pizza createPizza(String item) {
        if (item.equals("kimchi")) {
            return new KoreaStyleKimchiPizza();
        } else if (item.equals("bulgogi")) {
            return new KoreaStyleBulgogiPizza();
        } else return null;
    }
}
