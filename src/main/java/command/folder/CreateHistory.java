package command.folder;

public class CreateHistory implements FolderOperation {
    private final Folder folder;

    public CreateHistory(Folder folder) {
        this.folder = folder;
    }

    @Override
    public Folder execute() {
        return folder.createHistory();
    }
}
