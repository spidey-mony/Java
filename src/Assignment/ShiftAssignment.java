package Assignment;

class ShiftAssignment {
    private Employee employee;
    private Shift shift;

    public ShiftAssignment(Employee employee, Shift shift) {
        this.employee = employee;
        this.shift = shift;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Shift getShift() {
        return shift;
    }
}

