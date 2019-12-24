package factoryPattern.abstractFactoryPattern1;

// 客户端测试代码
public class Client {
	public static void main(String args[]) {
		Factory factory;
		AbstractProductA productA;
		factory = new ConcreteFactory1();
		productA = factory.createProductA();
	}
}
