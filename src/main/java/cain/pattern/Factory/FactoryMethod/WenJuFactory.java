package cain.pattern.Factory.FactoryMethod;

public class WenJuFactory {
	
	public Product producePen(){
		return new PenPart("0.5mm");
	}
	
	public Product produceNoteBook(){
		return new NoteBookPart();
	}

}
