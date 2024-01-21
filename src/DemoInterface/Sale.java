package DemoInterface;
public class Sale extends Employee implements IEmployee {

    double basicSalary;
    double commission;
    public Sale(int employeeId, String employeeName, String employeePhone, double basicSalary, double commission) {
        super(employeeId, employeeName, employeePhone);
        this.basicSalary = basicSalary;
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return basicSalary+commission;
    }
}
