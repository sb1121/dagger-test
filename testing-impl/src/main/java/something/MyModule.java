package something;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public interface MyModule {
	@Provides
	static Engine provideEngine() {
		return new EngineImpl();
	}

	@Provides
	static GasTank provideGasTank() {
		return new GasTankImpl();
	}

	@Provides
	static String name() {
		return "car1";
	}

	@Binds
	Car bindCar(CarImpl car);
}
