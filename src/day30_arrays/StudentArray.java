package day30_arrays;

public class StudentArray {


    public static void main(String[] args) {
   String [] student1 = new String[5];
   student1 [0] = "AD1234";
   student1 [1] = "Zhanna";
   student1 [2] = "Sarsenova";
   student1 [3] = "batchNum";
   student1 [4] = "808-222-50-96";

   String[] student2 = {"AD1234","Zhanna","Sarsenova","batchNum","808-222-50-96"};
        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 first name = " + student2[1]);
        System.out.println("student2 last name = " + student2[2]);
        System.out.println("student2 batchNum= " + student2[3]);
        System.out.println("student2 phone Number" + student2[4]);
        System.out.println("student data length = " + student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data aray has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNumber = student2[4];
        System.out.println(mobileNumber.length());
        System.out.println(mobileNumber.startsWith("202"));

    }
}