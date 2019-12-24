package factoryPattern.factoryMethodPattern4;

// 客户端测试代码
public class Client {
	
	public static void main(String args[]) {
		LoggerFactory factory;
		factory = (LoggerFactory) XMLUtil.getBean();
		factory.writeLog(); // 直接使用工厂对象来调用产品对象的业务方法
	}
	
}
