package decorator;

public class Pudding extends DecoratorMilkTea {
    public Pudding(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 1 + iMilkTea.cost();
    }
}
