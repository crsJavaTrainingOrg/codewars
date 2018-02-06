//https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
package hu.adam.eightKyu;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int dogYears = 0;
        int catYears = 0;
        int humanyears = humanYears;
        int i = 1;
        while(i <= humanyears){
            if(i == 1){
                catYears= catYears + 15;
                dogYears = dogYears + 15;
            }
            else if (i == 2){
                catYears = catYears + 9;
                dogYears = dogYears + 9;
            }
           else{
                catYears = catYears + 4;
                dogYears = dogYears + 5;
            }

            i++;
        }

        return new int[]{humanYears,catYears,dogYears};
    }
}

