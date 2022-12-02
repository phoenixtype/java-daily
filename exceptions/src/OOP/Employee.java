package OOP;

public class Employee {

    private EmployeeLocation employeeLocation;
    private String name;
    private double salary;
    private int age;

    public Employee(EmployeeLocation employeeLocation, String name, double salary, int age) {
        this.employeeLocation = employeeLocation;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void raiseSalary() {
        //increase the salary by 20%
        this.salary = this.salary * 1.2;
    }
}
