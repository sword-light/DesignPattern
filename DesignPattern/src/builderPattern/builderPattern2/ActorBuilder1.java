package builderPattern.builderPattern2;

// 角色建造器：抽象建造者
public abstract class ActorBuilder1 {

	protected static Actor actor = new Actor();

	public abstract void buildType();

	public abstract void buildSex();

	public abstract void buildFace();

	public abstract void buildCostume();

	public abstract void buildHairstyle();

	// 工厂方法，返回一个完整的游戏角色对象
	public static Actor createActor(ActorBuilder1 ab) {
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		return actor;
	}

}
