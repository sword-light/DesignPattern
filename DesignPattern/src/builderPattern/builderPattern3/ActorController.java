package builderPattern.builderPattern3;

// 游戏角色创建控制器：指挥者 
public class ActorController {
	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		if (!ab.isBareheaded()) {
			ab.buildHairstyle();
		}
		actor = ab.createActor();
		return actor;
	}
}
