package decorator.notification;

public class Mail extends DecoratorNotify {

    public Mail(INotify iNotify) {
        super(iNotify);
    }

    @Override
    public void sendNotify() {
        System.out.println("send mail notify");
        iNotify.sendNotify();
    }
}
