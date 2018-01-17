package hu.adam.eightKyu;

//www.codewars.com/kata/get-the-middle-character
public class MiddleCharacters{

    public static String middleChar(String s){
        char[] characters = s.toCharArray();
        String middleCharacters = "";
        int i = characters.length / 2;

        if(characters.length % 2 !=0){
            middleCharacters = middleCharacters + characters[i];
            return middleCharacters;

        }
        middleCharacters = middleCharacters + characters[i-1] + characters[i];
        return middleCharacters;

    }
}
