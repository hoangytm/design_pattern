package decorator.department_assignment;

public class TeamMember extends DecoratorEmployee {
    public TeamMember(IEmployee iEmployee) {
        super(iEmployee);
    }

    @Override
    public void doTask() {
        super.doTask();
        memberDoTask();

    }

    private void memberDoTask() {
        System.out.println("--------------- member do task------------------");
    }


}
