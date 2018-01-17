package hu.adam.eightKyu;

//https://www.codewars.com/kata/mumbling/train/java

public class Accumulate{

    public static String accumulate(String s){
        String characters = "";
        
        for(int i = 0; i <s.length(); i++){ 
            for(int j = 0; j <= i; j++){

                if(j==0){ 

                    characters = characters + Character.toUpperCase(s.charAt(i));
                }
                else if (j > 0){
                    characters = characters + Character.toLowerCase(s.charAt(i));
                }//

            }
            if(i < s.length()-1){
                characters = characters + "-";
            }
        }
        return characters;
    }
}
