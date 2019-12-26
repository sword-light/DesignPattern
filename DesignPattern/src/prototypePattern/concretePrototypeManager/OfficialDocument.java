package prototypePattern.concretePrototypeManager;

public interface OfficialDocument extends Cloneable {
	
	public OfficialDocument clone();
	
	public void display();

}
