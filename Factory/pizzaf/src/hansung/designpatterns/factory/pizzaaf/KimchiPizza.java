package hansung.designpatterns.factory.pizzaaf;

public class KimchiPizza extends Pizza {
    public KimchiPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        kimchi = ingredientFactory.createKimchi();
    }
}