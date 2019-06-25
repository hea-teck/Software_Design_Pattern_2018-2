package hansung.designpatterns.factory.pizzaaf;

public class KRPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new KRPizzaIngredientFactory();

        if (item.equals("kimchi")) {

            pizza = new KimchiPizza(ingredientFactory);
            pizza.setName("Korea Style Kimchi Pizza");

        } else if (item.equals("bulgogi")) {

            pizza = new BulgogiPizza(ingredientFactory);
            pizza.setName("Korea Style Bulgogi Pizza");

        }
        return pizza;
    }
}
