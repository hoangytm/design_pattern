package command.bank;

public class Execute {
    public static void main(String[] args) {
        ICommand openAccount = new OpenAccountCmd();
        ICommand closeAccount = new CloseAccountCmd();
        Bank bank = new Bank(openAccount, closeAccount);
        bank.open();
        bank.close();
    }
}
