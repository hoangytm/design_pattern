package command;

public class TurnOffCommand implements ICommand {
    Fan fan;

    public TurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
}
