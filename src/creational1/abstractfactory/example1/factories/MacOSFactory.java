package creational1.abstractfactory.example1.factories;

import creational1.abstractfactory.example1.buttons.Button;
import creational1.abstractfactory.example1.buttons.MacOSButton;
import creational1.abstractfactory.example1.checkboxes.Checkbox;
import creational1.abstractfactory.example1.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		 return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		 return new MacOSCheckbox();
	}

}
