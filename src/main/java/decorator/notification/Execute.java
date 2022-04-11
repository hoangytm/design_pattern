package decorator.notification;

public class Execute {
    public static void main(String[] args) {
        Web web = new Web();
        INotify notify = new Mail(web);
        notify.sendNotify();
    }
}
