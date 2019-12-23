package factoryPattern.factoryMethodPattern1;

public class Client {
	public static void main(String args[]) {
		Logger logger;
		logger = LoggerFactory.createLogger("db");
		logger.writeLog();
	}
}