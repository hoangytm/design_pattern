package decorator.department_assignment;

public class TeamLead extends DecoratorEmployee {

    public TeamLead(IEmployee iEmployee) {
        super(iEmployee);
    }

    @Override
    public void doTask() {
        super.doTask();
        planTask();
        motivateMember();
        monitor();
    }

    public void planTask() {
        System.out.println("plan task");
    }

    public void motivateMember() {
        System.out.println("motivate member");
    }

    public void monitor() {
        System.out.println("monitor member");
    }


}
