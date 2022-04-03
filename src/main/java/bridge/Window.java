package bridge;

public class Window implements Os {
    private final FileType fileType;

    public Window(FileType fileType) {
        this.fileType = fileType;
    }
    @Override
    public void viewFile() {
        fileType.viewFile();

    }
}
