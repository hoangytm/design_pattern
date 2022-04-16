package adapter;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void makeSound() {
        System.out.println(" quack quack");
    }
}
