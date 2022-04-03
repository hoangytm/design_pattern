package decorator.department_assignment;

public class Manager extends DecoratorEmployee {
    public Manager(IEmployee iEmployee) {
        super(iEmployee);
    }

    @Override
    public void doTask() {
        super.doTask();
        createRequirement();
        assignTask();
    }

    public void createRequirement() {
        System.out.println("create requirement");
    }

    public void assignTask() {
        System.out.println("assign task");
    }


}
