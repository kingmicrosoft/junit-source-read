package cain.pattern.Observer;

import java.util.Enumeration;
import java.util.Vector;


public abstract class AbstactSubject implements Subject {
private Vector<Observer> observers=new Vector<Observer>();

	
	
	@Override
	public void addObserver(Observer obser) {
		observers.add(obser);
		
	}
	
	@Override
	public void deleteObserver(Observer obser) {
		observers.remove(obser);
		obser.updateCount(0);
		
	}
	@Override
	public void notifyAllObser(int count) {
		Enumeration<Observer> enumeration=observers.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement().updateCount(count);
		}
		
	}
	

	
	

}
