package OfficeHours.Practice_04_07_2021;

public class CamelCase {
    public static void main(String[] args) {
        String words = "thisHasManyWordsToFind"; //6
        int count = 1;
        for(int i = 0; i < words.length();i++){
            if(words.charAt(i)>= 'A' && words.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
