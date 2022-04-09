package command;

public class Execute {
    public static void main(String[] args) {
        Fan fan = new Fan();
        ICommand turnOffCommand = new TurnOffCommand(fan);
        ICommand turnOnCommand = new TurnOnCommand(fan);

        Remote remote = new Remote(turnOnCommand,turnOffCommand );
        remote.turnOnClick();
        remote.turnOffClick();
    }
}
