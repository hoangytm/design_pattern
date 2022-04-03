package decorator.department_assignment;

public class Employee implements IEmployee{
    @Override
    public void doTask() {
        System.out.println("do task");
    }

    @Override
    public void joinTask() {
        System.out.println("join task");
    }
}
