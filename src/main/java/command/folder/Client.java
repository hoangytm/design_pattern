package command.folder;

public class Client {
    public static void main(String[] args) {
        FolderOperationExecutor folderOperationExecutor = new FolderOperationExecutor();
        Folder last = folderOperationExecutor.executeOperation(new OpenFolder(new Folder(null, "tree1", null, null)));
        FolderRepository.showData();

        folderOperationExecutor.executeOperation(new UpdateFolder(new Folder(last.getId(), "new tree", "3333", "123")));

        FolderRepository.showData();
        folderOperationExecutor.executeOperation(new CreateHistory(new Folder(last.getId(), "new tree", "3333", "123")));
        System.out.println("-----------------------------------------");
        FolderRepository.showHistory();


    }
}
