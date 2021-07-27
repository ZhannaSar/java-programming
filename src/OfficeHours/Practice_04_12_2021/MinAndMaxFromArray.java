package OfficeHours.Practice_04_12_2021;

public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int [] arr ={3,1,5,7,5,3};
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
