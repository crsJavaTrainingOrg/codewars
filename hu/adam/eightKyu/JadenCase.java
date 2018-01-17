package hu.adam.eightKyu;

//www.codewars.com/kata/jaden-casing-strings
public class JadenCase {

    public static String toJadenCase(String phrase){
        String newphrase = "";
        String[] wordsOfPhrase = phrase.split(" ");

        if(phrase.length() == 0 || phrase == null){
            return null;
        }

        for(int i = 0; i <= wordsOfPhrase.length-1; i++){
            newphrase = newphrase + wordsOfPhrase[i].substring(0,1).toUpperCase() +
            wordsOfPhrase[i].substring(1);
            if(i < wordsOfPhrase.length - 1){
                newphrase = newphrase + " ";
            }


        }
        return newphrase;
    }
}

