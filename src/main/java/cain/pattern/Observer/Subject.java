package cain.pattern.Observer;

public interface Subject {
	
	void addObserver(Observer obser);
	void deleteObserver(Observer obser);
	void notifyAllObser(int count);
	
//	void operation();
	

}
