package abstractfactory.button;

public class RectangularButton implements Button{
    @Override
    public void description() {
        System.out.println("Rectangular button.");
    }
}
