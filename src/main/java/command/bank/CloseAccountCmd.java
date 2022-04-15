package command.bank;

public class CloseAccountCmd implements ICommand {
    @Override
    public void execute() {
        System.out.println("close accocunt");
    }

    @Override
    public void undo() {
        System.out.println("open account again");
    }
}
