package command.bank;

public class OpenAccountCmd implements ICommand{
    @Override
    public void execute() {
        System.out.println("open account");
    }

    @Override
    public void undo() {
        System.out.println("close account");
    }
}
