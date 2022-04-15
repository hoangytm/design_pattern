package command.folder;

import java.util.UUID;

public class Folder {
    final String name;
    private String id;
    private String parentId;
    private String parentName;

    public Folder(String id, String name, String parentId, String parentName) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.parentName = parentName;
    }


    public Folder create() {
        if (this.getId() == null) {
            this.id = UUID.randomUUID().toString();
        }
        FolderRepository.save(this);
        return this;
    }

    public Folder update() {
        FolderRepository.update(this);
        return this;
    }
    public Folder createHistory() {
        FolderRepository.createHistory(this);
        return this;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}
