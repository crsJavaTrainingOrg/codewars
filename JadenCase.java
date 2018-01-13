//www.codewars.com/kata/jaden-casing-strings
public class JadenCase {
    
    
    public static String toJadenCase(String phrase){
        String[] wordsOfPhrase = phrase.split(" ");
        String newphrase = "";
        
       
        
        if(phrase.length() == 0 ||phrase == null){
            return null;
        }
        else{
            for(int i = 0; i <wordsOfPhrase.length; i++){
                newphrase = newphrase + wordsOfPhrase[i].substring(0,1).toUpperCase() +
                wordsOfPhrase[i].substring(1) + " ";
            }
        }
        return newphrase;
    }
}
                
                
    
    
