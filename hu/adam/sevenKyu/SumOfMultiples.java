package hu.adam.sevenKyu;

//https://www.codewars.com/kata/514b92a657cdc65150000006


public class SumOfMultiples {
    public static int sum(int number) {
        int currentNumber = 1;
        int sum = 0;
        while (currentNumber < number) {
            if (currentNumber % 3 == 0 || currentNumber % 5 == 0) {
                sum = sum + currentNumber;

            }
            currentNumber++;

        }
        System.out.print(sum);
        return sum;
    }
}

