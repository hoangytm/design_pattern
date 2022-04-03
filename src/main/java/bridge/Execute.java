package bridge;

public class Execute {
    public static void main(String[] args) {
        Os window = new Window(new Pdf());
        window.viewFile();
    }
}
