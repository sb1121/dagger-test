package something;

import javax.inject.Inject;

public class CarImpl implements Car {
    private final Engine engine;
    private final GasTank gasTank;
	private final String name;

    @Inject
    public CarImpl(Engine engine, GasTank gasTank, String name) {
        this.engine = engine;
        this.gasTank = gasTank;
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + ": Starting " + engine);
    }

    @Override
    public void fill() {
        gasTank.fill();
    }
}
