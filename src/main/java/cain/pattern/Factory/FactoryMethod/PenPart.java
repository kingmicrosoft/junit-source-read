package cain.pattern.Factory.FactoryMethod;

public class PenPart implements Product {
	public PenPart(String type) {
		this.type = type;
	}

	String type;

	@Override
	public String produce(String matiral) {
		
		return "pen";
	}

}
