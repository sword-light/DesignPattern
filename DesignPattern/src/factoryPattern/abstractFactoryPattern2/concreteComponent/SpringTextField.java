package factoryPattern.abstractFactoryPattern2.concreteComponent;

import factoryPattern.abstractFactoryPattern2.componentInterface.TextField;

public class SpringTextField implements TextField {

	@Override
	public void display() {
		System.out.println("显示绿色边框文本框。");
	}

}
