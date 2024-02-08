package Assignment;

class Shift {
    private String shiftName;
    private String[] requiredSkills;

    public Shift(String shiftName, String[] requiredSkills) {
        this.shiftName = shiftName;
        this.requiredSkills = requiredSkills;
    }

    public String getShiftName() {
        return shiftName;
    }

    public String[] getRequiredSkills() {
        return requiredSkills;
    }
}
