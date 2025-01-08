package abstractfactory;

import abstractfactory.widgetfactory.CircularWidgetFactory;
import abstractfactory.widgetfactory.RectangularWidgetFactory;
import abstractfactory.widgetfactory.WidgetFactory;

public class WidgetMaker {
    public enum LookAndFeelType {
        CIRCULAR, RECTANGULAR
    }

    public static WebPage getWidgetFactory(String lookAndFeelType) {
        if (LookAndFeelType.CIRCULAR.toString().equals(lookAndFeelType)) {
            return new WebPage(new CircularWidgetFactory());
        } else {
            return new WebPage(new RectangularWidgetFactory());
        }
    }
}
