package DemoInterface;


public class Developer extends Employee implements IEmployee {

    double basicSalary;
    public Developer(int employeeId, String employeeName, String employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeePhone);
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

}
