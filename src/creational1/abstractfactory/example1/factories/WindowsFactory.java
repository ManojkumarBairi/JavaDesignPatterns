package creational1.abstractfactory.example1.factories;

import creational1.abstractfactory.example1.buttons.Button;
import creational1.abstractfactory.example1.buttons.WindowsButton;
import creational1.abstractfactory.example1.checkboxes.Checkbox;
import creational1.abstractfactory.example1.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		 return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
