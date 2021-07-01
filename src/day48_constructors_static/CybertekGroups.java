package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 =new Group("CyberBugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Jack");
        group1.addMember("Rasim");
        group1.addMember("Marina");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());


        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Dima", "Maksim", "Andrea"));
        System.out.println("group2 members = " + group2.getMembers());

        if(group2.getMembers().contains("Dima")){
            System.out.println("Dima is in group2");
        } else {
            System.out.println("Dima is not in the group");
        }


        group1.removeMember("Jack");
    }
}
