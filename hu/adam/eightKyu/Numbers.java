//https://www.codewars.com/kata/large-sum/train/java
package hu.adam.eightKyu;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Numbers{
    public static String firstTenDigitsOfSum(String[] numbers){

        String result;
        BigInteger sum =  new BigInteger("0");

        for(int i = 0; i < numbers.length; i++){
            sum = sum.add(new BigInteger(numbers[i]));

        }
        

        System.out.print(sum.toString().substring(0,10));
        return sum.toString().substring(0,10);

    }
}

