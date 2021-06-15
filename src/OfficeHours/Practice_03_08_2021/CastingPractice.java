package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args){

        // byte short int long float double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;
        System.out.println(b2);

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i);//5
        System.out.println((double)i); //5.0


        float f = 3.54f;
        float f2 = (float)3.54;


        float f3 = 5; //float = int -> 5.0
        System.out.println(f3);
        float f4 =5.5f; // float = double
        System.out.println(f4);

        long l = 223553; //long = int
        long l2 = 35453469896L;
        System.out.println((double)l);
        System.out.println((float)l);

        double million = 1_000_000;
        System.out.println(million);

        int x =10;
        int y=x++;
        System.out.println(y++ +" " + " " + x++ +" "+ y);










    }
}
