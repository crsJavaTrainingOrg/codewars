//https://www.codewars.com/kata/growth-of-a-population/train/java
package hu.adam.eightKyu;
import java.lang.Math;


public class Arge{
    public static int nbYear(int p0, double percent, int aug, int p){
        int numberOfYears = 0;
        double realPercent = percent / 100;
        while(p0<=p){
            p0 = p0 + (int) Math.round(p0 * realPercent) + aug;
            numberOfYears++;
        }
        return numberOfYears;
    }
}

