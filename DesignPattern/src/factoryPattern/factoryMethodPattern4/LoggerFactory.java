package factoryPattern.factoryMethodPattern4;

/**
 * 日志记录器工厂接口：抽象工厂
 * @author wuwenqi
 */
public abstract class LoggerFactory {
	
	/**
	 * 在工厂类中直接调用日志记录器的业务方法writeLog()，以便对客户端隐藏工厂方法
	 */
	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}
	
	public abstract Logger createLogger();
	
	public abstract Logger createLogger(String args);
	
	public abstract Logger createLogger(Object obj);
	
}
