package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening to Audio Book");
        System.out.println("title = " + title);
        System.out.println("author = " + author);

    }
}
