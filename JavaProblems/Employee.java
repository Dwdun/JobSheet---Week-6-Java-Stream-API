package JavaProblems;

public class Employee {
    private String name;
    private int salary;

    //constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //output
    public String toString() {
        return "Employee{Name: " + name + ", Salary: " + salary + "}";
    }

}