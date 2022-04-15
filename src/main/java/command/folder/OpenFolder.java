package command.folder;

public class OpenFolder implements FolderOperation {
    private final Folder folder;


    public OpenFolder(Folder folder) {
        this.folder = folder;
    }

    @Override
    public Folder execute() {
        return folder.create();
    }
}
