package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);

        int indexOfXucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfXucumber = " + indexOfXucumber);




        int num =-5;

        System.out.println(num++);
        System.out.println(num=0);
        System.out.println(--num);


        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 ==(9-10+1);
        System.out.println("two = " + two);


        double pi =3.14;
        boolean d = 119 %5 ==0;
        int num1 = 0;

        if (pi> 3.14 && !d ){
            num1 +=50;

        } else {
            num1 -=50;

        } if(d) {
                num1 +=50;
        }
        System.out.println("num1 = " + num1);




        double decimal =  13.142;
        int whole = decimal < 20 ? 20:10;
        System.out.println("whole = " + whole);

        String name ="jimmy";
        boolean check;

    }
}
