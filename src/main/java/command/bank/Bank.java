package command.bank;

public class Bank {
    private final ICommand openAccountCmd;
    private final ICommand closeAccountCmd;

    public Bank(ICommand openAccountCmd, ICommand closeAccountCmd) {
        this.openAccountCmd = openAccountCmd;
        this.closeAccountCmd = closeAccountCmd;
    }

    public void close() {
        //do some logic here
        closeAccountCmd.execute();
    }

    public void open() {
        //do some logic here
        openAccountCmd.execute();
    }
}
