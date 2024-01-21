package JAVALESSON;
    public class FullTimeEmployee extends Employee {
        public double monthlySalary;

        public FullTimeEmployee(int employeeId, String employeeName, String employeePhone, double monthlySalary) {
            super(employeeId, employeeName, employeePhone);
            this.monthlySalary = monthlySalary;
        }

        public double calculateSalary() {
            return monthlySalary;
        }
    }
