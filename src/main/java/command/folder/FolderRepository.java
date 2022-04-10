package command.folder;

import com.google.gson.Gson;
import command.H;

import java.util.ArrayList;
import java.util.List;

public class FolderRepository {
    public static List<Folder> database = new ArrayList<>();
    public static List<History> histories = new ArrayList<>();

    public static void save(Folder folder) {
        database.add(folder);
        System.out.println("save folder success");
    }

    public static void update(Folder folder) {
        remove(folder.getId());
        database.add(folder);
        System.out.println("update item to folder");
    }

    private static void remove(String id) {
        H.each(database, ((index, item) -> {
            if (item.getId().equals(id)) {
                database.remove(index);
            }
        }));

    }

    public static void showData() {
        database.parallelStream().forEach(item -> {
            System.out.println(new Gson().toJson(item));
        });
    }

    public static void showHistory() {
        histories.parallelStream().forEach(item -> {
            System.out.println(new Gson().toJson(item));
        });
    }

    public static void createHistory(Folder folder) {
        History history = new History(folder.getId(), "đã tạo folder " + folder.getName());
        histories.add(history);
    }
}
