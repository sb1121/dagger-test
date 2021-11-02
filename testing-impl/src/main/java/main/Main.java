package main;

import something.Car;
import something.DaggerMyComponent;
import something.MyComponent;

public class Main {

    public static void main(String[] args) {
        MyComponent comp = DaggerMyComponent.create();
        Car car = comp.getCar();
        car.fill();
        car.start();
    }
}
