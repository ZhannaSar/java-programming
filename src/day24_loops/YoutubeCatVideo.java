package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat - BBC");
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching Youtube video :" + seconds);
            seconds++;
            Thread.sleep(1000);
        }

        System.out.println("Finished watching cat video, let start another one");


    }
}
