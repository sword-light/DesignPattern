package factoryPattern.simpleFactoryPattern1;

public class Client {
	public static void main(String args[]) {
		Product product;
		product = Factory.getProduct("A"); // 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();
	}
}

abstract class Product {
	// 所有产品类的公共业务方法
	public void methodSame() {
		// 公共方法的实现
	}

	// 声明抽象业务方法
	public abstract void methodDiff();
}

class ConcreteProduct extends Product {
	// 实现业务方法
	public void methodDiff() {
		// 业务方法的实现
	}
}

class ConcreteProductA extends Product {
	// 实现业务方法
	public void methodDiff() {
		// 业务方法的实现
	}
}

class ConcreteProductB extends Product {
	// 实现业务方法
	public void methodDiff() {
		// 业务方法的实现
	}
}

class Factory {
	// 静态工厂方法
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ConcreteProductA();
			// 初始化设置product
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ConcreteProductB();
			// 初始化设置product
		}
		return product;
	}
}