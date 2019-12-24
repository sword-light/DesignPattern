package factoryPattern.abstractFactoryPattern2.concreteComponent;

import factoryPattern.abstractFactoryPattern2.componentInterface.Button;

public class SummerButton implements Button {

	@Override
	public void display() {
		System.out.println("显示浅蓝色按钮。");
	}

}
