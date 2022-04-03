package decorator.department_assignment;

public abstract class DecoratorEmployee implements IEmployee {
    private IEmployee iEmployee;

    public DecoratorEmployee(IEmployee iEmployee) {
        this.iEmployee = iEmployee;
    }

    public void doTask() {
        iEmployee.doTask();
    }

    public void joinTask() {
        iEmployee.joinTask();
    }

}
