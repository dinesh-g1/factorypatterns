package abstractfactory;

import abstractfactory.button.Button;
import abstractfactory.icon.Icon;
import abstractfactory.widgetfactory.WidgetFactory;
import abstractfactory.window.Window;

public class WebPage {
    private final Button button;
    private final Icon icon;
    private final Window window;

    public WebPage(WidgetFactory widgetFactory) {
        this.button = widgetFactory.createButton();
        this.icon = widgetFactory.createIcon();
        this.window = widgetFactory.createWindow();
    }

    public void buttonDescription() {
        button.description();
    }

    public void iconShape() {
        icon.description();
    }

    public void windowDescription() {
        window.description();
    }
}
