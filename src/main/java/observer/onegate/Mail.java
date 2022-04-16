package observer.onegate;

public class Mail implements Observer {
    @Override
    public void update(EFile eFile) {
        System.out.println(" do business of mail service for this email");
    }
}
