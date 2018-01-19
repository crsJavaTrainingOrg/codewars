import java.util.concurrent.ThreadLocalRandom;
public class Array{

    public void cycle() {

        int [] anArray;
        anArray = new int[10];
        int random = ThreadLocalRandom.current().nextInt(0,1001);
        
        while(random !=0){
            random = ThreadLocalRandom.current().nextInt(0,1001);
            anArray = new int[anArray.length + 1];

            if( random == 0){
                break;
            }
        }
        System.out.println(anArray.length +" "+ anArray[53]);
    }
}
            
            

    
    
