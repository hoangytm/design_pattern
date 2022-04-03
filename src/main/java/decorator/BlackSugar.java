package decorator;

public class BlackSugar extends DecoratorMilkTea {
    public BlackSugar(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return iMilkTea.cost() + 100;
    }
}
