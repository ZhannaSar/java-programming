package day48_constructors_static;


import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("bob");
        System.out.println(cs1.toString());

        Customer cs2 = new Customer("Mike", 2);
        System.out.println(cs2);

        Customer cs3 = new Customer("John", 4873);
        System.out.println(cs3);

        Customer[] todayCustomers = {cs1,cs2,cs3,new Customer("Bashir", 5775)};

        List <Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 445));
        customerList.add(new Customer("Zhanna", 767));

        System.out.println(todayCustomers[0]);
        System.out.println(todayCustomers[1]);

        System.out.println(customerList.get(0));

        System.out.println(customerList);

        System.out.println("for loop");

        for(int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("For each loop");

        for(Customer each: customerList){
            System.out.println(each);
        }

        System.out.println("Names of customers");
        customerList.forEach(each -> System.out.println(each.getName()));

        for(Customer each: customerList){
            System.out.println(each.getName());
        }

    }
}
