package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println("developer = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println(Math.round(annualDevSalary));


        Contractor sdetContractor = new Contractor();
        System.out.println("sdetContractor = " + sdetContractor.calculateSalary(45));
        double sdetSalary = sdetContractor.calculateSalary(46);
        System.out.println(sdetSalary);
    }
}
