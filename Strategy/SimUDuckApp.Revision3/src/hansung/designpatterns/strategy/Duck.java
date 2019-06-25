package hansung.designpatterns.strategy;

public abstract class Duck {
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	abstract public void display();
}
