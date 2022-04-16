package observer.onegate;

public class Sms implements Observer {
    @Override
    public void update(EFile eFile) {
        System.out.println("do business of sms service for this eFile");
    }
}
