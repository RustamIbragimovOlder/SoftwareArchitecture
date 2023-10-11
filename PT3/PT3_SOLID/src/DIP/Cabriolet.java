package DIP;

public class Cabriolet extends Car implements Engine {

    public Cabriolet(TypeEngine engine) {
        super(TypeEngine.ElectricEngine);
    }

    @Override
    public void start() {
        System.out.println("Двинатель заведен.");
    }

}
