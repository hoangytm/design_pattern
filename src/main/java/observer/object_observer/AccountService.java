package observer.object_observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {
    List<Observer> observers = new ArrayList<>();
    User user;

    public AccountService(User user) {
        this.user = user;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach(item -> {
            item.update(user);
        });

    }

    public void changeStatus(String loginStatus) {
        user.setLoginStatus(loginStatus);
        notifyAllObserver();
    }

    public void login() {
        user.setLoginStatus("active");
    }

}
