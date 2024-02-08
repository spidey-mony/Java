package Assignment;

class EmployeeScheduler {
    private Employee[] employees;
    private Shift[] shifts;
    private ShiftAssignment[] schedule;

    public EmployeeScheduler(Employee[] employees, Shift[] shifts) {
        this.employees = employees;
        this.shifts = shifts;
        this.schedule = new ShiftAssignment[employees.length * shifts.length];
    }

    public ShiftAssignment[] generateSchedule() {
        int index = 0;

        for (Employee employee : employees) {
            for (Shift shift : shifts) {
                schedule[index++] = new ShiftAssignment(employee, shift);
            }
        }

        return schedule;
    }

    public void printScheduleTable() {
        // Print table header
        System.out.printf("%-15s", "Employee/Shift");
        for (Shift shift : shifts) {
            System.out.printf("%-15s", shift.getShiftName());
        }
        System.out.println();

        // Print schedule rows
        for (Employee employee : employees) {
            System.out.printf("%-15s", employee.getName());
            for (Shift shift : shifts) {
                ShiftAssignment assignment = findAssignment(employee, shift);
                if (assignment != null) {
                    System.out.printf("%-15s", "Assigned");
                } else {
                    System.out.printf("%-15s", "Not Assigned");
                }
            }
            System.out.println();
        }
    }

    private ShiftAssignment findAssignment(Employee employee, Shift shift) {
        for (ShiftAssignment assignment : schedule) {
            if (assignment.getEmployee().equals(employee) && assignment.getShift().equals(shift)) {
                return assignment;
            }
        }
        return null;
    }
}