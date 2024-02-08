package Assignment;

public class Main {
    public static void main(String[] args) {
        // Example employees
        Employee[] employees = {
                new Employee("John", new String[]{"Java", "SQL"}, 40),
                new Employee("Alice", new String[]{"Python", "Machine Learning"}, 35)
        };

        Shift[] shifts = {
                new Shift("Morning", new String[]{"Machine Learning"}),
                new Shift("Night", new String[]{"Python"})
        };

        EmployeeScheduler scheduler = new EmployeeScheduler(employees, shifts);

        ShiftAssignment[] schedule = scheduler.generateSchedule();
        scheduler.printScheduleTable();
    }
}