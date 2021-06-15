package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
    }
}
