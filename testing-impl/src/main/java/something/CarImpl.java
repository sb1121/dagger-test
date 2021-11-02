package something;

import javax.inject.Inject;

public class CarImpl implements Car {
    private final Engine engine;
    private final GasTank gasTank;

    @Inject
    public CarImpl(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    @Override
    public void start() {
        System.out.println("Starting " + engine);
    }

    @Override
    public void fill() {
        gasTank.fill();
    }
}
