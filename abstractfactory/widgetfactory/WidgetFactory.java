package abstractfactory.widgetfactory;

import abstractfactory.button.Button;
import abstractfactory.icon.Icon;
import abstractfactory.window.Window;

public interface WidgetFactory {
    Window createWindow();
    Button createButton();
    Icon createIcon();
}
