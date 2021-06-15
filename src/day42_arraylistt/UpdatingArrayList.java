package day42_arraylistt;

import java.util.*;
public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List <String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println("the first car in the list is " + myCars.get(0));
        System.out.println("the las car in the list is " + myCars.get(myCars.size()-1));
        System.out.print("myCars = " + myCars);
        System.out.println();
        System.out.println("myCars = " + myCars.toString()); //print all cars

        String allCarsin1St = myCars.toString();//saves all cars in 1 string variable

        System.out.println("allCarsin1St = " + allCarsin1St);

        //change index 0 to lamborgini
        myCars.set(0,"lamborgini");
        System.out.println("myCars = " + myCars.toString());

        myCars.set(4,"honda");
        System.out.println("myCars= " + myCars.toString());

        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("after set to jiguli = " + myCars);


        //replace ford with trabant using single statement:
        //indexOf("ford"), "trabant"

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);

        //lada -> bugatti
        /*
        if myCars contains "lada"
        find index of lada and set value to bugatti
        else
        print "lada is not found
         */

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"buggati");
        } else {
            System.out.println("lada is not found");
        }

        System.out.println(myCars.toString());

        /*
        lamborgini -> prius
        lada -> lexus
        trabant -> audi
         */

        for(int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equals("lamborgini")){
                //change to prius
                myCars.set(i,"prius");
            } else if (myCars.get(i).equals("toyota")){
                myCars.set(i,"lexus");
            }else if (myCars.get(i).equals("trabant")){
                myCars.set(i,"audi");
            }
        }

        System.out.println("new = " + myCars);
    }
}
