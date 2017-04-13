package ArrayAndString;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 *
 * @author Pushpak
 */
public class CheckUnique {

    public String method1(String input) {        
        char[] temp = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (temp[i] == temp[j]) {
                    return "Not Unique";
                }
            }
        }
        return "Unique Characters";
    }
    
    public String method2(String input){
        for(int i=0;i<input.length();i++){
            char temp=input.charAt(i);
            for(int j=i+1;j<input.length();j++){
                if(temp==input.charAt(j)){
                    return "Not Unique";
                }
            }
        }
        return "Unique";
    }
    
    public String method3(String input){
        HashSet<Character> hs= new HashSet<Character>();
        for(int i=0;i<input.length();i++){
            hs.add(input.charAt(i));
        }
        if(hs.size()!=input.length()){
            return "Not Unique";
        }else
        return "Unique";
    }

    public static void main(String arg[]) {
        String input = "YOUR STRING HERE!";
        CheckUnique obj = new CheckUnique();
        System.out.println(obj.method1(input));
        System.out.println(obj.method2(input));
        System.out.println(obj.method3(input));
    }
}
