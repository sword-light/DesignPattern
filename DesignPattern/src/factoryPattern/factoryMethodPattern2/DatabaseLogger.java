package factoryPattern.factoryMethodPattern2;

/**
 * 数据库日志记录器：具体产品
 * @author wuwenqi
 */
public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("数据库日志记录。");
	}

}
