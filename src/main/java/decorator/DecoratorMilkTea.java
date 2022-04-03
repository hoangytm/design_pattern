package decorator;

public abstract class DecoratorMilkTea implements IMilkTea {
    IMilkTea iMilkTea;

    public DecoratorMilkTea(IMilkTea iMilkTea) {
        this.iMilkTea = iMilkTea;
    }

     public abstract double cost() ;

}
