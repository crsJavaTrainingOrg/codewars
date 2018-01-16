package hu.adam.eightKyu;

//https://www.codewars.com/kata/case-swapping
public class SwapVowels{
    
    public String swapVowels(String word){
        char[] characters = word.toCharArray();
        String str = "";
        
        for(int i = 0; i < characters.length; i++) {
            char ch1 = characters[i];
            if(Character.isUpperCase(ch1) == true){
                char ch3 =Character.toLowerCase(ch1);
                str = str + ch3;
            }
            if(Character.isUpperCase(ch1) == false){
                
                char ch2 = Character.toUpperCase(ch1);
                str = str + ch2;
            }
        }
        return str;
    }
}
