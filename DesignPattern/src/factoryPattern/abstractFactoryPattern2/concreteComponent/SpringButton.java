package factoryPattern.abstractFactoryPattern2.concreteComponent;

import factoryPattern.abstractFactoryPattern2.componentInterface.Button;

public class SpringButton implements Button {

	@Override
	public void display() {
		System.out.println("显示浅绿色按钮。");
	}

}
