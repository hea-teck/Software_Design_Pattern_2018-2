package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;

public class DecoyDuck implements Quackable {
	Observable observable;

	private ArrayList<Observer> observers;

	public DecoyDuck() {
		//observable = new Observable(this);
		observers = new ArrayList<>();
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		observers.add(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		for(Observer observer : observers){
			observer.update(this);
		}
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
