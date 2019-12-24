package factoryPattern.abstractFactoryPattern2;

import factoryPattern.abstractFactoryPattern2.componentInterface.*;

// 客户端测试代码
public class Client {
	
	public static void main(String args[]) {
		SkinFactory factory;
		Button button;
		TextField textField;
		ComboBox comboBox;
		
		factory = (SkinFactory) XMLUtil.getBean();
		button = factory.createButton();
		textField = factory.createTextField();
		comboBox = factory.createComboBox();
		button.display();
		textField.display();
		comboBox.display();
	}
	
}
