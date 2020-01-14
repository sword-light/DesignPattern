package builderPattern.builderPattern2;

// 恶魔角色建造器：具体建造者
public class DevilBuilder /*extends ActorBuilder1*/ extends ActorBuilder2 {

	@Override
	public void buildType() {
		actor.setType("恶魔");
	}

	@Override
	public void buildSex() {
		actor.setSex("妖");
	}

	@Override
	public void buildFace() {
		actor.setFace("丑陋");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("黑衣");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("光头");
	}

}
