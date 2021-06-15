package day43_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List <Integer> nums= new ArrayList <>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println("nums = " + nums);
        List<Integer> uniqueList = new ArrayList<>();
        for (int each:nums){
            if(Collections.frequency(nums,each)==1){
                System.out.println(each + " ");
                uniqueList.add(each);

            }
        }

        System.out.println("\nuniqueList = " + uniqueList);


    }
}
