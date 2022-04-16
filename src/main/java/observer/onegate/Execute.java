package observer.onegate;

public class Execute {
    public static void main(String[] args) {
        ManagerEvent managerEvent = new ManagerEvent(new EFile());
        Observer observer = new Sms();
        managerEvent.attach(new Mail());
        managerEvent.attach(observer);
        managerEvent.notifyAllObserver();
        System.out.println("------------------------");
        managerEvent.detach(observer);
        managerEvent.notifyAllObserver();
    }
}
