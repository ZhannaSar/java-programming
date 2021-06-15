package day43_arraylist;

import java.util.*;

public class collectionzz {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a','i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println("letters = " + letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);




        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("after replace = " + letters);

        Collections.sort(letters);

        System.out.println("After sort = " + letters);
        
        
        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0,5,5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums = " + nums);


        int max = Collections.max(nums);
        System.out.println(max);
        int min =Collections.min(nums);
        System.out.println(min);
        System.out.println(Collections.frequency(nums, 5));
        
        int  countofOne = Collections.frequency(nums,1);
        System.out.println("countofOne = " + countofOne);


        Collections.replaceAll(nums, 5,50);
        System.out.println(nums);


        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);


        Collections.shuffle(nums);

    }

}
