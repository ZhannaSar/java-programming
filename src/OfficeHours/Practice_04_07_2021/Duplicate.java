package OfficeHours.Practice_04_07_2021;

public class Duplicate {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        String checked = "";

        for(int i = 0; i <word.length();i++){
            int count = 0;
            if(checked.contains("" + word.charAt(i))){
                continue;
            }
            for(int j = 0; j< word.length();j++){
                if(word.charAt(i)==word.charAt(j)){//A==A
                    count++;
                }
            }
           // if(word.charAt(i)==word.charAt(i+1)){
         //       duplicate+=word.charAt(i);
       //     }
            if(count>1){
                System.out.println(word.charAt(i)+ "is Duplicate");
            }
            checked+=word.charAt(i);
        }
        System.out.println(checked);

    }
}
