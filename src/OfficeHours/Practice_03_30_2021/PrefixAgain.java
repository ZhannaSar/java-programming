package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {
    public static void main (String [] args) {
        String str = "abxYabc";
        int n = 2;
        
        String prefixe = str.substring(0,n);
        System.out.println("prefixe = " + prefixe);
        String remaining = str.substring(n);
        System.out.println("remaining = " + remaining);
        System.out.println(remaining.contains(prefixe));
        
        
        
        
    }
    
    
}
