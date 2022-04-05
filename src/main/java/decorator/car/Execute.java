package decorator.car;

public class Execute {
    public static void main(String[] args) {
        Car car = new LuxuryCar(new SportCar(new BasicCar()));
        car.assemble();
    }
}
