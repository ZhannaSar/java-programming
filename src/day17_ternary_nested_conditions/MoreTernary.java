package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50.0;
 //       if (hourlyRate > 45) {
  //          System.out.println("accept");
 //       } else {
  //          System.out.println("reject");
 //       }
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        
        
        String todaysClass = "java";
        
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);


        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "have DL and can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
        
        
        
        
        
        
    }
}
