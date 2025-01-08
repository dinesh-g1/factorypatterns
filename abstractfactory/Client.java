package abstractfactory;

import abstractfactory.widgetfactory.CircularWidgetFactory;
import abstractfactory.widgetfactory.WidgetFactory;

public class Client {
    public static void main(String[] args) {
        WebPage webPageWithCircularWidgets = createCircularWidgets();
        webPageWithCircularWidgets.buttonDescription();
        webPageWithCircularWidgets.iconShape();
        webPageWithCircularWidgets.windowDescription();

        System.out.println("-----------------------");

        WebPage webPageWithRectangularWidgets = createRectangularWidgets();
        webPageWithRectangularWidgets.buttonDescription();
        webPageWithRectangularWidgets.iconShape();
        webPageWithRectangularWidgets.windowDescription();
    }

    public static WebPage createRectangularWidgets() {
       return WidgetMaker.getWidgetFactory(String.valueOf(WidgetMaker.LookAndFeelType.RECTANGULAR));
    }

    public static WebPage createCircularWidgets() {
        return WidgetMaker.getWidgetFactory(String.valueOf(WidgetMaker.LookAndFeelType.CIRCULAR));
    }
}
