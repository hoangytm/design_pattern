package observer.object_observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        System.out.println("update mail for this user");
    }
}
