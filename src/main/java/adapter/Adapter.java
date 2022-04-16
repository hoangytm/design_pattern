package adapter;

public class Adapter implements Toy {
    Duck duck;

    public Adapter(Duck duck) {
        this.duck = duck;
    }


    @Override
    public void makeFun() {
        duck.makeSound();
    }
}
