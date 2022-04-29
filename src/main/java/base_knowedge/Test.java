package base_knowedge;

import java.util.Optional;

public class Test {
    private static Optional<Employee> getEmployee() {
        System.out.println("get employee");
        return Optional.of(new Employee(1l, "hoang"));
    }

    private static Optional<Employee> getLeader() {
        System.out.println("get leader");
        return Optional.empty();
    }

    public static void main(String[] args) {


    }

}

class Employee {
    private Long id;
    private String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
