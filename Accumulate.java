//https://www.codewars.com/kata/mumbling/train/java

public class Accumulate{

    public static String accumulate(String s){
        char[] charactersOfString = s.toCharArray(); //Egy char array létrehozása, melynek tagjai a String s karakterjei.
        String characters = "";

        for(int i = 0; i <charactersOfString.length; i++){ 
            for(int j = 0; j <= i; j++){

                if(j==0){ //Ha az adott karakter az első karakter akkor azt nagybetűre átírja.
                    char ch1 = charactersOfString[i];
                    char ch2 = Character.toUpperCase(ch1);
                    characters = characters + ch2;

                }
                if(j != 0){
                    characters = characters + charactersOfString[i];
                }//

            }
            if(i < charactersOfString.length-1){
                characters = characters + "-";
            }
        }
        return characters;
    }
}
