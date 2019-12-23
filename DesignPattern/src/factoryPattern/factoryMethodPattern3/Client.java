package factoryPattern.factoryMethodPattern3;

// 客户端测试代码
public class Client {
	
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean(); // getBean()的返回类型为Object
		logger = factory.createLogger();
		logger.writeLog();
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
