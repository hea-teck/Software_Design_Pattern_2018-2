package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleKimchiPizza extends Pizza{

    public KoreaStyleKimchiPizza() {
        name = "Korea Style Kimchi Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        kimchi = "Yulmukimchi";

        toppings.add("Grated Reggiano Cheese");
    }
}
