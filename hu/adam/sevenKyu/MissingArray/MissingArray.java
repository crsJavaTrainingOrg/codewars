<<<<<<< HEAD:hu/adam/sevenKyu/MissingArray.java
package hu.adam.sevenKyu;
=======
package adam.sevenKyu.MissingArray;
>>>>>>> 87574baf3e12c09684b0344ee623f0f9c690ca3e:hu/adam/sevenKyu/MissingArray/MissingArray.java

//https://www.codewars.com/kata/length-of-missing-array/train/java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingArray{

    public  int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        List<Integer> lengthsOfArrays = new ArrayList<>();



        for(int i = 0; i < arrayOfArrays.length; i++) {

            lengthsOfArrays.add(arrayOfArrays[i].length);

        }
        Collections.sort(lengthsOfArrays);


        int i = 0;
        int missingArrayLength = 0;
        while(i < lengthsOfArrays.size()){
            if(lengthsOfArrays.get(i) + 1 != lengthsOfArrays.get(i+1) ) {
                missingArrayLength = lengthsOfArrays.get(i) + 1;
                break;
            }
            i++;
        }

        for(int j = 0; j < arrayOfArrays.length; j++){
            if(arrayOfArrays[j].length == 0 || arrayOfArrays[j] == null){
                return 0;
            }

        }
        System.out.println(missingArrayLength);
        return missingArrayLength;
    }

}
