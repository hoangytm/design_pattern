package decorator;

public class Sugar extends DecoratorMilkTea {
    public Sugar(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return iMilkTea.cost() + 35;
    }
}
