package prototypePattern.prototypePattern1;

public class ConcretePrototype implements Prototype {

	private String attr;

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	@Override
	public Prototype clone() {
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAttr(this.attr);
		return prototype;
	}

}
