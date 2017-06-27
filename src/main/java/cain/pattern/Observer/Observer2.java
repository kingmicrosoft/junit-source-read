package cain.pattern.Observer;

public class Observer2 implements Observer{
private int count;

public Observer2() {
	// TODO Auto-generated constructor stub
}

@Override
	public int getCount(){
		return this.count;
	}
	
	@Override
	public void updateCount(int count) {
		this.count=count;
		System.out.println("observer2 count equals: " +count);


	}
	
	
	

}
