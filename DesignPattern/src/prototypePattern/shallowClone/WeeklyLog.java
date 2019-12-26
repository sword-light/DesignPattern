package prototypePattern.shallowClone;

/**
 * 工作周报
 * 浅克隆
 * @author wuwenqi
 */
public class WeeklyLog implements Cloneable {
	// 为了简化设计和实现，假设一份工作周报中只有一个附件对象，实际情况中可以包含多个附件
	private Attachment attachment;
	private String name;
	private String date;
	private String content;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return (this.name);
	}

	public String getDate() {

		return (this.date);
	}

	public String getContent() {
		return (this.content);
	}

	// 使用clone()方法实现浅克隆
	public WeeklyLog clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (WeeklyLog) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制！");
			return null;
		}
	}
}
