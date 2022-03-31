package adapter;

public class BugattiVeyron implements Movable {

    // chỉ trả ra km/h điền này không thể đáp ứng được
    @Override
    public double getSpeed() {
        return 268;
    }
}