package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data = {32, 532, 12,5454, 22,123, 543, 999, 321, 3};
        for(int eachNum: data) {
            System.out.println(eachNum);
        }

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]+ " ");
        }

        System.out.println("last value " + data[data.length -1]);


        for (int n = data.length-1; n >= 0; n--){
            System.out.println(data[n]);
        }
    }
}
