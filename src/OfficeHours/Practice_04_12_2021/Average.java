package OfficeHours.Practice_04_12_2021;

public class Average {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4};
        int middle = numbers.length/2;
        if(numbers.length%2==0){
            System.out.println((numbers[middle-1]+ numbers[middle])/2);
        } else {

            System.out.println(numbers[middle]);
        }
    }
}
