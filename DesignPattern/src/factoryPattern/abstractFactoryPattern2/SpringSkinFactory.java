package factoryPattern.abstractFactoryPattern2;

import factoryPattern.abstractFactoryPattern2.componentInterface.Button;
import factoryPattern.abstractFactoryPattern2.componentInterface.ComboBox;
import factoryPattern.abstractFactoryPattern2.componentInterface.TextField;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SpringButton;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SpringComboBox;
import factoryPattern.abstractFactoryPattern2.concreteComponent.SpringTextField;

public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}

}
