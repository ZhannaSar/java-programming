package OfficeHours.Practice_04_12_2021;

public class EvenAndOdd {
    public static void main(String[] args) {
        int [] num = {6,4,3,7,9};
        int odd= 0;
        int even = 0;
        for(int each:num){
            if(each%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
