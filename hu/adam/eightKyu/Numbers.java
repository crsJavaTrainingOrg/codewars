//https://www.codewars.com/kata/large-sum/train/java
package hu.adam.eightKyu;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Numbers{
    public static String firstTenDigitsOfSum(String[] numbers){

        StringBuilder result = new StringBuilder();
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i < numbers.length; i++){
            sum.add(new BigInteger(numbers[i]));

        }


        String digits = sum.toString();
        for(int k = 0; k < 10; k++){
            result.append(digits.charAt(k));

        }

        System.out.println(result);
        return result.toString();

    }
}

