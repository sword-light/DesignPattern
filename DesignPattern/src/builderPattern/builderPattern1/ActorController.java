package builderPattern.builderPattern1;

// 游戏角色创建控制器：指挥者 
public class ActorController {
	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor = ab.createActor();
		return actor;
	}
}
