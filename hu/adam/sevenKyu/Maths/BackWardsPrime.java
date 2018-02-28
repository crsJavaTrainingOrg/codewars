package sevenKyuExercises;
//https://www.codewars.com/kata/5539fecef69c483c5a000015
public class BackWardsPrime {
    public static String backwardsPrime(long start, long end){
        long temp;
        String result = "";
        while(start<=end){
            if(start >= 10 && isPrime(start)){
                temp = start;
                temp = Integer.parseInt(new StringBuffer(String.valueOf(temp)).reverse().toString());
                if(isPrime(temp) && start != temp){
                    result = result + start + " ";
                }
            }
            start++;
        }
        if(result.length() != 0) {
            result = result.substring(0, result.length() - 1); //remove space from the end
        }
        System.out.println(result);
        return result;
    }

    private static boolean isPrime(long number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
