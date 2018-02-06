//https://www.codewars.com/kata/large-sum/train/java
package hu.adam.eightKyu;
import java.lang.StringBuilder;

public class Numbers{
    public static String firstTenDigitsOfSum(String[] numbers){
        long sum = 0;
        int k = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            sum = sum + Integer.parseInt(numbers[i]);
        }

        String number = String.valueOf(sum);
        char[] digits = number.toCharArray();

        while(k < 10){
            result.append(digits[k]);
            k++;
        }
        return result.toString();
    }
}

