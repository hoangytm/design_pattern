package command;

public class TurnOnCommand implements ICommand {
    Fan fan;

    public TurnOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
