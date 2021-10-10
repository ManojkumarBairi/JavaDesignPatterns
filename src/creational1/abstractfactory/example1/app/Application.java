package creational1.abstractfactory.example1.app;

import creational1.abstractfactory.example1.buttons.Button;
import creational1.abstractfactory.example1.checkboxes.Checkbox;
import creational1.abstractfactory.example1.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
