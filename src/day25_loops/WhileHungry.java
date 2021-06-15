package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        //it takes 3 bananas for isHungry to be set to false
        while (isHungry){
            bananas++;
            System.out.println("eating a banana: " + bananas);
            if(bananas == countToFull) {
                isHungry = false;
            }

        }
        System.out.println("Had enough bananas, lets get back to studying");

    }
}
