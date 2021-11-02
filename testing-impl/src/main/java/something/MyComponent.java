package something;

import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent {
    Car getCar();
}
