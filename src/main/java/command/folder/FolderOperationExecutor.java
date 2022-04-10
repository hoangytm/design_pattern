package command.folder;

public class FolderOperationExecutor {

    public Folder executeOperation(FolderOperation folderOperation) {
        return folderOperation.execute();
    }
}
