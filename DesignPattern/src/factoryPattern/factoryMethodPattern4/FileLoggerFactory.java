package factoryPattern.factoryMethodPattern4;

/**
 * 文件日志记录器工厂类：具体工厂
 * @author wuwenqi
 */
public class FileLoggerFactory extends LoggerFactory {

	@Override
	public Logger createLogger() {
		// 创建文件日志记录器对象
		Logger logger = new FileLogger();
		// 创建文件，代码省略
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用参数args为文件日志记录器提供文件路径
		Logger logger = new DatabaseLogger();
		// 初始化数据库日志记录器，代码省略
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封装在参数obj中的字符串为文件日志记录器提供文件路径
		Logger logger = new DatabaseLogger();
		// 使用封装在参数obj中的数据来初始化文件日志记录器，代码省略
		return logger;
	}

}
