package adapter;

import java.util.Arrays;

public class Execute {
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println(bugattiVeyronAdapter.getSpeed());
        Arrays.asList()
    }
}
