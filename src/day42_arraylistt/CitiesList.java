package day42_arraylistt;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4
        //add Ashgabat to first index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println("cities = " + cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));

        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arrayList
        System.out.println("count of items = " + cities.size());
        
        int size = cities.size();
        System.out.println("size = " + size + " cities in the list");

        //for loop and print all values in same line

        for (int i=0; i < cities.size()/2; i++) {
            System.out.print(cities.get(i) + " ");
        }

        System.out.println();


        //for each loop

        for (String each:cities){
            System.out.print(each + " ");
        }


        System.out.println();
        //delete item from ArrayList
        //1) remove using index
        //2) remove using object/value


        //remove Vienna using index

        cities.remove(3);

        //remove using object/value
        cities.remove("New York");
        System.out.println("after remove = " + cities);

        //delete/remove everything/all values
        cities.clear();
        System.out.println("cities = " + cities);


        //using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");

        }


        //check size() == 0;

        if(cities.size()==0){
            System.out.println("list is empty");
        }



    }


}
