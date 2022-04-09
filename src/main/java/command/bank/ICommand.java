package command.bank;

public interface ICommand {
    void execute();

    void undo();
}
