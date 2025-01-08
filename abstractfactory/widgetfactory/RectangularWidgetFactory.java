package abstractfactory.widgetfactory;

import abstractfactory.button.Button;
import abstractfactory.icon.Icon;
import abstractfactory.window.RectangularWindow;
import abstractfactory.button.RectangularButton;
import abstractfactory.icon.RectangularIcon;
import abstractfactory.window.Window;

public class RectangularWidgetFactory implements WidgetFactory{
    @Override
    public Window createWindow() {
        return new RectangularWindow();
    }

    @Override
    public Button createButton() {
        return new RectangularButton();
    }

    @Override
    public Icon createIcon() {
        return new RectangularIcon();
    }
}
