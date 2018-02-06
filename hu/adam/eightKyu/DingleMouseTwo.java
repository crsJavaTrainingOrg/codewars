//https://www.codewars.com/kata/5a6d3bd238f80014a2000187
package hu.adam.eightKyu;

public class DingleMouseTwo{
    public static int[] ownedCatAndDog(final int catYears,final int dogYears){
        int ownedCat;
        int ownedDog;
        

        if( 15 <= catYears && catYears < 24 ) { 
            ownedCat = 1;
        }

        else if  (catYears < 15) {
            ownedCat = 0;
        }

        else {
            ownedCat = ((catYears - 24) / 4) + 2;
        }
        
        
        if( 15 <= dogYears && dogYears < 24 ) { 
            ownedDog = 1;
        }

        else if  (dogYears < 15) {
            ownedDog = 0;
        }

        else {
            ownedDog = ((dogYears - 24) / 5) + 2;
        }
        return new int []{ownedCat,ownedDog};
    }
    
}

       
        
        
