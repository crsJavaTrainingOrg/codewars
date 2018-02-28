package hu.adam.sevenKyu;

//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

import java.util.HashMap;
import java.util.Map;

public class HighestScoringString {

    public String highest(String string) {
        Map<String, Integer> wordsAndPoints = new HashMap<>();
        String[] wordsOfString = string.split(" ");
        int points = 0;

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < wordsOfString.length; i++) {
            for (int j = 0; j < wordsOfString[i].length(); j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    if (wordsOfString[i].charAt(j) == alphabet[k]) {
                        points = points + (k + 1);


                    }
                    wordsAndPoints.put(wordsOfString[i], points);
                }

            }

        }
        String highestMap = null;
        int highestPoints = 0;
        for (Map.Entry<String, Integer> entry : wordsAndPoints.entrySet()) {
            if (entry.getValue() > highestPoints) {
                highestMap = entry.getKey();
                highestPoints = entry.getValue();
            }
        }
        System.out.println(highestMap);
        return highestMap;
    }

}
