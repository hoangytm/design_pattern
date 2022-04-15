package observer;

import java.io.File;

public class Sms implements EventListener {
    @Override
    public void update(String eventType, File file) {
        System.out.println("do event listener");
    }
}
