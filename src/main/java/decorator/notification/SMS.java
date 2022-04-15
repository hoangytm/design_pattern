package decorator.notification;

public class SMS extends DecoratorNotify {
    public SMS(INotify iNotify) {
        super(iNotify);
    }

    @Override
    public void sendNotify() {
        System.out.println("send sms");
        iNotify.sendNotify();
    }
}
