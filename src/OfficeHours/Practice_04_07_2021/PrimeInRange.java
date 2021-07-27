package OfficeHours.Practice_04_07_2021;

public class PrimeInRange {
    public static void main(String[] args) {
        int number = 5;
        boolean isPrime = true;
        //50/2 50/3 50/4
        for(int i = 2;i <number;i++){
           if(number%i == 0){
               isPrime=false;
               break;
           }
        }
        System.out.println(isPrime);
    }
}
