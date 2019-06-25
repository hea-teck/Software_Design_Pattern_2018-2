package hansung.designpatterns.strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract public void display();
}
