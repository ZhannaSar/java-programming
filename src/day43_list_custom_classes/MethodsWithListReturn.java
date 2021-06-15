package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {

        List <Integer>mlnNums = getIntegerList();
        int [] arr= getIntegerArray();
        System.out.println(mlnNums);
    }
    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <=1_000_000; i++){
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray(){
        int [] nums = new int[1_000_001];
        for (int i= 0; i <=1_000_000; i++){
            nums[i] = i;
        }
        return nums;
    }


}
