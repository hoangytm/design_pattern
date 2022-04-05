package decorator.car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("assemble basic car");
    }
}
