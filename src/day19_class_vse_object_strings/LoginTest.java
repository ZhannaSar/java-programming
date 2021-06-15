package day19_class_vse_object_strings;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.jws.soap.SOAPBinding;
import javax.lang.model.SourceVersion;

public class LoginTest {
    public static void main(String[] args){
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String UserName = "CYBERTEK";
        String Password = "AB123";
        if (expUserName.equalsIgnoreCase(UserName) && expPassword.equals(Password)){
            System.out.println("Pass - user successfully");

        } else {
            if (!expUserName.equals(UserName)){
                System.out.println("Incorrect Username");

            } else {
                System.out.println("Incorrect password");

            }
        }



    }
}
