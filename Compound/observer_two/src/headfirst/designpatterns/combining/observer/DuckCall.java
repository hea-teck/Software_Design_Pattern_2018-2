package headfirst.designpatterns.combining.observer;

public class DuckCall extends java.util.Observable implements Quackable {

	//Observable observable;

	public DuckCall() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Kwak");
		setChanged();
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		addObserver(observer);
		//observable.registerObserver(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		super.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
