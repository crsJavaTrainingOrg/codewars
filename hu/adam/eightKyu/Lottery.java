package hu.adam.eightKyu;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery{

    public static String lottery(int n1, int n2, int n3, int n4, int n5){

        int [] randomNumbers;
        randomNumbers = new int [5];
        String result = "";
        String stringOfRandomNumbers = "";
        int [] playedNumbers = new int[] {n1,n2,n3,n4,n5};
        int k = 0;

        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(1,91);
            stringOfRandomNumbers = stringOfRandomNumbers + randomNumbers[i];

        }

        for(int i = 0; i < playedNumbers.length; i++){
            for(int j = k; j < randomNumbers.length; j++){
                if(playedNumbers[i] == randomNumbers[j] && i == j){
                    result = result + playedNumbers[i];
                    if(i < playedNumbers.length - 1){
                        result = result + " ";
                    }
                    k++;

                }
            }

        }
        if(result.length() == 0){
            return "You don't have matches";
        }
        else{
            System.out.println("Drawn numbers: " + stringOfRandomNumbers
                + " " + "Winning numbers: " + result);
            return result;
        }

    }

}
