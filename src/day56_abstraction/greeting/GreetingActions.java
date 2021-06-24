package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Japanese js = new Japanese();
        js.hi();
        js.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();
    }
}
