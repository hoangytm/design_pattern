package observer.onegate;

import java.util.ArrayList;
import java.util.List;

public class ManagerEvent implements Subject {
    List<Observer> observers = new ArrayList<>();
    EFile eFile;

    public ManagerEvent(EFile eFile) {
        this.eFile = eFile;
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }

    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach((item) -> {
            item.update(eFile);
        });
    }
}
