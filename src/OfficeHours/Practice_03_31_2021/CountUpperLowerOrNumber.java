package OfficeHours.Practice_03_31_2021;

public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int numbers = 0;
        for (int i = 0; i < word.length();i++){
            char letter = word.charAt(i);
            
            if(letter >= 'A' && letter <= 'Z'){
                upper++;
            }else if(letter >= 'a' && letter <= 'z'){
                lower++;
            } else if(letter >= '0' && letter <= '9'){
                numbers++;
            }
        }
        System.out.println("numbers = " + numbers);
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        
    }
}
