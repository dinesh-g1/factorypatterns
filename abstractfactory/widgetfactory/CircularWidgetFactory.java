package abstractfactory.widgetfactory;

import abstractfactory.button.Button;
import abstractfactory.icon.Icon;
import abstractfactory.window.CircularWindow;
import abstractfactory.button.CircularButton;
import abstractfactory.icon.CircularIcon;
import abstractfactory.window.Window;

public class CircularWidgetFactory implements WidgetFactory{
    @Override
    public Window createWindow() {
        return new CircularWindow();
    }

    @Override
    public Button createButton() {
        return new CircularButton();
    }

    @Override
    public Icon createIcon() {
        return new CircularIcon();
    }
}
