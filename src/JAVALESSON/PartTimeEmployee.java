package JAVALESSON;
        public class PartTimeEmployee extends Employee {
            public double hourlyWage;
            public double hoursWorked;

            public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double hourlyWage, double hoursWorked) {
                super(employeeId, employeeName, employeePhone);
                this.hourlyWage = hourlyWage;
                this.hoursWorked = hoursWorked;
            }

            public double calculateSalary() {
                return hourlyWage * hoursWorked;
            }
        }
