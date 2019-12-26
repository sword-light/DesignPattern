package prototypePattern.deepClone;

import java.io.*;

/**
 * 工作周报
 *  深克隆
 * @author wuwenqi
 */
public class WeeklyLog implements Serializable {
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

	// 使用序列化技术实现深克隆
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
		// 将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		// 将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyLog) ois.readObject();
	}
}
