package decorator.car;

public abstract class DecoratorCar implements Car {
    private final Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    public void assemble() {
        car.assemble();
    }
}
