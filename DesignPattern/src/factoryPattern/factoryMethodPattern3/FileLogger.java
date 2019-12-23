package factoryPattern.factoryMethodPattern3;

/**
 * 文件日志记录器：具体产品
 * @author wuwenqi
 */
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("文件日志记录。");
	}

}
