package hansung.designpatterns.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
		//setQuackBehavior(new FakeQuak());
	}
	
	public void display() {
		System.out.println("I'm a model duck ");

	}

}
