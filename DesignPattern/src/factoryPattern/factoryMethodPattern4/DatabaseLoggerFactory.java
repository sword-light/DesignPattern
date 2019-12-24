package factoryPattern.factoryMethodPattern4;

/**
 * 数据库日志记录器工厂类：具体工厂
 * @author wuwenqi
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// 连接数据库，代码省略
		// 创建数据库日志记录器对象
		Logger logger = new DatabaseLogger();
		// 初始化数据库日志记录器，代码省略
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用参数args作为连接字符串来连接数据库，代码省略
		Logger logger = new DatabaseLogger();
		// 初始化数据库日志记录器，代码省略
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封装在参数obj中的连接字符串来连接数据库，代码省略
		Logger logger = new DatabaseLogger();
		// 使用封装在参数obj中的数据来初始化数据库日志记录器，代码省略
		return logger;
	}

}
