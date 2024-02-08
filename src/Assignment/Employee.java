package Assignment;

class Employee {
    private String name;
    private String[] skills;
    private int maxWeeklyHours;

    public Employee(String name, String[] skills, int maxWeeklyHours) {
        this.name = name;
        this.skills = skills;
        this.maxWeeklyHours = maxWeeklyHours;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public int getMaxWeeklyHours() {
        return maxWeeklyHours;
    }
}
