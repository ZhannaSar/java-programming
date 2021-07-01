package mysolvings.instamve_variable;

public class SMS {
    public static void main(String[] args) {

        String message = "Sender: [Nadir] from number  <2223334444> Message: {Hello, lets code some java}";
        String sender, mobileNumber, text;

        int start = message.indexOf("[");
        int finish = message.indexOf("]");
        sender = message.substring((start)+1,finish);
        System.out.println(sender);
        mobileNumber = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println(mobileNumber);
        text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println(text);


    }
}
