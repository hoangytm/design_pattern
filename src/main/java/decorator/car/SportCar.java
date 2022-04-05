package decorator.car;

public class SportCar extends DecoratorCar {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("assemble sport car");
    }
}
