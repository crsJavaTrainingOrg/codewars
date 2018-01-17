package hu.adam.eightKyu;

//https://www.codewars.com/kata/mumbling/train/java

public class Accumulate {

    public static void main(String[] args) {
        System.out.println(accumulate("cwAt"));
    }

    public static String accumulate(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    result.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    result.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            if (i < s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
