package factoryPattern.abstractFactoryPattern2;

import factoryPattern.abstractFactoryPattern2.componentInterface.*;

public interface SkinFactory {

	public Button createButton();
	
	public TextField createTextField();
	
	public ComboBox createComboBox();
	
}
