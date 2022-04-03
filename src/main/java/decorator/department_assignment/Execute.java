package decorator.department_assignment;

public class Execute {
    public static void main(String[] args) {
        IEmployee teamLead = new Manager(new TeamLead(new TeamMember(new Employee())));
        teamLead.doTask();


    }
}
