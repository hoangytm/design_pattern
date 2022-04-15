package command.folder;

public class UpdateFolder implements FolderOperation {
    private final Folder folder;

    public UpdateFolder(Folder folder) {
        this.folder = folder;
    }

    @Override
    public Folder execute() {
      return  folder.update();
    }
}
