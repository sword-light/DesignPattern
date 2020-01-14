package builderPattern.builderPattern2;

// 天使角色建造器：具体建造者 
public class AngleBuilder /*extends ActorBuilder1*/ extends ActorBuilder2 {

	@Override
	public void buildType() {
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildFace() {
		actor.setFace("漂亮");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("白裙");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("披肩长发");
	}

}