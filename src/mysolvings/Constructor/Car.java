package mysolvings.Constructor;

public class Car {
    String brand;
    int model;
    int Xsize;


    public Car() {
        this.brand = "Ford";
        this.model = 444;
        this.Xsize = 0;
        System.out.println(brand + " " + model);
    }

    public Car(String Xbrand, int Xmodel, int Xsize){
        this(Xbrand, Xmodel);


    }

    public Car(String Sbrand,int Smodel){
        brand = Sbrand;
        model = Smodel;
        System.out.println(brand + " " + model);

    }
    public void DriveCar(){
        System.out.println("I am driving a car" + model + " " + brand);
    }
}
