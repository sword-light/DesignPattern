package factoryPattern.factoryMethodPattern1;

// 客户端测试代码
public class Client {
	public static void main(String args[]) {
		Logger logger;
		logger = LoggerFactory.createLogger("db");
		logger.writeLog();
	}
}
