package builderPattern.builderPattern3;

// 恶魔角色建造器：具体建造者
public class DevilBuilder extends ActorBuilder {

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
	
	// 覆盖抽象建造者的钩子方法
	public boolean isBareheaded() {
		return false;
	}

}
