package factoryPattern.factoryMethodPattern2;

import factoryPattern.factoryMethodPattern2.FileLoggerFactory;
import factoryPattern.factoryMethodPattern2.Logger;
import factoryPattern.factoryMethodPattern2.LoggerFactory;

// 客户端测试代码
public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}
}
