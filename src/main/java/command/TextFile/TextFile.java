package command.TextFile;

public class TextFile {

    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    //create method for execute
    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    // additional text file methods (editing, writing, copying, pasting)
}