package observer.object_observer;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("write log");
    }
}
