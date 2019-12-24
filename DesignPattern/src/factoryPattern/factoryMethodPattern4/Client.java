package factoryPattern.factoryMethodPattern4;

// 客户端测试代码
public class Client {
	
	public static void main(String args[]) {
		LoggerFactory factory;
		factory = (LoggerFactory) XMLUtil.getBean();
		factory.writeLog(); // 直接使用工厂对象来调用产品对象的业务方法
	}
	
	// java-reflect
//	public static void main(String[] args) {
//		try {
//			Class c = Class.forName("java.lang.String");
//			try {
//				Object obj = c.newInstance();
//				System.out.println(obj instanceof String);
//			} catch (InstantiationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
