package prototypePattern.prototypePattern2;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype obj1 = new ConcretePrototype();
		ConcretePrototype obj2 = (ConcretePrototype)obj1.clone();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.getClass() == obj2.getClass());
	}

}
