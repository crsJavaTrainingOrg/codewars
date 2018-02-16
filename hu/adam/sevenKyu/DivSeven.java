package hu.adam.sevenKyu;
//https://www.codewars.com/kata/55e6f5e58f7817808e00002e

public class DivSeven {
    public static long[] seven(long m) {
        String newNumber = String.valueOf(m);
        long number = m;
        int steps = 0;
        while (String.valueOf(number).length() > 2) {

                number = Long.parseLong(newNumber.substring(0, newNumber.length() - 1)) - 2 * Long.parseLong(newNumber.substring(newNumber.length() - 1, newNumber.length()));
                newNumber = String.valueOf(number);
                steps++;

        }
            if (number % 7 == 0) {
                System.out.print("The number is divisible by 7" + steps);
            } else {
                System.out.print("The number is not divisible by 7" + steps);
            }
            return new long[] {number, steps};

    }
}
