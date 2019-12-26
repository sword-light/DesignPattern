package prototypePattern.prototypePattern1;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype obj1 = new ConcretePrototype();
		obj1.setAttr("Sunny");
		ConcretePrototype obj2 = (ConcretePrototype)obj1.clone();
		System.out.println(obj1 == obj2);
		System.out.println(obj2.getAttr());
	}

}
