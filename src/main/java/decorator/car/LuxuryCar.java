package decorator.car;

public class LuxuryCar extends DecoratorCar {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("luxury car");
    }

}
