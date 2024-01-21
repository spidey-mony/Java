package JAVALESSON;

public abstract class Employee {
    public int employeeId;
    public String employeeName;
    public String employeePhone;

    public Employee(int employeeId, String employeeName, String employeePhone) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }

    public abstract double calculateSalary();

    public String getName() {
        return employeeName;
    }

    public int getId() {
        return employeeId;
    }

    public String getPhone() {
        return employeePhone;
    }
}
