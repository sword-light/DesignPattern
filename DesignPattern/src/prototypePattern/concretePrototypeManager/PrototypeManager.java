package prototypePattern.concretePrototypeManager;

import java.util.Hashtable;

// 原型管理器（使用饿汉式单例模式实现）
public class PrototypeManager {

	// 定义一个Hashtable用于存储原型对象
	private Hashtable<String, OfficialDocument> ht = new Hashtable<String, OfficialDocument>();
	private static PrototypeManager pm = new PrototypeManager();
	
	private PrototypeManager() {
		ht.put("far", new FAR());
		ht.put("srs", new SRS());
	}

	public void add(String key, OfficialDocument document) {
		ht.put("key", document);
	}

	public OfficialDocument getOfficialDocument(String key) {
		return ((OfficialDocument) ht.get(key)).clone();
	}
	
	public static PrototypeManager getPrototypeManager() {
		return pm;
	}

}
