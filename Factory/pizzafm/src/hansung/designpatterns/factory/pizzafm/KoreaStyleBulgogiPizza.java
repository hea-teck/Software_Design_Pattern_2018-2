package hansung.designpatterns.factory.pizzafm;

public class KoreaStyleBulgogiPizza extends Pizza{

    public KoreaStyleBulgogiPizza() {
        name = "Korea Style Bulgogi Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        bulgogi = "Porkbulgogi";

        toppings.add("Grated Reggiano Cheese");
    }
}
