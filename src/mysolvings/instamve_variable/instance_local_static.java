package mysolvings.instamve_variable;

public class instance_local_static {
    static String staticVar = "Zhanna";
    int InstanceVar = 27;
    void test(){
        String local = "Anna";
        System.out.println(local);
    }

    public static void main(String[] args) {
        System.out.println(staticVar);
        instance_local_static ils = new instance_local_static();
        System.out.println(ils.InstanceVar);
        ils.test();
        int f = 67;
        System.out.println(f);

    }



}
