package TaskNinth;


public class Main {
    public static void main(String[] args){
    // name and address -> Person

    Student obj = new Student("Spidey","Orknha Mong Rethy Street",5);

    try{
        obj.addCourseGrade("Java",100);
        obj.addCourseGrade("Network",90);
        obj.addCourseGrade("STA",100);
        obj.addCourseGrade("C#",100);
        obj.addCourseGrade("MIS",80);
        obj.addCourseGrade("CA",100);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Error:"+ e.getMessage());
    }
    System.out.println("\n================================");
    obj.printGrade();
    }
}
