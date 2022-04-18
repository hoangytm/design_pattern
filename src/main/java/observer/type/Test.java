package observer.type;

import java.util.Observable;
import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Store store = new Store();
        Citizen citizen = new Citizen();
        store.addObserver(citizen);
        store.addObserver(new Leader());
        store.addObserver(new King());
        store.change();
    }
}

class Store extends Observable {
    private String id;
    private String storeName;

    void change() {
        System.out.println("sau khi thay đỏi thì bắn event cho các sự kiện khác hoạt động");
        setChanged();
        notifyObservers();
        System.out.println("--------------------");
    }

}


class Citizen implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        try {
            Thread.sleep(5000);
            System.out.println("citizen");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

class Leader implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        try {
            System.out.println("leader");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

class King implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        try {
            Thread.sleep(4000);
            System.out.println("king");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
