package DemoInterface;

public class Main {
    public static void main(String[] args) {

        Developer dev1 = new Developer(1,"Mony","09552842", 200);
        Sale sale1 = new Sale(2,"Panha","023523553", 120, 29);

        System.out.println(dev1.employeeId);
        System.out.println(dev1.employeeName);
        System.out.println(dev1.employeePhone);
        System.out.println(dev1.calculateSalary());

        System.out.println("");

        System.out.println(sale1.employeeId);
        System.out.println(sale1.employeeName);
        System.out.println(sale1.employeePhone);
        System.out.println(sale1.calculateSalary());
    }
}
