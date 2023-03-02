package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	public void add(Observer observer) {
		
		observers.add(observer);
		
	}
	
	public void notifyObservers(boolean status) {
		
		for (Observer obs : observers) {
			obs.update(status);
		}
	}
	
	
	
	
}
