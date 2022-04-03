package bridge;

public class Pdf implements FileType {
    @Override
    public void viewFile() {
        System.out.println("show file for clients");
    }
}
