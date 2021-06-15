package day29_nestedloop_arrays;

import javax.lang.model.SourceVersion;

public class ArraysIntro {
    public static void main(String[] args) {


        int num = 10; //single variable
        int[] nums = new int[3];//array variable
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println(nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        System.out.println("length = " + nums.length);
        int len = nums.length;
        nums [0] = 100;
        nums [1] = 300;
        nums [2] = nums [1];

        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);

        int [] nums1 = {234, 12,45,67,9877,544};
        System.out.println(nums1.length);
    }
}
