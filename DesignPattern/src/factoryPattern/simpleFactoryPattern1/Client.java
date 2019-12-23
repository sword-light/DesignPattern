package factoryPattern.simpleFactoryPattern1;

public class Client {
	public static void main(String args[]) {
		Product product;
		product = Factory.getProduct("A"); // 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();
	}
}

/**
 * 将具体产品类的公共代码和都需要实现的方法，抽象、提取后封装在抽象产品类中
 * @author wuwenqi
 */
abstract class Product {
	// 所有产品类的公共业务方法
	public void methodSame() {
		// 公共方法的实现
	}

	// 声明抽象业务方法
	public abstract void methodDiff();
}

/**
 * 将不同Chart对象封装到不同的类中，这些类称为具体产品类
 * @author wuwenqi
 */
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

/**
 * 工厂类是简单工厂模式的核心，内含静态方法，该方法可以根据传入参数的不同返回不同产品的对象
 * 该对象是具体产品对象的上转型对象
 * @author wuwenqi
 */
class Factory {
	/**
	 * 静态工厂方法
	 * @param arg
	 * @return Product
	 */
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