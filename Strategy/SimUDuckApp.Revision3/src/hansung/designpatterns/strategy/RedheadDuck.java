package hansung.designpatterns.strategy;

public class RedheadDuck extends Duck implements Flyable, Quackable{

	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
	
	public void fly() {
		System.out.println("I'm flying");	
	}

	public void quack() {
		System.out.println("Quack");	
	}
}
