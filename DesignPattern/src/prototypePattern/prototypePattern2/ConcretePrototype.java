package prototypePattern.prototypePattern2;

public class ConcretePrototype implements Cloneable, Prototype {
	public Prototype clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException exception) {
			System.err.println("Not	support	cloneable");
		}
		return (Prototype) object;
	}
}
