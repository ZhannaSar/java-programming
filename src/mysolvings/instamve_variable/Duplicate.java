package mysolvings.instamve_variable;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Duplicate {
    public static void main(String[] args) {
        String word = "AAABBBCCC";
        System.out.println(removeDupl(word));
    }
    public static String removeDupl(String word){
        String output = "";
        for(int i = 0; i < word.length();i++){
            if(!output.contains("" + word.charAt(i))){
                output+=word.charAt(i);
            }
        }
        return output;
    }

}
