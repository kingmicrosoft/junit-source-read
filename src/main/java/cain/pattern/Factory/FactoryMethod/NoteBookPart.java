package cain.pattern.Factory.FactoryMethod;

public class NoteBookPart implements Product {

	@Override
	public String produce(String matiral) {

		return "notebook";
	}

}
