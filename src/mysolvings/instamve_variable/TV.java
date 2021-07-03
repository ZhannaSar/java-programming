package mysolvings.instamve_variable;

public class TV {
    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV(){
    System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
    System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void channelUp(int channel){
        channel++;
    }

    public void channelDown(int channel){
        channel--;
    }

    public void volumeUp(int volumeLevel){
        volumeLevel++;
    }

    public void volumeDowm(int volumeLevel){
        volumeLevel--;
    }

    public void isOn(boolean on){

    }
    public void turnOn(boolean on){
        System.out.println("TV is already ON");
    }

    public void turnOff(boolean on){
        System.out.println("TV is already OFF");
    }
}
