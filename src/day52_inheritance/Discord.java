package day52_inheritance;


public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }
    @Override
    public boolean download() {
        System.out.println("Downloaded Discord from 0.0.23 from AppStore");
        return true;
    }


    @Override
    public void useTheApp(int minutes){
        super.useTheApp(20);
        chat("Vladislav");

    }

    public void printInfo(){
        System.out.println("App name " + getName());
        System.out.println("App version " + getVersion());
    }
}
