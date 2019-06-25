package hansung.designpatterns.strategy;

public class DecoyDuck extends Duck {
	
	public void quack() {
		System.out.println("<< Silence >>");
	}

	public void display() {
		System.out.println("I'm a duck Decoy");

	}
	
	public void fly() {
		System.out.println("I can't fly");
	}
}
