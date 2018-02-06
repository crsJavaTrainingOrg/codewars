//https://www.codewars.com/kata/two-to-one
package hu.adam.eightKyu;

import java.util.HashSet;
import java.util.Arrays;


public class TwoToOne{
    
    public static String longest(String s1, String s2){
        HashSet<Character>usedCharacters  = new HashSet<Character>();
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s1.length(); i++){
            if(usedCharacters.contains(s1.charAt(i)) == false){
                result.append(s1.charAt(i));
                usedCharacters.add(s1.charAt(i));
                
            }
            else{
                result.append("");
                
            }
        }
        for(int j = 0; j <s2.length(); j++){
            if(usedCharacters.contains(s2.charAt(j)) == false){
                result.append(s2.charAt(j));
                usedCharacters.add(s2.charAt(j));
            }
            else{
                result.append("");
                
            }
        }
         char[] charArray = (result.toString()).toCharArray();
         Arrays.sort(charArray);
         String sortedString = new String(charArray);
         return sortedString;
         
         
    }
    
}
