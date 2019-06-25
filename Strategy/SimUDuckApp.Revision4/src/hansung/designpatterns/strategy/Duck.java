package hansung.designpatterns.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	abstract public void display();
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
}
