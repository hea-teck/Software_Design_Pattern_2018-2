package hansung.designpatterns.strategy;

public class RubberDuck extends Duck {

	public void quack() {
		System.out.println("Squeak");
	}
	
	public void display() {
		System.out.println("I'm a rubber duckie");

	}
	
	public void fly() {
		System.out.println("I can't fly");
	}

}
