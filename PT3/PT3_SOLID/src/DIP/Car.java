package DIP;

public abstract class Car {
    private TypeEngine engine;

    public Car(TypeEngine engine) {
        this.engine = engine;
    }

    public TypeEngine getEngine() {
        return engine;
    }

    public void setEngine(TypeEngine engine) {
        this.engine = engine;
    }

}
