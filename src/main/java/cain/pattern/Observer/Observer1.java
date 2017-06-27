package cain.pattern.Observer;

/**
 * Created by wenchai on 2015/7/17.
 */
public class Observer1 implements Observer{
	private int count;
	
	public Observer1() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void updateCount(int count) {
		this.count=count;
		System.out.println("observer1 count equals: " +count);
	}



	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.count; 
	}
	
	
	
	
	
	
}
