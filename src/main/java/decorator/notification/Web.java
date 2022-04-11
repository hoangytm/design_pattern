package decorator.notification;

public class Web implements INotify {
    @Override
    public void sendNotify() {
        System.out.println("send web");
    }
}
