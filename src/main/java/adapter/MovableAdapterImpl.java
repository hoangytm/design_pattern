package adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    // standard constructors
    public MovableAdapterImpl(Movable movable) {
        this.luxuryCars = movable;
    }

    // convert km/h to mile/h
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}