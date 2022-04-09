package command;

public class Remote {
    private final ICommand turnOnCommand;
    private final ICommand turnOffCommand;

    public Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    void turnOnClick() {
        turnOnCommand.execute();
    }

    void turnOffClick() {
        turnOffCommand.undo();
    }
}
