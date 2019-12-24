package factoryPattern.abstractFactoryPattern2;

import factoryPattern.abstractFactoryPattern2.componentInterface.Button;
import factoryPattern.abstractFactoryPattern2.componentInterface.ComboBox;
import factoryPattern.abstractFactoryPattern2.componentInterface.TextField;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SummerButton;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SummerComboBox;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SummerTextField;

public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SummerComboBox();
	}

}
