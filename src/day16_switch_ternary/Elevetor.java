package day16_switch_ternary;

public class Elevetor {
    public static void main(String[] args){
        int floorNum = 2;
        if (floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");

        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat");

        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");

        } else {
            System.out.println("invalid floor - " + floorNum);
        }

        System.out.println("=============== SWITCH STATEMENT VERSION=============");

        floorNum = 1;
        switch(floorNum) {
            case 1: // same as if (floorNum == 1)
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("invalid floor - " + floorNum);

        }

    }

}
