package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("janna"));
    }
    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isPalidrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2;i++){
                if(str.charAt(i) != str.length()-1-i){
                    return false;
                }
        }
        return true;
    }
}
