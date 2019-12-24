package factoryPattern.abstractFactoryPattern2.concreteComponent;

import factoryPattern.abstractFactoryPattern2.componentInterface.TextField;

public class SummerTextField implements TextField {

	@Override
	public void display() {
		System.out.println("显示蓝色边框文本框。");
	}

}
