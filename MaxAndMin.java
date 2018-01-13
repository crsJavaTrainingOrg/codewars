//https://www.codewars.com/kata/highest-and-lowest
public class MaxAndMin{

    public static String maximumAndMinimum(String numbers){
        String[] numbersOfTheString = numbers.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        
        if(numbers.length() == 0 || numbers ==null){
            return null;
        }

        for(int i = 0; i < numbersOfTheString.length; i++){
            if(Integer.parseInt(numbersOfTheString[i]) > max){
                max = Integer.parseInt(numbersOfTheString[i]);
                maxIndex = i;
            }
            else if(Integer.parseInt(numbersOfTheString[i]) < min){
                min = Integer.parseInt(numbersOfTheString[i]);
                minIndex = i;
            }
        }
        return numbersOfTheString[maxIndex] + " " + numbersOfTheString[minIndex];
    }
}

