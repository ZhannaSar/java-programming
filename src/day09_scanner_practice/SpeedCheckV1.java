package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args){
        int speedlimit= 55;
        int currentSpeed =75;
        int overTheLimit = currentSpeed - speedlimit;
        System.out.println("You are driving " + overTheLimit +"mph over the limit. Slow down!");

    }
}
