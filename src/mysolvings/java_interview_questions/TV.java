package mysolvings.java_interview_questions;

public class TV {
    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public  TV(){
        System.out.println("Creating TV object using no args-constructor");
    }
    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        if(channel>0 && channel< 120){
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
        if(volumeLevel>=0 && volumeLevel<=7){

        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }
    public boolean isOn(){
        return on;


    }
    public void turnOn(boolean on){
        if (on == false) {
            on=true;
            System.out.println("TV is already ON");
        }
    }
    public void turnOff(boolean on){
        System.out.println("TV is already OFF");

    }
    }
