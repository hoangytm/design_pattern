package decorator.notification;

public abstract class DecoratorNotify implements INotify {
    INotify iNotify;

    public DecoratorNotify(INotify iNotify) {
        this.iNotify = iNotify;
    }

    public abstract void sendNotify();
}
