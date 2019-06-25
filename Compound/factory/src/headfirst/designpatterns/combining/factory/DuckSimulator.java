package headfirst.designpatterns.combining.factory;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory(); //카운팅 Yes
		//AbstractDuckFactory duckFactory = new DuckFactory();   // 카운팅 No
 
		simulator.simulate(duckFactory);
	}
 
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Abstract Factory");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
 
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
