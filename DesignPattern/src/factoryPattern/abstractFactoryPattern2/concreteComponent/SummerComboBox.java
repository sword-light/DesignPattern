package factoryPattern.abstractFactoryPattern2.concreteComponent;

import factoryPattern.abstractFactoryPattern2.componentInterface.ComboBox;

public class SummerComboBox implements ComboBox {

	@Override
	public void display() {
		System.out.println("显示蓝色边框组合框。");
	}

}
