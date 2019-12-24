package singletonPattern.singletonPatternOfTaskManager;

public class TaskManager {
	
	private static TaskManager tm = null;

	// 初始化窗口
	private TaskManager() {
		// ……
	}
	
	public static TaskManager getInstance() {
		if(tm == null) {
			tm = new TaskManager();
		}
		return tm;
	}

	// 显示进程
	public void displayProcesses() {
		// ……
	}

	// 显示服务
	public void displayServices() {
		// ……
	}

	// ……

}
