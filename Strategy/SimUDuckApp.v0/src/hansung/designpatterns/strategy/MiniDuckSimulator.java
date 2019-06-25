package hansung.designpatterns.strategy;

import java.util.ArrayList;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		
		ducks.add(new MallardDuck());
		ducks.add(new RedheadDuck());
		
		for (Duck d: ducks) {
			d.display();
			d.swim();
			d.quack();
			System.out.println();
		}

	}

}
