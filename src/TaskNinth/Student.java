package TaskNinth;

public class Student extends Person{
    String[] courses;
    int numCourse;
    int[] grades;
    int index;

    Student(String name, String address, int numCourse){
        super(name,address);
        this.numCourse = numCourse;
        this.courses = new String[numCourse];
        this.grades = new int[numCourse];
        this.index = 0;
    }

    public void addCourseGrade(String course, int grade){
        if (index < numCourse) {
            courses[index] = course;
            grades[index] = grade;
            index++;

        } else {
            System.out.println("Maximum is limited, cannot add more courses");
        }
    }
    public void printGrade(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Courses and Grades:");
        for (int i = 0; i < index; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
}
