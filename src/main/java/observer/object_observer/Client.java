package observer.object_observer;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        Subject subject = new AccountService(user);

        subject.attach(new Mailer());
        subject.attach(new Logger());
        subject.notifyAllObserver();
        System.out.println("===================");
        subject.detach(new Logger());
        subject.notifyAllObserver();
    }
}
