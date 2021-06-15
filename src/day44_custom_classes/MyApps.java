package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App uberApp = new App();
        uberApp.name = "uber";
        uberApp.version = 3.5;
        uberApp.open();

        uberApp.version = 4.00;
        uberApp.open();

    }


}
