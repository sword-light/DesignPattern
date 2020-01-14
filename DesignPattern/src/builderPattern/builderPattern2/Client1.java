package builderPattern.builderPattern2;

// 客户端测试代码
public class Client1 {

	public static void main(String args[]) {
		ActorBuilder1 actorBuilder;
		Actor actor;

		actorBuilder = (ActorBuilder1) XMLUtil.getBean();
		actor = ActorBuilder1.createActor(actorBuilder);
		System.out.println(actor.getType() + "的外观：");
		System.out.println("性别：" + actor.getSex());
		System.out.println("面容：" + actor.getFace());
		System.out.println("服装：" + actor.getCostume());
		System.out.println("发型：" + actor.getHairstyle());
	}

}
