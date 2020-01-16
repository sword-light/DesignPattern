package builderPattern.builderPattern3;

// 客户端测试代码
public class Client {

	public static void main(String args[]) {
		ActorController actorController = new ActorController();
		ActorBuilder actorBuilder;
		Actor actor;

		actorBuilder = (ActorBuilder) XMLUtil.getBean();
		actor = actorController.construct(actorBuilder);
		System.out.println(actor.getType() + "的外观：");
		System.out.println("性别：" + actor.getSex());
		System.out.println("面容：" + actor.getFace());
		System.out.println("服装：" + actor.getCostume());
		System.out.println("发型：" + actor.getHairstyle());
	}

}
